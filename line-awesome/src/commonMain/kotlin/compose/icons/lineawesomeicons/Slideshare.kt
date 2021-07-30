package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Slideshare: ImageVector
    get() {
        if (_slideshare != null) {
            return _slideshare!!
        }
        _slideshare = Builder(name = "Slideshare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(6.3555f, 4.0f, 5.0f, 5.3555f, 5.0f, 7.0f)
                lineTo(5.0f, 15.4063f)
                curveTo(4.2305f, 14.9609f, 3.6289f, 14.5625f, 3.5f, 14.5625f)
                curveTo(3.1406f, 14.5625f, 3.0f, 14.9063f, 3.0f, 15.125f)
                curveTo(3.0f, 16.2461f, 6.3359f, 18.4063f, 8.4375f, 19.1875f)
                curveTo(8.4375f, 19.1875f, 7.9063f, 20.7383f, 7.9063f, 22.5f)
                curveTo(7.9063f, 24.2617f, 8.9922f, 28.0f, 12.4375f, 28.0f)
                curveTo(12.4375f, 28.0f, 15.0f, 27.9922f, 15.0f, 25.4688f)
                lineTo(15.0f, 20.5f)
                lineTo(17.0f, 21.0938f)
                lineTo(17.0f, 25.4688f)
                curveTo(17.0f, 27.9922f, 19.5625f, 28.0f, 19.5625f, 28.0f)
                curveTo(23.0078f, 28.0f, 24.0938f, 24.2617f, 24.0938f, 22.5f)
                curveTo(24.0938f, 20.7383f, 23.5625f, 19.1875f, 23.5625f, 19.1875f)
                curveTo(25.6641f, 18.4063f, 29.0f, 16.2461f, 29.0f, 15.125f)
                curveTo(29.0f, 14.9063f, 28.8594f, 14.5625f, 28.5f, 14.5625f)
                curveTo(28.3711f, 14.5625f, 27.7695f, 14.9609f, 27.0f, 15.4063f)
                lineTo(27.0f, 7.0f)
                curveTo(27.0f, 5.3555f, 25.6445f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(8.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                curveTo(24.5664f, 6.0f, 25.0f, 6.4336f, 25.0f, 7.0f)
                lineTo(25.0f, 16.4063f)
                curveTo(23.8867f, 16.8711f, 22.6016f, 17.25f, 21.2813f, 17.25f)
                curveTo(19.8203f, 17.25f, 18.9023f, 17.1563f, 18.2813f, 17.1563f)
                curveTo(17.0781f, 17.1563f, 17.0f, 18.4375f, 17.0f, 18.4375f)
                lineTo(17.0f, 19.3438f)
                lineTo(14.6563f, 17.5625f)
                curveTo(14.4688f, 17.3398f, 14.168f, 17.1563f, 13.7188f, 17.1563f)
                curveTo(13.0977f, 17.1563f, 12.1797f, 17.25f, 10.7188f, 17.25f)
                curveTo(9.3984f, 17.25f, 8.1133f, 16.8711f, 7.0f, 16.4063f)
                lineTo(7.0f, 7.0f)
                curveTo(7.0f, 6.4336f, 7.4336f, 6.0f, 8.0f, 6.0f)
                close()
                moveTo(12.3125f, 10.9688f)
                curveTo(10.8359f, 10.9688f, 9.6563f, 12.1133f, 9.6563f, 13.5f)
                curveTo(9.6563f, 14.8867f, 10.8359f, 16.0f, 12.3125f, 16.0f)
                curveTo(13.7891f, 16.0f, 15.0f, 14.8867f, 15.0f, 13.5f)
                curveTo(15.0f, 12.1133f, 13.7891f, 10.9688f, 12.3125f, 10.9688f)
                close()
                moveTo(19.6875f, 10.9688f)
                curveTo(18.2109f, 10.9688f, 17.0f, 12.1133f, 17.0f, 13.5f)
                curveTo(17.0f, 14.8867f, 18.2109f, 16.0f, 19.6875f, 16.0f)
                curveTo(21.1641f, 16.0f, 22.3438f, 14.8867f, 22.3438f, 13.5f)
                curveTo(22.3438f, 12.1133f, 21.1641f, 10.9688f, 19.6875f, 10.9688f)
                close()
            }
        }
        .build()
        return _slideshare!!
    }

private var _slideshare: ImageVector? = null
