package Pizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.channels.Channels;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GraficoPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
        
		System.out.println("Insira 4 valores para o grafico ");
		int grafico[] = new int [4];
		for (int i = 0; i < 4; i++) {
			grafico[i] = entrada.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(grafico[i]+" ");
		}
		
		String html =  "<html>\n" +
				"  <head>\n" +
				"    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
				"    <script type=\"text/javascript\">\n" +
				"      google.charts.load(\"current\", {packages:[\"corechart\"]});\n" +
				"      google.charts.setOnLoadCallback(drawChart);\n" +
				"      function drawChart() {\n" +
				"        var data = google.visualization.arrayToDataTable([\n" +
				"          ['Task', 'Hours per Day'],\n" +
				"          ['Comer',      "+grafico[0]+"],\n" +
				"          ['Dormir',     "+grafico[1]+"],\n" +
				"          ['Jogar',      "+grafico[2]+"],\n" +
				"          ['Mexer no celular', "+grafico[3]+"],\n" +
				"          ['Prestar atenção na aula', 3]\n" +
				"        ]);\n" +
				"\n" +
				"        var options = {\n" +
				"          title: 'Coisas que os alunos fazem na hora da aula',\n" +
				"          is3D: true,\n" +
				"        };\n" +
				"\n" +
				"        var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));\n" +
				"        chart.draw(data, options);\n" +
				"      }\n" +
				"    </script>\n" +
				"  </head>\n" +
				"  <body>\n" +
				"    <div id=\"piechart_3d\" style=\"width: 900px; height: 500px;\"></div>\n" +
				"  </body>\n" +
				"</html>";
		File file = new File("pizza.html");
        PrintWriter writer;
    try {
        writer = new PrintWriter(file);
         writer.write(html);
        writer.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Channels.class.getName()).log(Level.SEVERE, null, ex);
    }
		
		entrada.close();
	}

}
