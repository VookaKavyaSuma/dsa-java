class Solution {
    public int numberOfWays(String corridor) {
        final int MOD = 1_000_000_007;
        int seatCount = 0;
        long ways = 1;
        int plantsBetween = 0;
        boolean countingPlants = false;

        for (char ch : corridor.toCharArray()) {
            if (ch == 'S') {
                seatCount++;

                if (seatCount % 2 == 0) {
                    countingPlants = true;
                }
                
                else if (seatCount > 1) {
                    ways = (ways * (plantsBetween + 1)) % MOD;
                    plantsBetween = 0;
                    countingPlants = false;
                }
            } 
            else if (ch == 'P' && countingPlants) {
                plantsBetween++;
            }
        }

        return seatCount > 0 && seatCount % 2 == 0 ? (int) ways : 0;
    }
}
