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

public val RoundGroup.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) {
            return _swipeDown!!
        }
        _swipeDown = Builder(name = "SwipeDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.83f, 19.1f)
                curveToRelative(-0.26f, -0.6f, 0.09f, -1.28f, 0.73f, -1.41f)
                lineToRelative(3.58f, -0.71f)
                lineTo(8.79f, 7.17f)
                curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f)
                curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f)
                lineToRelative(2.43f, 5.49f)
                lineToRelative(0.84f, -0.37f)
                curveToRelative(0.28f, -0.13f, 0.59f, -0.18f, 0.9f, -0.17f)
                lineToRelative(4.56f, 0.21f)
                curveToRelative(0.86f, 0.04f, 1.6f, 0.63f, 1.83f, 1.45f)
                lineToRelative(1.23f, 4.33f)
                curveToRelative(0.27f, 0.96f, -0.2f, 1.97f, -1.11f, 2.37f)
                lineToRelative(-5.63f, 2.49f)
                curveToRelative(-0.48f, 0.21f, -1.26f, 0.33f, -1.76f, 0.14f)
                lineToRelative(-5.45f, -2.27f)
                curveTo(9.13f, 19.53f, 8.93f, 19.34f, 8.83f, 19.1f)
                close()
                moveTo(5.59f, 2.73f)
                curveTo(4.27f, 4.65f, 3.5f, 6.99f, 3.5f, 9.5f)
                curveToRelative(0.0f, 0.92f, 0.1f, 1.82f, 0.3f, 2.68f)
                lineToRelative(-1.19f, -1.19f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.32f, -1.07f, -0.04f)
                curveToRelative(-0.31f, 0.29f, -0.31f, 0.78f, -0.02f, 1.08f)
                lineToRelative(2.26f, 2.26f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(2.24f, -2.24f)
                curveToRelative(0.29f, -0.29f, 0.32f, -0.77f, 0.04f, -1.07f)
                curveToRelative(-0.29f, -0.31f, -0.78f, -0.31f, -1.08f, -0.02f)
                lineToRelative(-1.09f, 1.09f)
                curveTo(5.11f, 11.24f, 5.0f, 10.38f, 5.0f, 9.5f)
                curveToRelative(0.0f, -2.2f, 0.68f, -4.24f, 1.83f, -5.93f)
                curveToRelative(0.2f, -0.3f, 0.17f, -0.7f, -0.09f, -0.95f)
                curveTo(6.41f, 2.28f, 5.86f, 2.34f, 5.59f, 2.73f)
                close()
            }
        }
        .build()
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
