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

public val SimpleIcons.Chef: ImageVector
    get() {
        if (_chef != null) {
            return _chef!!
        }
        _chef = Builder(name = "Chef", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.03f, 0.0f)
                curveTo(6.94f, 0.0f, 2.57f, 3.17f, 0.82f, 7.65f)
                lineToRelative(1.91f, 0.77f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.3f, -6.4f)
                curveToRelative(2.24f, 0.0f, 4.32f, 0.77f, 5.96f, 1.97f)
                lineToRelative(1.2f, -1.64f)
                arcTo(11.96f, 11.96f, 0.0f, false, false, 12.03f, 0.0f)
                close()
                moveTo(12.03f, 2.3f)
                arcToRelative(9.76f, 9.76f, 0.0f, false, false, -9.08f, 6.23f)
                lineToRelative(1.91f, 0.7f)
                arcToRelative(7.62f, 7.62f, 0.0f, false, true, 7.17f, -4.91f)
                close()
                moveTo(15.58f, 3.0f)
                lineToRelative(-0.76f, 1.92f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, 4.75f, 5.63f)
                horizontalLineToRelative(2.08f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, -6.07f, -7.54f)
                close()
                moveTo(12.03f, 4.6f)
                arcToRelative(7.44f, 7.44f, 0.0f, true, false, 7.32f, 8.9f)
                horizontalLineToRelative(-2.08f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -5.24f, 3.94f)
                arcToRelative(5.39f, 5.39f, 0.0f, false, true, -5.42f, -5.41f)
                arcToRelative(5.39f, 5.39f, 0.0f, false, true, 5.42f, -5.41f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 5.2f, 3.93f)
                horizontalLineToRelative(2.07f)
                arcToRelative(7.35f, 7.35f, 0.0f, false, false, -7.27f, -5.96f)
                close()
                moveTo(22.25f, 5.69f)
                lineTo(20.5f, 6.78f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 1.42f, 3.77f)
                lineTo(24.0f, 10.55f)
                arcToRelative(11.56f, 11.56f, 0.0f, false, false, -1.75f, -4.86f)
                close()
                moveTo(11.97f, 6.83f)
                arcToRelative(5.22f, 5.22f, 0.0f, false, false, -4.7f, 7.27f)
                lineToRelative(1.97f, -0.87f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, -0.27f, -1.2f)
                curveToRelative(0.0f, -1.64f, 1.36f, -3.01f, 3.0f, -3.01f)
                close()
                moveTo(13.89f, 7.22f)
                lineToRelative(-0.77f, 2.02f)
                curveToRelative(0.66f, 0.27f, 1.15f, 0.7f, 1.53f, 1.31f)
                horizontalLineToRelative(2.3f)
                arcToRelative(5.04f, 5.04f, 0.0f, false, false, -3.06f, -3.33f)
                close()
                moveTo(0.0f, 12.02f)
                curveToRelative(0.0f, 1.65f, 0.33f, 3.29f, 1.04f, 4.87f)
                lineToRelative(1.8f, -0.82f)
                arcToRelative(10.49f, 10.49f, 0.0f, false, true, -0.82f, -4.04f)
                close()
                moveTo(2.3f, 12.02f)
                curveToRelative(0.0f, 4.1f, 2.51f, 7.6f, 6.12f, 9.03f)
                lineToRelative(0.76f, -1.92f)
                arcToRelative(7.63f, 7.63f, 0.0f, false, true, -4.86f, -7.1f)
                close()
                moveTo(14.6f, 13.5f)
                curveToRelative(-0.33f, 0.6f, -0.82f, 1.1f, -1.48f, 1.31f)
                lineToRelative(0.77f, 2.03f)
                arcToRelative(5.04f, 5.04f, 0.0f, false, false, 3.06f, -3.34f)
                close()
                moveTo(19.57f, 13.5f)
                arcToRelative(7.73f, 7.73f, 0.0f, false, true, -7.54f, 6.24f)
                verticalLineToRelative(2.02f)
                arcToRelative(9.71f, 9.71f, 0.0f, false, false, 9.62f, -8.26f)
                close()
                moveTo(21.92f, 13.5f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, -9.9f, 8.53f)
                curveToRelative(-2.73f, 0.0f, -5.24f, -1.15f, -7.04f, -2.95f)
                lineTo(3.55f, 20.5f)
                curveToRelative(2.19f, 2.19f, 5.2f, 3.5f, 8.53f, 3.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 13.5f)
                close()
                moveTo(9.9f, 14.16f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, false, 3.66f, 1.53f)
                verticalLineToRelative(-2.19f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, true, -2.13f, -0.87f)
                close()
            }
        }
        .build()
        return _chef!!
    }

private var _chef: ImageVector? = null
