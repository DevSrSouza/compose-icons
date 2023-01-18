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

public val FilledGroup.ThumbDislike: ImageVector
    get() {
        if (_thumbDislike != null) {
            return _thumbDislike!!
        }
        _thumbDislike = Builder(name = "ThumbDislike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0556f, 14.1826f)
                curveTo(15.5164f, 15.6096f, 15.7491f, 16.8587f, 15.7491f, 17.9358f)
                curveTo(15.7491f, 20.3345f, 14.81f, 22.1832f, 13.2491f, 22.1832f)
                curveTo(12.4493f, 22.1832f, 12.1712f, 21.7335f, 11.8665f, 20.6367f)
                lineTo(11.5968f, 19.6152f)
                curveTo(11.4958f, 19.2565f, 11.32f, 18.6457f, 11.0697f, 17.7842f)
                curveTo(11.063f, 17.7611f, 11.0532f, 17.7394f, 11.0403f, 17.7193f)
                lineTo(8.1736f, 13.2336f)
                curveTo(7.4955f, 12.1727f, 6.4951f, 11.3572f, 5.3192f, 10.907f)
                lineTo(4.062f, 10.4256f)
                curveTo(3.2686f, 10.1218f, 2.808f, 9.2922f, 2.9697f, 8.4582f)
                lineTo(3.6558f, 4.9195f)
                curveTo(3.823f, 4.0575f, 4.4763f, 3.3715f, 5.3291f, 3.1625f)
                lineTo(13.5786f, 1.1406f)
                curveTo(16.1098f, 0.5202f, 18.6682f, 2.0551f, 19.3121f, 4.5804f)
                lineTo(20.886f, 10.7531f)
                curveTo(21.2612f, 12.2248f, 20.3723f, 13.7221f, 18.9007f, 14.0973f)
                curveTo(18.6786f, 14.1539f, 18.4504f, 14.1826f, 18.2212f, 14.1826f)
                horizontalLineTo(15.0556f)
                close()
            }
        }
        .build()
        return _thumbDislike!!
    }

private var _thumbDislike: ImageVector? = null
