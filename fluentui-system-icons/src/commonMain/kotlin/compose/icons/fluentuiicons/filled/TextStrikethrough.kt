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

public val FilledGroup.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8479f, 11.5004f)
                horizontalLineTo(19.5007f)
                curveTo(20.0529f, 11.5004f, 20.5007f, 11.9482f, 20.5007f, 12.5004f)
                curveTo(20.5007f, 13.0527f, 20.0529f, 13.5004f, 19.5007f, 13.5004f)
                horizontalLineTo(17.1138f)
                curveTo(17.7748f, 14.2754f, 18.1124f, 15.1754f, 18.1124f, 16.1849f)
                curveTo(18.1124f, 19.1139f, 14.8316f, 21.0998f, 11.0788f, 20.6637f)
                curveTo(8.7511f, 20.3932f, 7.1144f, 19.4448f, 6.2523f, 17.8312f)
                curveTo(5.9921f, 17.3441f, 6.0447f, 16.8156f, 6.5f, 16.5003f)
                curveTo(6.9553f, 16.1849f, 7.7562f, 16.4017f, 8.0164f, 16.8888f)
                curveTo(8.5493f, 17.8864f, 9.6199f, 18.4807f, 11.3097f, 18.6771f)
                curveTo(13.8964f, 18.9777f, 16.1124f, 17.7672f, 16.1124f, 16.1849f)
                curveTo(16.1124f, 15.0867f, 15.5649f, 14.2455f, 14.005f, 13.5004f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 13.5004f, 4.0f, 13.0527f, 4.0f, 12.5004f)
                curveTo(4.0f, 11.9482f, 4.4477f, 11.5004f, 5.0f, 11.5004f)
                horizontalLineTo(13.812f)
                curveTo(13.8307f, 11.5002f, 13.8318f, 11.5002f, 13.8479f, 11.5004f)
                close()
                moveTo(6.9867f, 9.6953f)
                curveTo(6.8819f, 9.5371f, 6.7829f, 9.3703f, 6.6891f, 9.186f)
                curveTo(6.3886f, 8.5954f, 6.2208f, 7.9711f, 6.2542f, 7.3503f)
                curveTo(6.4135f, 4.3857f, 9.1881f, 2.6373f, 12.8562f, 3.0636f)
                curveTo(15.1166f, 3.3263f, 16.8455f, 4.1475f, 18.0031f, 5.5503f)
                curveTo(18.3546f, 5.9763f, 18.276f, 6.5988f, 17.85f, 6.9503f)
                curveTo(17.424f, 7.3018f, 16.8015f, 7.2762f, 16.45f, 6.8503f)
                curveTo(15.6372f, 5.8653f, 14.3821f, 5.2544f, 12.6253f, 5.0502f)
                curveTo(10.0647f, 4.7526f, 8.2538f, 5.7684f, 8.2538f, 7.3737f)
                curveTo(8.2538f, 8.0875f, 8.4927f, 8.5935f, 9.0156f, 9.1834f)
                curveTo(9.2407f, 9.4374f, 9.6627f, 9.709f, 10.2815f, 9.9982f)
                horizontalLineTo(7.1922f)
                curveTo(7.0808f, 9.835f, 7.0123f, 9.734f, 6.9867f, 9.6953f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
