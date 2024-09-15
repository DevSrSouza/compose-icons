package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Cannabis: ImageVector
    get() {
        if (_cannabis != null) {
            return _cannabis!!
        }
        _cannabis = Builder(name = "Cannabis", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(503.47f, 360.25f)
                curveToRelative(-1.56f, -0.82f, -32.39f, -16.89f, -76.78f, -25.81f)
                curveToRelative(64.25f, -75.12f, 84.05f, -161.67f, 84.93f, -165.64f)
                curveToRelative(1.18f, -5.33f, -0.44f, -10.9f, -4.3f, -14.77f)
                curveToRelative(-3.03f, -3.04f, -7.12f, -4.7f, -11.32f, -4.7f)
                curveToRelative(-1.14f, 0.0f, -2.29f, 0.12f, -3.44f, 0.38f)
                curveToRelative(-3.88f, 0.85f, -86.54f, 19.59f, -160.58f, 79.76f)
                curveToRelative(0.01f, -1.46f, 0.01f, -2.93f, 0.01f, -4.4f)
                curveToRelative(0.0f, -118.79f, -59.98f, -213.72f, -62.53f, -217.7f)
                arcTo(15.97f, 15.97f, 0.0f, false, false, 256.0f, 0.0f)
                curveToRelative(-5.45f, 0.0f, -10.53f, 2.78f, -13.47f, 7.37f)
                curveToRelative(-2.55f, 3.98f, -62.53f, 98.91f, -62.53f, 217.7f)
                curveToRelative(0.0f, 1.47f, 0.01f, 2.94f, 0.01f, 4.4f)
                curveToRelative(-74.03f, -60.16f, -156.69f, -78.9f, -160.58f, -79.76f)
                curveToRelative(-1.14f, -0.25f, -2.29f, -0.38f, -3.44f, -0.38f)
                curveToRelative(-4.2f, 0.0f, -8.29f, 1.66f, -11.32f, 4.7f)
                arcTo(15.99f, 15.99f, 0.0f, false, false, 0.38f, 168.8f)
                curveToRelative(0.88f, 3.97f, 20.68f, 90.52f, 84.93f, 165.64f)
                curveToRelative(-44.39f, 8.92f, -75.21f, 24.99f, -76.78f, 25.81f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.02f, 28.29f)
                curveToRelative(2.45f, 1.29f, 60.76f, 31.72f, 133.49f, 31.72f)
                curveToRelative(6.14f, 0.0f, 11.96f, -0.1f, 17.5f, -0.31f)
                curveToRelative(-11.37f, 22.23f, -16.52f, 38.31f, -16.81f, 39.22f)
                curveToRelative(-1.8f, 5.68f, -0.29f, 11.89f, 3.91f, 16.11f)
                arcToRelative(16.02f, 16.02f, 0.0f, false, false, 16.1f, 3.99f)
                curveToRelative(1.83f, -0.57f, 37.72f, -11.99f, 77.3f, -39.29f)
                verticalLineTo(504.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                verticalLineToRelative(-64.01f)
                curveToRelative(39.58f, 27.3f, 75.47f, 38.71f, 77.3f, 39.29f)
                arcToRelative(16.02f, 16.02f, 0.0f, false, false, 16.1f, -3.99f)
                curveToRelative(4.2f, -4.22f, 5.71f, -10.43f, 3.91f, -16.11f)
                curveToRelative(-0.29f, -0.91f, -5.45f, -16.99f, -16.81f, -39.22f)
                curveToRelative(5.54f, 0.21f, 11.37f, 0.31f, 17.5f, 0.31f)
                curveToRelative(72.72f, 0.0f, 131.04f, -30.43f, 133.49f, -31.72f)
                curveToRelative(5.24f, -2.78f, 8.52f, -8.22f, 8.51f, -14.15f)
                curveToRelative(-0.01f, -5.94f, -3.29f, -11.39f, -8.53f, -14.15f)
                close()
            }
        }
        .build()
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
