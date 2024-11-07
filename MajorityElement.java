
/*
    169. Majority Element

    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Example 1:

    Input: nums = [3,2,3]
    Output: 3
    Example 2:

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
    

    Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109
*/       




// If n is the current majority element we add 1 to its count, otherwise we decrement by 1. 
// The thought is that the majority is the size of the array minus the minority therefore if we count up each number one at a time we should always know the majority.


// Think of it like cards, where the array is like a row of cards. Grab the first card and assume thats your majority card. Pick one up at a time and you can see if its a match or different.
// If its a match keep it and move on. If it is not a match discard a card from the keep pile, if you dont have any the card becomes the new majority card.
// This will always ensure you have the majority card in hand. This is because there is more of those cards than any other card.


// For example at an array of size three such as [3,2,3] we can grab 3 and say its the majority to start and count it as 1. Now we check the next num and it is
// not the same as the previous so now its a 50/50 shot we have a 3 and a 2. Currently it would return 3 because that is the first majority element, however we have 
// one more to go so we check and see it is a 3 so we add one to the count of majorityElement and find that we are done. 
// This shows that the majority will never hit 0 because that means that it is no longer the majority or its is a shared majority such as 2,2,3,3.

    public class MajorityElement {  

        public int majorityElement(int[] nums) {
            // Actual number to return 
            int majElement = 0;
            // Count of majElement
            int majElementCount = 0;

            // Iterate over the whole array adding or removing from majElementCount
            for(int n : nums)
            {            
                if (majElementCount == 0) // If this hits 0 time to find a new majority
                {
                    majElement = n;
                }

                if(n == majElement)
                {
                    majElementCount += 1;
                }
                else
                {
                    majElementCount -= 1;
                }
            }

            return majElement;
        }
    }
