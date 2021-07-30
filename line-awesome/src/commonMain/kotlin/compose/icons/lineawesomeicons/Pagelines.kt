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

public val LineAwesomeIcons.Pagelines: ImageVector
    get() {
        if (_pagelines != null) {
            return _pagelines!!
        }
        _pagelines = Builder(name = "Pagelines", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0938f, 4.0f)
                curveTo(15.0938f, 4.0f, 13.8867f, 5.6641f, 14.25f, 8.2813f)
                curveTo(14.5273f, 10.2617f, 16.1797f, 11.5039f, 17.0938f, 12.0313f)
                curveTo(17.125f, 12.9844f, 17.1016f, 13.957f, 17.0f, 14.9375f)
                curveTo(16.5391f, 13.8125f, 15.5078f, 11.8438f, 13.5938f, 11.1563f)
                curveTo(11.7344f, 10.4844f, 9.375f, 11.3438f, 9.375f, 11.3438f)
                curveTo(9.6914f, 13.6602f, 11.2109f, 15.4609f, 13.6875f, 15.9063f)
                curveTo(15.2734f, 16.1914f, 16.332f, 16.0078f, 16.875f, 15.875f)
                curveTo(16.625f, 17.5469f, 16.1641f, 19.1992f, 15.5f, 20.6875f)
                curveTo(15.1406f, 19.582f, 13.9883f, 17.3203f, 10.6563f, 16.9375f)
                curveTo(8.6992f, 16.7148f, 6.8438f, 17.9375f, 6.8438f, 17.9375f)
                curveTo(6.8438f, 17.9375f, 8.0352f, 22.2188f, 11.875f, 22.2188f)
                curveTo(13.4336f, 22.2188f, 14.4648f, 21.8633f, 15.0625f, 21.5938f)
                curveTo(15.0313f, 21.6563f, 15.0039f, 21.7188f, 14.9688f, 21.7813f)
                curveTo(13.2617f, 24.8633f, 10.5586f, 27.0f, 6.4688f, 27.0f)
                lineTo(6.4688f, 28.0f)
                curveTo(10.9141f, 28.0f, 14.0117f, 25.5586f, 15.8438f, 22.25f)
                curveTo(15.957f, 22.0469f, 16.0508f, 21.8359f, 16.1563f, 21.625f)
                curveTo(16.4297f, 21.832f, 17.9141f, 22.875f, 20.8438f, 22.875f)
                curveTo(24.082f, 22.875f, 25.5313f, 19.2188f, 25.5313f, 19.2188f)
                curveTo(25.5313f, 19.2188f, 23.9141f, 17.875f, 21.4375f, 17.875f)
                curveTo(19.0938f, 17.875f, 17.3398f, 19.7422f, 16.5313f, 20.8125f)
                curveTo(17.1758f, 19.3047f, 17.6289f, 17.6797f, 17.875f, 16.0313f)
                curveTo(18.0508f, 16.0664f, 21.3945f, 16.668f, 23.2813f, 14.75f)
                curveTo(25.2188f, 12.7813f, 24.9063f, 10.9688f, 24.9063f, 10.9688f)
                curveTo(24.9063f, 10.9688f, 21.6484f, 10.5039f, 19.875f, 12.125f)
                curveTo(18.7578f, 13.1484f, 18.168f, 14.8477f, 17.9375f, 15.625f)
                curveTo(18.1133f, 14.2969f, 18.1523f, 12.9727f, 18.0938f, 11.6875f)
                curveTo(18.4492f, 11.0313f, 18.9375f, 9.9102f, 18.9375f, 8.4375f)
                curveTo(18.9375f, 5.2422f, 15.0938f, 4.0f, 15.0938f, 4.0f)
                close()
            }
        }
        .build()
        return _pagelines!!
    }

private var _pagelines: ImageVector? = null
