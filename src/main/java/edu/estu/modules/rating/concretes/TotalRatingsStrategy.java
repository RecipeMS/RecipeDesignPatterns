package edu.estu.modules.rating.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.rating.abstracts.RatingComputationStrategy;

public class TotalRatingsStrategy implements RatingComputationStrategy{

    @Override
    public void updateRatings(Recipe recipe, int rating) {
        recipe.setTotalRatings(recipe.getTotalRatings() + 1);
    }

    @Override
    public double computeImpact(Recipe recipe) {
        return recipe.getTotalRatings();
    }
}
