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

public val FilledGroup.InkingTool: ImageVector
    get() {
        if (_inkingTool != null) {
            return _inkingTool!!
        }
        _inkingTool = Builder(name = "InkingTool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8199f, 20.0408f)
                curveTo(13.6981f, 20.4958f, 13.5101f, 20.9211f, 13.2567f, 21.3147f)
                curveTo(13.1343f, 21.5047f, 12.9706f, 21.6646f, 12.7778f, 21.7824f)
                curveTo(12.1126f, 22.1891f, 11.2556f, 22.0157f, 10.7903f, 21.3936f)
                lineTo(10.7078f, 21.2717f)
                lineTo(10.5838f, 21.0535f)
                curveTo(10.4175f, 20.7401f, 10.2865f, 20.4019f, 10.1905f, 20.0395f)
                curveTo(10.0141f, 19.3735f, 9.9625f, 18.6925f, 10.0349f, 17.9992f)
                lineTo(13.9652f, 18.0004f)
                curveTo(14.0387f, 18.7213f, 13.991f, 19.402f, 13.8199f, 20.0408f)
                close()
                moveTo(18.477f, 8.9991f)
                lineTo(15.0123f, 16.0854f)
                curveTo(14.7905f, 16.5389f, 14.3881f, 16.8671f, 13.9165f, 17.0005f)
                lineTo(10.178f, 16.999f)
                lineTo(10.0714f, 16.9687f)
                curveTo(9.6996f, 16.8414f, 9.3771f, 16.589f, 9.1631f, 16.2488f)
                lineTo(9.0781f, 16.0978f)
                lineTo(5.536f, 8.9991f)
                horizontalLineTo(18.477f)
                close()
                moveTo(20.2498f, 1.998f)
                curveTo(20.6295f, 1.998f, 20.9433f, 2.2802f, 20.993f, 2.6463f)
                lineTo(20.9998f, 2.748f)
                verticalLineTo(6.2481f)
                curveTo(20.9998f, 7.1662f, 20.2927f, 7.9192f, 19.3934f, 7.9922f)
                lineTo(19.2498f, 7.9981f)
                horizontalLineTo(4.7519f)
                curveTo(3.8338f, 7.9981f, 3.0808f, 7.2909f, 3.0078f, 6.3916f)
                lineTo(3.002f, 6.2481f)
                verticalLineTo(2.748f)
                curveTo(3.002f, 2.3684f, 3.2841f, 2.0546f, 3.6502f, 2.0049f)
                lineTo(3.752f, 1.998f)
                horizontalLineTo(20.2498f)
                close()
            }
        }
        .build()
        return _inkingTool!!
    }

private var _inkingTool: ImageVector? = null
