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

public val FilledGroup.TextCaseTitle: ImageVector
    get() {
        if (_textCaseTitle != null) {
            return _textCaseTitle!!
        }
        _textCaseTitle = Builder(name = "TextCaseTitle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4427f, 3.4156f)
                curveTo(8.3029f, 3.0215f, 7.9326f, 2.756f, 7.5145f, 2.7501f)
                curveTo(7.0963f, 2.7442f, 6.7187f, 2.999f, 6.5677f, 3.389f)
                lineTo(0.5677f, 18.889f)
                curveTo(0.3683f, 19.404f, 0.6242f, 19.9832f, 1.1393f, 20.1826f)
                curveTo(1.6543f, 20.3819f, 2.2335f, 20.126f, 2.4328f, 19.611f)
                lineTo(3.8306f, 16.0f)
                lineTo(10.786f, 16.0f)
                lineTo(12.0578f, 19.5844f)
                curveTo(12.2425f, 20.1049f, 12.8142f, 20.3771f, 13.3347f, 20.1924f)
                curveTo(13.8552f, 20.0077f, 14.1274f, 19.4361f, 13.9427f, 18.9156f)
                lineTo(8.4427f, 3.4156f)
                close()
                moveTo(4.6048f, 14.0f)
                lineTo(7.4595f, 6.6255f)
                lineTo(10.0763f, 14.0f)
                lineTo(4.6048f, 14.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveTo(16.5523f, 3.0f, 17.0f, 3.4477f, 17.0f, 4.0f)
                verticalLineTo(11.6187f)
                curveTo(17.5883f, 11.2252f, 18.2714f, 11.0f, 19.0f, 11.0f)
                curveTo(21.2091f, 11.0f, 23.0f, 13.0707f, 23.0f, 15.625f)
                curveTo(23.0f, 18.1793f, 21.2091f, 20.25f, 19.0f, 20.25f)
                curveTo(18.2467f, 20.25f, 17.5421f, 20.0092f, 16.9405f, 19.5906f)
                curveTo(16.8012f, 19.9752f, 16.4327f, 20.25f, 16.0f, 20.25f)
                curveTo(15.4477f, 20.25f, 15.0f, 19.8023f, 15.0f, 19.25f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 3.4477f, 15.4477f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(19.0f, 18.25f)
                curveTo(19.8419f, 18.25f, 21.0f, 17.3572f, 21.0f, 15.625f)
                curveTo(21.0f, 13.8928f, 19.8419f, 13.0f, 19.0f, 13.0f)
                curveTo(18.1581f, 13.0f, 17.0f, 13.8928f, 17.0f, 15.625f)
                curveTo(17.0f, 17.3572f, 18.1581f, 18.25f, 19.0f, 18.25f)
                close()
            }
        }
        .build()
        return _textCaseTitle!!
    }

private var _textCaseTitle: ImageVector? = null
