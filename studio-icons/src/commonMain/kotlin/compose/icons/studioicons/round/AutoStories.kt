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

public val RoundGroup.AutoStories: ImageVector
    get() {
        if (_autoStories != null) {
            return _autoStories!!
        }
        _autoStories = Builder(name = "AutoStories", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.15f, 1.35f)
                lineToRelative(-4.0f, 4.0f)
                curveTo(14.05f, 5.45f, 14.0f, 5.57f, 14.0f, 5.71f)
                verticalLineToRelative(8.17f)
                curveToRelative(0.0f, 0.43f, 0.51f, 0.66f, 0.83f, 0.37f)
                lineToRelative(4.0f, -3.6f)
                curveToRelative(0.11f, -0.09f, 0.17f, -0.23f, 0.17f, -0.37f)
                verticalLineTo(1.71f)
                curveTo(19.0f, 1.26f, 18.46f, 1.04f, 18.15f, 1.35f)
                close()
                moveTo(22.47f, 5.2f)
                curveTo(22.0f, 4.96f, 21.51f, 4.76f, 21.0f, 4.59f)
                verticalLineToRelative(12.03f)
                curveTo(19.86f, 16.21f, 18.69f, 16.0f, 17.5f, 16.0f)
                curveToRelative(-1.9f, 0.0f, -3.78f, 0.54f, -5.5f, 1.58f)
                verticalLineTo(5.48f)
                curveTo(10.38f, 4.55f, 8.51f, 4.0f, 6.5f, 4.0f)
                curveTo(4.71f, 4.0f, 3.02f, 4.44f, 1.53f, 5.2f)
                curveTo(1.2f, 5.36f, 1.0f, 5.71f, 1.0f, 6.08f)
                verticalLineToRelative(12.08f)
                curveToRelative(0.0f, 0.76f, 0.81f, 1.23f, 1.48f, 0.87f)
                curveTo(3.69f, 18.4f, 5.05f, 18.0f, 6.5f, 18.0f)
                curveToRelative(2.07f, 0.0f, 3.98f, 0.82f, 5.5f, 2.0f)
                curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f)
                curveToRelative(1.45f, 0.0f, 2.81f, 0.4f, 4.02f, 1.04f)
                curveTo(22.19f, 19.4f, 23.0f, 18.93f, 23.0f, 18.17f)
                verticalLineTo(6.08f)
                curveTo(23.0f, 5.71f, 22.8f, 5.36f, 22.47f, 5.2f)
                close()
            }
        }
        .build()
        return _autoStories!!
    }

private var _autoStories: ImageVector? = null
