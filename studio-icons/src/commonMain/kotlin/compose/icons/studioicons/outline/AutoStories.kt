package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AutoStories: ImageVector
    get() {
        if (_autoStories != null) {
            return _autoStories!!
        }
        _autoStories = Builder(name = "AutoStories", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                curveToRelative(0.0f, 0.58f, 0.47f, 0.99f, 1.0f, 0.99f)
                curveToRelative(0.16f, 0.0f, 0.32f, -0.04f, 0.48f, -0.12f)
                curveTo(3.69f, 18.4f, 5.05f, 18.0f, 6.5f, 18.0f)
                curveToRelative(2.07f, 0.0f, 3.98f, 0.82f, 5.5f, 2.0f)
                curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f)
                curveToRelative(1.45f, 0.0f, 2.81f, 0.4f, 4.02f, 1.04f)
                curveToRelative(0.16f, 0.08f, 0.32f, 0.12f, 0.48f, 0.12f)
                curveToRelative(0.52f, 0.0f, 1.0f, -0.41f, 1.0f, -0.99f)
                verticalLineTo(6.08f)
                curveTo(23.0f, 5.71f, 22.8f, 5.36f, 22.47f, 5.2f)
                close()
                moveTo(10.0f, 16.62f)
                curveTo(8.86f, 16.21f, 7.69f, 16.0f, 6.5f, 16.0f)
                curveToRelative(-1.19f, 0.0f, -2.36f, 0.21f, -3.5f, 0.62f)
                verticalLineTo(6.71f)
                curveTo(4.11f, 6.24f, 5.28f, 6.0f, 6.5f, 6.0f)
                curveTo(7.7f, 6.0f, 8.89f, 6.25f, 10.0f, 6.72f)
                verticalLineTo(16.62f)
                close()
                moveTo(19.0f, 0.5f)
                lineToRelative(-5.0f, 5.0f)
                verticalLineTo(15.0f)
                lineToRelative(5.0f, -4.5f)
                verticalLineTo(0.5f)
                close()
            }
        }
        .build()
        return _autoStories!!
    }

private var _autoStories: ImageVector? = null
