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

public val SimpleIcons.Storybook: ImageVector
    get() {
        if (_storybook != null) {
            return _storybook!!
        }
        _storybook = Builder(name = "Storybook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.71f, 0.243f)
                lineToRelative(-0.12f, 2.71f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.29f, 0.15f)
                lineToRelative(1.06f, -0.8f)
                lineToRelative(0.9f, 0.7f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.28f, -0.14f)
                lineToRelative(-0.1f, -2.76f)
                lineToRelative(1.33f, -0.1f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.279f, 1.2f)
                verticalLineToRelative(21.596f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.26f, 1.2f)
                lineToRelative(-16.096f, -0.72f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.15f, -1.16f)
                lineToRelative(-0.75f, -19.797f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.13f, -1.27f)
                lineTo(16.7f, 0.222f)
                close()
                moveTo(13.64f, 9.3f)
                curveToRelative(0.0f, 0.47f, 3.16f, 0.24f, 3.59f, -0.08f)
                curveToRelative(0.0f, -3.2f, -1.72f, -4.89f, -4.859f, -4.89f)
                curveToRelative(-3.15f, 0.0f, -4.899f, 1.72f, -4.899f, 4.29f)
                curveToRelative(0.0f, 4.45f, 5.999f, 4.53f, 5.999f, 6.959f)
                curveToRelative(0.0f, 0.7f, -0.32f, 1.1f, -1.05f, 1.1f)
                curveToRelative(-0.96f, 0.0f, -1.35f, -0.49f, -1.3f, -2.16f)
                curveToRelative(0.0f, -0.36f, -3.649f, -0.48f, -3.769f, 0.0f)
                curveToRelative(-0.27f, 4.03f, 2.23f, 5.2f, 5.099f, 5.2f)
                curveToRelative(2.79f, 0.0f, 4.969f, -1.49f, 4.969f, -4.18f)
                curveToRelative(0.0f, -4.77f, -6.099f, -4.64f, -6.099f, -6.999f)
                curveToRelative(0.0f, -0.97f, 0.72f, -1.1f, 1.13f, -1.1f)
                curveToRelative(0.45f, 0.0f, 1.25f, 0.07f, 1.19f, 1.87f)
                close()
            }
        }
        .build()
        return _storybook!!
    }

private var _storybook: ImageVector? = null
