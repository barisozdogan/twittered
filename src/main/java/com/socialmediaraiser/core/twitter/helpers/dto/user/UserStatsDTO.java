package com.socialmediaraiser.core.twitter.helpers.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserStatsDTO {
    @JsonProperty("followers_count")
    private int followersCount;
    @JsonProperty("following_count")
    private int followingCount;
    @JsonProperty("tweet_count")
    private int tweetCount;
    @JsonProperty("listed_count")
    private int listedCount;
}
