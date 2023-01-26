package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9f, 19.91f)
                curveToRelative(0.36f, 0.05f, 0.72f, 0.09f, 1.1f, 0.09f)
                curveToRelative(2.18f, 0.0f, 4.16f, -0.88f, 5.61f, -2.3f)
                lineTo(14.89f, 13.0f)
                lineToRelative(-3.99f, 6.91f)
                close()
                moveTo(9.86f, 19.7f)
                lineToRelative(2.71f, -4.7f)
                lineTo(4.59f, 15.0f)
                curveToRelative(0.93f, 2.28f, 2.87f, 4.03f, 5.27f, 4.7f)
                close()
                moveTo(8.54f, 12.0f)
                lineTo(5.7f, 7.09f)
                curveTo(4.64f, 8.45f, 4.0f, 10.15f, 4.0f, 12.0f)
                curveToRelative(0.0f, 0.69f, 0.1f, 1.36f, 0.26f, 2.0f)
                horizontalLineToRelative(5.43f)
                lineToRelative(-1.15f, -2.0f)
                close()
                moveTo(18.3f, 16.91f)
                curveTo(19.36f, 15.55f, 20.0f, 13.85f, 20.0f, 12.0f)
                curveToRelative(0.0f, -0.69f, -0.1f, -1.36f, -0.26f, -2.0f)
                horizontalLineToRelative(-5.43f)
                lineToRelative(3.99f, 6.91f)
                close()
                moveTo(13.73f, 9.0f)
                horizontalLineToRelative(5.68f)
                curveToRelative(-0.93f, -2.28f, -2.88f, -4.04f, -5.28f, -4.7f)
                lineTo(11.42f, 9.0f)
                horizontalLineToRelative(2.31f)
                close()
                moveTo(10.27f, 9.0f)
                lineToRelative(2.83f, -4.92f)
                curveTo(12.74f, 4.03f, 12.37f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-2.18f, 0.0f, -4.16f, 0.88f, -5.6f, 2.3f)
                lineTo(9.12f, 11.0f)
                lineToRelative(1.15f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f)
                lineToRelative(-0.08f, -0.04f)
                lineToRelative(-0.01f, 0.02f)
                curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f)
                lineTo(14.89f, 13.0f)
                lineToRelative(2.72f, 4.7f)
                curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f)
                lineToRelative(-4.0f, -6.91f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f)
                close()
                moveTo(19.41f, 9.0f)
                horizontalLineToRelative(-7.99f)
                lineToRelative(2.71f, -4.7f)
                curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f)
                lineTo(10.27f, 9.0f)
                lineToRelative(-1.15f, 2.0f)
                lineTo(6.4f, 6.3f)
                curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f)
                lineTo(8.54f, 12.0f)
                lineToRelative(1.15f, 2.0f)
                lineTo(4.26f, 14.0f)
                curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f)
                close()
                moveTo(10.27f, 15.0f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-2.71f, 4.7f)
                curveToRelative(-2.4f, -0.67f, -4.35f, -2.42f, -5.28f, -4.7f)
                horizontalLineToRelative(5.69f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
