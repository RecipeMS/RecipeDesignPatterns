package edu.estu.modules.rating.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.rating.abstracts.RatingComputationStrategy;

public class AverageRatingStrategy implements RatingComputationStrategy {
    @Override
    public void updateRatings(Recipe recipe, int rating) {
        recipe.setTotalRatings(recipe.getTotalRatings() + 1);
        recipe.setAverageRating((recipe.getAverageRating() * (recipe.getTotalRatings() - 1) + rating) / recipe.getTotalRatings());
    }

    @Override
    public double computeImpact(Recipe recipe) {
        return recipe.getAverageRating();
    }
}
