package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Gesture: ImageVector
    get() {
        if (_gesture != null) {
            return _gesture!!
        }
        _gesture = Builder(name = "Gesture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.59f, 6.89f)
                curveToRelative(0.7f, -0.71f, 1.4f, -1.35f, 1.71f, -1.22f)
                curveToRelative(0.5f, 0.2f, 0.0f, 1.03f, -0.3f, 1.52f)
                curveToRelative(-0.25f, 0.42f, -2.86f, 3.89f, -2.86f, 6.31f)
                curveToRelative(0.0f, 1.28f, 0.48f, 2.34f, 1.34f, 2.98f)
                curveToRelative(0.75f, 0.56f, 1.74f, 0.73f, 2.64f, 0.46f)
                curveToRelative(1.07f, -0.31f, 1.95f, -1.4f, 3.06f, -2.77f)
                curveToRelative(1.21f, -1.49f, 2.83f, -3.44f, 4.08f, -3.44f)
                curveToRelative(1.63f, 0.0f, 1.65f, 1.01f, 1.76f, 1.79f)
                curveToRelative(-3.78f, 0.64f, -5.38f, 3.67f, -5.38f, 5.37f)
                curveToRelative(0.0f, 1.7f, 1.44f, 3.09f, 3.21f, 3.09f)
                curveToRelative(1.63f, 0.0f, 4.29f, -1.33f, 4.69f, -6.1f)
                lineTo(21.0f, 14.88f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-0.15f, -1.65f, -1.09f, -4.2f, -4.03f, -4.2f)
                curveToRelative(-2.25f, 0.0f, -4.18f, 1.91f, -4.94f, 2.84f)
                curveToRelative(-0.58f, 0.73f, -2.06f, 2.48f, -2.29f, 2.72f)
                curveToRelative(-0.25f, 0.3f, -0.68f, 0.84f, -1.11f, 0.84f)
                curveToRelative(-0.45f, 0.0f, -0.72f, -0.83f, -0.36f, -1.92f)
                curveToRelative(0.35f, -1.09f, 1.4f, -2.86f, 1.85f, -3.52f)
                curveToRelative(0.78f, -1.14f, 1.3f, -1.92f, 1.3f, -3.28f)
                curveTo(8.95f, 3.69f, 7.31f, 3.0f, 6.44f, 3.0f)
                curveTo(5.12f, 3.0f, 3.97f, 4.0f, 3.72f, 4.25f)
                curveToRelative(-0.36f, 0.36f, -0.66f, 0.66f, -0.88f, 0.93f)
                lineToRelative(1.75f, 1.71f)
                close()
                moveTo(13.88f, 18.55f)
                curveToRelative(-0.31f, 0.0f, -0.74f, -0.26f, -0.74f, -0.72f)
                curveToRelative(0.0f, -0.6f, 0.73f, -2.2f, 2.87f, -2.76f)
                curveToRelative(-0.3f, 2.69f, -1.43f, 3.48f, -2.13f, 3.48f)
                close()
            }
        }
        .build()
        return _gesture!!
    }

private var _gesture: ImageVector? = null
