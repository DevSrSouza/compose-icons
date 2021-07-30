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

public val LineAwesomeIcons.WrenchSolid: ImageVector
    get() {
        if (_wrenchSolid != null) {
            return _wrenchSolid!!
        }
        _wrenchSolid = Builder(name = "WrenchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(17.1445f, 4.0f, 14.0f, 7.1445f, 14.0f, 11.0f)
                curveTo(14.0f, 11.7148f, 14.2148f, 12.3633f, 14.4141f, 13.0156f)
                lineTo(4.9453f, 22.4844f)
                curveTo(3.6875f, 23.7383f, 3.6875f, 25.8008f, 4.9453f, 27.0586f)
                curveTo(6.1992f, 28.3125f, 8.2617f, 28.3125f, 9.5156f, 27.0586f)
                lineTo(18.9844f, 17.5898f)
                curveTo(19.6328f, 17.7891f, 20.2852f, 18.0f, 21.0f, 18.0f)
                curveTo(24.8555f, 18.0f, 28.0f, 14.8555f, 28.0f, 11.0f)
                curveTo(28.0f, 9.9727f, 27.7734f, 9.0f, 27.375f, 8.125f)
                lineTo(26.7813f, 6.8047f)
                lineTo(25.7617f, 7.8281f)
                lineTo(22.5859f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 9.4141f)
                lineTo(25.1953f, 5.2188f)
                lineTo(23.875f, 4.625f)
                curveTo(23.0f, 4.2266f, 22.0273f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(21.0f, 6.0f)
                curveTo(21.1719f, 6.0f, 21.3164f, 6.0859f, 21.4844f, 6.1016f)
                lineTo(19.0f, 8.5859f)
                lineTo(19.0f, 13.0f)
                lineTo(23.4141f, 13.0f)
                lineTo(25.8945f, 10.5156f)
                curveTo(25.9141f, 10.6836f, 26.0f, 10.8281f, 26.0f, 11.0f)
                curveTo(26.0f, 13.7734f, 23.7734f, 16.0f, 21.0f, 16.0f)
                curveTo(20.3008f, 16.0f, 19.6367f, 15.8555f, 19.0313f, 15.5977f)
                lineTo(18.4102f, 15.332f)
                lineTo(8.1016f, 25.6406f)
                curveTo(7.6211f, 26.125f, 6.8398f, 26.125f, 6.3594f, 25.6406f)
                curveTo(5.875f, 25.1602f, 5.875f, 24.3789f, 6.3594f, 23.8945f)
                lineTo(16.668f, 13.5898f)
                lineTo(16.4023f, 12.9648f)
                curveTo(16.1445f, 12.3594f, 16.0f, 11.6992f, 16.0f, 11.0f)
                curveTo(16.0f, 8.2266f, 18.2266f, 6.0f, 21.0f, 6.0f)
                close()
            }
        }
        .build()
        return _wrenchSolid!!
    }

private var _wrenchSolid: ImageVector? = null
