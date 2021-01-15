package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Gauges: ImageVector
    get() {
        if (_gauges != null) {
            return _gauges!!
        }
        _gauges = Builder(name = "Gauges", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6f, 12.635f)
                lineToRelative(-1.125f, -0.053f)
                curveToRelative(-0.945f, -0.033f, -1.197f, -0.083f, -1.197f, -0.435f)
                curveToRelative(0.0f, -0.135f, 0.1f, -0.318f, 0.303f, -0.42f)
                curveToRelative(0.167f, 0.036f, 0.337f, 0.053f, 0.507f, 0.053f)
                curveToRelative(2.415f, 0.0f, 3.63f, -1.17f, 3.63f, -2.98f)
                curveToRelative(0.0f, -0.3f, -0.074f, -0.57f, -0.225f, -0.735f)
                horizontalLineToRelative(0.96f)
                verticalLineToRelative(-2.01f)
                lineTo(12.6f, 6.055f)
                curveToRelative(-0.472f, -0.115f, -0.892f, -0.2f, -1.465f, -0.2f)
                curveToRelative(-2.543f, 0.0f, -3.804f, 1.474f, -3.804f, 3.18f)
                curveToRelative(0.0f, 1.07f, 0.506f, 1.84f, 1.26f, 2.242f)
                curveToRelative(-0.584f, 0.234f, -1.022f, 0.87f, -1.022f, 1.54f)
                curveToRelative(0.0f, 0.586f, 0.322f, 1.054f, 0.81f, 1.287f)
                curveToRelative(-0.64f, 0.336f, -1.215f, 1.155f, -1.215f, 1.94f)
                curveToRelative(0.0f, 1.66f, 1.35f, 2.476f, 3.64f, 2.476f)
                curveToRelative(2.873f, 0.0f, 4.695f, -1.604f, 4.695f, -3.41f)
                horizontalLineToRelative(-0.018f)
                curveToRelative(0.0f, -1.674f, -1.078f, -2.41f, -2.88f, -2.475f)
                close()
                moveTo(11.138f, 7.855f)
                curveToRelative(0.895f, 0.0f, 1.342f, 0.48f, 1.342f, 1.193f)
                curveToRelative(0.0f, 0.71f, -0.5f, 1.14f, -1.325f, 1.14f)
                curveToRelative(-0.893f, 0.0f, -1.342f, -0.445f, -1.342f, -1.173f)
                curveToRelative(0.0f, -0.68f, 0.483f, -1.16f, 1.325f, -1.16f)
                close()
                moveTo(13.146f, 15.409f)
                curveToRelative(0.0f, 0.63f, -0.612f, 1.113f, -1.82f, 1.113f)
                curveToRelative(-0.944f, 0.0f, -1.5f, -0.405f, -1.5f, -1.002f)
                curveToRelative(0.0f, -0.353f, 0.226f, -0.708f, 0.6f, -0.997f)
                curveToRelative(0.09f, 0.015f, 0.226f, 0.0f, 0.33f, 0.015f)
                lineToRelative(1.35f, 0.032f)
                curveToRelative(0.796f, 0.033f, 1.08f, 0.388f, 1.08f, 0.84f)
                horizontalLineToRelative(-0.04f)
                close()
                moveTo(17.637f, 10.854f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.99f, 0.0f, -1.824f, 0.834f, -1.824f, 1.845f)
                curveToRelative(0.0f, 1.01f, 0.834f, 1.823f, 1.824f, 1.823f)
                curveToRelative(1.01f, 0.0f, 1.846f, -0.814f, 1.846f, -1.824f)
                curveToRelative(0.0f, -1.01f, -0.837f, -1.846f, -1.846f, -1.846f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.335f)
                curveTo(6.293f, 22.335f, 1.665f, 17.708f, 1.665f, 12.0f)
                curveTo(1.665f, 6.293f, 6.293f, 1.665f, 12.0f, 1.665f)
                curveToRelative(5.708f, 0.0f, 10.335f, 4.628f, 10.335f, 10.335f)
                curveToRelative(0.0f, 5.708f, -4.627f, 10.335f, -10.335f, 10.335f)
                close()
            }
        }
        .build()
        return _gauges!!
    }

private var _gauges: ImageVector? = null
