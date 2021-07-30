package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.LaptopMedicalSolid: ImageVector
    get() {
        if (_laptopMedicalSolid != null) {
            return _laptopMedicalSolid!!
        }
        _laptopMedicalSolid = Builder(name = "LaptopMedicalSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                lineTo(5.0f, 19.5625f)
                lineTo(2.7188f, 21.877f)
                curveTo(2.2657f, 22.329f, 2.0f, 22.9527f, 2.0f, 23.5938f)
                curveTo(2.0f, 24.9137f, 3.0863f, 26.0f, 4.4063f, 26.0f)
                lineTo(27.5938f, 26.0f)
                curveTo(28.9137f, 26.0f, 30.0f, 24.9137f, 30.0f, 23.5938f)
                curveTo(30.0f, 22.9527f, 29.7342f, 22.328f, 29.2813f, 21.875f)
                lineTo(27.0f, 19.5625f)
                lineTo(27.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(7.0f, 8.0f)
                lineTo(25.0f, 8.0f)
                lineTo(25.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 8.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 13.0f)
                lineTo(12.0f, 13.0f)
                lineTo(12.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 18.0f)
                lineTo(17.0f, 18.0f)
                lineTo(17.0f, 15.0f)
                lineTo(20.0f, 15.0f)
                lineTo(20.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                close()
                moveTo(6.4375f, 21.0f)
                lineTo(25.5625f, 21.0f)
                lineTo(27.875f, 23.2813f)
                curveTo(27.953f, 23.3592f, 28.0f, 23.4837f, 28.0f, 23.5938f)
                curveTo(28.0f, 23.8358f, 27.8358f, 24.0f, 27.5938f, 24.0f)
                lineTo(4.4063f, 24.0f)
                curveTo(4.1642f, 24.0f, 4.0f, 23.8358f, 4.0f, 23.5938f)
                curveTo(4.0f, 23.4848f, 4.047f, 23.3603f, 4.125f, 23.2813f)
                lineTo(6.4375f, 21.0f)
                close()
            }
        }
        .build()
        return _laptopMedicalSolid!!
    }

private var _laptopMedicalSolid: ImageVector? = null
