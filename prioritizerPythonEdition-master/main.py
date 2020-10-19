# -*- coding:UTF-8 -*-
from tkinter import *
from tkinter import messagebox


def telaPrioritizer():
    import tel2Prioritizer
    
def telaCotacao():
    import tel3Prioritizer


    
class TelaInicial:

    def __init__():
        
        def sair():
            root.destroy()


        root = Tk()
        menubar = Menu(root)

        root.geometry("500x500")
        root.title("Prioritizer | Tela Principal")
        root.configure(background='#b3ccff')


        def message1():
            messagebox.showinfo(title="HI!", message="The goal of this project is to create an open-source financial helper for the general public. Not for profit, only in order to improve the knowledge of the authors and to help the public.")

        def message2():
            messagebox.showinfo(title="About authors", message="Chameleon: He's a student of computer science and information security. He is currently studying at the IFRN and is 17 years old.")


        
        menubar = Menu(root)
        root.config(menu=menubar)
        
        fileMenu = Menu(menubar)       
        fileMenu2 = Menu(menubar)       
       
        submenu = Menu(fileMenu)
        submenu2 = Menu(fileMenu2)

        
        submenu2 = Menu(fileMenu2)
        
        #fileMenu.add_separator()
        
        menubar.add_cascade(label="Prioritizer", underline=0, menu=fileMenu)       
        fileMenu.add_command(label="Exit", underline=0, command=sair)
        menubar.add_cascade(label="Sobre", underline=0, menu=fileMenu2)
        fileMenu2.add_command(label="Sobre o projeto", underline=0, command=message1)
        fileMenu2.add_command(label="Sobre os autores", underline=0, command=message2)



        labelWelcome = Label(root, font=('arial',11, 'bold'), text="Welcome To Prioritizer", width=1, height=2, bd=1, relief="raise")
        labelWelcome.pack(side=TOP, fill=X)

        frameCima = Frame(root, width=477, height=400, bd=7, relief="raise",pady=10,padx=10, bg=["#fff"])
        frameCima.pack(side=TOP)



        botaoPrioritizer = Button(frameCima,width=10, height=2, text="Prioritizer", command=telaPrioritizer, font=('arial', 9, 'bold'))
        botaoPrioritizer.place(x=180, y=30)


        botaoCotacao = Button(frameCima,width=10, height=2, text="Cotação", command=telaCotacao, font=('arial', 9, 'bold'))
        botaoCotacao.place(x=180, y=110)

        
        


        labelCreated = Label(root, font=('arial',9, 'bold'), text="CREATED BY: CHAMELEON", width=20, height=2, bd=1, relief="raise")
        labelCreated.pack(side=BOTTOM, fill=X)



        def sair():
            root.destroy()


        botaoSair = Button(frameCima,width=10, height=2, text="SAIR",command=sair, font=('arial', 9, 'bold'))
        botaoSair.place(x=180, y=190)



        root.mainloop()

    __init__()

        


