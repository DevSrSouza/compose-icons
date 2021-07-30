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

public val LineAwesomeIcons.GrinTongue: ImageVector
    get() {
        if (_grinTongue != null) {
            return _grinTongue!!
        }
        _grinTongue = Builder(name = "GrinTongue", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 12.0f)
                close()
                moveTo(11.7656f, 17.3574f)
                lineTo(10.2324f, 18.6426f)
                curveTo(11.1092f, 19.6872f, 12.4514f, 20.4263f, 14.0f, 20.7734f)
                lineTo(14.0f, 22.0f)
                curveTo(14.0f, 23.1f, 14.9f, 24.0f, 16.0f, 24.0f)
                curveTo(17.1f, 24.0f, 18.0f, 23.1f, 18.0f, 22.0f)
                lineTo(18.0f, 20.7734f)
                curveTo(19.5486f, 20.4263f, 20.8896f, 19.6879f, 21.7656f, 18.6426f)
                lineTo(20.2324f, 17.3574f)
                curveTo(19.3844f, 18.3714f, 17.763f, 19.0f, 16.0f, 19.0f)
                curveTo(14.237f, 19.0f, 12.6146f, 18.3704f, 11.7656f, 17.3574f)
                close()
            }
        }
        .build()
        return _grinTongue!!
    }

private var _grinTongue: ImageVector? = null
