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

public val BaselineGroup.PanoramaHorizontalSelect: ImageVector
    get() {
        if (_panoramaHorizontalSelect != null) {
            return _panoramaHorizontalSelect!!
        }
        _panoramaHorizontalSelect = Builder(name = "PanoramaHorizontalSelect", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.43f, 4.0f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.02f, -0.31f, 0.06f)
                curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12.0f, 5.7f)
                reflectiveCurveToRelative(-6.18f, -0.55f, -9.12f, -1.64f)
                curveTo(2.77f, 4.02f, 2.66f, 4.0f, 2.57f, 4.0f)
                curveToRelative(-0.34f, 0.0f, -0.57f, 0.23f, -0.57f, 0.63f)
                verticalLineToRelative(14.75f)
                curveToRelative(0.0f, 0.39f, 0.23f, 0.62f, 0.57f, 0.62f)
                curveToRelative(0.1f, 0.0f, 0.2f, -0.02f, 0.31f, -0.06f)
                curveToRelative(2.94f, -1.1f, 6.03f, -1.64f, 9.12f, -1.64f)
                reflectiveCurveToRelative(6.18f, 0.55f, 9.12f, 1.64f)
                curveToRelative(0.11f, 0.04f, 0.21f, 0.06f, 0.31f, 0.06f)
                curveToRelative(0.33f, 0.0f, 0.57f, -0.23f, 0.57f, -0.63f)
                verticalLineTo(4.63f)
                curveToRelative(0.0f, -0.4f, -0.24f, -0.63f, -0.57f, -0.63f)
                close()
            }
        }
        .build()
        return _panoramaHorizontalSelect!!
    }

private var _panoramaHorizontalSelect: ImageVector? = null
