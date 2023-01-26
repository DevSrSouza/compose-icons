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

public val SharpGroup.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) {
            return _panoramaHorizontal!!
        }
        _panoramaHorizontal = Builder(name = "PanoramaHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.55f)
                curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f)
                curveToRelative(2.72f, 0.0f, 5.41f, -0.39f, 8.0f, -1.16f)
                verticalLineToRelative(10.91f)
                curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f)
                curveToRelative(-2.72f, 0.0f, -5.41f, 0.39f, -8.0f, 1.16f)
                verticalLineTo(6.55f)
                moveTo(2.0f, 3.77f)
                verticalLineToRelative(16.47f)
                reflectiveCurveToRelative(0.77f, -0.26f, 0.88f, -0.3f)
                curveTo(5.82f, 18.85f, 8.91f, 18.3f, 12.0f, 18.3f)
                curveToRelative(3.09f, 0.0f, 6.18f, 0.55f, 9.12f, 1.64f)
                curveToRelative(0.11f, 0.04f, 0.88f, 0.3f, 0.88f, 0.3f)
                verticalLineTo(3.77f)
                reflectiveCurveToRelative(-0.77f, 0.26f, -0.88f, 0.3f)
                curveTo(18.18f, 5.15f, 15.09f, 5.71f, 12.0f, 5.71f)
                reflectiveCurveToRelative(-6.18f, -0.56f, -9.12f, -1.64f)
                curveToRelative(-0.11f, -0.05f, -0.88f, -0.3f, -0.88f, -0.3f)
                close()
            }
        }
        .build()
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
