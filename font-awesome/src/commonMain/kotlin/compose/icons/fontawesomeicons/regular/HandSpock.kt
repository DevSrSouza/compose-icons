package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.HandSpock: ImageVector
    get() {
        if (_handSpock != null) {
            return _handSpock!!
        }
        _handSpock = Builder(name = "HandSpock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.03f, 116.18f)
                curveToRelative(-19.39f, -31.51f, -51.24f, -35.73f, -66.31f, -35.02f)
                curveToRelative(-14.11f, -50.81f, -62.0f, -54.08f, -70.74f, -54.08f)
                arcToRelative(74.03f, 74.03f, 0.0f, false, false, -72.24f, 58.92f)
                lineToRelative(-4.65f, 22.66f)
                lineToRelative(-13.68f, -53.21f)
                curveToRelative(-9.1f, -35.37f, -46.41f, -64.05f, -89.66f, -53.07f)
                arcToRelative(73.9f, 73.9f, 0.0f, false, false, -55.12f, 78.95f)
                arcToRelative(73.68f, 73.68f, 0.0f, false, false, -64.85f, 94.42f)
                lineToRelative(24.36f, 82.2f)
                curveToRelative(-38.24f, -7.54f, -62.8f, 16.18f, -68.12f, 21.85f)
                arcToRelative(73.68f, 73.68f, 0.0f, false, false, 3.2f, 104.19f)
                lineToRelative(91.37f, 85.98f)
                arcTo(154.16f, 154.16f, 0.0f, false, false, 220.62f, 512.0f)
                horizontalLineToRelative(107.45f)
                arcTo(127.3f, 127.3f, 0.0f, false, false, 452.34f, 413.86f)
                lineToRelative(57.62f, -241.96f)
                arcTo(73.2f, 73.2f, 0.0f, false, false, 501.03f, 116.18f)
                close()
                moveTo(463.27f, 160.78f)
                lineTo(405.65f, 402.75f)
                arcToRelative(79.47f, 79.47f, 0.0f, false, true, -77.57f, 61.26f)
                lineTo(220.62f, 464.01f)
                arcToRelative(106.34f, 106.34f, 0.0f, false, true, -73.14f, -29.0f)
                lineToRelative(-91.37f, -85.98f)
                curveTo(31.34f, 325.73f, 66.61f, 288.13f, 91.4f, 311.54f)
                lineToRelative(51.12f, 48.11f)
                curveToRelative(5.43f, 5.11f, 13.48f, 0.72f, 13.48f, -5.83f)
                arcToRelative(246.8f, 246.8f, 0.0f, false, false, -10.18f, -70.15f)
                lineToRelative(-36.01f, -121.54f)
                curveToRelative(-9.73f, -32.88f, 39.7f, -47.27f, 49.39f, -14.63f)
                lineToRelative(31.34f, 105.78f)
                curveToRelative(5.59f, 18.9f, 33.78f, 10.71f, 28.96f, -8.01f)
                lineTo(177.06f, 80.24f)
                curveToRelative(-8.5f, -33.1f, 41.43f, -45.65f, 49.87f, -12.84f)
                lineToRelative(47.33f, 184.04f)
                curveToRelative(4.43f, 17.24f, 29.16f, 16.5f, 32.71f, -0.8f)
                lineToRelative(31.79f, -154.97f)
                curveToRelative(6.81f, -33.11f, 57.52f, -24.11f, 50.12f, 11.96f)
                lineTo(360.33f, 246.79f)
                curveToRelative(-3.72f, 18.11f, 23.67f, 24.63f, 28.06f, 6.22f)
                lineTo(413.18f, 148.86f)
                curveTo(421.15f, 115.51f, 471.14f, 127.8f, 463.27f, 160.78f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
