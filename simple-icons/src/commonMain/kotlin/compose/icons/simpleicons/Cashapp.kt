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

public val SimpleIcons.Cashapp: ImageVector
    get() {
        if (_cashapp != null) {
            return _cashapp!!
        }
        _cashapp = Builder(name = "Cashapp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.59f, 3.475f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, -3.05f, -3.05f)
                curveToRelative(-1.31f, -0.42f, -2.5f, -0.42f, -4.92f, -0.42f)
                lineTo(8.36f, 0.005f)
                curveToRelative(-2.4f, 0.0f, -3.61f, 0.0f, -4.9f, 0.4f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, -3.05f, 3.06f)
                curveTo(0.0f, 4.765f, 0.0f, 5.965f, 0.0f, 8.365f)
                verticalLineToRelative(7.27f)
                curveToRelative(0.0f, 2.41f, 0.0f, 3.6f, 0.4f, 4.9f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, 3.05f, 3.05f)
                curveToRelative(1.3f, 0.41f, 2.5f, 0.41f, 4.9f, 0.41f)
                horizontalLineToRelative(7.28f)
                curveToRelative(2.41f, 0.0f, 3.61f, 0.0f, 4.9f, -0.4f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, 3.06f, -3.06f)
                curveToRelative(0.41f, -1.3f, 0.41f, -2.5f, 0.41f, -4.9f)
                verticalLineToRelative(-7.25f)
                curveToRelative(0.0f, -2.41f, 0.0f, -3.61f, -0.41f, -4.91f)
                close()
                moveTo(17.42f, 8.105f)
                lineToRelative(-0.93f, 0.93f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.67f, 0.01f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.22f, -1.18f)
                curveToRelative(-0.97f, 0.0f, -1.94f, 0.32f, -1.94f, 1.21f)
                curveToRelative(0.0f, 0.9f, 1.04f, 1.2f, 2.24f, 1.65f)
                curveToRelative(2.1f, 0.7f, 3.84f, 1.58f, 3.84f, 3.64f)
                curveToRelative(0.0f, 2.24f, -1.74f, 3.78f, -4.58f, 3.95f)
                lineToRelative(-0.26f, 1.2f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.48f, 0.39f)
                lineTo(9.63f, 19.905f)
                lineToRelative(-0.09f, -0.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.38f, -0.59f)
                lineToRelative(0.28f, -1.27f)
                arcToRelative(6.54f, 6.54f, 0.0f, false, true, -2.88f, -1.57f)
                verticalLineToRelative(-0.01f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.0f, -0.68f)
                lineToRelative(1.0f, -0.97f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.67f, 0.0f)
                curveToRelative(0.91f, 0.86f, 2.13f, 1.34f, 3.39f, 1.32f)
                curveToRelative(1.3f, 0.0f, 2.17f, -0.55f, 2.17f, -1.42f)
                curveToRelative(0.0f, -0.87f, -0.88f, -1.1f, -2.54f, -1.72f)
                curveToRelative(-1.76f, -0.63f, -3.43f, -1.52f, -3.43f, -3.6f)
                curveToRelative(0.0f, -2.42f, 2.01f, -3.6f, 4.39f, -3.71f)
                lineToRelative(0.25f, -1.23f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.48f, -0.38f)
                horizontalLineToRelative(1.78f)
                lineToRelative(0.1f, 0.01f)
                curveToRelative(0.26f, 0.06f, 0.43f, 0.31f, 0.37f, 0.57f)
                lineToRelative(-0.27f, 1.37f)
                curveToRelative(0.9f, 0.3f, 1.75f, 0.77f, 2.48f, 1.39f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.5f, 0.0f, 0.68f)
                close()
            }
        }
        .build()
        return _cashapp!!
    }

private var _cashapp: ImageVector? = null
