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

public val RegularGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.27f, 225.31f)
                curveToRelative(4.67f, -22.65f, 0.86f, -44.54f, -8.99f, -62.99f)
                curveToRelative(2.96f, -23.87f, -4.02f, -48.56f, -17.34f, -66.99f)
                curveTo(438.99f, 39.42f, 404.12f, 0.0f, 327.0f, 0.0f)
                curveToRelative(-7.0f, 0.0f, -15.0f, 0.01f, -22.22f, 0.01f)
                curveTo(201.2f, 0.01f, 169.0f, 40.0f, 128.0f, 40.0f)
                horizontalLineToRelative(-10.85f)
                curveToRelative(-5.64f, -4.97f, -13.04f, -8.0f, -21.16f, -8.0f)
                lineTo(32.0f, 32.0f)
                curveTo(14.33f, 32.0f, 0.0f, 46.33f, 0.0f, 64.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(11.84f, 0.0f, 22.17f, -6.44f, 27.71f, -16.0f)
                horizontalLineToRelative(7.05f)
                curveToRelative(19.15f, 16.95f, 46.01f, 60.65f, 68.76f, 83.4f)
                curveToRelative(13.67f, 13.67f, 10.15f, 108.6f, 71.76f, 108.6f)
                curveToRelative(57.58f, 0.0f, 95.27f, -31.94f, 95.27f, -104.73f)
                curveToRelative(0.0f, -18.41f, -3.93f, -33.73f, -8.85f, -46.54f)
                horizontalLineToRelative(36.48f)
                curveToRelative(48.6f, 0.0f, 85.82f, -41.56f, 85.82f, -85.58f)
                curveToRelative(0.0f, -19.15f, -4.96f, -34.99f, -13.73f, -49.84f)
                close()
                moveTo(64.0f, 296.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.74f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.74f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(394.18f, 312.73f)
                lineTo(290.19f, 312.73f)
                curveToRelative(0.0f, 37.82f, 28.36f, 55.37f, 28.36f, 94.54f)
                curveToRelative(0.0f, 23.75f, 0.0f, 56.73f, -47.27f, 56.73f)
                curveToRelative(-18.91f, -18.91f, -9.46f, -66.18f, -37.82f, -94.54f)
                curveTo(206.9f, 342.89f, 167.28f, 272.0f, 138.92f, 272.0f)
                lineTo(128.0f, 272.0f)
                lineTo(128.0f, 85.83f)
                curveToRelative(53.61f, 0.0f, 100.0f, -37.82f, 171.64f, -37.82f)
                horizontalLineToRelative(37.82f)
                curveToRelative(35.51f, 0.0f, 60.82f, 17.12f, 53.12f, 65.9f)
                curveToRelative(15.2f, 8.16f, 26.5f, 36.44f, 13.94f, 57.57f)
                curveToRelative(21.58f, 20.38f, 18.7f, 51.06f, 5.21f, 65.62f)
                curveToRelative(9.45f, 0.0f, 22.36f, 18.91f, 22.27f, 37.81f)
                curveToRelative(-0.09f, 18.91f, -16.71f, 37.82f, -37.82f, 37.82f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
