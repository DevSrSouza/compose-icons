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

public val SimpleIcons.Octanerender: ImageVector
    get() {
        if (_octanerender != null) {
            return _octanerender!!
        }
        _octanerender = Builder(name = "Octanerender", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.71f, 0.0f)
                curveTo(8.24f, 3.9f, 6.92f, 6.0f, 6.64f, 9.14f)
                curveToRelative(-0.01f, -0.01f, -0.03f, -0.01f, -0.04f, -0.02f)
                curveToRelative(-1.28f, -0.73f, -2.3f, -2.22f, -2.91f, -3.73f)
                lineToRelative(-2.23f, 0.87f)
                curveToRelative(1.64f, 4.95f, 2.81f, 7.13f, 5.39f, 8.94f)
                curveToRelative(-0.02f, 0.01f, -0.03f, 0.02f, -0.05f, 0.03f)
                curveToRelative(-1.27f, 0.74f, -3.07f, 0.89f, -4.68f, 0.66f)
                lineToRelative(-0.36f, 2.37f)
                curveToRelative(5.11f, 1.06f, 7.59f, 1.15f, 10.46f, -0.19f)
                verticalLineToRelative(0.06f)
                curveToRelative(0.0f, 1.47f, -0.77f, 3.09f, -1.78f, 4.38f)
                lineTo(12.3f, 24.0f)
                curveToRelative(3.46f, -3.89f, 4.78f, -5.99f, 5.06f, -9.13f)
                curveToRelative(0.02f, 0.01f, 0.03f, 0.01f, 0.05f, 0.02f)
                curveToRelative(1.27f, 0.73f, 2.29f, 2.21f, 2.9f, 3.73f)
                lineToRelative(2.23f, -0.87f)
                curveToRelative(-1.64f, -4.95f, -2.8f, -7.14f, -5.39f, -8.95f)
                curveToRelative(0.02f, -0.01f, 0.03f, -0.02f, 0.05f, -0.03f)
                curveToRelative(1.27f, -0.74f, 3.07f, -0.88f, 4.68f, -0.65f)
                lineToRelative(0.36f, -2.38f)
                curveToRelative(-5.1f, -1.06f, -7.58f, -1.14f, -10.44f, 0.19f)
                verticalLineToRelative(-0.06f)
                curveToRelative(0.0f, -1.47f, 0.77f, -3.09f, 1.78f, -4.38f)
                lineTo(11.71f, 0.0f)
                close()
                moveTo(11.9f, 8.82f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, true, 3.28f, 3.07f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, true, -3.07f, 3.28f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, true, -3.28f, -3.07f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, true, 3.07f, -3.28f)
                close()
            }
        }
        .build()
        return _octanerender!!
    }

private var _octanerender: ImageVector? = null
