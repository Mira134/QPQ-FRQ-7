public int[] findDuplicates(int[] arr){
    Set<Integer> uniqueValues = new HashSet<>();
    Set<Integer> duplicateValues = new HashSet<>();

    for(int num : arr){
        if(!uniqueValues.add(num)){
            duplicateValues.add(num);
        }
    }
    int[] result=new int[duplicateValues.size()];
    int index = 0;

    for(int num : duplicateValues){
        result[index] = num;
        index++;
    }
    return result;
}