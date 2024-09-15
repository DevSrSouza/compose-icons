package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Rocketchat: ImageVector
    get() {
        if (_rocketchat != null) {
            return _rocketchat!!
        }
        _rocketchat = Builder(name = "Rocketchat", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.05f, 224.8f)
                arcToRelative(34.11f, 34.11f, 0.0f, true, false, 34.32f, 34.11f)
                arcTo(34.22f, 34.22f, 0.0f, false, false, 284.05f, 224.8f)
                close()
                moveTo(173.6f, 224.8f)
                arcToRelative(34.11f, 34.11f, 0.0f, true, false, 34.32f, 34.11f)
                arcTo(34.22f, 34.22f, 0.0f, false, false, 173.6f, 224.8f)
                close()
                moveTo(394.52f, 224.8f)
                arcToRelative(34.11f, 34.11f, 0.0f, true, false, 34.32f, 34.11f)
                arcTo(34.22f, 34.22f, 0.0f, false, false, 394.52f, 224.8f)
                close()
                moveTo(548.33f, 169.48f)
                curveToRelative(-15.53f, -24.17f, -37.31f, -45.57f, -64.68f, -63.62f)
                curveToRelative(-52.89f, -34.82f, -122.37f, -54.0f, -195.67f, -54.0f)
                arcToRelative(405.98f, 405.98f, 0.0f, false, false, -72.03f, 6.36f)
                arcToRelative(238.52f, 238.52f, 0.0f, false, false, -49.51f, -36.59f)
                curveTo(99.68f, -11.7f, 40.86f, 0.71f, 11.14f, 11.42f)
                arcTo(14.29f, 14.29f, 0.0f, false, false, 5.58f, 34.78f)
                curveTo(26.54f, 56.46f, 61.22f, 99.3f, 52.7f, 138.25f)
                curveToRelative(-33.14f, 33.9f, -51.11f, 74.78f, -51.11f, 117.34f)
                curveToRelative(0.0f, 43.37f, 17.97f, 84.25f, 51.11f, 118.15f)
                curveToRelative(8.53f, 38.96f, -26.15f, 81.82f, -47.12f, 103.49f)
                arcToRelative(14.28f, 14.28f, 0.0f, false, false, 5.55f, 23.34f)
                curveToRelative(29.72f, 10.71f, 88.55f, 23.15f, 155.32f, -10.2f)
                arcToRelative(238.68f, 238.68f, 0.0f, false, false, 49.51f, -36.59f)
                arcTo(405.97f, 405.97f, 0.0f, false, false, 288.0f, 460.14f)
                curveToRelative(73.31f, 0.0f, 142.8f, -19.16f, 195.67f, -53.97f)
                curveToRelative(27.37f, -18.05f, 49.15f, -39.43f, 64.68f, -63.62f)
                curveToRelative(17.31f, -26.92f, 26.07f, -55.92f, 26.07f, -86.13f)
                curveTo(574.39f, 225.4f, 565.63f, 196.43f, 548.33f, 169.49f)
                close()
                moveTo(284.99f, 409.9f)
                arcToRelative(345.65f, 345.65f, 0.0f, false, true, -89.45f, -11.5f)
                lineToRelative(-20.13f, 19.39f)
                arcToRelative(184.37f, 184.37f, 0.0f, false, true, -37.14f, 27.58f)
                arcToRelative(145.77f, 145.77f, 0.0f, false, true, -52.52f, 14.87f)
                curveToRelative(0.98f, -1.77f, 1.88f, -3.56f, 2.84f, -5.36f)
                quadToRelative(30.26f, -55.68f, 16.33f, -100.08f)
                curveToRelative(-32.99f, -25.96f, -52.78f, -59.2f, -52.78f, -95.4f)
                curveToRelative(0.0f, -83.1f, 104.25f, -150.47f, 232.85f, -150.47f)
                reflectiveCurveToRelative(232.87f, 67.37f, 232.87f, 150.47f)
                curveTo(517.85f, 342.52f, 413.6f, 409.9f, 284.99f, 409.9f)
                close()
            }
        }
        .build()
        return _rocketchat!!
    }

private var _rocketchat: ImageVector? = null
