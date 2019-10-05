package three.spring.edu.conditional;

public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
