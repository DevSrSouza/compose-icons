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

public val OutlineGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 2.26f)
                lineToRelative(-0.08f, -0.04f)
                lineToRelative(-0.01f, 0.02f)
                curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f)
                close()
                moveTo(19.41f, 9.0f)
                horizontalLineToRelative(-7.99f)
                lineToRelative(2.71f, -4.7f)
                curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f)
                close()
                moveTo(13.1f, 4.08f)
                lineTo(10.27f, 9.0f)
                lineToRelative(-1.15f, 2.0f)
                lineTo(6.4f, 6.3f)
                curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f)
                curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f)
                close()
                moveTo(5.7f, 7.09f)
                lineTo(8.54f, 12.0f)
                lineToRelative(1.15f, 2.0f)
                lineTo(4.26f, 14.0f)
                curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f)
                curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f)
                close()
                moveTo(4.59f, 15.0f)
                horizontalLineToRelative(7.98f)
                lineToRelative(-2.71f, 4.7f)
                curveToRelative(-2.4f, -0.67f, -4.34f, -2.42f, -5.27f, -4.7f)
                close()
                moveTo(10.9f, 19.91f)
                lineTo(14.89f, 13.0f)
                lineToRelative(2.72f, 4.7f)
                curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f)
                curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f)
                close()
                moveTo(18.3f, 16.91f)
                lineToRelative(-4.0f, -6.91f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f)
                curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
