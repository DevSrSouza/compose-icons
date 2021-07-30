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

public val SolidGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.02f, 309.34f)
                curveToRelative(-40.12f, 2.58f, -76.53f, 17.86f, -97.19f, 72.3f)
                curveToRelative(-2.35f, 6.21f, -8.0f, 9.98f, -14.59f, 9.98f)
                curveToRelative(-11.11f, 0.0f, -45.46f, -27.67f, -55.25f, -34.35f)
                curveTo(0.0f, 439.62f, 37.93f, 512.0f, 128.0f, 512.0f)
                curveToRelative(75.86f, 0.0f, 128.0f, -43.77f, 128.0f, -120.19f)
                curveToRelative(0.0f, -3.11f, -0.65f, -6.08f, -0.97f, -9.13f)
                lineToRelative(-88.01f, -73.34f)
                close()
                moveTo(457.89f, 0.0f)
                curveToRelative(-15.16f, 0.0f, -29.37f, 6.71f, -40.21f, 16.45f)
                curveTo(213.27f, 199.05f, 192.0f, 203.34f, 192.0f, 257.09f)
                curveToRelative(0.0f, 13.7f, 3.25f, 26.76f, 8.73f, 38.7f)
                lineToRelative(63.82f, 53.18f)
                curveToRelative(7.21f, 1.8f, 14.64f, 3.03f, 22.39f, 3.03f)
                curveToRelative(62.11f, 0.0f, 98.11f, -45.47f, 211.16f, -256.46f)
                curveToRelative(7.38f, -14.35f, 13.9f, -29.85f, 13.9f, -45.99f)
                curveTo(512.0f, 20.64f, 486.0f, 0.0f, 457.89f, 0.0f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
