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

public val SolidGroup.Quran: ImageVector
    get() {
        if (_quran != null) {
            return _quran!!
        }
        _quran = Builder(name = "Quran", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 358.4f)
                lineTo(448.0f, 25.6f)
                curveToRelative(0.0f, -16.0f, -9.6f, -25.6f, -25.6f, -25.6f)
                lineTo(96.0f, 0.0f)
                curveTo(41.6f, 0.0f, 0.0f, 41.6f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 54.4f, 41.6f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0.0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -6.4f, -3.2f, -12.8f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16.0f, -3.2f, -60.8f, 0.0f, -73.6f)
                curveToRelative(6.4f, -3.2f, 9.6f, -9.6f, 9.6f, -19.2f)
                close()
                moveTo(301.08f, 145.82f)
                curveToRelative(0.6f, -1.21f, 1.76f, -1.82f, 2.92f, -1.82f)
                reflectiveCurveToRelative(2.32f, 0.61f, 2.92f, 1.82f)
                lineToRelative(11.18f, 22.65f)
                lineToRelative(25.0f, 3.63f)
                curveToRelative(2.67f, 0.39f, 3.74f, 3.67f, 1.81f, 5.56f)
                lineToRelative(-18.09f, 17.63f)
                lineToRelative(4.27f, 24.89f)
                curveToRelative(0.36f, 2.11f, -1.31f, 3.82f, -3.21f, 3.82f)
                curveToRelative(-0.5f, 0.0f, -1.02f, -0.12f, -1.52f, -0.38f)
                lineTo(304.0f, 211.87f)
                lineToRelative(-22.36f, 11.75f)
                curveToRelative(-0.5f, 0.26f, -1.02f, 0.38f, -1.52f, 0.38f)
                curveToRelative(-1.9f, 0.0f, -3.57f, -1.71f, -3.21f, -3.82f)
                lineToRelative(4.27f, -24.89f)
                lineToRelative(-18.09f, -17.63f)
                curveToRelative(-1.94f, -1.89f, -0.87f, -5.17f, 1.81f, -5.56f)
                lineToRelative(24.99f, -3.63f)
                lineToRelative(11.19f, -22.65f)
                close()
                moveTo(243.19f, 76.81f)
                curveToRelative(13.67f, 0.0f, 27.26f, 2.49f, 40.38f, 7.41f)
                arcToRelative(6.775f, 6.775f, 0.0f, true, true, -2.38f, 13.12f)
                curveToRelative(-0.67f, 0.0f, -3.09f, -0.21f, -4.13f, -0.21f)
                curveToRelative(-52.31f, 0.0f, -94.86f, 42.55f, -94.86f, 94.86f)
                curveToRelative(0.0f, 52.3f, 42.55f, 94.86f, 94.86f, 94.86f)
                curveToRelative(1.03f, 0.0f, 3.48f, -0.21f, 4.13f, -0.21f)
                curveToRelative(3.93f, 0.0f, 6.8f, 3.14f, 6.8f, 6.78f)
                curveToRelative(0.0f, 2.98f, -1.94f, 5.51f, -4.62f, 6.42f)
                curveToRelative(-13.07f, 4.87f, -26.59f, 7.34f, -40.19f, 7.34f)
                curveTo(179.67f, 307.19f, 128.0f, 255.51f, 128.0f, 192.0f)
                curveToRelative(0.0f, -63.52f, 51.67f, -115.19f, 115.19f, -115.19f)
                close()
                moveTo(380.8f, 448.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-19.2f, 0.0f, -32.0f, -12.8f, -32.0f, -32.0f)
                reflectiveCurveToRelative(16.0f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(284.8f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _quran!!
    }

private var _quran: ImageVector? = null
