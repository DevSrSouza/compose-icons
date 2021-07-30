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

public val SimpleIcons.Etsy: ImageVector
    get() {
        if (_etsy != null) {
            return _etsy!!
        }
        _etsy = Builder(name = "Etsy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.559f, 2.445f)
                curveToRelative(0.0f, -0.325f, 0.033f, -0.52f, 0.59f, -0.52f)
                horizontalLineToRelative(7.465f)
                curveToRelative(1.3f, 0.0f, 2.02f, 1.11f, 2.54f, 3.193f)
                lineToRelative(0.42f, 1.666f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.23f, -4.728f, 0.43f, -6.784f, 0.43f, -6.784f)
                reflectiveCurveToRelative(-3.196f, 0.36f, -5.09f, 0.36f)
                horizontalLineTo(6.635f)
                lineTo(1.521f, 0.196f)
                verticalLineToRelative(1.37f)
                lineToRelative(1.725f, 0.326f)
                curveToRelative(1.21f, 0.24f, 1.5f, 0.496f, 1.6f, 1.606f)
                curveToRelative(0.0f, 0.0f, 0.11f, 3.27f, 0.11f, 8.64f)
                curveToRelative(0.0f, 5.385f, -0.09f, 8.61f, -0.09f, 8.61f)
                curveToRelative(0.0f, 0.973f, -0.39f, 1.333f, -1.59f, 1.573f)
                lineToRelative(-1.722f, 0.33f)
                verticalLineTo(24.0f)
                lineToRelative(5.13f, -0.165f)
                horizontalLineToRelative(8.55f)
                curveToRelative(1.935f, 0.0f, 6.39f, 0.165f, 6.39f, 0.165f)
                curveToRelative(0.105f, -1.17f, 0.75f, -6.48f, 0.855f, -7.064f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-1.284f, 2.91f)
                curveToRelative(-1.005f, 2.28f, -2.476f, 2.445f, -4.11f, 2.445f)
                horizontalLineToRelative(-4.906f)
                curveToRelative(-1.63f, 0.0f, -2.415f, -0.64f, -2.415f, -2.05f)
                verticalLineTo(12.8f)
                reflectiveCurveToRelative(3.62f, 0.0f, 4.79f, 0.096f)
                curveToRelative(0.912f, 0.064f, 1.463f, 0.325f, 1.76f, 1.598f)
                lineToRelative(0.39f, 1.695f)
                horizontalLineToRelative(1.41f)
                lineToRelative(-0.09f, -4.278f)
                lineToRelative(0.192f, -4.305f)
                horizontalLineToRelative(-1.391f)
                lineToRelative(-0.45f, 1.89f)
                curveToRelative(-0.283f, 1.244f, -0.48f, 1.47f, -1.754f, 1.6f)
                curveToRelative(-1.666f, 0.17f, -4.815f, 0.14f, -4.815f, 0.14f)
                verticalLineTo(2.45f)
                horizontalLineToRelative(-0.05f)
                close()
            }
        }
        .build()
        return _etsy!!
    }

private var _etsy: ImageVector? = null
