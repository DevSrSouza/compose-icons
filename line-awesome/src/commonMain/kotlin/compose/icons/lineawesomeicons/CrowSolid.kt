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

public val LineAwesomeIcons.CrowSolid: ImageVector
    get() {
        if (_crowSolid != null) {
            return _crowSolid!!
        }
        _crowSolid = Builder(name = "CrowSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveTo(4.791f, 6.0f, 3.0f, 7.791f, 3.0f, 10.0f)
                lineTo(3.0f, 15.0f)
                curveTo(3.0f, 19.079f, 6.055f, 22.439f, 10.0f, 22.932f)
                lineTo(10.0f, 27.0f)
                lineTo(12.0f, 27.0f)
                lineTo(12.0f, 23.0f)
                lineTo(13.0f, 23.0f)
                lineTo(14.0f, 23.0f)
                lineTo(14.0f, 27.0f)
                lineTo(16.0f, 27.0f)
                lineTo(16.0f, 23.0f)
                lineTo(22.385f, 23.0f)
                lineTo(25.463f, 25.0f)
                lineTo(29.463f, 25.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                curveTo(15.0f, 8.343f, 12.796f, 7.0f, 11.0f, 7.0f)
                lineTo(9.619f, 7.0f)
                curveTo(8.916f, 6.386f, 8.007f, 6.0f, 7.0f, 6.0f)
                close()
                moveTo(7.0f, 8.0f)
                curveTo(7.202f, 8.0f, 7.392f, 8.04f, 7.576f, 8.096f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.904f, 9.424f)
                curveTo(8.96f, 9.608f, 9.0f, 9.798f, 9.0f, 10.0f)
                lineTo(9.0f, 13.0f)
                lineTo(9.0f, 14.086f)
                lineTo(9.91f, 14.676f)
                lineTo(19.639f, 21.0f)
                lineTo(13.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                curveTo(7.692f, 21.0f, 5.0f, 18.308f, 5.0f, 15.0f)
                lineTo(5.0f, 10.0f)
                curveTo(5.0f, 8.897f, 5.897f, 8.0f, 7.0f, 8.0f)
                close()
            }
        }
        .build()
        return _crowSolid!!
    }

private var _crowSolid: ImageVector? = null
