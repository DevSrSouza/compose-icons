package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.27f, 286.69f)
                curveTo(475.04f, 271.84f, 480.0f, 256.0f, 480.0f, 236.85f)
                curveToRelative(0.0f, -44.015f, -37.218f, -85.58f, -85.82f, -85.58f)
                lineTo(357.7f, 151.27f)
                curveToRelative(4.92f, -12.81f, 8.85f, -28.13f, 8.85f, -46.54f)
                curveTo(366.55f, 31.936f, 328.86f, 0.0f, 271.28f, 0.0f)
                curveToRelative(-61.607f, 0.0f, -58.093f, 94.933f, -71.76f, 108.6f)
                curveToRelative(-22.747f, 22.747f, -49.615f, 66.447f, -68.76f, 83.4f)
                lineTo(32.0f, 192.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(14.893f, 0.0f, 27.408f, -10.174f, 30.978f, -23.95f)
                curveToRelative(44.509f, 1.001f, 75.06f, 39.94f, 177.802f, 39.94f)
                curveToRelative(7.22f, 0.0f, 15.22f, 0.01f, 22.22f, 0.01f)
                curveToRelative(77.117f, 0.0f, 111.986f, -39.423f, 112.94f, -95.33f)
                curveToRelative(13.319f, -18.425f, 20.299f, -43.122f, 17.34f, -66.99f)
                curveToRelative(9.854f, -18.452f, 13.664f, -40.343f, 8.99f, -62.99f)
                close()
                moveTo(404.52f, 340.52f)
                curveToRelative(12.56f, 21.13f, 1.26f, 49.41f, -13.94f, 57.57f)
                curveToRelative(7.7f, 48.78f, -17.608f, 65.9f, -53.12f, 65.9f)
                horizontalLineToRelative(-37.82f)
                curveToRelative(-71.639f, 0.0f, -118.029f, -37.82f, -171.64f, -37.82f)
                lineTo(128.0f, 240.0f)
                horizontalLineToRelative(10.92f)
                curveToRelative(28.36f, 0.0f, 67.98f, -70.89f, 94.54f, -97.46f)
                curveToRelative(28.36f, -28.36f, 18.91f, -75.63f, 37.82f, -94.54f)
                curveToRelative(47.27f, 0.0f, 47.27f, 32.98f, 47.27f, 56.73f)
                curveToRelative(0.0f, 39.17f, -28.36f, 56.72f, -28.36f, 94.54f)
                horizontalLineToRelative(103.99f)
                curveToRelative(21.11f, 0.0f, 37.73f, 18.91f, 37.82f, 37.82f)
                curveToRelative(0.09f, 18.9f, -12.82f, 37.81f, -22.27f, 37.81f)
                curveToRelative(13.489f, 14.555f, 16.371f, 45.236f, -5.21f, 65.62f)
                close()
                moveTo(88.0f, 432.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.745f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.745f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.745f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
