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

public val LineAwesomeIcons.PowerOffSolid: ImageVector
    get() {
        if (_powerOffSolid != null) {
            return _powerOffSolid!!
        }
        _powerOffSolid = Builder(name = "PowerOffSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(12.0f, 4.6875f)
                curveTo(7.3477f, 6.3398f, 4.0f, 10.7852f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 10.7852f, 24.6523f, 6.3398f, 20.0f, 4.6875f)
                lineTo(20.0f, 6.8438f)
                curveTo(23.5273f, 8.3906f, 26.0f, 11.9102f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5156f, 21.5156f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4844f, 26.0f, 6.0f, 21.5156f, 6.0f, 16.0f)
                curveTo(6.0f, 11.9102f, 8.4727f, 8.3906f, 12.0f, 6.8438f)
                close()
            }
        }
        .build()
        return _powerOffSolid!!
    }

private var _powerOffSolid: ImageVector? = null
