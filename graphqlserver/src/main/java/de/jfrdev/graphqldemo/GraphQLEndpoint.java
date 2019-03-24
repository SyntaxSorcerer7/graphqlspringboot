package de.jfrdev.graphqldemo;

import graphql.servlet.SimpleGraphQLServlet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    @Autowired
    public GraphQLEndpoint(SchemaFactory schemaFactory) {
        super(schemaFactory.createSchema());
    }
}