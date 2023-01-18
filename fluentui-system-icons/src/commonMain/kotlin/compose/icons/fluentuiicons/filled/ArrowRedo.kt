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

public val FilledGroup.ArrowRedo: ImageVector
    get() {
        if (_arrowRedo != null) {
            return _arrowRedo!!
        }
        _arrowRedo = Builder(name = "ArrowRedo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0001f, 7.586f)
                lineTo(14.359f, 3.9509f)
                curveTo(11.7578f, 1.3497f, 7.5404f, 1.3497f, 4.9392f, 3.9509f)
                curveTo(2.338f, 6.5521f, 2.338f, 10.7695f, 4.9392f, 13.3708f)
                lineTo(13.2777f, 21.7078f)
                curveTo(13.6683f, 22.0982f, 14.3014f, 22.098f, 14.6919f, 21.7075f)
                curveTo(15.0824f, 21.317f, 15.0822f, 20.6838f, 14.6916f, 20.2933f)
                lineTo(6.3534f, 11.9565f)
                curveTo(4.5332f, 10.1364f, 4.5332f, 7.1853f, 6.3534f, 5.3651f)
                curveTo(8.1167f, 3.6018f, 10.9413f, 3.5467f, 12.7714f, 5.2003f)
                lineTo(12.9453f, 5.3656f)
                lineTo(16.5851f, 8.999f)
                lineTo(12.0001f, 8.9995f)
                curveTo(11.4873f, 8.9995f, 11.0646f, 9.3856f, 11.0069f, 9.8829f)
                lineTo(11.0001f, 9.9995f)
                curveTo(11.0001f, 10.5124f, 11.3862f, 10.935f, 11.8835f, 10.9928f)
                lineTo(12.0001f, 10.9995f)
                horizontalLineTo(19.0001f)
                curveTo(19.513f, 10.9995f, 19.9356f, 10.6135f, 19.9934f, 10.1162f)
                lineTo(20.0001f, 9.9995f)
                verticalLineTo(3.0024f)
                curveTo(20.0001f, 2.4501f, 19.5524f, 2.0024f, 19.0001f, 2.0024f)
                curveTo(18.4873f, 2.0024f, 18.0646f, 2.3884f, 18.0069f, 2.8857f)
                lineTo(18.0001f, 3.0024f)
                verticalLineTo(7.586f)
                lineTo(14.359f, 3.9509f)
                lineTo(18.0001f, 7.586f)
                close()
            }
        }
        .build()
        return _arrowRedo!!
    }

private var _arrowRedo: ImageVector? = null
