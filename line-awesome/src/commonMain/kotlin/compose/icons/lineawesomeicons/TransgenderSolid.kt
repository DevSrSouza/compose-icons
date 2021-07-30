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

public val LineAwesomeIcons.TransgenderSolid: ImageVector
    get() {
        if (_transgenderSolid != null) {
            return _transgenderSolid!!
        }
        _transgenderSolid = Builder(name = "TransgenderSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(19.0f, 5.0f)
                lineTo(22.5938f, 5.0f)
                lineTo(18.1875f, 9.4063f)
                curveTo(17.0156f, 8.5234f, 15.5742f, 8.0f, 14.0f, 8.0f)
                curveTo(10.1445f, 8.0f, 7.0f, 11.1445f, 7.0f, 15.0f)
                curveTo(7.0f, 18.5156f, 9.6172f, 21.418f, 13.0f, 21.9063f)
                lineTo(13.0f, 25.0f)
                lineTo(10.0f, 25.0f)
                lineTo(10.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 30.0f)
                lineTo(15.0f, 30.0f)
                lineTo(15.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                lineTo(18.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 21.9063f)
                curveTo(18.3828f, 21.418f, 21.0f, 18.5156f, 21.0f, 15.0f)
                curveTo(21.0f, 13.4258f, 20.4766f, 11.9844f, 19.5938f, 10.8125f)
                lineTo(24.0f, 6.4063f)
                lineTo(24.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(14.0f, 10.0f)
                curveTo(16.7734f, 10.0f, 19.0f, 12.2266f, 19.0f, 15.0f)
                curveTo(19.0f, 17.7734f, 16.7734f, 20.0f, 14.0f, 20.0f)
                curveTo(11.2266f, 20.0f, 9.0f, 17.7734f, 9.0f, 15.0f)
                curveTo(9.0f, 12.2266f, 11.2266f, 10.0f, 14.0f, 10.0f)
                close()
            }
        }
        .build()
        return _transgenderSolid!!
    }

private var _transgenderSolid: ImageVector? = null
