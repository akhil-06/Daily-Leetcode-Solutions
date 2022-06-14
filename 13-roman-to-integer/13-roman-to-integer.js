/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const map = {
        'I':1,
        'V':5,
        'X':10,
        'L':50,
        'C':100,
        'D':500,
        'M':1000
    }
    
    let ans = 0;
    for(let i=0;i<s.length;i++){
        let first = map[s[i]]; 
        let second = map[s[i+1]];
        
        if(first < second){
            ans += second-first;
            i++;
        }else{
            ans += first;
        }
    }
    return ans;
};

