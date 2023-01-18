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

public val RegularGroup.TextFontSize: ImageVector
    get() {
        if (_textFontSize != null) {
            return _textFontSize!!
        }
        _textFontSize = Builder(name = "TextFontSize", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.212f, 17.11f)
                lineTo(15.0434f, 3.4991f)
                curveTo(15.2657f, 2.8727f, 16.1126f, 2.8359f, 16.4083f, 3.3887f)
                lineTo(16.457f, 3.4992f)
                lineTo(21.957f, 18.9997f)
                curveTo(22.0955f, 19.3901f, 21.8913f, 19.8188f, 21.501f, 19.9573f)
                curveTo(21.1431f, 20.0843f, 20.7531f, 19.9233f, 20.5838f, 19.5949f)
                lineTo(20.5434f, 19.5013f)
                lineTo(18.946f, 15.0f)
                horizontalLineTo(12.552f)
                lineTo(10.9726f, 19.4521f)
                curveTo(10.9201f, 19.6396f, 10.7955f, 19.8048f, 10.6175f, 19.9045f)
                lineTo(10.5253f, 19.9482f)
                curveTo(10.1721f, 20.0875f, 9.7767f, 19.9401f, 9.5962f, 19.6178f)
                lineTo(9.5525f, 19.5256f)
                lineTo(8.556f, 17.0f)
                horizontalLineTo(4.443f)
                lineTo(3.4477f, 19.5209f)
                curveTo(3.3081f, 19.874f, 2.9303f, 20.0621f, 2.5716f, 19.9737f)
                lineTo(2.4745f, 19.9426f)
                curveTo(2.1214f, 19.803f, 1.9333f, 19.4253f, 2.0217f, 19.0666f)
                lineTo(2.0527f, 18.9694f)
                lineTo(5.8063f, 9.4743f)
                curveTo(6.0417f, 8.8788f, 6.8488f, 8.8441f, 7.151f, 9.3698f)
                lineTo(7.2015f, 9.4749f)
                lineTo(10.212f, 17.11f)
                lineTo(15.0434f, 3.4991f)
                lineTo(10.212f, 17.11f)
                close()
                moveTo(6.5029f, 11.7923f)
                lineTo(5.036f, 15.5f)
                horizontalLineTo(7.964f)
                lineTo(6.5029f, 11.7923f)
                close()
                moveTo(15.7501f, 5.9925f)
                lineTo(13.084f, 13.5f)
                horizontalLineTo(18.414f)
                lineTo(15.7501f, 5.9925f)
                close()
            }
        }
        .build()
        return _textFontSize!!
    }

private var _textFontSize: ImageVector? = null
