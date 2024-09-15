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

public val LineAwesomeIcons.Hdd: ImageVector
    get() {
        if (_hdd != null) {
            return _hdd!!
        }
        _hdd = Builder(name = "Hdd", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.219f, 6.0f)
                lineTo(3.0f, 18.875f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 18.875f)
                lineTo(25.781f, 6.0f)
                close()
                moveTo(7.781f, 8.0f)
                lineTo(24.219f, 8.0f)
                lineTo(26.719f, 18.0f)
                lineTo(5.281f, 18.0f)
                close()
                moveTo(5.0f, 20.0f)
                lineTo(27.0f, 20.0f)
                lineTo(27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveTo(23.449f, 21.0f, 23.0f, 21.449f, 23.0f, 22.0f)
                curveTo(23.0f, 22.551f, 23.449f, 23.0f, 24.0f, 23.0f)
                curveTo(24.551f, 23.0f, 25.0f, 22.551f, 25.0f, 22.0f)
                curveTo(25.0f, 21.449f, 24.551f, 21.0f, 24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _hdd!!
    }

private var _hdd: ImageVector? = null
