class Solution {
    public int solution(int[] ingredient) {
        int[] newIngredient = new int[ingredient.length];
        int index = 0;
        int answer = 0;
        for(int i : ingredient) {
            newIngredient[index] = i;
            index++;

            if(index >= 4) {
                if(newIngredient[index-4] == 1 && newIngredient[index-3] == 2 && newIngredient[index-2] == 3 && newIngredient[index-1] == 1) {
                    index -= 4;
                    answer++;
                }
            }
        }
        return answer;
    }
}