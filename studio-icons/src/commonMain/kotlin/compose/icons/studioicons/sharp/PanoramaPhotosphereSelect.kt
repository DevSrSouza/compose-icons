package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PanoramaPhotosphereSelect: ImageVector
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
                moveTo(23.0f, 8.84f)
                curveToRelative(-0.54f, -0.43f, -1.23f, -0.81f, -1.99f, -1.15f)
                curveTo(19.4f, 4.33f, 15.98f, 2.0f, 12.0f, 2.0f)
                curveTo(8.02f, 2.0f, 4.6f, 4.33f, 2.99f, 7.68f)
                curveTo(2.23f, 8.03f, 1.54f, 8.4f, 1.0f, 8.84f)
                verticalLineToRelative(6.33f)
                curveToRelative(0.54f, 0.43f, 1.23f, 0.81f, 1.99f, 1.15f)
                curveTo(4.6f, 19.67f, 8.02f, 22.0f, 12.0f, 22.0f)
                curveToRelative(3.98f, 0.0f, 7.4f, -2.33f, 9.01f, -5.68f)
                curveToRelative(0.76f, -0.34f, 1.45f, -0.72f, 1.99f, -1.15f)
                verticalLineTo(8.84f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.37f, 0.0f, 4.49f, 1.04f, 5.95f, 2.68f)
                curveTo(16.17f, 6.25f, 14.15f, 6.0f, 12.0f, 6.0f)
                curveTo(9.85f, 6.0f, 7.83f, 6.25f, 6.05f, 6.68f)
                curveTo(7.51f, 5.04f, 9.63f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-2.37f, 0.0f, -4.49f, -1.04f, -5.95f, -2.68f)
                curveTo(7.83f, 17.75f, 9.85f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(4.17f, -0.25f, 5.95f, -0.68f)
                curveTo(16.49f, 18.96f, 14.37f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _panoramaPhotosphereSelect!!
    }

private var _panoramaPhotosphereSelect: ImageVector? = null
