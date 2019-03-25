package de.jfrdev.graphqldemo;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchemaFactory {

    private LinkRepository linkRepository;

    @Autowired
    public SchemaFactory(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public GraphQLSchema createSchema() {
        GraphQLSchema graphQLSchema = SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(linkRepository), new Mutation(linkRepository))
                .build()
                .makeExecutableSchema();
        return graphQLSchema;
    }

}
