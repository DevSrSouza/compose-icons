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

public val SimpleIcons.Loom: ImageVector
    get() {
        if (_loom != null) {
            return _loom!!
        }
        _loom = Builder(name = "Loom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4f, 4.64f)
                curveTo(18.02f, 1.82f, 15.15f, 0.0f, 12.0f, 0.0f)
                curveTo(8.76f, 0.0f, 5.98f, 1.89f, 4.64f, 4.6f)
                curveTo(1.82f, 5.98f, 0.0f, 8.85f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.24f, 1.89f, 6.02f, 4.6f, 7.36f)
                curveTo(5.98f, 22.18f, 8.85f, 24.0f, 12.0f, 24.0f)
                curveToRelative(3.24f, 0.0f, 6.02f, -1.89f, 7.36f, -4.61f)
                curveTo(22.18f, 18.02f, 24.0f, 15.15f, 24.0f, 12.0f)
                curveToRelative(0.0f, -3.24f, -1.89f, -6.02f, -4.6f, -7.36f)
                close()
                moveTo(12.0f, 1.5f)
                curveToRelative(1.99f, 0.0f, 3.87f, 0.89f, 5.13f, 2.37f)
                curveToRelative(-0.45f, -0.08f, -0.91f, -0.12f, -1.38f, -0.12f)
                curveToRelative(-3.34f, 0.0f, -6.21f, 1.99f, -7.52f, 4.86f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(0.03f)
                curveTo(7.76f, 9.67f, 7.5f, 10.8f, 7.5f, 12.0f)
                curveToRelative(0.0f, 0.46f, 0.04f, 0.93f, 0.12f, 1.38f)
                curveToRelative(-1.47f, -1.26f, -2.37f, -3.14f, -2.37f, -5.13f)
                curveTo(5.25f, 4.53f, 8.28f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(0.89f, 0.0f, 1.71f, 0.18f, 2.49f, 0.48f)
                curveToRelative(0.33f, 0.81f, 0.51f, 1.65f, 0.51f, 2.52f)
                curveToRelative(0.0f, 0.89f, -0.18f, 1.72f, -0.48f, 2.49f)
                curveToRelative(-0.81f, 0.33f, -1.65f, 0.51f, -2.52f, 0.51f)
                curveToRelative(-0.89f, 0.0f, -1.72f, -0.18f, -2.49f, -0.48f)
                curveTo(9.18f, 13.71f, 9.0f, 12.87f, 9.0f, 12.0f)
                curveToRelative(0.0f, -0.89f, 0.18f, -1.73f, 0.48f, -2.49f)
                curveTo(10.29f, 9.18f, 11.13f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(1.5f, 12.0f)
                curveToRelative(0.0f, -1.99f, 0.89f, -3.87f, 2.37f, -5.13f)
                curveToRelative(-0.08f, 0.45f, -0.12f, 0.91f, -0.12f, 1.38f)
                curveToRelative(0.0f, 3.34f, 1.99f, 6.21f, 4.86f, 7.52f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(0.03f)
                curveToRelative(1.03f, 0.46f, 2.16f, 0.72f, 3.36f, 0.72f)
                curveToRelative(0.47f, 0.0f, 0.93f, -0.04f, 1.38f, -0.12f)
                curveToRelative(-1.26f, 1.47f, -3.14f, 2.37f, -5.13f, 2.37f)
                curveToRelative(-3.72f, 0.0f, -6.75f, -3.03f, -6.75f, -6.75f)
                close()
                moveTo(12.0f, 22.5f)
                curveToRelative(-1.99f, 0.0f, -3.87f, -0.89f, -5.13f, -2.37f)
                curveToRelative(0.45f, 0.07f, 0.91f, 0.12f, 1.38f, 0.12f)
                curveToRelative(3.34f, 0.0f, 6.21f, -1.99f, 7.52f, -4.86f)
                lineToRelative(0.02f, -0.03f)
                curveToRelative(0.46f, -1.03f, 0.72f, -2.16f, 0.72f, -3.36f)
                curveToRelative(0.0f, -0.47f, -0.04f, -0.93f, -0.12f, -1.38f)
                curveToRelative(1.47f, 1.26f, 2.37f, 3.14f, 2.37f, 5.13f)
                curveToRelative(-0.01f, 3.72f, -3.04f, 6.75f, -6.76f, 6.75f)
                close()
                moveTo(20.13f, 17.13f)
                curveToRelative(0.08f, -0.45f, 0.12f, -0.92f, 0.12f, -1.38f)
                curveToRelative(0.0f, -3.35f, -1.99f, -6.21f, -4.86f, -7.52f)
                curveToRelative(-0.02f, -0.02f, -0.02f, -0.02f, -0.03f, -0.02f)
                curveToRelative(-1.03f, -0.45f, -2.16f, -0.71f, -3.36f, -0.71f)
                curveToRelative(-0.47f, 0.0f, -0.93f, 0.04f, -1.38f, 0.12f)
                curveToRelative(1.26f, -1.47f, 3.14f, -2.37f, 5.13f, -2.37f)
                curveToRelative(3.72f, 0.0f, 6.75f, 3.03f, 6.75f, 6.75f)
                curveToRelative(0.0f, 1.99f, -0.89f, 3.87f, -2.37f, 5.13f)
                close()
            }
        }
        .build()
        return _loom!!
    }

private var _loom: ImageVector? = null
