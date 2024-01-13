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

public val SimpleIcons.Openhab: ImageVector
    get() {
        if (_openhab != null) {
            return _openhab!!
        }
        _openhab = Builder(name = "Openhab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 9.103f)
                lineToRelative(-9.76f, 9.768f)
                curveToRelative(-0.376f, -0.553f, -0.725f, -1.123f, -0.998f, -1.738f)
                lineToRelative(9.39f, -9.397f)
                lineTo(12.0f, 6.368f)
                lineToRelative(1.368f, 1.368f)
                lineToRelative(6.931f, 6.931f)
                lineToRelative(-0.01f, 0.035f)
                lineToRelative(-0.136f, 0.403f)
                lineToRelative(-0.156f, 0.393f)
                lineToRelative(-0.174f, 0.384f)
                lineToRelative(-0.192f, 0.374f)
                lineToRelative(-0.175f, 0.304f)
                lineTo(12.0f, 9.103f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.39f, 0.0f, 0.0f, 5.39f, 0.0f, 12.0f)
                curveToRelative(0.0f, 1.306f, 0.211f, 2.563f, 0.6f, 3.741f)
                lineToRelative(0.893f, -0.893f)
                lineToRelative(0.668f, -0.67f)
                arcTo(10.039f, 10.039f, 0.0f, false, true, 1.922f, 12.0f)
                curveTo(1.922f, 6.45f, 6.45f, 1.922f, 12.0f, 1.922f)
                reflectiveCurveTo(22.078f, 6.449f, 22.078f, 12.0f)
                curveToRelative(0.0f, 5.55f, -4.527f, 10.078f, -10.078f, 10.078f)
                arcToRelative(10.06f, 10.06f, 0.0f, false, true, -7.698f, -3.588f)
                lineToRelative(-0.012f, 0.012f)
                lineToRelative(-0.309f, 0.309f)
                lineToRelative(-0.308f, 0.309f)
                lineToRelative(-0.308f, 0.308f)
                lineToRelative(-0.424f, 0.425f)
                curveTo(5.144f, 22.39f, 8.39f, 24.0f, 12.001f, 24.0f)
                curveTo(18.61f, 24.0f, 24.0f, 18.61f, 24.0f, 12.0f)
                reflectiveCurveTo(18.61f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _openhab!!
    }

private var _openhab: ImageVector? = null
