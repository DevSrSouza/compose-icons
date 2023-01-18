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

public val FilledGroup.MailAttach: ImageVector
    get() {
        if (_mailAttach != null) {
            return _mailAttach!!
        }
        _mailAttach = Builder(name = "MailAttach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9542f, 4.1f)
                curveTo(18.7655f, 3.2888f, 20.0808f, 3.2888f, 20.8921f, 4.1f)
                curveTo(21.7034f, 4.9113f, 21.7034f, 6.2265f, 20.8921f, 7.0377f)
                curveTo(20.8655f, 7.0643f, 20.8413f, 7.0924f, 20.8196f, 7.1217f)
                lineTo(16.6388f, 11.3012f)
                curveTo(16.3765f, 11.5635f, 15.9512f, 11.5636f, 15.6889f, 11.3013f)
                curveTo(15.4267f, 11.0391f, 15.4266f, 10.6141f, 15.6886f, 10.3518f)
                lineTo(19.5226f, 6.5292f)
                curveTo(19.8158f, 6.2368f, 19.8165f, 5.7621f, 19.5241f, 5.4689f)
                curveTo(19.2317f, 5.1757f, 18.757f, 5.1751f, 18.4638f, 5.4674f)
                lineTo(14.6286f, 9.2913f)
                curveTo(13.7807f, 10.1391f, 13.7807f, 11.5137f, 14.6286f, 12.3615f)
                curveTo(15.4764f, 13.2093f, 16.8511f, 13.2093f, 17.6989f, 12.3615f)
                lineTo(22.0237f, 8.0381f)
                curveTo(22.0622f, 7.9996f, 22.0957f, 7.9579f, 22.1241f, 7.9139f)
                curveTo(23.3466f, 6.5088f, 23.2894f, 4.3768f, 21.9524f, 3.0398f)
                curveTo(20.5555f, 1.6431f, 18.2908f, 1.6431f, 16.8939f, 3.0398f)
                lineTo(13.2157f, 6.7176f)
                curveTo(12.9229f, 7.0104f, 12.9229f, 7.4851f, 13.2157f, 7.7778f)
                curveTo(13.5085f, 8.0706f, 13.9832f, 8.0706f, 14.276f, 7.7779f)
                lineTo(17.9542f, 4.1f)
                close()
                moveTo(12.5088f, 8.4846f)
                curveTo(12.8079f, 8.7837f, 13.1885f, 8.9519f, 13.5791f, 8.9891f)
                curveTo(13.035f, 9.7524f, 12.8698f, 10.7027f, 13.0834f, 11.5797f)
                lineTo(11.9964f, 12.149f)
                lineTo(2.0162f, 6.9214f)
                curveTo(2.1738f, 5.3413f, 3.4638f, 4.0946f, 5.063f, 4.0044f)
                lineTo(5.2488f, 3.9991f)
                horizontalLineTo(14.5208f)
                lineTo(12.5089f, 6.0108f)
                curveTo(11.8257f, 6.6939f, 11.8256f, 7.8015f, 12.5088f, 8.4846f)
                close()
                moveTo(13.7741f, 12.9104f)
                curveTo(13.8212f, 12.9643f, 13.8704f, 13.0169f, 13.9217f, 13.0683f)
                curveTo(15.1599f, 14.3064f, 17.1675f, 14.3064f, 18.4058f, 13.0684f)
                lineTo(21.9929f, 9.4823f)
                verticalLineTo(16.7437f)
                curveTo(21.9929f, 18.476f, 20.6369f, 19.8916f, 18.9284f, 19.9871f)
                lineTo(18.7441f, 19.9923f)
                horizontalLineTo(5.2488f)
                curveTo(3.5164f, 19.9923f, 2.1007f, 18.6364f, 2.0051f, 16.928f)
                lineTo(2.0f, 16.7437f)
                verticalLineTo(8.6052f)
                lineTo(11.6486f, 13.6594f)
                curveTo(11.8664f, 13.7735f, 12.1264f, 13.7735f, 12.3443f, 13.6594f)
                lineTo(13.7741f, 12.9104f)
                close()
            }
        }
        .build()
        return _mailAttach!!
    }

private var _mailAttach: ImageVector? = null
