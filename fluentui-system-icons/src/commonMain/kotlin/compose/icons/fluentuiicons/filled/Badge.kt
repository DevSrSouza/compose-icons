package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.5019f)
                curveTo(16.0f, 6.4349f, 17.567f, 8.002f, 19.5f, 8.002f)
                curveTo(20.0372f, 8.002f, 20.5461f, 7.8809f, 21.001f, 7.6646f)
                lineTo(21.0f, 18.2503f)
                curveTo(21.0f, 19.7691f, 19.7688f, 21.0003f, 18.25f, 21.0003f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0003f, 3.0f, 19.7691f, 3.0f, 18.2503f)
                verticalLineTo(5.7503f)
                curveTo(3.0f, 4.2315f, 4.2312f, 3.0003f, 5.75f, 3.0003f)
                lineTo(16.3378f, 2.9999f)
                curveTo(16.1212f, 3.4551f, 16.0f, 3.9643f, 16.0f, 4.5019f)
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
