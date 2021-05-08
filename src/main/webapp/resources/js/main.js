/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function deleteNhanVien(idNhanVien) {
    if (confirm("Bạn chắc chắn xóa không?") == true) {
        fetch(`/NhaHangTiecCuoi/api/nhanvien/${idNhanVien}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`nhanvien${idNhanVien}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}

