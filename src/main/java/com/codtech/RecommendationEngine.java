package com.codtech;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.File;
import java.util.List;

public class RecommendationEngine {
    public static void main(String[] args) {
        try {
            // Load ratings.csv from resources folder
            File ratingsFile = new File(RecommendationEngine.class.getClassLoader().getResource("ratings.csv").toURI());

            // Load the data model from the CSV file
            DataModel model = new FileDataModel(ratingsFile);

            // Calculate similarity between users
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Set up the neighborhood (nearest N users)
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

            // Create the recommender
            Recommender recommender = new org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender(model, neighborhood, similarity);

            // Get recommendations for a specific user (userId = 3)
            int userId = 3;
            List<RecommendedItem> recommendations = recommender.recommend(userId, 3);

            // Print the recommendations
            System.out.println("Recommendations for User ID: " + userId);
            for (RecommendedItem recommendation : recommendations) {
                System.out.println("Item ID: " + recommendation.getItemID() + " , Estimated Preference: " + recommendation.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
