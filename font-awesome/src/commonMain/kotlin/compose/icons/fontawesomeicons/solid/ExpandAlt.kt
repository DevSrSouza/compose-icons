package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ExpandAlt: ImageVector
    get() {
        if (_expandAlt != null) {
            return _expandAlt!!
        }
        _expandAlt = Builder(name = "ExpandAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.686f, 315.314f)
                lineTo(120.0f, 408.0f)
                lineToRelative(32.922f, 31.029f)
                curveToRelative(15.12f, 15.12f, 4.412f, 40.971f, -16.97f, 40.971f)
                horizontalLineToRelative(-112.0f)
                curveTo(10.697f, 480.0f, 0.0f, 469.255f, 0.0f, 456.0f)
                lineTo(0.0f, 344.0f)
                curveToRelative(0.0f, -21.382f, 25.803f, -32.09f, 40.922f, -16.971f)
                lineTo(72.0f, 360.0f)
                lineToRelative(92.686f, -92.686f)
                curveToRelative(6.248f, -6.248f, 16.379f, -6.248f, 22.627f, 0.0f)
                lineToRelative(25.373f, 25.373f)
                curveToRelative(6.249f, 6.248f, 6.249f, 16.378f, 0.0f, 22.627f)
                close()
                moveTo(235.314f, 196.686f)
                lineTo(328.0f, 104.0f)
                lineToRelative(-32.922f, -31.029f)
                curveTo(279.958f, 57.851f, 290.666f, 32.0f, 312.048f, 32.0f)
                horizontalLineToRelative(112.0f)
                curveTo(437.303f, 32.0f, 448.0f, 42.745f, 448.0f, 56.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 21.382f, -25.803f, 32.09f, -40.922f, 16.971f)
                lineTo(376.0f, 152.0f)
                lineToRelative(-92.686f, 92.686f)
                curveToRelative(-6.248f, 6.248f, -16.379f, 6.248f, -22.627f, 0.0f)
                lineToRelative(-25.373f, -25.373f)
                curveToRelative(-6.249f, -6.248f, -6.249f, -16.378f, 0.0f, -22.627f)
                close()
            }
        }
        .build()
        return _expandAlt!!
    }

private var _expandAlt: ImageVector? = null
