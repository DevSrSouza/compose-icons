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

public val RegularGroup.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 12.0002f)
                horizontalLineTo(19.2507f)
                curveTo(19.6649f, 12.0002f, 20.0007f, 12.3359f, 20.0007f, 12.7502f)
                curveTo(20.0007f, 13.1299f, 19.7185f, 13.4437f, 19.3524f, 13.4933f)
                lineTo(19.2507f, 13.5002f)
                lineTo(16.2763f, 13.5001f)
                curveTo(17.1552f, 14.3132f, 17.6124f, 15.2931f, 17.6124f, 16.4347f)
                curveTo(17.6124f, 19.2599f, 14.3804f, 21.0745f, 10.8577f, 20.6651f)
                curveTo(8.6233f, 20.4054f, 7.049f, 19.5095f, 6.2228f, 17.9632f)
                curveTo(6.0277f, 17.5978f, 6.1656f, 17.1434f, 6.531f, 16.9482f)
                curveTo(6.8963f, 16.7531f, 7.3507f, 16.891f, 7.5459f, 17.2564f)
                curveTo(8.1161f, 18.3236f, 9.2483f, 18.968f, 11.0308f, 19.1751f)
                curveTo(13.7738f, 19.4939f, 16.1124f, 18.1809f, 16.1124f, 16.4347f)
                curveTo(16.1124f, 15.2627f, 15.3072f, 14.3077f, 13.547f, 13.5485f)
                lineTo(13.431f, 13.5f)
                lineTo(4.75f, 13.5002f)
                curveTo(4.3703f, 13.5002f, 4.0565f, 13.218f, 4.0068f, 12.8519f)
                lineTo(4.0f, 12.7502f)
                curveTo(4.0f, 12.3705f, 4.2821f, 12.0567f, 4.6482f, 12.007f)
                lineTo(4.75f, 12.0002f)
                horizontalLineTo(19.2507f)
                horizontalLineTo(4.75f)
                close()
                moveTo(6.261f, 8.1234f)
                curveTo(6.4131f, 5.2922f, 9.0827f, 3.6547f, 12.5845f, 4.0616f)
                curveTo(14.7732f, 4.316f, 16.4484f, 5.1148f, 17.5674f, 6.4709f)
                curveTo(17.8311f, 6.7904f, 17.7858f, 7.2631f, 17.4663f, 7.5267f)
                curveTo(17.1469f, 7.7904f, 16.6742f, 7.7451f, 16.4105f, 7.4256f)
                curveTo(15.5584f, 6.393f, 14.2394f, 5.7641f, 12.4113f, 5.5516f)
                curveTo(9.6937f, 5.2358f, 7.761f, 6.3565f, 7.761f, 8.1234f)
                curveTo(7.761f, 8.8954f, 7.9948f, 9.4715f, 8.5907f, 10.1045f)
                lineTo(8.719f, 10.2372f)
                curveTo(8.8132f, 10.3327f, 8.9157f, 10.4324f, 8.9696f, 10.4763f)
                lineTo(9.0f, 10.4979f)
                horizontalLineTo(7.0808f)
                lineTo(7.0561f, 10.4589f)
                curveTo(6.9131f, 10.2526f, 6.1997f, 9.2635f, 6.261f, 8.1234f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
