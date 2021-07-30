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

public val LineAwesomeIcons.Rockrms: ImageVector
    get() {
        if (_rockrms != null) {
            return _rockrms!!
        }
        _rockrms = Builder(name = "Rockrms", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(15.5f, 8.0f)
                curveTo(15.212f, 8.0f, 14.9361f, 8.1258f, 14.7461f, 8.3418f)
                lineTo(8.0469f, 16.0f)
                lineTo(10.7031f, 16.0f)
                lineTo(15.4727f, 10.5508f)
                lineTo(19.8984f, 16.0f)
                lineTo(15.0f, 16.0f)
                curveTo(14.609f, 16.0f, 14.2548f, 16.228f, 14.0918f, 16.582f)
                curveTo(13.9288f, 16.937f, 13.9862f, 17.3534f, 14.2402f, 17.6504f)
                lineTo(18.8262f, 23.0f)
                lineTo(21.4609f, 23.0f)
                lineTo(17.1738f, 18.0f)
                lineTo(22.0f, 18.0f)
                curveTo(22.386f, 18.0f, 22.7363f, 17.7777f, 22.9023f, 17.4297f)
                curveTo(23.0673f, 17.0817f, 23.0184f, 16.6681f, 22.7754f, 16.3691f)
                lineTo(16.2754f, 8.3691f)
                curveTo(16.0894f, 8.1401f, 15.8125f, 8.005f, 15.5195f, 8.0f)
                lineTo(15.5f, 8.0f)
                close()
            }
        }
        .build()
        return _rockrms!!
    }

private var _rockrms: ImageVector? = null
