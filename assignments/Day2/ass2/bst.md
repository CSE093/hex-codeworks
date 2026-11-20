1.Preorder Traversal
Rule: Root → Left → Right

50 → 30 → 20 → 40 → 70 → 60 → 65 → 80
2.Inorder Traversal
Rule: Left → Root → Right

20 → 30 → 40 → 50 → 60 → 65 → 70 → 80
3.Postorder Traversal
Rule: Left → Right → Root

20 → 40 → 30 → 65 → 60 → 80 → 70 → 50
4.Which traversal gives the numbers in sorted order? Why?
Answer: Inorder traversal gives the numbers in sorted order.
In a Binary Search Tree (BST), smaller values are stored in the left subtree and larger values are stored in the right subtree. Inorder traversal visits Left → Root → Right. Therefore, it displays the numbers in ascending order.