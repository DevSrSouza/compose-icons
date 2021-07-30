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

public val SimpleIcons.Podcastaddict: ImageVector
    get() {
        if (_podcastaddict != null) {
            return _podcastaddict!!
        }
        _podcastaddict = Builder(name = "Podcastaddict", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.36f, 0.037f)
                curveTo(2.41f, 0.037f, 0.0f, 2.447f, 0.0f, 5.397f)
                verticalLineToRelative(13.207f)
                curveToRelative(0.0f, 2.95f, 2.41f, 5.36f, 5.36f, 5.36f)
                horizontalLineToRelative(13.28f)
                curveToRelative(2.945f, 0.0f, 5.36f, -2.41f, 5.36f, -5.36f)
                lineTo(24.0f, 5.396f)
                curveToRelative(0.0f, -2.95f, -2.415f, -5.36f, -5.36f, -5.36f)
                close()
                moveTo(11.945f, 4.322f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, true, 7.717f, 7.544f)
                lineToRelative(0.005f, 7.896f)
                horizontalLineToRelative(-3.39f)
                verticalLineToRelative(-1.326f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, true, -4.327f, 1.326f)
                arcToRelative(7.777f, 7.777f, 0.0f, false, true, -2.384f, -0.378f)
                verticalLineToRelative(-4.63f)
                arcToRelative(3.647f, 3.647f, 0.0f, false, false, 2.416f, 0.91f)
                arcToRelative(3.666f, 3.666f, 0.0f, false, false, 3.599f, -2.97f)
                horizontalLineToRelative(-1.284f)
                arcToRelative(2.416f, 2.416f, 0.0f, false, true, -4.73f, -0.66f)
                verticalLineToRelative(-0.031f)
                curveToRelative(0.0f, -1.095f, 0.728f, -2.023f, 1.728f, -2.316f)
                lineTo(11.295f, 8.403f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.975f, 3.6f)
                verticalLineToRelative(6.852f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, true, 3.625f, -14.533f)
                close()
                moveTo(11.976f, 6.192f)
                lineTo(11.976f, 7.43f)
                horizontalLineToRelative(0.006f)
                arcToRelative(4.575f, 4.575f, 0.0f, false, true, 4.573f, 4.574f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(1.237f)
                verticalLineToRelative(-0.01f)
                arcToRelative(5.81f, 5.81f, 0.0f, false, false, -5.81f, -5.81f)
                close()
                moveTo(11.976f, 8.341f)
                verticalLineToRelative(1.246f)
                horizontalLineToRelative(0.006f)
                arcToRelative(2.413f, 2.413f, 0.0f, false, true, 2.415f, 2.416f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(1.247f)
                verticalLineToRelative(-0.01f)
                arcToRelative(3.662f, 3.662f, 0.0f, false, false, -3.662f, -3.662f)
                close()
                moveTo(11.976f, 10.593f)
                curveToRelative(-0.78f, 0.0f, -1.409f, 0.629f, -1.409f, 1.41f)
                curveToRelative(0.0f, 0.78f, 0.629f, 1.409f, 1.41f, 1.409f)
                curveToRelative(0.78f, 0.0f, 1.409f, -0.629f, 1.409f, -1.41f)
                curveToRelative(0.0f, -0.78f, -0.629f, -1.409f, -1.41f, -1.409f)
                close()
            }
        }
        .build()
        return _podcastaddict!!
    }

private var _podcastaddict: ImageVector? = null
