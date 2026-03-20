int lengthOfLongestSubstring(char* s) {
    char sub[strlen(s)+1];
    int currlen = 0, flag=0, maxlen = 0;
    for(int i=0;i<strlen(s);i++){
        currlen = 0;
        for(int j=i;j<strlen(s);j++){
            flag = 0;
            for(int k=0;k<currlen;k++){
                if(s[j] == sub[k]){ flag = 1; break; }
            }
            if (!flag) {sub[currlen] = s[j]; currlen++;}
            else { break;}
        }
        if(currlen > maxlen) maxlen=currlen;
    }
    return maxlen;
}