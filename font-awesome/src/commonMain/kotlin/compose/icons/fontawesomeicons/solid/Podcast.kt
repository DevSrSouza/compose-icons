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

public val SolidGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(267.43f, 488.56f)
                curveTo(262.29f, 507.57f, 242.86f, 512.0f, 224.0f, 512.0f)
                curveToRelative(-18.86f, 0.0f, -38.29f, -4.43f, -43.43f, -23.44f)
                curveTo(172.93f, 460.13f, 160.0f, 388.9f, 160.0f, 355.75f)
                curveToRelative(0.0f, -35.16f, 31.14f, -43.75f, 64.0f, -43.75f)
                reflectiveCurveToRelative(64.0f, 8.59f, 64.0f, 43.75f)
                curveToRelative(0.0f, 32.95f, -12.87f, 104.18f, -20.57f, 132.81f)
                close()
                moveTo(156.87f, 288.55f)
                curveToRelative(-18.69f, -18.31f, -29.96f, -44.17f, -28.78f, -72.6f)
                curveToRelative(2.05f, -49.72f, 42.4f, -89.96f, 92.12f, -91.88f)
                curveTo(274.86f, 121.96f, 320.0f, 165.81f, 320.0f, 220.0f)
                curveToRelative(0.0f, 26.83f, -11.06f, 51.12f, -28.87f, 68.55f)
                curveToRelative(-2.67f, 2.62f, -2.4f, 6.99f, 0.63f, 9.19f)
                curveToRelative(9.31f, 6.76f, 16.46f, 15.34f, 21.23f, 25.36f)
                curveToRelative(1.74f, 3.65f, 6.5f, 4.66f, 9.45f, 1.89f)
                curveToRelative(28.83f, -27.04f, 46.55f, -65.78f, 45.51f, -108.57f)
                curveToRelative(-1.86f, -76.21f, -63.6f, -138.21f, -139.79f, -140.37f)
                curveTo(146.87f, 73.75f, 80.0f, 139.21f, 80.0f, 220.0f)
                curveToRelative(0.0f, 41.36f, 17.53f, 78.7f, 45.55f, 104.99f)
                curveToRelative(2.95f, 2.77f, 7.71f, 1.77f, 9.45f, -1.89f)
                curveToRelative(4.77f, -10.02f, 11.92f, -18.6f, 21.24f, -25.36f)
                curveToRelative(3.03f, -2.2f, 3.3f, -6.57f, 0.63f, -9.19f)
                close()
                moveTo(224.0f, 0.0f)
                curveTo(100.2f, 0.0f, 0.0f, 100.18f, 0.0f, 224.0f)
                curveToRelative(0.0f, 89.99f, 52.6f, 165.65f, 125.74f, 201.41f)
                curveToRelative(4.33f, 2.12f, 9.27f, -1.54f, 8.53f, -6.31f)
                curveToRelative(-2.38f, -15.51f, -4.34f, -30.95f, -5.41f, -44.34f)
                curveToRelative(-0.15f, -1.84f, -1.15f, -3.49f, -2.68f, -4.51f)
                curveToRelative(-47.4f, -31.81f, -78.56f, -86.02f, -78.19f, -147.35f)
                curveToRelative(0.59f, -96.24f, 79.29f, -174.65f, 175.53f, -174.9f)
                curveTo(320.79f, 47.75f, 400.0f, 126.8f, 400.0f, 224.0f)
                curveToRelative(0.0f, 61.93f, -32.16f, 116.49f, -80.65f, 147.87f)
                curveToRelative(-1.0f, 14.04f, -3.07f, 30.59f, -5.62f, 47.23f)
                curveToRelative(-0.73f, 4.77f, 4.2f, 8.43f, 8.53f, 6.31f)
                curveTo(395.23f, 389.73f, 448.0f, 314.19f, 448.0f, 224.0f)
                curveTo(448.0f, 100.21f, 347.82f, 0.0f, 224.0f, 0.0f)
                close()
                moveTo(224.0f, 160.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.65f, -64.0f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
