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

public val FilledGroup.ArrowReplyDown: ImageVector
    get() {
        if (_arrowReplyDown != null) {
            return _arrowReplyDown!!
        }
        _arrowReplyDown = Builder(name = "ArrowReplyDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7042f, 8.7055f)
                curveTo(10.0945f, 8.3147f, 10.094f, 7.6816f, 9.7032f, 7.2913f)
                curveTo(9.3125f, 6.9011f, 8.6793f, 6.9015f, 8.289f, 7.2923f)
                lineTo(3.2924f, 12.2957f)
                curveTo(2.9024f, 12.6863f, 2.9025f, 13.319f, 3.2928f, 13.7094f)
                lineTo(8.2894f, 18.707f)
                curveTo(8.6799f, 19.0976f, 9.3131f, 19.0977f, 9.7037f, 18.7072f)
                curveTo(10.0942f, 18.3167f, 10.0943f, 17.6835f, 9.7038f, 17.293f)
                lineTo(6.411f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(17.3349f, 14.0f, 20.8645f, 10.5522f, 20.9962f, 6.2492f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 5.4477f, 20.5523f, 5.0f, 20.0f, 5.0f)
                curveTo(19.4477f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                curveTo(19.0f, 9.2384f, 16.4344f, 11.8776f, 13.2249f, 11.9959f)
                lineTo(13.0f, 12.0f)
                horizontalLineTo(6.414f)
                lineTo(9.7042f, 8.7055f)
                close()
            }
        }
        .build()
        return _arrowReplyDown!!
    }

private var _arrowReplyDown: ImageVector? = null
