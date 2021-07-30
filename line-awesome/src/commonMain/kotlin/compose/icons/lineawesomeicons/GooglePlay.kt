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

public val LineAwesomeIcons.GooglePlay: ImageVector
    get() {
        if (_googlePlay != null) {
            return _googlePlay!!
        }
        _googlePlay = Builder(name = "GooglePlay", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 3.0f)
                curveTo(7.6758f, 2.9922f, 7.6094f, 3.0273f, 7.5313f, 3.0313f)
                curveTo(7.4648f, 3.0352f, 7.4102f, 3.0195f, 7.3438f, 3.0313f)
                curveTo(7.332f, 3.0313f, 7.3242f, 3.0313f, 7.3125f, 3.0313f)
                curveTo(7.2813f, 3.0313f, 7.25f, 3.0313f, 7.2188f, 3.0313f)
                curveTo(7.1094f, 3.0547f, 7.0039f, 3.0977f, 6.9063f, 3.1563f)
                curveTo(6.8008f, 3.2109f, 6.7031f, 3.2852f, 6.625f, 3.375f)
                curveTo(6.2344f, 3.7031f, 6.0f, 4.2109f, 6.0f, 4.6875f)
                lineTo(6.0f, 27.4688f)
                curveTo(6.0f, 27.9609f, 6.2188f, 28.5547f, 6.75f, 28.8438f)
                curveTo(6.7891f, 28.8633f, 6.8359f, 28.8594f, 6.875f, 28.875f)
                curveTo(6.9063f, 28.8867f, 6.9375f, 28.8984f, 6.9688f, 28.9063f)
                curveTo(7.4453f, 29.0664f, 7.9414f, 28.9727f, 8.3125f, 28.75f)
                curveTo(8.3242f, 28.75f, 8.332f, 28.75f, 8.3438f, 28.75f)
                curveTo(8.7734f, 28.4883f, 17.75f, 23.0f, 17.75f, 23.0f)
                lineTo(22.5313f, 20.125f)
                curveTo(22.5313f, 20.125f, 26.5859f, 17.6719f, 27.125f, 17.3438f)
                curveTo(27.582f, 17.0664f, 28.0078f, 16.5391f, 28.0f, 15.9063f)
                curveTo(27.9922f, 15.2734f, 27.5547f, 14.8047f, 27.125f, 14.5625f)
                curveTo(26.9883f, 14.4844f, 25.7852f, 13.7617f, 24.6875f, 13.0938f)
                curveTo(23.6367f, 12.4531f, 22.7148f, 11.8984f, 22.625f, 11.8438f)
                curveTo(22.5938f, 11.8203f, 22.5625f, 11.8008f, 22.5313f, 11.7813f)
                lineTo(17.75f, 8.875f)
                curveTo(17.75f, 8.875f, 9.0508f, 3.5977f, 8.5313f, 3.2813f)
                curveTo(8.3008f, 3.1445f, 8.0273f, 3.0313f, 7.75f, 3.0f)
                close()
                moveTo(8.0f, 6.0938f)
                lineTo(17.4375f, 15.9375f)
                lineTo(8.0f, 25.7813f)
                close()
                moveTo(12.8125f, 8.2188f)
                curveTo(14.5781f, 9.2891f, 16.7188f, 10.5938f, 16.7188f, 10.5938f)
                lineTo(20.4063f, 12.8438f)
                lineTo(18.8125f, 14.5f)
                close()
                moveTo(22.1563f, 13.9063f)
                curveTo(22.5391f, 14.1406f, 22.8906f, 14.3477f, 23.6563f, 14.8125f)
                curveTo(24.4922f, 15.3203f, 25.0742f, 15.6445f, 25.5625f, 15.9375f)
                curveTo(24.6445f, 16.4922f, 22.9023f, 17.5664f, 22.1875f, 18.0f)
                lineTo(20.2188f, 15.9375f)
                close()
                moveTo(18.8125f, 17.4063f)
                lineTo(20.4063f, 19.0625f)
                lineTo(16.7188f, 21.3125f)
                curveTo(16.7188f, 21.3125f, 14.5273f, 22.6289f, 12.7813f, 23.6875f)
                close()
            }
        }
        .build()
        return _googlePlay!!
    }

private var _googlePlay: ImageVector? = null
