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

public val BaselineGroup.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) {
            return _panoramaHorizontal!!
        }
        _panoramaHorizontal = Builder(name = "PanoramaHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.54f)
                verticalLineToRelative(10.91f)
                curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f)
                curveToRelative(-2.72f, 0.0f, -5.4f, 0.39f, -8.0f, 1.16f)
                verticalLineTo(6.54f)
                curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f)
                curveToRelative(2.72f, 0.01f, 5.4f, -0.38f, 8.0f, -1.16f)
                moveTo(21.43f, 4.0f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.02f, -0.31f, 0.06f)
                curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12.0f, 5.7f)
                curveToRelative(-3.09f, 0.0f, -6.18f, -0.55f, -9.12f, -1.64f)
                curveToRelative(-0.11f, -0.04f, -0.22f, -0.06f, -0.31f, -0.06f)
                curveToRelative(-0.34f, 0.0f, -0.57f, 0.23f, -0.57f, 0.63f)
                verticalLineToRelative(14.75f)
                curveToRelative(0.0f, 0.39f, 0.23f, 0.62f, 0.57f, 0.62f)
                curveToRelative(0.1f, 0.0f, 0.2f, -0.02f, 0.31f, -0.06f)
                curveToRelative(2.94f, -1.1f, 6.03f, -1.64f, 9.12f, -1.64f)
                curveToRelative(3.09f, 0.0f, 6.18f, 0.55f, 9.12f, 1.64f)
                curveToRelative(0.11f, 0.04f, 0.21f, 0.06f, 0.31f, 0.06f)
                curveToRelative(0.33f, 0.0f, 0.57f, -0.23f, 0.57f, -0.63f)
                verticalLineTo(4.63f)
                curveToRelative(0.0f, -0.4f, -0.24f, -0.63f, -0.57f, -0.63f)
                close()
            }
        }
        .build()
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
