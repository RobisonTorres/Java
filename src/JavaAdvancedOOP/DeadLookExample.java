package JavaAdvancedOOP;

class DeadlockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    private static final Object resource3 = new Object();

    public void method1() {
        synchronized (resource1) {
            // Perform operations with resource1
            synchronized (resource2) {
                // Perform operations with resource2
                synchronized (resource3) {
                    // Perform operations with resource3
                }
            }
        }
    }

    public void method2() {
        synchronized (resource3) {
            // Perform operations with resource3
            synchronized (resource2) {
                // Perform operations with resource2
                synchronized (resource1) {
                    // Perform operations with resource1
                }
            }
        }
    }
}

/*
To avoid deadlook it is necessary to acquire the resources in the same order in both methods.

class DeadlockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    private static final Object resource3 = new Object();

    public void method1() {
        synchronized (resource1) {
            // Perform operations with resource1
            synchronized (resource2) {
                // Perform operations with resource2
                synchronized (resource3) {
                    // Perform operations with resource3
                }
            }
        }
    }

    public void method2() {
        synchronized (resource1) {
            // Perform operations with resource1
            synchronized (resource2) {
                // Perform operations with resource2
                synchronized (resource3) {
                    // Perform operations with resource3
                }
            }
        }
    }
}
 */