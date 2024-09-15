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

public val LineAwesomeIcons.BookMedicalSolid: ImageVector
    get() {
        if (_bookMedicalSolid != null) {
            return _bookMedicalSolid!!
        }
        _bookMedicalSolid = Builder(name = "BookMedicalSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(7.355f, 4.0f, 6.0f, 5.355f, 6.0f, 7.0f)
                lineTo(6.0f, 25.0f)
                curveTo(6.0f, 26.645f, 7.355f, 28.0f, 9.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                curveTo(8.648f, 22.0f, 8.316f, 22.074f, 8.0f, 22.188f)
                lineTo(8.0f, 7.0f)
                curveTo(8.0f, 6.434f, 8.434f, 6.0f, 9.0f, 6.0f)
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
                close()
                moveTo(9.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                curveTo(8.434f, 26.0f, 8.0f, 25.566f, 8.0f, 25.0f)
                curveTo(8.0f, 24.434f, 8.434f, 24.0f, 9.0f, 24.0f)
                close()
            }
        }
        .build()
        return _bookMedicalSolid!!
    }

private var _bookMedicalSolid: ImageVector? = null
