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

public val LineAwesomeIcons.CreativeCommonsSa: ImageVector
    get() {
        if (_creativeCommonsSa != null) {
            return _creativeCommonsSa!!
        }
        _creativeCommonsSa = Builder(name = "CreativeCommonsSa", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(16.0f, 10.0f)
                curveTo(13.794f, 10.0f, 12.0f, 11.794f, 12.0f, 14.0f)
                lineTo(10.0f, 14.0f)
                lineTo(13.0f, 17.0f)
                lineTo(16.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                curveTo(14.0f, 12.897f, 14.897f, 12.0f, 16.0f, 12.0f)
                curveTo(17.103f, 12.0f, 18.0f, 12.897f, 18.0f, 14.0f)
                lineTo(18.0f, 18.0f)
                curveTo(18.0f, 19.103f, 17.103f, 20.0f, 16.0f, 20.0f)
                curveTo(15.263f, 20.0f, 14.6243f, 19.595f, 14.2773f, 19.0f)
                lineTo(12.1426f, 19.0f)
                curveTo(12.5896f, 20.721f, 14.141f, 22.0f, 16.0f, 22.0f)
                curveTo(18.206f, 22.0f, 20.0f, 20.206f, 20.0f, 18.0f)
                lineTo(20.0f, 14.0f)
                curveTo(20.0f, 11.794f, 18.206f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsSa!!
    }

private var _creativeCommonsSa: ImageVector? = null
