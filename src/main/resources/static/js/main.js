// alert to comfirm the deletion of student
const confirmStudentDeletion = () => {
    const response = confirm("Are you sure you want to remove this student?");

    if (response) {
        alert("Removing this student from the list...");
    } else {
        alert("Canceled deleting.");
    }
}

// alert to comfirm the deletion of student
const confirmTeacherDeletion = () => {
    const response = confirm("Are you sure you want to remove this teacher?");

    if (response) {
        alert("Removing this teacher from the list...");
    } else {
        alert("Canceled deleting.");
    }
}