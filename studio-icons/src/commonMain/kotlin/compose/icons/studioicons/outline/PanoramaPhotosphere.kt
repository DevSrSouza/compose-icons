package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PanoramaPhotosphere: ImageVector
    get() {
        if (_panoramaPhotosphere != null) {
            return _panoramaPhotosphere!!
        }
        _panoramaPhotosphere = Builder(name = "PanoramaPhotosphere", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.95f, 8.15f)
                curveToRelative(-0.29f, -0.16f, -0.61f, -0.31f, -0.93f, -0.46f)
                curveTo(19.4f, 4.33f, 15.98f, 2.0f, 12.0f, 2.0f)
                curveTo(8.02f, 2.0f, 4.6f, 4.33f, 2.99f, 7.68f)
                curveToRelative(-0.33f, 0.15f, -0.64f, 0.3f, -0.93f, 0.46f)
                curveTo(1.41f, 8.5f, 1.0f, 9.17f, 1.0f, 9.91f)
                verticalLineToRelative(4.18f)
                curveToRelative(0.0f, 0.74f, 0.41f, 1.41f, 1.05f, 1.77f)
                curveToRelative(0.29f, 0.16f, 0.61f, 0.31f, 0.93f, 0.46f)
                curveTo(4.6f, 19.67f, 8.02f, 22.0f, 12.0f, 22.0f)
                curveToRelative(3.98f, 0.0f, 7.4f, -2.33f, 9.01f, -5.68f)
                curveToRelative(0.33f, -0.15f, 0.64f, -0.3f, 0.93f, -0.46f)
                curveTo(22.59f, 15.5f, 23.0f, 14.83f, 23.0f, 14.09f)
                verticalLineTo(9.91f)
                curveTo(23.0f, 9.17f, 22.59f, 8.5f, 21.95f, 8.15f)
                close()
                moveTo(21.0f, 9.91f)
                curveTo(21.0f, 9.91f, 21.0f, 9.91f, 21.0f, 9.91f)
                lineToRelative(0.0f, 4.19f)
                curveTo(18.81f, 15.31f, 15.53f, 16.0f, 12.0f, 16.0f)
                curveToRelative(-3.53f, 0.0f, -6.81f, -0.7f, -9.0f, -1.91f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(0.0f, -4.18f)
                curveTo(5.2f, 8.69f, 8.47f, 8.0f, 12.0f, 8.0f)
                curveTo(15.53f, 8.0f, 18.81f, 8.7f, 21.0f, 9.91f)
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
        return _panoramaPhotosphere!!
    }

private var _panoramaPhotosphere: ImageVector? = null
