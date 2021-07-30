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

public val LineAwesomeIcons.Angular: ImageVector
    get() {
        if (_angular != null) {
            return _angular!!
        }
        _angular = Builder(name = "Angular", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.9355f)
                lineTo(4.3613f, 8.168f)
                lineTo(6.4492f, 23.8398f)
                lineTo(16.0f, 29.1445f)
                lineTo(25.5508f, 23.8379f)
                lineTo(27.6387f, 8.168f)
                lineTo(16.0f, 3.9355f)
                close()
                moveTo(16.0f, 6.0645f)
                lineTo(25.4434f, 9.498f)
                lineTo(23.6992f, 22.5781f)
                lineTo(16.0f, 26.8555f)
                lineTo(8.3008f, 22.5781f)
                lineTo(6.5566f, 9.498f)
                lineTo(16.0f, 6.0645f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(10.0f, 22.0f)
                lineTo(12.0f, 22.0f)
                lineTo(13.2891f, 19.0f)
                lineTo(18.7109f, 19.0f)
                lineTo(20.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(16.0f, 12.5508f)
                lineTo(16.0195f, 12.6094f)
                lineTo(16.7207f, 14.3594f)
                lineTo(17.8496f, 17.0f)
                lineTo(14.1504f, 17.0f)
                lineTo(15.2793f, 14.3594f)
                lineTo(15.9805f, 12.6094f)
                lineTo(16.0f, 12.5508f)
                close()
            }
        }
        .build()
        return _angular!!
    }

private var _angular: ImageVector? = null
