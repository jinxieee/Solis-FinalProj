# Step 1: Welcome message
print("Welcome to your Daily Task Tracker!")
print("This will help you remember your tasks for today.\n")

# Step 2: Create an empty list to store tasks
daily_tasks = []

# Step 3: Ask the user how many tasks they want to add
task_count = int(input("How many tasks do you want to remember today? "))

# Step 4: Loop to get task names from user
for i in range(task_count):
    task = input(f"Enter task #{i + 1}: ")
    daily_tasks.append(task)

# Step 5: Show all tasks entered
print("\nHere's your task list for today:")
for i, task in enumerate(daily_tasks, 1):
    print(f"{i}. {task}")

# Step 6: Ask which tasks are done (by number)
done_input = input("\nEnter the numbers of the tasks you've finished (e.g. 1 3): ")
done_indexes = [int(i) - 1 for i in done_input.split() if i.isdigit()]

# Step 7: Show updated status
print("\nTask Status:")
for i, task in enumerate(daily_tasks):
    if i in done_indexes:
        print(f"{i + 1}. {task} - DONE")
    else:
        print(f"{i + 1}. {task} - PENDING")

# Step 8: Goodbye message
print("\nGreat job keeping track of your tasks! Keep it up!")