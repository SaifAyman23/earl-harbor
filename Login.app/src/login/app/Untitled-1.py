# طلب عدد الطلاب
num_students = int(input("Enter the number of students: "))

# قائمة لتخزين بيانات الطلاب
students = []

# جمع البيانات لكل طالب
for _ in range(num_students):
    name = input("Enter the student's name: ")
    scores = []
    for i in range(1, 4):
        score = float(input(f"Enter score {i} for {name}: "))
        scores.append(score)
    
    # حساب متوسط الدرجات
    average = sum(scores) / len(scores)
    
    # تحديد الدرجة بناءً على المتوسط
    if average >= 90:
        grade = 'A'
    elif average >= 80:
        grade = 'B'
    elif average >= 70:
        grade = 'C'
    elif average >= 60:
        grade = 'D'
    else:
        grade = 'F'
    
    # إضافة بيانات الطالب إلى القائمة
    students.append((name, scores, average, grade))

# طباعة النتائج
print("\nStudent Results:")
print(f"{'Name':<15}{'Scores':<25}{'Average':<10}{'Grade'}")
for student in students:
    name, scores, average, grade = student
    print(f"{name:<15}{str(scores):<25}{average:<10.2f}{grade}")
