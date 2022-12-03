/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArrayByParity = function(arr) {
    let oddcount = 0;
    
    if(!arr) return;
    
    for(let i in arr){
        if(arr[i]%2!==0){
            oddcount+=1;
        }else{
            let temp = arr[i];
            let temp1 = arr[i-oddcount];
            //swap
            
            arr[i-oddcount] = temp;
            arr[i] = temp1;
        }
    }
    return arr;
};