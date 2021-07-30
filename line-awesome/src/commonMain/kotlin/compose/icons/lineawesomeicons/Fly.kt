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

public val LineAwesomeIcons.Fly: ImageVector
    get() {
        if (_fly != null) {
            return _fly!!
        }
        _fly = Builder(name = "Fly", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(15.8398f, 4.0f, 15.6875f, 4.0234f, 15.5313f, 4.0313f)
                curveTo(10.832f, 4.2617f, 7.0f, 7.8477f, 7.0f, 12.3438f)
                curveTo(7.0f, 15.293f, 8.7891f, 17.8828f, 10.4688f, 19.75f)
                curveTo(12.1484f, 21.6172f, 13.8125f, 22.8125f, 13.8125f, 22.8125f)
                lineTo(14.0938f, 23.0f)
                lineTo(17.9063f, 23.0f)
                lineTo(18.1875f, 22.8125f)
                curveTo(18.1875f, 22.8125f, 19.8516f, 21.6172f, 21.5313f, 19.75f)
                curveTo(23.2109f, 17.8828f, 25.0f, 15.293f, 25.0f, 12.3438f)
                curveTo(25.0f, 7.8359f, 21.1523f, 4.2461f, 16.4375f, 4.0313f)
                curveTo(16.2891f, 4.0117f, 16.1484f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.2734f, 6.0f, 17.1133f, 6.3125f, 17.7813f, 7.1563f)
                curveTo(18.4492f, 8.0f, 19.0f, 9.3281f, 19.0f, 11.2188f)
                curveTo(19.0f, 15.5352f, 16.7266f, 20.2305f, 16.3438f, 21.0f)
                lineTo(15.6563f, 21.0f)
                curveTo(15.2734f, 20.2266f, 13.0f, 15.5156f, 13.0f, 11.2188f)
                curveTo(13.0f, 9.3984f, 13.5742f, 8.0547f, 14.25f, 7.1875f)
                curveTo(14.9258f, 6.3203f, 15.7578f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.9063f, 7.2188f)
                curveTo(11.3672f, 8.3086f, 11.0f, 9.6406f, 11.0f, 11.2188f)
                curveTo(11.0f, 14.1016f, 11.8633f, 17.0508f, 12.6875f, 19.2188f)
                curveTo(12.4414f, 18.9688f, 12.207f, 18.7031f, 11.9375f, 18.4063f)
                curveTo(10.418f, 16.7148f, 9.0f, 14.4492f, 9.0f, 12.3438f)
                curveTo(9.0f, 10.2422f, 10.1445f, 8.375f, 11.9063f, 7.2188f)
                close()
                moveTo(20.1563f, 7.25f)
                curveTo(21.8867f, 8.4102f, 23.0f, 10.2617f, 23.0f, 12.3438f)
                curveTo(23.0f, 14.4492f, 21.582f, 16.7148f, 20.0625f, 18.4063f)
                curveTo(19.8008f, 18.6992f, 19.5547f, 18.9453f, 19.3125f, 19.1875f)
                curveTo(20.1289f, 17.0273f, 21.0f, 14.0898f, 21.0f, 11.2188f)
                curveTo(21.0f, 9.6484f, 20.668f, 8.3281f, 20.1563f, 7.25f)
                close()
                moveTo(14.0f, 25.0f)
                lineTo(14.0f, 28.0f)
                lineTo(18.0f, 28.0f)
                lineTo(18.0f, 25.0f)
                close()
            }
        }
        .build()
        return _fly!!
    }

private var _fly: ImageVector? = null
