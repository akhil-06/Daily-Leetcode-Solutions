/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // If nth version is not a bad version, then all versions are good.
        if (n <= 0 || !isBadVersion(n)) {
            return -1;
        }
        // If first version is a bad version, then all versions are bad.
        if (isBadVersion(1)) {
            return 1;
        }

        // Search space is from 1 to n (All possible version numbers)
        int left = 1;
    int right = n;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
}