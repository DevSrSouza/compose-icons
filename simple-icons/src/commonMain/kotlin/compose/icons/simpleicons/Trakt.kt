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

public val SimpleIcons.Trakt: ImageVector
    get() {
        if (_trakt != null) {
            return _trakt!!
        }
        _trakt = Builder(name = "Trakt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.385f, 24.0f, 0.0f, 18.615f, 0.0f, 12.0f)
                reflectiveCurveTo(5.385f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.385f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.385f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 1.211f)
                curveTo(6.05f, 1.211f, 1.211f, 6.05f, 1.211f, 12.0f)
                reflectiveCurveTo(6.05f, 22.79f, 12.0f, 22.79f)
                reflectiveCurveTo(22.79f, 17.95f, 22.79f, 12.0f)
                reflectiveCurveTo(17.95f, 1.211f, 12.0f, 1.211f)
                close()
                moveTo(4.89f, 18.531f)
                curveToRelative(1.756f, 1.92f, 4.294f, 3.113f, 7.11f, 3.113f)
                curveToRelative(1.439f, 0.0f, 2.801f, -0.313f, 4.027f, -0.876f)
                lineToRelative(-6.697f, -6.68f)
                lineToRelative(-4.44f, 4.443f)
                close()
                moveTo(19.178f, 18.464f)
                curveToRelative(1.541f, -1.71f, 2.484f, -3.99f, 2.484f, -6.466f)
                curveToRelative(0.0f, -3.885f, -2.287f, -7.215f, -5.568f, -8.76f)
                lineToRelative(-6.089f, 6.076f)
                lineToRelative(9.164f, 9.15f)
                horizontalLineToRelative(0.009f)
                close()
                moveTo(9.301f, 10.035f)
                lineTo(4.227f, 15.09f)
                lineToRelative(-0.679f, -0.68f)
                lineToRelative(5.337f, -5.336f)
                lineToRelative(6.23f, -6.225f)
                curveToRelative(-0.978f, -0.328f, -2.02f, -0.509f, -3.115f, -0.509f)
                curveTo(6.663f, 2.337f, 2.337f, 6.663f, 2.337f, 12.0f)
                curveToRelative(0.0f, 2.172f, 0.713f, 4.178f, 1.939f, 5.801f)
                lineToRelative(5.056f, -5.055f)
                lineToRelative(0.359f, 0.329f)
                lineToRelative(7.245f, 7.245f)
                curveToRelative(0.15f, -0.082f, 0.285f, -0.164f, 0.42f, -0.266f)
                lineTo(9.33f, 12.05f)
                lineToRelative(-4.854f, 4.855f)
                lineToRelative(-0.679f, -0.679f)
                lineToRelative(5.535f, -5.535f)
                lineToRelative(0.359f, 0.331f)
                lineToRelative(8.46f, 8.437f)
                curveToRelative(0.135f, -0.1f, 0.255f, -0.215f, 0.375f, -0.316f)
                lineTo(9.39f, 10.027f)
                lineToRelative(-0.083f, 0.015f)
                lineToRelative(-0.006f, -0.007f)
                close()
                moveTo(12.348f, 11.063f)
                lineToRelative(-0.678f, -0.676f)
                lineToRelative(4.788f, -4.79f)
                lineToRelative(0.679f, 0.689f)
                lineToRelative(-4.789f, 4.785f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(16.89f, 4.485f)
                lineToRelative(-5.52f, 5.52f)
                lineToRelative(-0.68f, -0.679f)
                lineToRelative(5.521f, -5.52f)
                lineToRelative(0.679f, 0.684f)
                verticalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _trakt!!
    }

private var _trakt: ImageVector? = null
