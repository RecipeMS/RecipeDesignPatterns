package edu.estu.modules.rating.abstracts;

import edu.estu.entities.abstracts.Recipe;

public interface RatingComputationStrategy {
    void updateRatings(Recipe recipe, int rating);
    double computeImpact(Recipe recipe);
}
