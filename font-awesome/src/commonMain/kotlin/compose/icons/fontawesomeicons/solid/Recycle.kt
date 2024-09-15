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

public val SolidGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.56f, 261.9f)
                curveToRelative(3.23f, 14.0f, -12.12f, 24.64f, -24.07f, 17.17f)
                lineToRelative(-40.74f, -25.45f)
                lineToRelative(-50.87f, 81.4f)
                curveTo(55.61f, 356.27f, 70.96f, 384.0f, 96.01f, 384.0f)
                lineTo(148.0f, 384.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                lineTo(96.11f, 448.0f)
                curveToRelative(-75.33f, 0.0f, -121.3f, -83.05f, -81.41f, -146.88f)
                lineToRelative(50.82f, -81.39f)
                lineToRelative(-40.72f, -25.45f)
                curveToRelative(-12.08f, -7.55f, -8.97f, -25.96f, 4.88f, -29.16f)
                lineToRelative(110.24f, -25.45f)
                curveToRelative(8.61f, -1.99f, 17.2f, 3.38f, 19.19f, 11.99f)
                lineToRelative(25.45f, 110.24f)
                close()
                moveTo(283.12f, 78.99f)
                lineToRelative(41.29f, 66.08f)
                lineToRelative(-40.74f, 25.46f)
                curveToRelative(-12.05f, 7.53f, -9.0f, 25.95f, 4.88f, 29.16f)
                lineToRelative(110.24f, 25.45f)
                curveToRelative(8.67f, 2.0f, 17.22f, -3.44f, 19.19f, -11.99f)
                lineToRelative(25.45f, -110.24f)
                curveToRelative(3.2f, -13.84f, -11.99f, -24.72f, -24.07f, -17.17f)
                lineToRelative(-40.69f, 25.42f)
                lineToRelative(-41.26f, -66.08f)
                curveToRelative(-37.52f, -60.03f, -125.21f, -60.17f, -162.82f, 0.0f)
                lineToRelative(-17.96f, 28.77f)
                curveToRelative(-3.51f, 5.62f, -1.8f, 13.02f, 3.82f, 16.53f)
                lineToRelative(33.92f, 21.19f)
                curveToRelative(5.62f, 3.51f, 13.02f, 1.8f, 16.54f, -3.82f)
                lineToRelative(17.96f, -28.74f)
                curveToRelative(12.71f, -20.34f, 41.97f, -19.68f, 54.26f, -0.02f)
                close()
                moveTo(497.29f, 301.12f)
                lineToRelative(-27.51f, -44.06f)
                curveToRelative(-3.51f, -5.62f, -10.92f, -7.33f, -16.54f, -3.82f)
                lineToRelative(-33.86f, 21.16f)
                curveToRelative(-5.62f, 3.51f, -7.33f, 10.91f, -3.82f, 16.54f)
                lineToRelative(27.56f, 44.11f)
                curveToRelative(13.26f, 21.21f, -2.06f, 48.96f, -27.14f, 48.96f)
                lineTo(320.0f, 384.0f)
                lineTo(320.0f, 336.02f)
                curveToRelative(0.0f, -14.21f, -17.24f, -21.38f, -27.31f, -11.31f)
                lineToRelative(-80.0f, 79.98f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(80.0f, 79.99f)
                curveTo(302.69f, 517.31f, 320.0f, 510.3f, 320.0f, 495.99f)
                lineTo(320.0f, 448.0f)
                horizontalLineToRelative(95.88f)
                curveToRelative(75.27f, 0.0f, 121.33f, -83.0f, 81.41f, -146.88f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
