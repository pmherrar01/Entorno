import tkinter as tk

def calcular():
    try:
        resultado = eval(entry.get())
        entry.delete(0, tk.END)
        entry.insert(tk.END, str(resultado))
    except:
        entry.delete(0, tk.END)
        entry.insert(tk.END, "Error")

# Configuración de la ventana
root = tk.Tk()
root.title("Calculadora")

# Entrada de texto
entry = tk.Entry(root, width=16, borderwidth=5)
entry.grid(row=0, column=0, columnspan=3)

# Botones numéricos
buttons = [
    '7', '8', '9',
    '4', '5', '6',
    '1', '2', '3',
    'C', '0', '+'
]

row = 1
col = 0
for button_text in buttons:
    tk.Button(root, text=button_text, width=4, height=2, command=lambda x=button_text: entry.insert(tk.END, x)).grid(row=row, column=col)
    col += 1
    if col > 2:
        col = 0
        row += 1

tk.Button(root, text="Clear", width=4, height=2, command=lambda: entry.delete(0, tk.END)).grid(row=5, column=0)
tk.Button(root, text="=", width=4, height=2, command=calcular).grid(row=5, column=1, columnspan=2)

# Ejecutar la ventana
root.mainloop()
