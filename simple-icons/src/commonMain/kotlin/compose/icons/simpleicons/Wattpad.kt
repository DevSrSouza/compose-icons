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

public val SimpleIcons.Wattpad: ImageVector
    get() {
        if (_wattpad != null) {
            return _wattpad!!
        }
        _wattpad = Builder(name = "Wattpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.034f, 3.09f)
                curveToRelative(-1.695f, 0.113f, -3.9f, 2.027f, -6.9f, 6.947f)
                curveToRelative(0.245f, -2.758f, 0.345f, -4.716f, -0.857f, -5.743f)
                curveToRelative(-0.823f, -0.702f, -2.764f, -0.974f, -3.926f, 0.536f)
                curveTo(0.18f, 6.349f, -0.09f, 9.312f, 0.024f, 12.432f)
                curveToRelative(0.238f, 6.518f, 2.544f, 8.487f, 4.59f, 8.487f)
                horizontalLineToRelative(0.001f)
                curveToRelative(3.623f, 0.0f, 4.13f, -4.439f, 6.604f, -8.4f)
                curveToRelative(-0.09f, 1.416f, -0.008f, 2.668f, 0.266f, 3.532f)
                curveToRelative(1.078f, 3.398f, 4.784f, 3.663f, 6.467f, 0.21f)
                curveToRelative(2.374f, -4.87f, 3.058f, -6.016f, 5.453f, -9.521f)
                curveToRelative(1.58f, -2.314f, -0.252f, -3.812f, -2.374f, -2.735f)
                curveToRelative(-1.09f, 0.554f, -2.86f, 1.935f, -5.065f, 4.867f)
                curveToRelative(0.387f, -2.23f, 0.28f, -5.996f, -2.932f, -5.782f)
                close()
            }
        }
        .build()
        return _wattpad!!
    }

private var _wattpad: ImageVector? = null
