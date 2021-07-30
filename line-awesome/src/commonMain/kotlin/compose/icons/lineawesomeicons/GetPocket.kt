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

public val LineAwesomeIcons.GetPocket: ImageVector
    get() {
        if (_getPocket != null) {
            return _getPocket!!
        }
        _getPocket = Builder(name = "GetPocket", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(5.3555f, 5.0f, 4.0f, 6.3555f, 4.0f, 8.0f)
                lineTo(4.0f, 15.0f)
                curveTo(4.0f, 21.6172f, 9.3828f, 27.0f, 16.0f, 27.0f)
                curveTo(22.6172f, 27.0f, 28.0f, 21.6172f, 28.0f, 15.0f)
                lineTo(28.0f, 8.0f)
                curveTo(28.0f, 6.3555f, 26.6445f, 5.0f, 25.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                curveTo(25.5664f, 7.0f, 26.0f, 7.4336f, 26.0f, 8.0f)
                lineTo(26.0f, 15.0f)
                curveTo(26.0f, 20.5352f, 21.5352f, 25.0f, 16.0f, 25.0f)
                curveTo(10.4648f, 25.0f, 6.0f, 20.5352f, 6.0f, 15.0f)
                lineTo(6.0f, 8.0f)
                curveTo(6.0f, 7.4336f, 6.4336f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(10.6563f, 11.4063f)
                curveTo(10.2734f, 11.4063f, 9.8867f, 11.582f, 9.5938f, 11.875f)
                curveTo(9.0078f, 12.4609f, 9.0078f, 13.3828f, 9.5938f, 13.9688f)
                lineTo(15.0f, 19.375f)
                curveTo(15.2813f, 19.6563f, 15.6641f, 19.8125f, 16.0625f, 19.8125f)
                curveTo(16.4609f, 19.8125f, 16.8438f, 19.6563f, 17.125f, 19.375f)
                lineTo(22.4063f, 14.125f)
                curveTo(22.9922f, 13.5391f, 22.9922f, 12.5859f, 22.4063f, 12.0f)
                curveTo(21.8203f, 11.4141f, 20.8672f, 11.4141f, 20.2813f, 12.0f)
                lineTo(16.0625f, 16.2188f)
                lineTo(11.7188f, 11.875f)
                curveTo(11.4258f, 11.582f, 11.0391f, 11.4063f, 10.6563f, 11.4063f)
                close()
            }
        }
        .build()
        return _getPocket!!
    }

private var _getPocket: ImageVector? = null
