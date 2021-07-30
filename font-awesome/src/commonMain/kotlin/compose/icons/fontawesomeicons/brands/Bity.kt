package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Bity: ImageVector
    get() {
        if (_bity != null) {
            return _bity!!
        }
        _bity = Builder(name = "Bity", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.4f, 67.2f)
                curveTo(173.8f, -22.0f, 324.5f, -24.0f, 421.5f, 71.0f)
                curveToRelative(14.3f, 14.1f, -6.4f, 37.1f, -22.4f, 21.5f)
                curveToRelative(-84.8f, -82.4f, -215.8f, -80.3f, -298.9f, -3.2f)
                curveToRelative(-16.3f, 15.1f, -36.5f, -8.3f, -21.8f, -22.1f)
                close()
                moveTo(177.3f, 485.8f)
                curveToRelative(19.3f, 5.7f, 29.3f, -23.6f, 7.9f, -30.0f)
                curveTo(73.0f, 421.9f, 9.4f, 306.1f, 37.7f, 194.8f)
                curveToRelative(5.0f, -19.6f, -24.9f, -28.1f, -30.2f, -7.1f)
                curveToRelative(-32.1f, 127.4f, 41.1f, 259.8f, 169.8f, 298.1f)
                close()
                moveTo(325.4f, 483.8f)
                curveToRelative(121.9f, -40.2f, 192.9f, -166.9f, 164.4f, -291.0f)
                curveToRelative(-4.5f, -19.7f, -34.9f, -13.8f, -30.0f, 7.9f)
                curveToRelative(24.2f, 107.7f, -37.1f, 217.9f, -143.2f, 253.4f)
                curveToRelative(-21.2f, 7.0f, -10.4f, 36.0f, 8.8f, 29.7f)
                close()
                moveTo(262.5f, 404.8f)
                lineToRelative(0.2f, -71.8f)
                curveToRelative(0.0f, -8.2f, -6.6f, -14.8f, -14.8f, -14.8f)
                curveToRelative(-8.2f, 0.0f, -14.8f, 6.7f, -14.8f, 14.8f)
                lineToRelative(-0.2f, 71.8f)
                curveToRelative(0.0f, 8.2f, 6.6f, 14.8f, 14.8f, 14.8f)
                reflectiveCurveToRelative(14.8f, -6.6f, 14.8f, -14.8f)
                close()
                moveTo(333.5f, 135.8f)
                curveToRelative(2.1f, 90.9f, 4.7f, 131.9f, -85.5f, 132.5f)
                curveToRelative(-92.5f, -0.7f, -86.9f, -44.3f, -85.5f, -132.5f)
                curveToRelative(0.0f, -21.8f, -32.5f, -19.6f, -32.5f, 0.0f)
                verticalLineToRelative(71.6f)
                curveToRelative(0.0f, 69.3f, 60.7f, 90.9f, 118.0f, 90.1f)
                curveToRelative(57.3f, 0.8f, 118.0f, -20.8f, 118.0f, -90.1f)
                verticalLineToRelative(-71.6f)
                curveToRelative(0.0f, -19.6f, -32.5f, -21.8f, -32.5f, 0.0f)
                close()
            }
        }
        .build()
        return _bity!!
    }

private var _bity: ImageVector? = null
