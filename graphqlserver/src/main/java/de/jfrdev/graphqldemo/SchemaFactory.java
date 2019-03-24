package de.jfrdev.graphqldemo;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.stereotype.Component;

@Component
public class SchemaFactory {

    public GraphQLSchema createSchema() {
        LinkRepository linkRepository = new LinkRepository();
        GraphQLSchema graphQLSchema = SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(linkRepository))
                .build()
                .makeExecutableSchema();
        return graphQLSchema;
    }

}
