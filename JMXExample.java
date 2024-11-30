import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;

public class JMXExample {
    public static void main(String[] args) {
        // Get system MXBeans
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();

        // Output system and memory information
        System.out.println("OS Name: " + osBean.getName());
        System.out.println("CPU Load: " + osBean.getSystemLoadAverage());
        System.out.println("Heap Memory Usage: " + memoryBean.getHeapMemoryUsage());
    }
}
