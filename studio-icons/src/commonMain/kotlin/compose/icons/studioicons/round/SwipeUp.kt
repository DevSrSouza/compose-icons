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

public val RoundGroup.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = Builder(name = "SwipeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(6.75f, 13.38f)
                curveToRelative(0.26f, -0.26f, 0.29f, -0.66f, 0.09f, -0.95f)
                curveTo(5.68f, 10.74f, 5.0f, 8.7f, 5.0f, 6.5f)
                curveToRelative(0.0f, -0.88f, 0.11f, -1.74f, 0.32f, -2.56f)
                lineToRelative(1.09f, 1.09f)
                curveToRelative(0.3f, 0.3f, 0.79f, 0.29f, 1.08f, -0.02f)
                curveToRelative(0.28f, -0.3f, 0.25f, -0.78f, -0.04f, -1.07f)
                lineTo(5.21f, 1.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(1.53f, 3.97f)
                curveToRelative(-0.3f, 0.3f, -0.29f, 0.79f, 0.02f, 1.08f)
                curveToRelative(0.3f, 0.28f, 0.78f, 0.25f, 1.07f, -0.04f)
                lineTo(3.8f, 3.82f)
                curveTo(3.6f, 4.68f, 3.5f, 5.58f, 3.5f, 6.5f)
                curveToRelative(0.0f, 2.51f, 0.77f, 4.85f, 2.09f, 6.77f)
                curveTo(5.86f, 13.66f, 6.41f, 13.72f, 6.75f, 13.38f)
                close()
            }
        }
        .build()
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
