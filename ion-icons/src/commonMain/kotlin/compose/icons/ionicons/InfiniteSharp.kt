package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.InfiniteSharp: ImageVector
    get() {
        if (_infiniteSharp != null) {
            return _infiniteSharp!!
        }
        _infiniteSharp = Builder(name = "InfiniteSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(382.0f, 136.0f)
                curveToRelative(-40.87f, 0.0f, -73.46f, 20.53f, -93.6f, 37.76f)
                lineToRelative(-0.71f, 0.61f)
                lineToRelative(-11.47f, 12.47f)
                lineToRelative(25.32f, 41.61f)
                lineToRelative(18.74f, -18.79f)
                curveTo(339.89f, 193.1f, 361.78f, 184.0f, 382.0f, 184.0f)
                curveToRelative(40.8f, 0.0f, 74.0f, 32.3f, 74.0f, 72.0f)
                reflectiveCurveToRelative(-33.2f, 72.0f, -74.0f, 72.0f)
                curveToRelative(-62.0f, 0.0f, -104.14f, -81.95f, -104.56f, -82.78f)
                horizontalLineToRelative(0.0f)
                curveTo(275.0f, 240.29f, 221.56f, 136.0f, 130.0f, 136.0f)
                curveTo(62.73f, 136.0f, 8.0f, 189.83f, 8.0f, 256.0f)
                reflectiveCurveTo(62.73f, 376.0f, 130.0f, 376.0f)
                curveToRelative(32.95f, 0.0f, 65.38f, -13.11f, 93.79f, -37.92f)
                lineToRelative(0.61f, -0.54f)
                lineToRelative(11.38f, -12.38f)
                lineToRelative(-25.33f, -41.61f)
                lineToRelative(-18.83f, 18.88f)
                curveTo(172.0f, 319.4f, 151.26f, 328.0f, 130.0f, 328.0f)
                curveToRelative(-40.8f, 0.0f, -74.0f, -32.3f, -74.0f, -72.0f)
                reflectiveCurveToRelative(33.2f, -72.0f, 74.0f, -72.0f)
                curveToRelative(62.0f, 0.0f, 104.14f, 81.95f, 104.56f, 82.78f)
                horizontalLineToRelative(0.0f)
                curveTo(237.0f, 271.71f, 290.44f, 376.0f, 382.0f, 376.0f)
                curveToRelative(67.27f, 0.0f, 122.0f, -53.83f, 122.0f, -120.0f)
                reflectiveCurveTo(449.27f, 136.0f, 382.0f, 136.0f)
                close()
            }
        }
        .build()
        return _infiniteSharp!!
    }

private var _infiniteSharp: ImageVector? = null
