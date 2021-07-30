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

public val LineAwesomeIcons.Rev: ImageVector
    get() {
        if (_rev != null) {
            return _rev!!
        }
        _rev = Builder(name = "Rev", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 5.0508f)
                curveTo(9.4024f, 5.5584f, 5.0f, 10.2725f, 5.0f, 16.0f)
                curveTo(5.0f, 22.065f, 9.935f, 27.0f, 16.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 16.0f)
                curveTo(27.0f, 12.633f, 25.4769f, 9.6186f, 23.0859f, 7.5996f)
                lineTo(21.2227f, 8.6855f)
                curveTo(23.5047f, 10.3195f, 25.0f, 12.986f, 25.0f, 16.0f)
                curveTo(25.0f, 20.962f, 20.963f, 25.0f, 16.0f, 25.0f)
                curveTo(11.037f, 25.0f, 7.0f, 20.962f, 7.0f, 16.0f)
                curveTo(7.0f, 11.3759f, 10.506f, 7.5577f, 15.0f, 7.0586f)
                lineTo(15.0f, 10.0f)
                lineTo(21.0f, 6.5f)
                lineTo(15.0f, 3.0f)
                close()
                moveTo(16.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _rev!!
    }

private var _rev: ImageVector? = null
