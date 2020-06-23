package springbootvalidation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieRatingCollector {
    public static class RatingCollectorImpl implements RatingCollector {
       Map<Integer, ArrayList<Double>> map = new HashMap<Integer, ArrayList<Double>>();
       
        @Override
        public void putNewRating(String movie, double rating) {
            // YOUR CODE HERE
       ArrayList<Double> al = new ArrayList<>();
       al.add(rating);
       map.get(movie).addAll(al);
        	
        }

        @Override
        public double getAverageRating(String movie) {
			
            // YOUR CODE HERE
        	Double sum=0.0;
        	double avg;
            ArrayList<Double> avs  = map.get(movie);
            for(double rate : avs) {
            	sum = sum+rate;
            }
            
            avg=sum/avs.size();
            
            
            return avg;
        }

        @Override
        public int getRatingCount(String movie) {
			
            // YOUR CODE HERE
        	int count=0;
        	ArrayList<Double> avs  = map.get(movie);
            for(double rate : avs) {
            	count++;
            }
        	
        	return count;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}