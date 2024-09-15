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

public val LineAwesomeIcons.Kiss: ImageVector
    get() {
        if (_kiss != null) {
            return _kiss!!
        }
        _kiss = Builder(name = "Kiss", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(15.0f, 17.008f)
                lineTo(15.0f, 18.498f)
                curveTo(15.901f, 18.498f, 16.477f, 18.913f, 16.477f, 19.129f)
                curveTo(16.477f, 19.344f, 15.905f, 19.754f, 15.01f, 19.758f)
                curveTo(15.006f, 19.758f, 15.003f, 19.758f, 15.0f, 19.758f)
                lineTo(15.0f, 19.76f)
                lineTo(15.0f, 21.248f)
                lineTo(15.0f, 21.25f)
                curveTo(15.003f, 21.25f, 15.006f, 21.25f, 15.01f, 21.25f)
                curveTo(15.905f, 21.253f, 16.477f, 21.664f, 16.477f, 21.879f)
                curveTo(16.477f, 22.095f, 15.901f, 22.51f, 15.0f, 22.51f)
                lineTo(15.0f, 24.0f)
                curveTo(16.669f, 24.0f, 17.977f, 23.068f, 17.977f, 21.879f)
                curveTo(17.977f, 21.346f, 17.703f, 20.873f, 17.264f, 20.504f)
                curveTo(17.703f, 20.135f, 17.977f, 19.661f, 17.977f, 19.129f)
                curveTo(17.977f, 17.94f, 16.669f, 17.008f, 15.0f, 17.008f)
                close()
            }
        }
        .build()
        return _kiss!!
    }

private var _kiss: ImageVector? = null
