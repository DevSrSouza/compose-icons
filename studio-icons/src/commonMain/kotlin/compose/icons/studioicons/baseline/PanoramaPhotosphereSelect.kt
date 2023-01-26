package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PanoramaPhotosphereSelect: ImageVector
    get() {
        if (_panoramaPhotosphereSelect != null) {
            return _panoramaPhotosphereSelect!!
        }
        _panoramaPhotosphereSelect = Builder(name = "PanoramaPhotosphereSelect", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.49f, 8.51f)
                curveToRelative(-0.47f, -0.23f, -0.93f, -0.44f, -1.4f, -0.64f)
                curveTo(19.52f, 4.41f, 16.05f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(4.47f, 4.41f, 2.9f, 7.88f)
                curveToRelative(-0.47f, 0.2f, -0.93f, 0.41f, -1.4f, 0.63f)
                curveToRelative(-0.31f, 0.15f, -0.5f, 0.48f, -0.5f, 0.83f)
                verticalLineToRelative(5.32f)
                curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.51f, 0.83f)
                curveToRelative(0.47f, 0.23f, 0.93f, 0.44f, 1.39f, 0.64f)
                curveToRelative(3.55f, 7.83f, 14.65f, 7.82f, 18.2f, 0.0f)
                curveToRelative(0.47f, -0.2f, 0.93f, -0.41f, 1.39f, -0.63f)
                curveToRelative(0.31f, -0.17f, 0.51f, -0.49f, 0.51f, -0.84f)
                verticalLineTo(9.34f)
                curveToRelative(0.0f, -0.35f, -0.19f, -0.68f, -0.51f, -0.83f)
                close()
                moveTo(12.0f, 3.8f)
                curveToRelative(2.6f, 0.0f, 4.91f, 1.23f, 6.41f, 3.12f)
                curveToRelative(-4.1f, -1.19f, -8.48f, -1.26f, -12.83f, 0.01f)
                curveTo(7.08f, 5.03f, 9.4f, 3.8f, 12.0f, 3.8f)
                close()
                moveTo(5.6f, 17.08f)
                curveToRelative(4.19f, 1.22f, 8.57f, 1.23f, 12.82f, -0.01f)
                curveToRelative(-1.54f, 1.97f, -3.9f, 3.13f, -6.41f, 3.13f)
                curveToRelative(-2.5f, 0.0f, -4.87f, -1.15f, -6.41f, -3.12f)
                close()
            }
        }
        .build()
        return _panoramaPhotosphereSelect!!
    }

private var _panoramaPhotosphereSelect: ImageVector? = null
