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

public val BaselineGroup.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) {
            return _panoramaVertical!!
        }
        _panoramaVertical = Builder(name = "PanoramaVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.94f, 21.12f)
                curveToRelative(-1.1f, -2.94f, -1.64f, -6.03f, -1.64f, -9.12f)
                curveToRelative(0.0f, -3.09f, 0.55f, -6.18f, 1.64f, -9.12f)
                curveToRelative(0.04f, -0.11f, 0.06f, -0.22f, 0.06f, -0.31f)
                curveToRelative(0.0f, -0.34f, -0.23f, -0.57f, -0.63f, -0.57f)
                horizontalLineTo(4.63f)
                curveToRelative(-0.4f, 0.0f, -0.63f, 0.23f, -0.63f, 0.57f)
                curveToRelative(0.0f, 0.1f, 0.02f, 0.2f, 0.06f, 0.31f)
                curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12.0f)
                curveToRelative(0.0f, 3.09f, -0.55f, 6.18f, -1.64f, 9.12f)
                curveToRelative(-0.05f, 0.11f, -0.07f, 0.22f, -0.07f, 0.31f)
                curveToRelative(0.0f, 0.33f, 0.23f, 0.57f, 0.63f, 0.57f)
                horizontalLineToRelative(14.75f)
                curveToRelative(0.39f, 0.0f, 0.63f, -0.24f, 0.63f, -0.57f)
                curveToRelative(-0.01f, -0.1f, -0.03f, -0.2f, -0.07f, -0.31f)
                close()
                moveTo(6.54f, 20.0f)
                curveToRelative(0.77f, -2.6f, 1.16f, -5.28f, 1.16f, -8.0f)
                curveToRelative(0.0f, -2.72f, -0.39f, -5.4f, -1.16f, -8.0f)
                horizontalLineToRelative(10.91f)
                curveToRelative(-0.77f, 2.6f, -1.16f, 5.28f, -1.16f, 8.0f)
                curveToRelative(0.0f, 2.72f, 0.39f, 5.4f, 1.16f, 8.0f)
                horizontalLineTo(6.54f)
                close()
            }
        }
        .build()
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
