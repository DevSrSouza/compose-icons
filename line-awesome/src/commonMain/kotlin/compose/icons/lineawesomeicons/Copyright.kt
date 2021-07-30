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

public val LineAwesomeIcons.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                curveTo(22.0859f, 5.0f, 27.0f, 9.9141f, 27.0f, 16.0f)
                curveTo(27.0f, 22.0859f, 22.0859f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9141f, 27.0f, 5.0f, 22.0859f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9141f, 9.9141f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(15.9063f, 10.0f)
                curveTo(12.582f, 10.0f, 9.9063f, 12.6758f, 9.9063f, 16.0f)
                curveTo(9.9063f, 19.3242f, 12.582f, 22.0f, 15.9063f, 22.0f)
                curveTo(18.3047f, 22.0f, 20.3555f, 20.5625f, 21.3125f, 18.5313f)
                lineTo(19.5f, 17.6875f)
                curveTo(18.8555f, 19.0586f, 17.5078f, 20.0f, 15.9063f, 20.0f)
                curveTo(13.6289f, 20.0f, 11.9063f, 18.2773f, 11.9063f, 16.0f)
                curveTo(11.9063f, 13.7227f, 13.6289f, 12.0f, 15.9063f, 12.0f)
                curveTo(17.5078f, 12.0f, 18.8555f, 12.9414f, 19.5f, 14.3125f)
                lineTo(21.3125f, 13.4688f)
                curveTo(20.3555f, 11.4375f, 18.3047f, 10.0f, 15.9063f, 10.0f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
