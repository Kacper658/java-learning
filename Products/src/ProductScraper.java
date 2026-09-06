import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

public class ProductScraper {

	private static final String BASE_URL = "https://lalkihiszpanskie.pl";

    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect(BASE_URL).get();
            Elements productLinks = doc.select("a.product-link");
            // nie dziala LOL
            System.out.println(doc);

            for (Element link : productLinks) {
                String productUrl = BASE_URL + link.attr("href");
                processProductPage(productUrl);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processProductPage(String productUrl) {
        try {
            Document doc = Jsoup.connect(productUrl).get();
            String description = doc.select("div.product-description").text();
            String imageUrl = BASE_URL + doc.select("img.product-image").attr("src");

            saveDescription(productUrl, description);
            downloadImage(imageUrl);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveDescription(String productUrl, String description) {
        try (PrintWriter out = new PrintWriter("descriptions.txt", "UTF-8")) {
            out.println("Product URL: " + productUrl);
            out.println("Description: " + description);
            out.println("----");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void downloadImage(String imageUrl) {
        try (BufferedInputStream in = new BufferedInputStream(new URL(imageUrl).openStream());
             FileOutputStream out = new FileOutputStream("images/" + imageUrl.substring(imageUrl.lastIndexOf('/') + 1))) {

            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                out.write(dataBuffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
