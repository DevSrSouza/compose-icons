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

public val LineAwesomeIcons.AtSolid: ImageVector
    get() {
        if (_atSolid != null) {
            return _atSolid!!
        }
        _atSolid = Builder(name = "AtSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1875f, 4.0f)
                curveTo(8.8242f, 3.8906f, 2.9141f, 10.4844f, 4.1563f, 18.0313f)
                curveTo(5.0f, 23.1523f, 9.2031f, 27.1797f, 14.3438f, 27.875f)
                curveTo(17.8086f, 28.3438f, 21.0469f, 27.3438f, 23.5f, 25.375f)
                lineTo(22.25f, 23.8125f)
                curveTo(20.2031f, 25.4531f, 17.5117f, 26.3008f, 14.5938f, 25.9063f)
                curveTo(10.3398f, 25.332f, 6.8516f, 21.9531f, 6.1563f, 17.7188f)
                curveTo(5.1094f, 11.3477f, 9.9922f, 5.9102f, 16.1563f, 6.0f)
                curveTo(21.4102f, 6.0781f, 25.8398f, 10.4336f, 26.0f, 15.6875f)
                curveTo(26.0039f, 15.8008f, 26.0f, 15.9102f, 26.0f, 16.0313f)
                curveTo(25.9922f, 18.2344f, 24.207f, 20.0f, 22.0f, 20.0f)
                curveTo(20.8828f, 20.0f, 20.0f, 19.1172f, 20.0f, 18.0f)
                lineTo(20.0f, 10.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 10.7813f)
                curveTo(17.2813f, 10.293f, 16.4258f, 10.0f, 15.5f, 10.0f)
                curveTo(13.0273f, 10.0f, 11.0f, 12.0273f, 11.0f, 14.5f)
                lineTo(11.0f, 17.5f)
                curveTo(11.0f, 19.9727f, 13.0273f, 22.0f, 15.5f, 22.0f)
                curveTo(16.8477f, 22.0f, 18.0469f, 21.3867f, 18.875f, 20.4375f)
                curveTo(19.6094f, 21.3711f, 20.7305f, 22.0f, 22.0f, 22.0f)
                curveTo(25.2852f, 22.0f, 27.9883f, 19.3203f, 28.0f, 16.0313f)
                curveTo(28.0f, 15.8984f, 28.0039f, 15.7695f, 28.0f, 15.625f)
                curveTo(27.8086f, 9.2891f, 22.5234f, 4.0938f, 16.1875f, 4.0f)
                close()
                moveTo(15.5f, 12.0f)
                curveTo(16.8906f, 12.0f, 18.0f, 13.1094f, 18.0f, 14.5f)
                lineTo(18.0f, 17.5f)
                curveTo(18.0f, 18.8906f, 16.8906f, 20.0f, 15.5f, 20.0f)
                curveTo(14.1094f, 20.0f, 13.0f, 18.8906f, 13.0f, 17.5f)
                lineTo(13.0f, 14.5f)
                curveTo(13.0f, 13.1094f, 14.1094f, 12.0f, 15.5f, 12.0f)
                close()
            }
        }
        .build()
        return _atSolid!!
    }

private var _atSolid: ImageVector? = null
