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

public val SolidGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 56.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                lineTo(128.0f, 56.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 32.0f)
                curveTo(10.74f, 32.0f, 0.0f, 42.74f, 0.0f, 56.0f)
                close()
                moveTo(40.0f, 256.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.74f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.74f, -24.0f, -24.0f)
                close()
                moveTo(312.0f, 512.0f)
                curveToRelative(-20.18f, 0.0f, -29.49f, -39.29f, -33.93f, -57.79f)
                curveToRelative(-5.21f, -21.67f, -10.59f, -44.07f, -25.39f, -58.9f)
                curveToRelative(-32.47f, -32.52f, -49.5f, -73.97f, -89.12f, -113.11f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, true, -3.56f, -8.52f)
                lineTo(160.0f, 59.9f)
                curveToRelative(0.0f, -6.54f, 5.24f, -11.88f, 11.78f, -12.0f)
                curveToRelative(15.83f, -0.29f, 36.69f, -9.08f, 52.65f, -16.18f)
                curveTo(256.19f, 17.6f, 295.71f, 0.02f, 343.99f, 0.0f)
                horizontalLineToRelative(2.84f)
                curveToRelative(42.78f, 0.0f, 93.36f, 0.41f, 113.77f, 29.74f)
                curveToRelative(8.39f, 12.06f, 10.45f, 27.03f, 6.15f, 44.63f)
                curveToRelative(16.31f, 17.05f, 25.06f, 48.86f, 16.38f, 74.76f)
                curveToRelative(17.54f, 23.43f, 19.14f, 56.13f, 9.31f, 79.47f)
                lineToRelative(0.11f, 0.11f)
                curveToRelative(11.89f, 11.95f, 19.52f, 31.26f, 19.44f, 49.2f)
                curveToRelative(-0.16f, 30.35f, -26.16f, 58.1f, -59.55f, 58.1f)
                lineTo(350.72f, 336.0f)
                curveTo(358.03f, 364.34f, 384.0f, 388.13f, 384.0f, 430.55f)
                curveTo(384.0f, 504.0f, 336.0f, 512.0f, 312.0f, 512.0f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
