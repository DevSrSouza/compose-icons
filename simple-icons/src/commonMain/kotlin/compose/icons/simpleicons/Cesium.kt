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

public val SimpleIcons.Cesium: ImageVector
    get() {
        if (_cesium != null) {
            return _cesium!!
        }
        _cesium = Builder(name = "Cesium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0283f, 10.216f)
                curveToRelative(-0.3959f, 0.0f, -0.7785f, 0.22f, -1.0792f, 0.6168f)
                lineToRelative(-3.7755f, 4.994f)
                curveToRelative(-0.625f, 0.8275f, -1.5128f, 1.3012f, -2.4355f, 1.3012f)
                horizontalLineToRelative(-0.0143f)
                curveToRelative(-0.9236f, 0.0f, -1.8115f, -0.4737f, -2.4355f, -1.3012f)
                lineToRelative(-3.7754f, -4.994f)
                curveToRelative(-0.2998f, -0.3969f, -0.6823f, -0.6168f, -1.0802f, -0.6168f)
                curveToRelative(-0.3949f, 0.0f, -0.7795f, 0.22f, -1.0781f, 0.6168f)
                lineToRelative(-3.7765f, 4.994f)
                curveToRelative(-0.621f, 0.8204f, -1.4996f, 1.294f, -2.414f, 1.3012f)
                curveTo(3.088f, 21.186f, 7.2113f, 24.0f, 12.0004f, 24.0f)
                curveTo(18.6268f, 24.0f, 24.0f, 18.6276f, 24.0f, 12.001f)
                curveToRelative(0.0f, -0.4705f, -0.0338f, -0.9308f, -0.086f, -1.382f)
                curveToRelative(-0.2638f, -0.2598f, -0.5697f, -0.403f, -0.8857f, -0.403f)
                moveToRelative(-7.019f, -2.5972f)
                curveToRelative(-0.6936f, 0.0f, -1.2542f, -0.5616f, -1.2542f, -1.2541f)
                reflectiveCurveToRelative(0.5606f, -1.2541f, 1.2541f, -1.2541f)
                curveToRelative(0.6925f, 0.0f, 1.254f, 0.5616f, 1.254f, 1.254f)
                reflectiveCurveToRelative(-0.5615f, 1.2542f, -1.254f, 1.2542f)
                moveTo(12.0005f, 0.0f)
                curveTo(5.3732f, 0.0f, 0.0f, 5.3714f, 0.0f, 12.001f)
                curveToRelative(0.0f, 1.0536f, 0.1504f, 2.0704f, 0.406f, 3.0463f)
                curveToRelative(0.2272f, 0.175f, 0.4788f, 0.2762f, 0.7366f, 0.2762f)
                curveToRelative(0.3979f, 0.0f, 0.7804f, -0.2189f, 1.0812f, -0.6138f)
                lineToRelative(3.7754f, -4.996f)
                curveToRelative(0.623f, -0.8285f, 1.5129f, -1.3021f, 2.4335f, -1.3021f)
                curveToRelative(0.9226f, 0.0f, 1.8095f, 0.4736f, 2.4355f, 1.3021f)
                lineToRelative(3.6323f, 4.8037f)
                lineToRelative(0.1565f, 0.1923f)
                curveToRelative(0.2997f, 0.3939f, 0.6812f, 0.6107f, 1.074f, 0.6138f)
                curveToRelative(0.3918f, -0.003f, 0.7743f, -0.22f, 1.072f, -0.6138f)
                lineToRelative(0.1595f, -0.1923f)
                lineToRelative(3.6323f, -4.8037f)
                curveToRelative(0.624f, -0.8285f, 1.5118f, -1.3021f, 2.4335f, -1.3021f)
                curveToRelative(0.1462f, 0.0f, 0.2935f, 0.0163f, 0.4367f, 0.0388f)
                curveTo(21.9522f, 3.5557f, 17.3922f, 0.0f, 12.0005f, 0.0f)
            }
        }
        .build()
        return _cesium!!
    }

private var _cesium: ImageVector? = null
