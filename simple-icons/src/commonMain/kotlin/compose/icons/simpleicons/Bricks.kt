package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bricks: ImageVector
    get() {
        if (_bricks != null) {
            return _bricks!!
        }
        _bricks = Builder(name = "Bricks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.578f, 0.0f)
                lineToRelative(0.405f, 0.253f)
                verticalLineToRelative(7.038f)
                arcToRelative(8.416f, 8.416f, 0.0f, false, true, 4.742f, -1.418f)
                curveToRelative(2.498f, 0.0f, 4.569f, 0.872f, 6.211f, 2.616f)
                curveToRelative(1.621f, 1.745f, 2.431f, 3.894f, 2.431f, 6.448f)
                curveToRelative(0.0f, 2.565f, -0.816f, 4.714f, -2.448f, 6.447f)
                curveTo(17.277f, 23.128f, 15.212f, 24.0f, 12.725f, 24.0f)
                curveToRelative(-2.171f, 0.0f, -4.028f, -0.776f, -5.569f, -2.329f)
                verticalLineToRelative(1.907f)
                lineTo(2.633f, 23.578f)
                lineTo(2.633f, 0.557f)
                lineTo(7.578f, 0.0f)
                close()
                moveTo(11.865f, 10.447f)
                curveToRelative(-1.193f, 0.0f, -2.189f, 0.405f, -2.988f, 1.215f)
                curveToRelative(-0.799f, 0.833f, -1.198f, 1.925f, -1.198f, 3.275f)
                curveToRelative(0.0f, 1.35f, 0.399f, 2.436f, 1.198f, 3.257f)
                curveToRelative(0.788f, 0.822f, 1.784f, 1.232f, 2.988f, 1.232f)
                curveToRelative(1.271f, 0.0f, 2.301f, -0.427f, 3.088f, -1.282f)
                curveToRelative(0.777f, -0.844f, 1.165f, -1.913f, 1.165f, -3.207f)
                curveToRelative(0.0f, -1.294f, -0.394f, -2.369f, -1.182f, -3.224f)
                curveToRelative(-0.787f, -0.844f, -1.811f, -1.266f, -3.071f, -1.266f)
                close()
            }
        }
        .build()
        return _bricks!!
    }

private var _bricks: ImageVector? = null
