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

public val BrandsGroup.Mizuni: ImageVector
    get() {
        if (_mizuni != null) {
            return _mizuni!!
        }
        _mizuni = Builder(name = "Mizuni", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.1f, 0.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, 111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                curveTo(496.0f, 119.1f, 385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(168.0f, 359.9f)
                curveToRelative(-31.4f, 10.6f, -58.8f, 27.3f, -80.0f, 48.2f)
                lineTo(88.0f, 136.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(223.9f)
                close()
                moveTo(288.0f, 350.0f)
                curveToRelative(-12.9f, -2.0f, -26.2f, -3.1f, -39.8f, -3.1f)
                curveToRelative(-13.8f, 0.0f, -27.2f, 1.1f, -40.2f, 3.1f)
                lineTo(208.0f, 136.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(214.0f)
                close()
                moveTo(408.0f, 407.7f)
                curveToRelative(-21.2f, -20.8f, -48.6f, -37.4f, -80.0f, -48.0f)
                lineTo(328.0f, 136.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(271.7f)
                close()
            }
        }
        .build()
        return _mizuni!!
    }

private var _mizuni: ImageVector? = null
