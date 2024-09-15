package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongRightC: ImageVector
    get() {
        if (_arrowLongRightC != null) {
            return _arrowLongRightC!!
        }
        _arrowLongRightC = Builder(name = "ArrowLongRightC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.73f, 7.757f)
                lineTo(22.98f, 11.993f)
                lineTo(18.744f, 16.243f)
                lineTo(17.328f, 14.831f)
                lineTo(19.142f, 13.01f)
                lineTo(6.854f, 13.052f)
                curveTo(6.447f, 14.219f, 5.34f, 15.058f, 4.034f, 15.064f)
                curveTo(2.377f, 15.072f, 1.028f, 13.735f, 1.02f, 12.078f)
                curveTo(1.013f, 10.421f, 2.35f, 9.072f, 4.007f, 9.064f)
                curveTo(5.313f, 9.058f, 6.429f, 9.889f, 6.845f, 11.052f)
                lineTo(19.161f, 11.01f)
                lineTo(17.318f, 9.174f)
                lineTo(18.73f, 7.757f)
                close()
                moveTo(5.02f, 12.06f)
                curveTo(5.018f, 11.507f, 4.568f, 11.062f, 4.016f, 11.064f)
                curveTo(3.463f, 11.067f, 3.018f, 11.517f, 3.02f, 12.069f)
                curveTo(3.023f, 12.621f, 3.472f, 13.067f, 4.025f, 13.064f)
                curveTo(4.577f, 13.062f, 5.023f, 12.612f, 5.02f, 12.06f)
                close()
            }
        }
        .build()
        return _arrowLongRightC!!
    }

private var _arrowLongRightC: ImageVector? = null
