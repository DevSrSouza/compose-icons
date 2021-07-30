package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Slideshare: ImageVector
    get() {
        if (_slideshare != null) {
            return _slideshare!!
        }
        _slideshare = Builder(name = "Slideshare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.222f, 0.21f)
                curveTo(1.762f, 0.21f, 1.06f, 1.337f, 1.06f, 2.497f)
                verticalLineToRelative(7.883f)
                curveToRelative(-0.53f, -0.502f, -1.096f, -0.15f, -1.058f, 0.295f)
                curveToRelative(0.038f, 0.439f, 0.59f, 1.546f, 1.436f, 2.517f)
                curveToRelative(0.843f, 0.968f, 1.924f, 1.776f, 2.94f, 2.268f)
                arcToRelative(11.19f, 11.19f, 0.0f, false, false, -0.491f, 3.598f)
                curveToRelative(0.09f, 1.096f, 0.378f, 1.95f, 0.903f, 2.75f)
                curveToRelative(0.918f, 1.407f, 2.32f, 1.985f, 3.674f, 1.985f)
                curveToRelative(1.209f, 0.0f, 2.494f, -0.563f, 2.698f, -2.373f)
                verticalLineToRelative(-4.694f)
                curveToRelative(1.308f, 0.552f, 3.47f, 0.363f, 4.47f, -0.39f)
                curveToRelative(0.19f, -0.14f, 0.326f, -0.207f, 0.416f, -0.113f)
                curveToRelative(0.095f, 0.09f, 0.106f, 0.166f, -0.113f, 0.439f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -3.103f, 1.965f)
                lineToRelative(0.008f, 2.72f)
                arcToRelative(2.532f, 2.532f, 0.0f, false, false, 2.543f, 2.446f)
                curveToRelative(1.64f, 0.015f, 2.48f, -0.556f, 3.148f, -1.164f)
                curveToRelative(0.632f, -0.567f, 1.399f, -1.754f, 1.558f, -3.243f)
                arcToRelative(10.128f, 10.128f, 0.0f, false, false, -0.454f, -3.926f)
                arcToRelative(10.358f, 10.358f, 0.0f, false, false, 2.948f, -2.268f)
                curveTo(23.213f, 12.5f, 24.0f, 11.185f, 24.0f, 10.675f)
                curveToRelative(0.0f, -0.51f, -0.556f, -0.782f, -1.036f, -0.302f)
                lineTo(22.964f, 2.497f)
                curveToRelative(0.0f, -0.824f, -0.48f, -2.29f, -2.135f, -2.29f)
                close()
                moveTo(3.645f, 1.56f)
                lineTo(20.41f, 1.56f)
                curveToRelative(0.756f, 0.0f, 1.17f, 0.28f, 1.17f, 1.224f)
                verticalLineToRelative(8.904f)
                arcToRelative(8.73f, 8.73f, 0.0f, false, true, -3.555f, 1.534f)
                curveToRelative(-1.606f, 0.352f, -2.94f, 0.087f, -3.666f, 0.148f)
                curveToRelative(-0.718f, 0.06f, -1.428f, 0.529f, -1.296f, 1.79f)
                curveToRelative(-0.491f, -0.154f, -1.236f, -0.683f, -1.682f, -1.117f)
                curveToRelative(-0.438f, -0.428f, -0.87f, -0.711f, -1.534f, -0.692f)
                curveToRelative(-1.013f, 0.03f, -1.663f, 0.102f, -2.57f, 0.01f)
                arcToRelative(9.656f, 9.656f, 0.0f, false, true, -4.838f, -1.786f)
                lineTo(2.439f, 2.78f)
                curveToRelative(0.0f, -0.87f, 0.378f, -1.22f, 1.206f, -1.22f)
                close()
                moveTo(8.142f, 6.548f)
                arcToRelative(2.994f, 2.994f, 0.0f, true, false, 0.0f, 5.987f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 0.0f, -5.983f)
                close()
                moveTo(15.852f, 6.548f)
                arcToRelative(2.994f, 2.994f, 0.0f, true, false, 0.0f, 5.987f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 0.0f, -5.983f)
                close()
            }
        }
        .build()
        return _slideshare!!
    }

private var _slideshare: ImageVector? = null
