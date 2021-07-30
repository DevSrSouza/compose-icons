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

public val LineAwesomeIcons.UnlockAltSolid: ImageVector
    get() {
        if (_unlockAltSolid != null) {
            return _unlockAltSolid!!
        }
        _unlockAltSolid = Builder(name = "UnlockAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(12.9648f, 3.0f, 10.4141f, 4.9648f, 9.375f, 7.625f)
                lineTo(11.2188f, 8.375f)
                curveTo(11.9766f, 6.4336f, 13.8359f, 5.0f, 16.0f, 5.0f)
                curveTo(18.7539f, 5.0f, 21.0f, 7.2461f, 21.0f, 10.0f)
                lineTo(21.0f, 11.375f)
                curveTo(19.5234f, 10.5156f, 17.8242f, 10.0f, 16.0f, 10.0f)
                curveTo(10.4883f, 10.0f, 6.0f, 14.4883f, 6.0f, 20.0f)
                curveTo(6.0f, 25.5117f, 10.4883f, 30.0f, 16.0f, 30.0f)
                curveTo(21.5117f, 30.0f, 26.0f, 25.5117f, 26.0f, 20.0f)
                curveTo(26.0f, 17.2148f, 24.8477f, 14.6914f, 23.0f, 12.875f)
                lineTo(23.0f, 10.0f)
                curveTo(23.0f, 6.1563f, 19.8438f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(20.4297f, 12.0f, 24.0f, 15.5703f, 24.0f, 20.0f)
                curveTo(24.0f, 24.4297f, 20.4297f, 28.0f, 16.0f, 28.0f)
                curveTo(11.5703f, 28.0f, 8.0f, 24.4297f, 8.0f, 20.0f)
                curveTo(8.0f, 15.5703f, 11.5703f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(14.8945f, 18.0f, 14.0f, 18.8945f, 14.0f, 20.0f)
                curveTo(14.0f, 20.7383f, 14.4023f, 21.3711f, 15.0f, 21.7188f)
                lineTo(15.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                lineTo(17.0f, 21.7188f)
                curveTo(17.5977f, 21.3711f, 18.0f, 20.7383f, 18.0f, 20.0f)
                curveTo(18.0f, 18.8945f, 17.1055f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _unlockAltSolid!!
    }

private var _unlockAltSolid: ImageVector? = null
