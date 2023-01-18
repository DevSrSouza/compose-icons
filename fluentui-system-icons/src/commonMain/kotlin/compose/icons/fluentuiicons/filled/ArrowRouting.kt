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

public val FilledGroup.ArrowRouting: ImageVector
    get() {
        if (_arrowRouting != null) {
            return _arrowRouting!!
        }
        _arrowRouting = Builder(name = "ArrowRouting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7094f, 2.2923f)
                curveTo(18.3186f, 1.9021f, 17.6854f, 1.9026f, 17.2952f, 2.2935f)
                curveTo(16.905f, 2.6843f, 16.9055f, 3.3175f, 17.2964f, 3.7077f)
                lineTo(18.5876f, 4.9968f)
                horizontalLineTo(12.9959f)
                curveTo(11.339f, 4.9968f, 9.9958f, 6.3399f, 9.9958f, 7.9968f)
                verticalLineTo(16.9964f)
                curveTo(9.9958f, 17.5487f, 9.5481f, 17.9964f, 8.9958f, 17.9964f)
                horizontalLineTo(7.8278f)
                curveTo(7.4149f, 16.8333f, 6.3047f, 16.0005f, 5.0f, 16.0005f)
                curveTo(3.3431f, 16.0005f, 2.0f, 17.3436f, 2.0f, 19.0005f)
                curveTo(2.0f, 20.6573f, 3.3431f, 22.0005f, 5.0f, 22.0005f)
                curveTo(6.3078f, 22.0005f, 7.4201f, 21.1637f, 7.8307f, 19.9964f)
                horizontalLineTo(8.9958f)
                curveTo(10.6527f, 19.9964f, 11.9959f, 18.6533f, 11.9959f, 16.9964f)
                verticalLineTo(7.9968f)
                curveTo(11.9959f, 7.4445f, 12.4436f, 6.9968f, 12.9959f, 6.9968f)
                horizontalLineTo(18.5846f)
                lineTo(17.2896f, 8.2876f)
                curveTo(16.8984f, 8.6774f, 16.8973f, 9.3106f, 17.2872f, 9.7018f)
                curveTo(17.6771f, 10.0929f, 18.3103f, 10.094f, 18.7014f, 9.7041f)
                lineTo(21.7105f, 6.7051f)
                curveTo(21.8986f, 6.5175f, 22.0044f, 6.2629f, 22.0046f, 5.9972f)
                curveTo(22.0047f, 5.7316f, 21.8991f, 5.4768f, 21.7111f, 5.2891f)
                lineTo(18.7094f, 2.2923f)
                close()
            }
        }
        .build()
        return _arrowRouting!!
    }

private var _arrowRouting: ImageVector? = null
