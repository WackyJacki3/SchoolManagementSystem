// alert to comfirm the deletion of student
const confirmDeletion = () => {
    const response = confirm("Are you sure you want to remove this student?");

    if (response) {
        alert("Removing this student from the list...");
    } else {
        alert("Canceled deleting.");
    }
}