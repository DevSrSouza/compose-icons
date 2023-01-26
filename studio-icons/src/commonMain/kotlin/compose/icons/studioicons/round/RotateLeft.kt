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

public val RoundGroup.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = Builder(name = "RotateLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.56f, 7.98f)
                curveTo(6.1f, 7.52f, 5.31f, 7.6f, 5.0f, 8.17f)
                curveToRelative(-0.28f, 0.51f, -0.5f, 1.03f, -0.67f, 1.58f)
                curveToRelative(-0.19f, 0.63f, 0.31f, 1.25f, 0.96f, 1.25f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.43f, 0.0f, 0.82f, -0.28f, 0.94f, -0.7f)
                curveToRelative(0.12f, -0.4f, 0.28f, -0.79f, 0.48f, -1.17f)
                curveToRelative(0.22f, -0.37f, 0.15f, -0.84f, -0.16f, -1.15f)
                close()
                moveTo(5.31f, 13.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.65f, 0.0f, -1.15f, 0.62f, -0.96f, 1.25f)
                curveToRelative(0.16f, 0.54f, 0.38f, 1.07f, 0.66f, 1.58f)
                curveToRelative(0.31f, 0.57f, 1.11f, 0.66f, 1.57f, 0.2f)
                curveToRelative(0.3f, -0.31f, 0.38f, -0.77f, 0.17f, -1.15f)
                curveToRelative(-0.2f, -0.37f, -0.36f, -0.76f, -0.48f, -1.16f)
                curveToRelative(-0.12f, -0.44f, -0.51f, -0.72f, -0.94f, -0.72f)
                close()
                moveTo(8.16f, 19.02f)
                curveToRelative(0.51f, 0.28f, 1.04f, 0.5f, 1.59f, 0.66f)
                curveToRelative(0.62f, 0.18f, 1.24f, -0.32f, 1.24f, -0.96f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.0f, -0.43f, -0.28f, -0.82f, -0.7f, -0.94f)
                curveToRelative(-0.4f, -0.12f, -0.78f, -0.28f, -1.15f, -0.48f)
                curveToRelative(-0.38f, -0.21f, -0.86f, -0.14f, -1.16f, 0.17f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(-0.45f, 0.45f, -0.36f, 1.24f, 0.21f, 1.55f)
                close()
                moveTo(13.0f, 4.07f)
                verticalLineToRelative(-0.66f)
                curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(9.17f, 4.83f)
                curveToRelative(-0.4f, 0.4f, -0.4f, 1.04f, 0.0f, 1.43f)
                lineToRelative(2.13f, 2.08f)
                curveToRelative(0.63f, 0.62f, 1.7f, 0.17f, 1.7f, -0.72f)
                lineTo(13.0f, 6.09f)
                curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f)
                curveToRelative(0.0f, 2.73f, -1.82f, 5.02f, -4.32f, 5.75f)
                curveToRelative(-0.41f, 0.12f, -0.68f, 0.51f, -0.68f, 0.94f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.0f, 0.65f, 0.61f, 1.14f, 1.23f, 0.96f)
                curveTo(17.57f, 18.71f, 20.0f, 15.64f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.08f, -3.05f, -7.44f, -7.0f, -7.93f)
                close()
            }
        }
        .build()
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
