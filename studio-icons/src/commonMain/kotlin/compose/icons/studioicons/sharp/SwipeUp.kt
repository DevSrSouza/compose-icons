package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = Builder(name = "SwipeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.06f, 5.56f)
                lineTo(1.0f, 4.5f)
                lineTo(4.5f, 1.0f)
                lineTo(8.0f, 4.5f)
                lineTo(6.94f, 5.56f)
                lineTo(5.32f, 3.94f)
                curveTo(5.11f, 4.76f, 5.0f, 5.62f, 5.0f, 6.5f)
                curveToRelative(0.0f, 2.42f, 0.82f, 4.65f, 2.2f, 6.43f)
                lineTo(6.13f, 14.0f)
                curveTo(4.49f, 11.95f, 3.5f, 9.34f, 3.5f, 6.5f)
                curveToRelative(0.0f, -0.92f, 0.1f, -1.82f, 0.3f, -2.68f)
                lineTo(2.06f, 5.56f)
                close()
                moveTo(21.71f, 11.18f)
                lineToRelative(2.09f, 7.39f)
                lineToRelative(-8.23f, 3.65f)
                lineToRelative(-6.84f, -2.85f)
                lineToRelative(0.61f, -1.62f)
                lineToRelative(3.8f, -0.75f)
                lineTo(8.79f, 7.17f)
                curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f)
                curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f)
                lineToRelative(2.43f, 5.49f)
                lineToRelative(1.26f, -0.56f)
                lineTo(21.71f, 11.18f)
                close()
            }
        }
        .build()
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
