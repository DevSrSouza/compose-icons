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

public val RoundGroup.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.83f, 4.83f)
                lineTo(12.7f, 2.7f)
                curveToRelative(-0.62f, -0.62f, -1.7f, -0.18f, -1.7f, 0.71f)
                verticalLineToRelative(0.66f)
                curveTo(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f)
                curveToRelative(0.0f, 3.64f, 2.43f, 6.71f, 5.77f, 7.68f)
                curveToRelative(0.62f, 0.18f, 1.23f, -0.32f, 1.23f, -0.96f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.0f, -0.43f, -0.27f, -0.82f, -0.68f, -0.94f)
                curveTo(7.82f, 17.03f, 6.0f, 14.73f, 6.0f, 12.0f)
                curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f)
                verticalLineToRelative(1.53f)
                curveToRelative(0.0f, 0.89f, 1.07f, 1.33f, 1.7f, 0.71f)
                lineToRelative(2.13f, -2.08f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.0f, -1.42f)
                close()
                moveTo(19.67f, 9.76f)
                curveToRelative(-0.16f, -0.55f, -0.38f, -1.08f, -0.66f, -1.59f)
                curveToRelative(-0.31f, -0.57f, -1.1f, -0.66f, -1.56f, -0.2f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.31f, 0.31f, -0.38f, 0.78f, -0.17f, 1.16f)
                curveToRelative(0.2f, 0.37f, 0.36f, 0.76f, 0.48f, 1.16f)
                curveToRelative(0.12f, 0.42f, 0.51f, 0.7f, 0.94f, 0.7f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.65f, 0.0f, 1.15f, -0.62f, 0.96f, -1.24f)
                close()
                moveTo(13.0f, 18.68f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.0f, 0.65f, 0.62f, 1.14f, 1.24f, 0.96f)
                curveToRelative(0.55f, -0.16f, 1.08f, -0.38f, 1.59f, -0.66f)
                curveToRelative(0.57f, -0.31f, 0.66f, -1.1f, 0.2f, -1.56f)
                lineToRelative(-0.02f, -0.02f)
                curveToRelative(-0.31f, -0.31f, -0.78f, -0.38f, -1.16f, -0.17f)
                curveToRelative(-0.37f, 0.21f, -0.76f, 0.37f, -1.16f, 0.49f)
                curveToRelative(-0.41f, 0.12f, -0.69f, 0.51f, -0.69f, 0.94f)
                close()
                moveTo(17.44f, 16.03f)
                curveToRelative(0.46f, 0.46f, 1.25f, 0.37f, 1.56f, -0.2f)
                curveToRelative(0.28f, -0.51f, 0.5f, -1.04f, 0.67f, -1.59f)
                curveToRelative(0.18f, -0.62f, -0.31f, -1.24f, -0.96f, -1.24f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.44f, 0.0f, -0.82f, 0.28f, -0.94f, 0.7f)
                curveToRelative(-0.12f, 0.4f, -0.28f, 0.79f, -0.48f, 1.17f)
                curveToRelative(-0.21f, 0.38f, -0.13f, 0.86f, 0.17f, 1.16f)
                close()
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
