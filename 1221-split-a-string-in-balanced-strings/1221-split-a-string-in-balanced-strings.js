/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let ans = 0;
    let balance = 0;
    for(let i=0;i<s.length;i++){
        
        if(s[i] == 'R'){
            balance += 1;
        }else{
            balance -= 1;
        }
        
        if(balance === 0){
            ans++;
        }
    }
    return ans;
};
