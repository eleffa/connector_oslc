package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import virtuoso.jena.driver.VirtGraph;
import virtuoso.jena.driver.VirtuosoQueryExecution;
import virtuoso.jena.driver.VirtuosoQueryExecutionFactory;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.RDFNode;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VirtGraph set = new VirtGraph ("jdbc:virtuoso://localhost:1111", "dba", "dba");

		/*			STEP 2			*/


		/*			STEP 3			*/
		/*		Select all data in virtuoso	*/
				Query sparql = QueryFactory.create("SELECT * WHERE { GRAPH ?graph { ?s ?p ?o } } limit 100");

		/*			STEP 4			*/
				VirtuosoQueryExecution vqe = VirtuosoQueryExecutionFactory.create (sparql, set);

				ResultSet results = vqe.execSelect();
				while (results.hasNext()) {
					QuerySolution result = results.nextSolution();
				    RDFNode graph = result.get("graph");
				    RDFNode s = result.get("s");
				    RDFNode p = result.get("p");
				    RDFNode o = result.get("o");
				    response.getOutputStream().print(graph + " { " + s + " " + p + " " + o + " . }");
				
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
