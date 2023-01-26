package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) {
            return _swipeDown!!
        }
        _swipeDown = Builder(name = "SwipeDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8f, 12.18f)
                curveToRelative(-0.2f, -0.86f, -0.3f, -1.76f, -0.3f, -2.68f)
                curveToRelative(0.0f, -2.84f, 0.99f, -5.45f, 2.63f, -7.5f)
                lineTo(7.2f, 3.07f)
                curveTo(5.82f, 4.85f, 5.0f, 7.08f, 5.0f, 9.5f)
                curveToRelative(0.0f, 0.88f, 0.11f, 1.74f, 0.32f, 2.56f)
                lineToRelative(1.62f, -1.62f)
                lineTo(8.0f, 11.5f)
                lineTo(4.5f, 15.0f)
                lineTo(1.0f, 11.5f)
                lineToRelative(1.06f, -1.06f)
                lineTo(3.8f, 12.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
