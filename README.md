CRYPTOGRAPHIC KEY & SECURE FILE VAULT

1. Problem Statement

Develop a Java-based Secure Vault File Storage Unit that encrypts data using AES, stores encrypted data in files, reads and writes key files, and serializes encrypted vault objects. Implement custom exceptions named "UnauthorizedAccessException" and "KeyCorruptedException" to handle errors.

2. Objective

- To implement AES encryption and decryption.
- To perform file handling using Java.
- To read and write keys using FileReader and FileWriter.
- To store encrypted data using byte streams.
- To serialize encrypted vault objects.
- To handle errors using custom exceptions.

3. Classes Required

- Main: Executes the program.
- SecureVault: Manages encryption, decryption, and storage.
- KeyManager: Generates, reads, and writes keys.
- VaultData: Stores encrypted data and supports serialization.
- UnauthorizedAccessException: Handles unauthorized access.
- KeyCorruptedException: Handles corrupted keys.

4. OOP Concepts Used

- Class and Object: Organize the vault operations.
- Encapsulation: Protect data within classes.
- Abstraction: Simplify encryption and decryption operations.
- Inheritance: Custom exceptions extend the Exception class.
- Polymorphism: Supports handling different exception types.
- Exception Handling: Manages runtime errors.

5. UML Class Diagram
   <img width="1312" height="1199" alt="WhatsApp Image 2026-10-11 at 14 50 18" src="https://github.com/user-attachments/assets/38c2ba66-0738-46f8-8815-7c2d577e14cf" />


The UML diagram contains the Main, SecureVault, KeyManager, VaultData, UnauthorizedAccessException, and KeyCorruptedException classes. Main controls execution, SecureVault manages encrypted storage, KeyManager handles keys, and VaultData stores encrypted information.

6. Algorithm

1. Start the program.
2. Generate an AES secret key.
3. Write and read the key using FileWriter and FileReader.
4. Verify user authorization.
5. Encrypt the data using AES.
6. Store encrypted data using byte streams.
7. Serialize the encrypted vault object.
8. Deserialize and decrypt the data.
9. Display the original message.
10. Handle exceptions and stop the program.

7. Program Execution Instructions

1. Install the Java JDK.
2. Create the Java source files.
3. Open the project in VS Code.
4. Compile the program using "javac Main.java".
5. Run the program using "java Main".
6. Verify the output and generated files.

8. Sample Output

- AES key generated successfully.
- Encrypted vault saved successfully.
- Decrypted message displayed successfully.

9. Test Cases

Test Case| Expected Result
Valid key and password| Encryption and decryption succeed.
Incorrect password| UnauthorizedAccessException is thrown.
Corrupted key| KeyCorruptedException is thrown.
Missing key file| File error is displayed.
Missing vault file| File error is displayed.
Modified encrypted data| Decryption fails authentication.
Empty message| Empty message is processed successfully.

10. Exceptional Conditions

- UnauthorizedAccessException: Thrown when access credentials are incorrect.
- KeyCorruptedException: Thrown when the key is invalid or corrupted.
- IOException: Handles file-reading and writing errors.
- Decryption Error: Occurs when encrypted data is corrupted or authentication fails.

11. Screenshots
12. output:
    <img width="845" height="297" alt="image" src="https://github.com/user-attachments/assets/d16fb6a6-2d37-4992-9b54-e5af1974ea81" />


Include screenshots of:

1. Java source code.
2. Successful program execution.
3. Generated encrypted vault file.
4. GitHub repository.

12. Challenges Faced and Solutions

- Key Generation: Used Java KeyGenerator.
- Encryption: Used the Cipher class.
- File Handling: Used FileReader, FileWriter, and byte streams.
- Object Storage: Used serialization.
- Error Handling: Implemented custom exceptions.
- Key Security: Restricted access to key files and avoided uploading keys to GitHub.

13. GitHub Repository

Repository Name: Cryptographic-Key-Secure-File-Vault

Upload all Java source files, README.md, the UML diagram, screenshots, and the assignment report.

14. README.md Contents

1. Problem Statement
2. Objective
3. OOP Concepts Used
4. UML Class Diagram
5. Algorithm
6. Execution Instructions
7. Sample Output
8. Screenshots
9. Test Cases
10. Challenges and Solutions

15. Commit History

- Initial project creation.
- Added key management.
- Implemented encryption and decryption.
- Added serialization.
- Implemented custom exceptions.
- Added test cases and screenshots.
- Completed README documentation.

16. Conclusion

The Secure Vault File Storage Unit demonstrates AES encryption, key management, file handling, object serialization, and custom exception handling in Java. It helps protect stored data and improves understanding of object-oriented programming and secure file management.

17. GitHub Repository Link

Add the actual GitHub repository URL after uploading the project files.
