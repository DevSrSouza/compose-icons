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

public val RegularGroup.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(name = "HeartPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8199f, 5.5791f)
                lineTo(11.9992f, 6.4016f)
                lineTo(11.1759f, 5.5784f)
                curveTo(9.0769f, 3.4793f, 5.6736f, 3.4793f, 3.5745f, 5.5784f)
                curveTo(2.1077f, 7.0452f, 1.6659f, 9.149f, 2.2492f, 10.9995f)
                horizontalLineTo(3.8542f)
                curveTo(3.1957f, 9.5683f, 3.456f, 7.8182f, 4.6352f, 6.639f)
                curveTo(6.1485f, 5.1258f, 8.602f, 5.1258f, 10.1153f, 6.639f)
                lineTo(11.4727f, 7.9965f)
                curveTo(11.7706f, 8.2943f, 12.2553f, 8.2885f, 12.5459f, 7.9836f)
                lineTo(13.8806f, 6.6398f)
                curveTo(15.3977f, 5.1227f, 17.8528f, 5.1227f, 19.3699f, 6.6398f)
                curveTo(20.5498f, 7.8197f, 20.8084f, 9.5663f, 20.1486f, 10.9995f)
                horizontalLineTo(21.7539f)
                curveTo(22.3385f, 9.1484f, 21.8988f, 7.0473f, 20.4306f, 5.5791f)
                curveTo(18.3277f, 3.4762f, 14.9228f, 3.4762f, 12.8199f, 5.5791f)
                close()
                moveTo(11.4699f, 21.0751f)
                lineTo(4.8943f, 14.4995f)
                horizontalLineTo(6.8572f)
                curveTo(6.9082f, 14.4995f, 6.9589f, 14.4973f, 7.009f, 14.493f)
                lineTo(12.0002f, 19.4842f)
                lineTo(16.988f, 14.4995f)
                horizontalLineTo(19.1101f)
                lineTo(12.5306f, 21.0751f)
                curveTo(12.2377f, 21.368f, 11.7628f, 21.368f, 11.4699f, 21.0751f)
                close()
                moveTo(9.4208f, 8.4141f)
                curveTo(9.2925f, 8.1574f, 9.0289f, 7.9964f, 8.7419f, 7.9996f)
                curveTo(8.4549f, 8.0027f, 8.1948f, 8.1693f, 8.0721f, 8.4287f)
                lineTo(6.3823f, 11.9995f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 11.9995f, 2.0f, 12.3353f, 2.0f, 12.7495f)
                curveTo(2.0f, 13.1637f, 2.3358f, 13.4995f, 2.75f, 13.4995f)
                horizontalLineTo(6.8571f)
                curveTo(7.1471f, 13.4995f, 7.411f, 13.3324f, 7.5351f, 13.0703f)
                lineTo(8.7686f, 10.4637f)
                lineTo(11.3292f, 15.5849f)
                curveTo(11.4465f, 15.8196f, 11.6779f, 15.9759f, 11.9394f, 15.9971f)
                curveTo(12.2009f, 16.0183f, 12.4544f, 15.9013f, 12.608f, 15.6886f)
                lineTo(15.3062f, 11.9527f)
                lineTo(16.4356f, 13.2434f)
                curveTo(16.578f, 13.4062f, 16.7837f, 13.4995f, 17.0f, 13.4995f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 13.4995f, 22.0f, 13.1637f, 22.0f, 12.7495f)
                curveTo(22.0f, 12.3353f, 21.6642f, 11.9995f, 21.25f, 11.9995f)
                horizontalLineTo(17.3403f)
                lineTo(15.8144f, 10.2556f)
                curveTo(15.664f, 10.0837f, 15.4433f, 9.9897f, 15.215f, 10.0003f)
                curveTo(14.9867f, 10.011f, 14.7758f, 10.1251f, 14.642f, 10.3104f)
                lineTo(12.117f, 13.8065f)
                lineTo(9.4208f, 8.4141f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
