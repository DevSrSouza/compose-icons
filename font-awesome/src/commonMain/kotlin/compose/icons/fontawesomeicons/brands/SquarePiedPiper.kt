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

public val BrandsGroup.SquarePiedPiper: ImageVector
    get() {
        if (_squarePiedPiper != null) {
            return _squarePiedPiper!!
        }
        _squarePiedPiper = Builder(name = "SquarePiedPiper", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 419.0f)
                lineTo(0.0f, 479.2f)
                lineToRelative(0.8f, -328.0f)
                curveTo(0.8f, 85.3f, 54.0f, 32.0f, 120.0f, 32.0f)
                horizontalLineToRelative(327.2f)
                curveToRelative(-93.0f, 28.9f, -189.9f, 94.2f, -253.9f, 168.6f)
                curveTo(122.7f, 282.0f, 82.6f, 338.0f, 32.0f, 419.0f)
                moveTo(448.0f, 32.0f)
                reflectiveCurveTo(305.2f, 98.8f, 261.6f, 199.1f)
                curveToRelative(-23.2f, 53.6f, -28.9f, 118.1f, -71.0f, 158.6f)
                curveToRelative(-28.9f, 27.8f, -69.8f, 38.2f, -105.3f, 56.3f)
                curveToRelative(-23.2f, 12.0f, -66.4f, 40.5f, -84.9f, 66.0f)
                horizontalLineToRelative(328.4f)
                curveToRelative(66.0f, 0.0f, 119.3f, -53.3f, 119.3f, -119.2f)
                curveToRelative(-0.1f, 0.0f, -0.1f, -328.8f, -0.1f, -328.8f)
                close()
            }
        }
        .build()
        return _squarePiedPiper!!
    }

private var _squarePiedPiper: ImageVector? = null
