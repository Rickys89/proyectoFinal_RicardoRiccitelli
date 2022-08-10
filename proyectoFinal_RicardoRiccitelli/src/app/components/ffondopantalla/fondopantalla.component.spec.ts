import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ffondopantallaComponent } from './ffondopantalla.component';

describe('ffondopantallaComponent', () => {
  let component: ffondopantallaComponent;
  let fixture: ComponentFixture<ffondopantallaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ffondopantallaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ffondopantallaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
