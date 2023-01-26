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

public val BaselineGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4f, 10.5f)
                lineToRelative(4.77f, -8.26f)
                curveTo(13.47f, 2.09f, 12.75f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-2.4f, 0.0f, -4.6f, 0.85f, -6.32f, 2.25f)
                lineToRelative(3.66f, 6.35f)
                lineToRelative(0.06f, -0.1f)
                close()
                moveTo(21.54f, 9.0f)
                curveToRelative(-0.92f, -2.92f, -3.15f, -5.26f, -6.0f, -6.34f)
                lineTo(11.88f, 9.0f)
                horizontalLineToRelative(9.66f)
                close()
                moveTo(21.8f, 10.0f)
                horizontalLineToRelative(-7.49f)
                lineToRelative(0.29f, 0.5f)
                lineToRelative(4.76f, 8.25f)
                curveTo(21.0f, 16.97f, 22.0f, 14.61f, 22.0f, 12.0f)
                curveToRelative(0.0f, -0.69f, -0.07f, -1.35f, -0.2f, -2.0f)
                close()
                moveTo(8.54f, 12.0f)
                lineToRelative(-3.9f, -6.75f)
                curveTo(3.01f, 7.03f, 2.0f, 9.39f, 2.0f, 12.0f)
                curveToRelative(0.0f, 0.69f, 0.07f, 1.35f, 0.2f, 2.0f)
                horizontalLineToRelative(7.49f)
                lineToRelative(-1.15f, -2.0f)
                close()
                moveTo(2.46f, 15.0f)
                curveToRelative(0.92f, 2.92f, 3.15f, 5.26f, 6.0f, 6.34f)
                lineTo(12.12f, 15.0f)
                lineTo(2.46f, 15.0f)
                close()
                moveTo(13.73f, 15.0f)
                lineToRelative(-3.9f, 6.76f)
                curveToRelative(0.7f, 0.15f, 1.42f, 0.24f, 2.17f, 0.24f)
                curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.32f, -2.25f)
                lineToRelative(-3.66f, -6.35f)
                lineToRelative(-0.93f, 1.6f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
