package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.81f, 2.86f)
                curveToRelative(0.17f, -0.3f, 0.0f, -0.7f, -0.35f, -0.74f)
                curveToRelative(-2.62f, -0.37f, -5.3f, 0.28f, -7.44f, 1.86f)
                curveToRelative(-0.19f, 0.15f, -0.25f, 0.43f, -0.12f, 0.65f)
                lineToRelative(3.01f, 5.22f)
                curveToRelative(0.19f, 0.33f, 0.67f, 0.33f, 0.87f, 0.0f)
                lineToRelative(4.03f, -6.99f)
                close()
                moveTo(21.3f, 8.33f)
                curveToRelative(-0.98f, -2.47f, -2.92f, -4.46f, -5.35f, -5.5f)
                curveToRelative(-0.23f, -0.1f, -0.5f, 0.0f, -0.63f, 0.22f)
                lineToRelative(-3.01f, 5.21f)
                curveToRelative(-0.19f, 0.32f, 0.05f, 0.74f, 0.44f, 0.74f)
                horizontalLineToRelative(8.08f)
                curveToRelative(0.35f, 0.0f, 0.6f, -0.35f, 0.47f, -0.67f)
                close()
                moveTo(21.37f, 10.0f)
                horizontalLineToRelative(-6.2f)
                curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.43f, 0.75f)
                lineTo(19.0f, 18.14f)
                curveToRelative(0.17f, 0.3f, 0.6f, 0.35f, 0.82f, 0.08f)
                curveToRelative(1.74f, -2.18f, 2.48f, -5.03f, 2.05f, -7.79f)
                curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
                close()
                moveTo(4.18f, 5.79f)
                curveToRelative(-1.73f, 2.19f, -2.48f, 5.02f, -2.05f, 7.79f)
                curveToRelative(0.03f, 0.24f, 0.25f, 0.42f, 0.5f, 0.42f)
                horizontalLineToRelative(6.2f)
                curveToRelative(0.38f, 0.0f, 0.63f, -0.42f, 0.43f, -0.75f)
                lineTo(5.0f, 5.87f)
                curveToRelative(-0.18f, -0.3f, -0.61f, -0.35f, -0.82f, -0.08f)
                close()
                moveTo(2.7f, 15.67f)
                curveToRelative(0.98f, 2.47f, 2.92f, 4.46f, 5.35f, 5.5f)
                curveToRelative(0.23f, 0.1f, 0.5f, 0.0f, 0.63f, -0.22f)
                lineToRelative(3.01f, -5.21f)
                curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.43f, -0.75f)
                lineTo(3.17f, 14.99f)
                curveToRelative(-0.35f, 0.01f, -0.6f, 0.36f, -0.47f, 0.68f)
                close()
                moveTo(10.53f, 21.89f)
                curveToRelative(2.62f, 0.37f, 5.3f, -0.28f, 7.44f, -1.86f)
                curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f)
                lineToRelative(-3.01f, -5.22f)
                curveToRelative(-0.19f, -0.33f, -0.67f, -0.33f, -0.87f, 0.0f)
                lineToRelative(-4.04f, 6.99f)
                curveToRelative(-0.17f, 0.3f, 0.01f, 0.7f, 0.35f, 0.75f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
