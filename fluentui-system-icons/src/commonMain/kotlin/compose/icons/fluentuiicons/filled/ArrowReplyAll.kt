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

public val FilledGroup.ArrowReplyAll: ImageVector
    get() {
        if (_arrowReplyAll != null) {
            return _arrowReplyAll!!
        }
        _arrowReplyAll = Builder(name = "ArrowReplyAll", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7042f, 16.2945f)
                curveTo(14.0945f, 16.6853f, 14.094f, 17.3184f, 13.7032f, 17.7087f)
                curveTo(13.3124f, 18.0989f, 12.6793f, 18.0985f, 12.289f, 17.7077f)
                lineTo(7.2924f, 12.7043f)
                curveTo(6.9024f, 12.3137f, 6.9026f, 11.681f, 7.2928f, 11.2906f)
                lineTo(12.2894f, 6.293f)
                curveTo(12.6799f, 5.9024f, 13.3131f, 5.9023f, 13.7036f, 6.2928f)
                curveTo(14.0942f, 6.6833f, 14.0943f, 7.3165f, 13.7038f, 7.707f)
                lineTo(10.411f, 11.0f)
                horizontalLineTo(13.0f)
                curveTo(17.3349f, 11.0f, 20.8645f, 14.4478f, 20.9962f, 18.7508f)
                lineTo(21.0f, 19.0f)
                curveTo(21.0f, 19.5523f, 20.5523f, 20.0f, 20.0f, 20.0f)
                curveTo(19.4477f, 20.0f, 19.0f, 19.5523f, 19.0f, 19.0f)
                curveTo(19.0f, 15.7616f, 16.4344f, 13.1224f, 13.2249f, 13.0041f)
                lineTo(13.0f, 13.0f)
                horizontalLineTo(10.414f)
                lineTo(13.7042f, 16.2945f)
                close()
                moveTo(8.7037f, 6.2928f)
                curveTo(9.0942f, 6.6833f, 9.0943f, 7.3165f, 8.7038f, 7.707f)
                lineTo(4.4137f, 11.9981f)
                lineTo(8.7042f, 16.2945f)
                curveTo(9.0945f, 16.6853f, 9.094f, 17.3184f, 8.7032f, 17.7087f)
                curveTo(8.3125f, 18.0989f, 7.6793f, 18.0985f, 7.289f, 17.7077f)
                lineTo(2.2924f, 12.7043f)
                curveTo(1.9024f, 12.3137f, 1.9025f, 11.681f, 2.2928f, 11.2906f)
                lineTo(7.2894f, 6.293f)
                curveTo(7.6799f, 5.9024f, 8.3131f, 5.9023f, 8.7037f, 6.2928f)
                close()
            }
        }
        .build()
        return _arrowReplyAll!!
    }

private var _arrowReplyAll: ImageVector? = null
