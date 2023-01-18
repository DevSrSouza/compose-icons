package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SpotifyLine: ImageVector
    get() {
        if (_spotifyLine != null) {
            return _spotifyLine!!
        }
        _spotifyLine = Builder(name = "SpotifyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.55f, 0.0f, 10.0f, 4.5f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.5f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.395f, 0.0f, -8.0f, 3.605f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.605f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.605f, 8.0f, -8.0f)
                curveToRelative(0.0f, -4.414f, -3.573f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(15.75f, 16.65f)
                curveToRelative(-2.35f, -1.45f, -5.3f, -1.75f, -8.8f, -0.95f)
                curveToRelative(-0.35f, 0.1f, -0.65f, -0.15f, -0.75f, -0.45f)
                curveToRelative(-0.1f, -0.35f, 0.15f, -0.65f, 0.45f, -0.75f)
                curveToRelative(3.8f, -0.85f, 7.1f, -0.5f, 9.7f, 1.1f)
                curveToRelative(0.35f, 0.15f, 0.4f, 0.55f, 0.25f, 0.85f)
                curveToRelative(-0.2f, 0.3f, -0.55f, 0.4f, -0.85f, 0.2f)
                close()
                moveTo(16.75f, 13.95f)
                curveToRelative(-2.7f, -1.65f, -6.8f, -2.15f, -9.95f, -1.15f)
                curveToRelative(-0.4f, 0.1f, -0.85f, -0.1f, -0.95f, -0.5f)
                curveToRelative(-0.1f, -0.4f, 0.1f, -0.85f, 0.5f, -0.95f)
                curveToRelative(3.65f, -1.1f, 8.15f, -0.55f, 11.25f, 1.35f)
                curveToRelative(0.3f, 0.15f, 0.45f, 0.65f, 0.2f, 1.0f)
                reflectiveCurveToRelative(-0.7f, 0.5f, -1.05f, 0.25f)
                close()
                moveTo(6.3f, 9.75f)
                curveToRelative(-0.5f, 0.15f, -1.0f, -0.15f, -1.15f, -0.6f)
                curveToRelative(-0.15f, -0.5f, 0.15f, -1.0f, 0.6f, -1.15f)
                curveToRelative(3.55f, -1.05f, 9.4f, -0.85f, 13.1f, 1.35f)
                curveToRelative(0.45f, 0.25f, 0.6f, 0.85f, 0.35f, 1.3f)
                curveToRelative(-0.25f, 0.35f, -0.85f, 0.5f, -1.3f, 0.25f)
                curveTo(14.7f, 9.0f, 9.35f, 8.8f, 6.3f, 9.75f)
                close()
            }
        }
        .build()
        return _spotifyLine!!
    }

private var _spotifyLine: ImageVector? = null
