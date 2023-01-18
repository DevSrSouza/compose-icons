package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.338f, 2.9996f)
                curveTo(16.1215f, 3.4542f, 16.0003f, 3.9629f, 16.0f, 4.4999f)
                lineTo(5.75f, 4.5003f)
                curveTo(5.0596f, 4.5003f, 4.5f, 5.0599f, 4.5f, 5.7503f)
                verticalLineTo(18.2503f)
                curveTo(4.5f, 18.9406f, 5.0596f, 19.5003f, 5.75f, 19.5003f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 19.5003f, 19.5f, 18.9406f, 19.5f, 18.2503f)
                verticalLineTo(8.002f)
                curveTo(20.0372f, 8.002f, 20.5461f, 7.8809f, 21.001f, 7.6646f)
                lineTo(21.0f, 18.2503f)
                curveTo(21.0f, 19.7691f, 19.7688f, 21.0003f, 18.25f, 21.0003f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0003f, 3.0f, 19.7691f, 3.0f, 18.2503f)
                verticalLineTo(5.7503f)
                curveTo(3.0f, 4.2315f, 4.2312f, 3.0003f, 5.75f, 3.0003f)
                lineTo(16.338f, 2.9996f)
                close()
                moveTo(19.5f, 2.002f)
                curveTo(20.8807f, 2.002f, 22.0f, 3.1212f, 22.0f, 4.5019f)
                curveTo(22.0f, 5.8827f, 20.8807f, 7.0019f, 19.5f, 7.0019f)
                curveTo(18.1193f, 7.0019f, 17.0f, 5.8827f, 17.0f, 4.5019f)
                curveTo(17.0f, 3.1212f, 18.1193f, 2.002f, 19.5f, 2.002f)
                close()
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
