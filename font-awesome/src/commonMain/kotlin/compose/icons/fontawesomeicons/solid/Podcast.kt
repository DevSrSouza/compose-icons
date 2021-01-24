package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(267.429f, 488.563f)
                curveTo(262.286f, 507.573f, 242.858f, 512.0f, 224.0f, 512.0f)
                curveToRelative(-18.857f, 0.0f, -38.286f, -4.427f, -43.428f, -23.437f)
                curveTo(172.927f, 460.134f, 160.0f, 388.898f, 160.0f, 355.75f)
                curveToRelative(0.0f, -35.156f, 31.142f, -43.75f, 64.0f, -43.75f)
                reflectiveCurveToRelative(64.0f, 8.594f, 64.0f, 43.75f)
                curveToRelative(0.0f, 32.949f, -12.871f, 104.179f, -20.571f, 132.813f)
                close()
                moveTo(156.867f, 288.554f)
                curveToRelative(-18.693f, -18.308f, -29.958f, -44.173f, -28.784f, -72.599f)
                curveToRelative(2.054f, -49.724f, 42.395f, -89.956f, 92.124f, -91.881f)
                curveTo(274.862f, 121.958f, 320.0f, 165.807f, 320.0f, 220.0f)
                curveToRelative(0.0f, 26.827f, -11.064f, 51.116f, -28.866f, 68.552f)
                curveToRelative(-2.675f, 2.62f, -2.401f, 6.986f, 0.628f, 9.187f)
                curveToRelative(9.312f, 6.765f, 16.46f, 15.343f, 21.234f, 25.363f)
                curveToRelative(1.741f, 3.654f, 6.497f, 4.66f, 9.449f, 1.891f)
                curveToRelative(28.826f, -27.043f, 46.553f, -65.783f, 45.511f, -108.565f)
                curveToRelative(-1.855f, -76.206f, -63.595f, -138.208f, -139.793f, -140.369f)
                curveTo(146.869f, 73.753f, 80.0f, 139.215f, 80.0f, 220.0f)
                curveToRelative(0.0f, 41.361f, 17.532f, 78.7f, 45.55f, 104.989f)
                curveToRelative(2.953f, 2.771f, 7.711f, 1.77f, 9.453f, -1.887f)
                curveToRelative(4.774f, -10.021f, 11.923f, -18.598f, 21.235f, -25.363f)
                curveToRelative(3.029f, -2.2f, 3.304f, -6.566f, 0.629f, -9.185f)
                close()
                moveTo(224.0f, 0.0f)
                curveTo(100.204f, 0.0f, 0.0f, 100.185f, 0.0f, 224.0f)
                curveToRelative(0.0f, 89.992f, 52.602f, 165.647f, 125.739f, 201.408f)
                curveToRelative(4.333f, 2.118f, 9.267f, -1.544f, 8.535f, -6.31f)
                curveToRelative(-2.382f, -15.512f, -4.342f, -30.946f, -5.406f, -44.339f)
                curveToRelative(-0.146f, -1.836f, -1.149f, -3.486f, -2.678f, -4.512f)
                curveToRelative(-47.4f, -31.806f, -78.564f, -86.016f, -78.187f, -147.347f)
                curveToRelative(0.592f, -96.237f, 79.29f, -174.648f, 175.529f, -174.899f)
                curveTo(320.793f, 47.747f, 400.0f, 126.797f, 400.0f, 224.0f)
                curveToRelative(0.0f, 61.932f, -32.158f, 116.49f, -80.65f, 147.867f)
                curveToRelative(-0.999f, 14.037f, -3.069f, 30.588f, -5.624f, 47.23f)
                curveToRelative(-0.732f, 4.767f, 4.203f, 8.429f, 8.535f, 6.31f)
                curveTo(395.227f, 389.727f, 448.0f, 314.187f, 448.0f, 224.0f)
                curveTo(448.0f, 100.205f, 347.815f, 0.0f, 224.0f, 0.0f)
                close()
                moveTo(224.0f, 160.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, 28.654f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.654f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.654f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.654f, -64.0f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
