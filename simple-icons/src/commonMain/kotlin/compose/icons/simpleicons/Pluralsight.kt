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

public val SimpleIcons.Pluralsight: ImageVector
    get() {
        if (_pluralsight != null) {
            return _pluralsight!!
        }
        _pluralsight = Builder(name = "Pluralsight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.72f, 1.755f)
                curveTo(10.08f, -0.301f, 3.811f, 2.625f, 1.771f, 8.25f)
                curveToRelative(-2.071f, 5.699f, 0.854f, 11.956f, 6.494f, 14.01f)
                curveToRelative(5.655f, 2.055f, 11.956f, -0.87f, 14.01f, -6.51f)
                curveToRelative(2.057f, -5.67f, -0.87f, -11.939f, -6.524f, -13.995f)
                horizontalLineToRelative(-0.031f)
                close()
                moveTo(12.0f, 24.0f)
                curveTo(5.4f, 24.0f, 0.0f, 18.6f, 0.0f, 12.0f)
                reflectiveCurveTo(5.4f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.4f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.4f, 12.0f, -12.0f, 12.0f)
                moveTo(8.926f, 5.805f)
                verticalLineToRelative(12.391f)
                lineTo(19.68f, 12.0f)
                lineTo(8.926f, 5.805f)
                close()
                moveTo(9.975f, 7.574f)
                lineTo(17.625f, 12.0f)
                lineToRelative(-7.65f, 4.426f)
                lineTo(9.975f, 7.574f)
                moveTo(6.449f, 7.155f)
                verticalLineToRelative(9.689f)
                lineTo(14.85f, 12.0f)
                lineTo(6.449f, 7.155f)
                close()
                moveTo(7.5f, 8.955f)
                lineTo(12.811f, 12.0f)
                lineTo(7.5f, 15.061f)
                lineTo(7.5f, 8.939f)
            }
        }
        .build()
        return _pluralsight!!
    }

private var _pluralsight: ImageVector? = null
