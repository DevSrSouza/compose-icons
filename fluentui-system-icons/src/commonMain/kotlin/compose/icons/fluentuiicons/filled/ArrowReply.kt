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

public val FilledGroup.ArrowReply: ImageVector
    get() {
        if (_arrowReply != null) {
            return _arrowReply!!
        }
        _arrowReply = Builder(name = "ArrowReply", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7042f, 16.2945f)
                curveTo(10.0945f, 16.6853f, 10.094f, 17.3184f, 9.7032f, 17.7087f)
                curveTo(9.3125f, 18.0989f, 8.6793f, 18.0985f, 8.289f, 17.7077f)
                lineTo(3.2924f, 12.7043f)
                curveTo(2.9024f, 12.3137f, 2.9025f, 11.681f, 3.2928f, 11.2906f)
                lineTo(8.2894f, 6.293f)
                curveTo(8.6799f, 5.9024f, 9.3131f, 5.9023f, 9.7037f, 6.2928f)
                curveTo(10.0942f, 6.6833f, 10.0943f, 7.3165f, 9.7038f, 7.707f)
                lineTo(6.411f, 11.0f)
                horizontalLineTo(13.0f)
                curveTo(17.3349f, 11.0f, 20.8645f, 14.4478f, 20.9962f, 18.7508f)
                lineTo(21.0f, 19.0f)
                curveTo(21.0f, 19.5523f, 20.5523f, 20.0f, 20.0f, 20.0f)
                curveTo(19.4477f, 20.0f, 19.0f, 19.5523f, 19.0f, 19.0f)
                curveTo(19.0f, 15.7616f, 16.4344f, 13.1224f, 13.2249f, 13.0041f)
                lineTo(13.0f, 13.0f)
                horizontalLineTo(6.414f)
                lineTo(9.7042f, 16.2945f)
                close()
            }
        }
        .build()
        return _arrowReply!!
    }

private var _arrowReply: ImageVector? = null
