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

public val SimpleIcons.Ghostery: ImageVector
    get() {
        if (_ghostery != null) {
            return _ghostery!!
        }
        _ghostery = Builder(name = "Ghostery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.058f, 19.93f)
                curveToRelative(-1.01f, -2.29f, -1.185f, -4.228f, -1.212f, -4.99f)
                verticalLineTo(8.67f)
                curveTo(20.846f, 3.882f, 16.886f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.15f, 3.882f, 3.15f, 8.671f)
                verticalLineToRelative(6.36f)
                curveToRelative(-0.037f, 0.82f, -0.236f, 2.7f, -1.207f, 4.899f)
                curveToRelative(-1.306f, 2.955f, -0.226f, 2.603f, 0.742f, 2.36f)
                curveToRelative(0.968f, -0.242f, 3.13f, -1.192f, 3.805f, -0.022f)
                curveToRelative(0.675f, 1.17f, 1.238f, 2.184f, 2.814f, 1.523f)
                curveToRelative(1.576f, -0.663f, 2.318f, -0.883f, 2.543f, -0.883f)
                horizontalLineToRelative(0.306f)
                curveToRelative(0.225f, 0.0f, 0.968f, 0.22f, 2.543f, 0.882f)
                curveToRelative(1.576f, 0.662f, 2.14f, -0.353f, 2.814f, -1.522f)
                curveToRelative(0.676f, -1.17f, 2.837f, -0.22f, 3.805f, 0.022f)
                curveToRelative(0.968f, 0.243f, 2.048f, 0.595f, 0.743f, -2.36f)
                moveTo(9.268f, 4.728f)
                curveToRelative(0.953f, 0.0f, 1.725f, 1.198f, 1.725f, 2.676f)
                curveToRelative(0.0f, 1.478f, -0.772f, 2.677f, -1.725f, 2.677f)
                curveToRelative(-0.953f, 0.0f, -1.726f, -1.198f, -1.726f, -2.677f)
                curveToRelative(0.0f, -1.478f, 0.773f, -2.676f, 1.726f, -2.676f)
                moveToRelative(2.73f, 10.697f)
                curveToRelative(-2.1f, 0.0f, -3.867f, -2.025f, -4.4f, -4.279f)
                curveToRelative(1.029f, 1.387f, 2.617f, 2.277f, 4.4f, 2.277f)
                curveToRelative(1.784f, 0.0f, 3.372f, -0.89f, 4.401f, -2.277f)
                curveToRelative(-0.533f, 2.254f, -2.3f, 4.28f, -4.4f, 4.28f)
                moveToRelative(2.73f, -5.345f)
                curveToRelative(-0.953f, 0.0f, -1.725f, -1.198f, -1.725f, -2.677f)
                curveToRelative(0.0f, -1.478f, 0.772f, -2.676f, 1.726f, -2.676f)
                curveToRelative(0.953f, 0.0f, 1.725f, 1.198f, 1.725f, 2.676f)
                curveToRelative(0.0f, 1.478f, -0.772f, 2.677f, -1.725f, 2.677f)
                close()
            }
        }
        .build()
        return _ghostery!!
    }

private var _ghostery: ImageVector? = null
