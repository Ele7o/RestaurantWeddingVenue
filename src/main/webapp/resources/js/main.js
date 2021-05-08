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

function deleteKhachHang(idKhachHang) {
    if (confirm("Bạn chắc chắn xóa không?") == true) {
        fetch(`/NhaHangTiecCuoi/api/khachhang/${idKhachHang}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`khachhang${idKhachHang}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}

function deleteDichVu(idDichVu) {
    if (confirm("Bạn chắc chắn xóa không?") == true) {
        fetch(`/NhaHangTiecCuoi/api/dichvu/${idDichVu}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`dichvu${idDichVu}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}

function deleteDonHang(idDonHang) {
    if (confirm("Bạn chắc chắn xóa không?") == true) {
        fetch(`/NhaHangTiecCuoi/api/donhang/${idDonHang}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`donhang${idDonHang}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}

function deleteNghiepVu(idNghiepVu) {
    if (confirm("Bạn chắc chắn xóa không?") == true) {
        fetch(`/NhaHangTiecCuoi/api/nghiepvu/${idNghiepVu}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`nghiepvu${idNghiepVu}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}

function deletePhanHoi(idPhanHoi) {
    if (confirm("Bạn chắc chắn xóa không?") == true) {
        fetch(`/NhaHangTiecCuoi/api/phanhoi/${idPhanHoi}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`phanhoi${idPhanHoi}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}

function deleteSanh(idSanh) {
    if (confirm("Bạn chắc chắn xóa không?") == true) {
        fetch(`/NhaHangTiecCuoi/api/sanh/${idSanh}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`sanh${idSanh}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}

