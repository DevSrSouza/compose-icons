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

public val SimpleIcons.Applearcade: ImageVector
    get() {
        if (_applearcade != null) {
            return _applearcade!!
        }
        _applearcade = Builder(name = "Applearcade", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.198f, 18.24f)
                arcToRelative(0.966f, 0.966f, 0.0f, false, true, -0.194f, -0.571f)
                verticalLineToRelative(-0.955f)
                reflectiveCurveToRelative(0.0f, -0.571f, 0.563f, -0.313f)
                curveToRelative(0.0f, 0.0f, 6.919f, 3.135f, 8.033f, 3.626f)
                arcToRelative(7.832f, 7.832f, 0.0f, false, false, 3.408f, 0.729f)
                arcToRelative(8.216f, 8.216f, 0.0f, false, false, 3.396f, -0.729f)
                lineToRelative(8.037f, -3.626f)
                curveToRelative(0.559f, -0.258f, 0.559f, 0.313f, 0.559f, 0.313f)
                verticalLineToRelative(0.955f)
                arcToRelative(1.038f, 1.038f, 0.0f, false, true, -0.198f, 0.575f)
                curveToRelative(-0.19f, 0.258f, -0.515f, 0.539f, -1.411f, 0.959f)
                curveToRelative(-0.713f, 0.337f, -6.23f, 2.818f, -6.995f, 3.17f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, true, -3.4f, 0.729f)
                arcToRelative(8.336f, 8.336f, 0.0f, false, true, -3.82f, -0.927f)
                curveToRelative(-1.435f, -0.65f, -5.849f, -2.631f, -6.567f, -2.972f)
                curveToRelative(-0.9f, -0.428f, -1.153f, -0.654f, -1.411f, -0.963f)
                close()
                moveTo(1.609f, 12.267f)
                lineToRelative(6.987f, -3.17f)
                arcToRelative(7.975f, 7.975f, 0.0f, false, true, 2.164f, -0.634f)
                verticalLineToRelative(5.707f)
                curveToRelative(0.0f, 0.396f, 0.571f, 0.697f, 1.236f, 0.697f)
                reflectiveCurveToRelative(1.141f, -0.313f, 1.141f, -0.697f)
                lineTo(13.137f, 8.479f)
                curveToRelative(0.778f, 0.105f, 1.54f, 0.313f, 2.263f, 0.618f)
                lineToRelative(6.987f, 3.17f)
                curveToRelative(0.579f, 0.273f, 1.609f, 0.761f, 1.609f, 1.538f)
                reflectiveCurveToRelative(-1.011f, 1.236f, -1.609f, 1.53f)
                lineToRelative(-6.987f, 3.17f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -3.396f, 0.729f)
                arcToRelative(7.832f, 7.832f, 0.0f, false, true, -3.408f, -0.729f)
                lineToRelative(-6.987f, -3.17f)
                curveTo(1.011f, 15.042f, 0.0f, 14.574f, 0.0f, 13.801f)
                reflectiveCurveToRelative(1.03f, -1.264f, 1.609f, -1.534f)
                close()
                moveTo(3.416f, 14.514f)
                curveToRelative(0.77f, 0.396f, 1.683f, 0.396f, 2.453f, 0.0f)
                curveToRelative(0.682f, -0.396f, 0.686f, -1.026f, 0.0f, -1.419f)
                arcToRelative(2.705f, 2.705f, 0.0f, false, false, -2.453f, 0.0f)
                curveToRelative(-0.68f, 0.392f, -0.666f, 1.02f, 0.0f, 1.419f)
                close()
                moveTo(12.0f, 7.595f)
                arcToRelative(3.35f, 3.35f, 0.0f, true, true, 3.349f, -3.351f)
                verticalLineToRelative(0.003f)
                curveToRelative(0.0f, 1.849f, -1.5f, 3.348f, -3.349f, 3.348f)
                close()
            }
        }
        .build()
        return _applearcade!!
    }

private var _applearcade: ImageVector? = null
