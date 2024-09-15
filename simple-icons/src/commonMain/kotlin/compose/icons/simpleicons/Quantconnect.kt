package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Quantconnect: ImageVector
    get() {
        if (_quantconnect != null) {
            return _quantconnect!!
        }
        _quantconnect = Builder(name = "Quantconnect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                verticalLineToRelative(-2.806f)
                curveToRelative(5.077f, 0.0f, 9.193f, -4.116f, 9.193f, -9.193f)
                curveToRelative(0.0f, -5.077f, -4.116f, -9.193f, -9.193f, -9.193f)
                reflectiveCurveTo(2.806f, 6.923f, 2.806f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(20.455f, 12.0f)
                curveToRelative(0.0f, -4.67f, -3.786f, -8.455f, -8.455f, -8.455f)
                verticalLineToRelative(2.797f)
                curveToRelative(3.125f, 0.0f, 5.658f, 2.533f, 5.658f, 5.658f)
                curveToRelative(0.0f, 3.125f, -2.533f, 5.658f, -5.658f, 5.658f)
                curveToRelative(-3.125f, 0.0f, -5.658f, -2.533f, -5.658f, -5.658f)
                lineTo(3.545f, 12.0f)
                curveToRelative(0.0f, 4.67f, 3.786f, 8.455f, 8.455f, 8.455f)
                reflectiveCurveTo(20.455f, 16.67f, 20.455f, 12.0f)
                close()
                moveTo(12.0f, 9.882f)
                lineTo(12.0f, 7.049f)
                curveToRelative(-2.744f, 0.0f, -4.968f, 2.217f, -4.968f, 4.951f)
                curveToRelative(0.0f, 2.734f, 2.224f, 4.951f, 4.968f, 4.951f)
                reflectiveCurveTo(16.968f, 14.734f, 16.968f, 12.0f)
                horizontalLineToRelative(-2.842f)
                curveToRelative(0.0f, 1.17f, -0.951f, 2.118f, -2.125f, 2.118f)
                reflectiveCurveTo(9.875f, 13.17f, 9.875f, 12.0f)
                reflectiveCurveTo(10.826f, 9.882f, 12.0f, 9.882f)
                close()
            }
        }
        .build()
        return _quantconnect!!
    }

private var _quantconnect: ImageVector? = null
