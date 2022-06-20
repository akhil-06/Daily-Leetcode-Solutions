/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    let setNums = new Set();
    
    for(let i=0;i<nums.length;i++){
        if(setNums.has(nums[i])) return nums[i];
        else setNums.add(nums[i]);
    }
};