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

public val SharpGroup.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) {
            return _panoramaVertical!!
        }
        _panoramaVertical = Builder(name = "PanoramaVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.46f, 4.0f)
                curveToRelative(-0.77f, 2.6f, -1.16f, 5.28f, -1.16f, 8.0f)
                curveToRelative(0.0f, 2.72f, 0.39f, 5.41f, 1.16f, 8.0f)
                horizontalLineTo(6.55f)
                curveToRelative(0.77f, -2.6f, 1.16f, -5.28f, 1.16f, -8.0f)
                curveToRelative(0.0f, -2.72f, -0.39f, -5.41f, -1.16f, -8.0f)
                horizontalLineToRelative(10.91f)
                moveToRelative(2.78f, -2.0f)
                horizontalLineTo(3.77f)
                reflectiveCurveToRelative(0.26f, 0.77f, 0.3f, 0.88f)
                curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12.0f)
                reflectiveCurveToRelative(-0.55f, 6.18f, -1.64f, 9.12f)
                curveToRelative(-0.04f, 0.11f, -0.3f, 0.88f, -0.3f, 0.88f)
                horizontalLineToRelative(16.47f)
                reflectiveCurveToRelative(-0.26f, -0.77f, -0.3f, -0.88f)
                curveToRelative(-1.09f, -2.94f, -1.64f, -6.03f, -1.64f, -9.12f)
                reflectiveCurveToRelative(0.55f, -6.18f, 1.64f, -9.12f)
                curveToRelative(0.04f, -0.11f, 0.3f, -0.88f, 0.3f, -0.88f)
                close()
            }
        }
        .build()
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
