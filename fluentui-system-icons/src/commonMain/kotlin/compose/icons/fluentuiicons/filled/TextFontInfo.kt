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

public val FilledGroup.TextFontInfo: ImageVector
    get() {
        if (_textFontInfo != null) {
            return _textFontInfo!!
        }
        _textFontInfo = Builder(name = "TextFontInfo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5145f, 1.7501f)
                curveTo(9.9326f, 1.756f, 10.3029f, 2.0215f, 10.4427f, 2.4156f)
                lineTo(13.5961f, 11.3025f)
                curveTo(12.9929f, 11.7563f, 12.4712f, 12.3126f, 12.057f, 12.9457f)
                lineTo(9.4595f, 5.6255f)
                lineTo(6.6048f, 13.0f)
                lineTo(12.0218f, 13.0f)
                curveTo(11.6341f, 13.6055f, 11.3441f, 14.2796f, 11.1739f, 15.0f)
                lineTo(5.8306f, 15.0f)
                lineTo(4.4328f, 18.611f)
                curveTo(4.2335f, 19.126f, 3.6543f, 19.3819f, 3.1393f, 19.1826f)
                curveTo(2.6242f, 18.9832f, 2.3683f, 18.404f, 2.5677f, 17.889f)
                lineTo(8.5677f, 2.389f)
                curveTo(8.7187f, 1.999f, 9.0963f, 1.7442f, 9.5145f, 1.7501f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.2761f, 17.2239f, 19.5f, 17.5f, 19.5f)
                curveTo(17.7761f, 19.5f, 18.0f, 19.2761f, 18.0f, 19.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 15.7239f, 17.7761f, 15.5f, 17.5f, 15.5f)
                curveTo(17.2239f, 15.5f, 17.0f, 15.7239f, 17.0f, 16.0f)
                close()
                moveTo(18.25f, 13.75f)
                curveTo(18.25f, 14.1642f, 17.9142f, 14.5f, 17.5f, 14.5f)
                curveTo(17.0858f, 14.5f, 16.75f, 14.1642f, 16.75f, 13.75f)
                curveTo(16.75f, 13.3358f, 17.0858f, 13.0f, 17.5f, 13.0f)
                curveTo(17.9142f, 13.0f, 18.25f, 13.3358f, 18.25f, 13.75f)
                close()
                moveTo(23.0f, 16.5f)
                curveTo(23.0f, 19.5376f, 20.5376f, 22.0f, 17.5f, 22.0f)
                curveTo(14.4624f, 22.0f, 12.0f, 19.5376f, 12.0f, 16.5f)
                curveTo(12.0f, 13.4624f, 14.4624f, 11.0f, 17.5f, 11.0f)
                curveTo(20.5376f, 11.0f, 23.0f, 13.4624f, 23.0f, 16.5f)
                close()
                moveTo(22.0f, 16.5f)
                curveTo(22.0f, 14.0147f, 19.9853f, 12.0f, 17.5f, 12.0f)
                curveTo(15.0147f, 12.0f, 13.0f, 14.0147f, 13.0f, 16.5f)
                curveTo(13.0f, 18.9853f, 15.0147f, 21.0f, 17.5f, 21.0f)
                curveTo(19.9853f, 21.0f, 22.0f, 18.9853f, 22.0f, 16.5f)
                close()
            }
        }
        .build()
        return _textFontInfo!!
    }

private var _textFontInfo: ImageVector? = null
