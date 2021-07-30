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

public val LineAwesomeIcons.PlaneDepartureSolid: ImageVector
    get() {
        if (_planeDepartureSolid != null) {
            return _planeDepartureSolid!!
        }
        _planeDepartureSolid = Builder(name = "PlaneDepartureSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.7188f, 4.7813f)
                curveTo(25.332f, 4.8164f, 24.957f, 4.9297f, 24.5938f, 5.125f)
                lineTo(19.875f, 7.625f)
                lineTo(13.5f, 6.0625f)
                lineTo(13.125f, 5.9688f)
                lineTo(12.75f, 6.1563f)
                lineTo(10.5938f, 7.4063f)
                lineTo(9.3125f, 8.1563f)
                lineTo(10.5f, 9.0625f)
                lineTo(13.2188f, 11.125f)
                lineTo(9.8125f, 12.9375f)
                lineTo(6.1563f, 11.2813f)
                lineTo(5.7188f, 11.0938f)
                lineTo(5.2813f, 11.3125f)
                lineTo(3.5313f, 12.25f)
                lineTo(2.375f, 12.875f)
                lineTo(3.25f, 13.8125f)
                lineTo(8.6563f, 19.625f)
                lineTo(9.1563f, 20.2188f)
                lineTo(9.8438f, 19.8438f)
                lineTo(15.0f, 17.0938f)
                lineTo(13.9688f, 22.7813f)
                lineTo(13.625f, 24.5938f)
                lineTo(15.3438f, 23.875f)
                lineTo(17.9063f, 22.7813f)
                lineTo(18.2813f, 22.625f)
                lineTo(18.4375f, 22.25f)
                lineTo(22.1563f, 13.2188f)
                lineTo(27.4063f, 10.4063f)
                curveTo(28.8516f, 9.6289f, 29.4336f, 7.7891f, 28.6563f, 6.3438f)
                curveTo(28.2695f, 5.6211f, 27.6094f, 5.1289f, 26.875f, 4.9063f)
                curveTo(26.5078f, 4.7969f, 26.1055f, 4.7461f, 25.7188f, 4.7813f)
                close()
                moveTo(25.9063f, 6.7813f)
                curveTo(26.0313f, 6.7734f, 26.1602f, 6.7773f, 26.2813f, 6.8125f)
                curveTo(26.5234f, 6.8867f, 26.7422f, 7.0352f, 26.875f, 7.2813f)
                curveTo(27.1406f, 7.7773f, 26.9648f, 8.3594f, 26.4688f, 8.625f)
                lineTo(20.875f, 11.6563f)
                lineTo(20.5625f, 11.8125f)
                lineTo(20.4375f, 12.1563f)
                lineTo(16.7188f, 21.0938f)
                lineTo(16.2813f, 21.2813f)
                lineTo(17.3438f, 15.375f)
                lineTo(17.7188f, 13.3438f)
                lineTo(15.9063f, 14.3125f)
                lineTo(9.5938f, 17.7188f)
                lineTo(5.625f, 13.4063f)
                lineTo(5.7813f, 13.3125f)
                lineTo(9.4375f, 14.9375f)
                lineTo(9.9063f, 15.1563f)
                lineTo(10.3125f, 14.9063f)
                lineTo(25.5313f, 6.875f)
                curveTo(25.6563f, 6.8086f, 25.7813f, 6.7891f, 25.9063f, 6.7813f)
                close()
                moveTo(13.375f, 8.0938f)
                lineTo(17.2188f, 9.0313f)
                lineTo(15.1563f, 10.0938f)
                lineTo(12.9063f, 8.375f)
                close()
                moveTo(3.0f, 26.0f)
                lineTo(3.0f, 28.0f)
                lineTo(29.0f, 28.0f)
                lineTo(29.0f, 26.0f)
                close()
            }
        }
        .build()
        return _planeDepartureSolid!!
    }

private var _planeDepartureSolid: ImageVector? = null
