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

public val LineAwesomeIcons.Kickstarter: ImageVector
    get() {
        if (_kickstarter != null) {
            return _kickstarter!!
        }
        _kickstarter = Builder(name = "Kickstarter", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(13.6328f, 11.0f)
                curveTo(12.5798f, 11.0f, 12.0f, 11.8084f, 12.0f, 12.8164f)
                lineTo(12.0f, 19.1328f)
                curveTo(12.0f, 20.1858f, 12.5593f, 20.9922f, 13.6523f, 20.9922f)
                curveTo(14.5293f, 20.9922f, 15.252f, 20.4218f, 15.252f, 19.1328f)
                lineTo(15.252f, 17.4277f)
                lineTo(17.7227f, 20.5156f)
                curveTo(18.2247f, 21.1236f, 19.314f, 21.2006f, 20.0f, 20.5156f)
                curveTo(20.596f, 19.8996f, 20.6031f, 19.0159f, 20.1621f, 18.4609f)
                lineTo(18.1602f, 15.8984f)
                lineTo(19.7324f, 13.4805f)
                curveTo(20.1164f, 12.9295f, 20.1219f, 12.0735f, 19.5059f, 11.4785f)
                curveTo(18.8369f, 10.8295f, 17.685f, 10.7717f, 17.0f, 11.7637f)
                lineTo(15.252f, 14.4258f)
                lineTo(15.252f, 12.8398f)
                curveTo(15.252f, 11.5868f, 14.5348f, 11.0f, 13.6328f, 11.0f)
                close()
            }
        }
        .build()
        return _kickstarter!!
    }

private var _kickstarter: ImageVector? = null
