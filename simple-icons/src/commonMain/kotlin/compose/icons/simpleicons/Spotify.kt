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

public val SimpleIcons.Spotify: ImageVector
    get() {
        if (_spotify != null) {
            return _spotify!!
        }
        _spotify = Builder(name = "Spotify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.4f, 0.0f, 0.0f, 5.4f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.4f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.4f, 12.0f, -12.0f)
                reflectiveCurveTo(18.66f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.521f, 17.34f)
                curveToRelative(-0.24f, 0.359f, -0.66f, 0.48f, -1.021f, 0.24f)
                curveToRelative(-2.82f, -1.74f, -6.36f, -2.101f, -10.561f, -1.141f)
                curveToRelative(-0.418f, 0.122f, -0.779f, -0.179f, -0.899f, -0.539f)
                curveToRelative(-0.12f, -0.421f, 0.18f, -0.78f, 0.54f, -0.9f)
                curveToRelative(4.56f, -1.021f, 8.52f, -0.6f, 11.64f, 1.32f)
                curveToRelative(0.42f, 0.18f, 0.479f, 0.659f, 0.301f, 1.02f)
                close()
                moveTo(18.961f, 14.04f)
                curveToRelative(-0.301f, 0.42f, -0.841f, 0.6f, -1.262f, 0.3f)
                curveToRelative(-3.239f, -1.98f, -8.159f, -2.58f, -11.939f, -1.38f)
                curveToRelative(-0.479f, 0.12f, -1.02f, -0.12f, -1.14f, -0.6f)
                curveToRelative(-0.12f, -0.48f, 0.12f, -1.021f, 0.6f, -1.141f)
                curveTo(9.6f, 9.9f, 15.0f, 10.561f, 18.72f, 12.84f)
                curveToRelative(0.361f, 0.181f, 0.54f, 0.78f, 0.241f, 1.2f)
                close()
                moveTo(19.081f, 10.68f)
                curveTo(15.24f, 8.4f, 8.82f, 8.16f, 5.16f, 9.301f)
                curveToRelative(-0.6f, 0.179f, -1.2f, -0.181f, -1.38f, -0.721f)
                curveToRelative(-0.18f, -0.601f, 0.18f, -1.2f, 0.72f, -1.381f)
                curveToRelative(4.26f, -1.26f, 11.28f, -1.02f, 15.721f, 1.621f)
                curveToRelative(0.539f, 0.3f, 0.719f, 1.02f, 0.419f, 1.56f)
                curveToRelative(-0.299f, 0.421f, -1.02f, 0.599f, -1.559f, 0.3f)
                close()
            }
        }
        .build()
        return _spotify!!
    }

private var _spotify: ImageVector? = null
