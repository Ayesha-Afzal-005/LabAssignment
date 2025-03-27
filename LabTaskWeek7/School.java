class School{
    private String name;
    private String address;
    private Principal principal;
    private ClassRoom[] classes;
    private int classCount = 0;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classes = new ClassRoom[10]; 
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append("School: ").append(name).append(", Address: ").append(address).append("\n");
        details.append("Principal: ").append(principal).append("\n");
        details.append("Classes:\n");
        for (int i = 0; i < classCount; i++) {
            details.append(classes[i]).append("\n");
        }
        return details.toString();
    }
}