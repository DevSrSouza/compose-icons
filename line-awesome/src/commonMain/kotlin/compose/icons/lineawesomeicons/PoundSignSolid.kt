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

public val LineAwesomeIcons.PoundSignSolid: ImageVector
    get() {
        if (_poundSignSolid != null) {
            return _poundSignSolid!!
        }
        _poundSignSolid = Builder(name = "PoundSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6875f, 5.0f)
                curveTo(17.418f, 5.0f, 17.1406f, 5.0273f, 16.875f, 5.0625f)
                curveTo(13.6992f, 5.4766f, 11.0f, 8.2031f, 11.0f, 11.6563f)
                curveTo(11.0f, 12.7852f, 11.2813f, 13.8984f, 11.6563f, 15.0f)
                lineTo(9.0f, 15.0f)
                lineTo(9.0f, 17.0f)
                lineTo(12.4063f, 17.0f)
                curveTo(12.6055f, 17.5547f, 12.7656f, 18.1016f, 12.9063f, 18.6563f)
                curveTo(13.4688f, 20.8633f, 13.5273f, 22.8398f, 11.5313f, 25.0f)
                lineTo(8.0f, 25.0f)
                lineTo(8.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                lineTo(24.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 25.0f)
                lineTo(14.0625f, 25.0f)
                curveTo(15.4531f, 22.6953f, 15.3789f, 20.2539f, 14.8438f, 18.1563f)
                curveTo(14.7422f, 17.7578f, 14.6172f, 17.3828f, 14.5f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 15.0f)
                lineTo(13.8438f, 15.0f)
                curveTo(13.3906f, 13.6914f, 13.0f, 12.5313f, 13.0f, 11.6563f)
                curveTo(13.0f, 8.4258f, 16.3008f, 6.1133f, 19.375f, 7.3438f)
                lineTo(20.125f, 5.5f)
                curveTo(19.3086f, 5.1758f, 18.4961f, 5.0f, 17.6875f, 5.0f)
                close()
            }
        }
        .build()
        return _poundSignSolid!!
    }

private var _poundSignSolid: ImageVector? = null
