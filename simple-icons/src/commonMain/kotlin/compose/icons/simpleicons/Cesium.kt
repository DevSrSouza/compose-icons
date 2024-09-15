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
                moveTo(23.028f, 10.216f)
                curveToRelative(-0.396f, 0.0f, -0.779f, 0.22f, -1.079f, 0.617f)
                lineToRelative(-3.776f, 4.994f)
                curveToRelative(-0.625f, 0.827f, -1.513f, 1.301f, -2.435f, 1.301f)
                horizontalLineToRelative(-0.014f)
                curveToRelative(-0.924f, 0.0f, -1.811f, -0.474f, -2.435f, -1.301f)
                lineToRelative(-3.775f, -4.994f)
                curveToRelative(-0.3f, -0.397f, -0.682f, -0.617f, -1.08f, -0.617f)
                curveToRelative(-0.395f, 0.0f, -0.78f, 0.22f, -1.078f, 0.617f)
                lineToRelative(-3.776f, 4.994f)
                curveToRelative(-0.621f, 0.82f, -1.5f, 1.294f, -2.414f, 1.301f)
                curveTo(3.088f, 21.186f, 7.211f, 24.0f, 12.0f, 24.0f)
                curveTo(18.627f, 24.0f, 24.0f, 18.628f, 24.0f, 12.001f)
                curveToRelative(0.0f, -0.47f, -0.034f, -0.931f, -0.086f, -1.382f)
                curveToRelative(-0.264f, -0.26f, -0.57f, -0.403f, -0.886f, -0.403f)
                moveToRelative(-7.019f, -2.597f)
                curveToRelative(-0.694f, 0.0f, -1.254f, -0.562f, -1.254f, -1.254f)
                reflectiveCurveToRelative(0.561f, -1.254f, 1.254f, -1.254f)
                curveToRelative(0.692f, 0.0f, 1.254f, 0.562f, 1.254f, 1.254f)
                reflectiveCurveToRelative(-0.562f, 1.254f, -1.254f, 1.254f)
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.371f, 0.0f, 12.001f)
                curveToRelative(0.0f, 1.054f, 0.15f, 2.07f, 0.406f, 3.046f)
                curveToRelative(0.227f, 0.175f, 0.479f, 0.276f, 0.737f, 0.276f)
                curveToRelative(0.398f, 0.0f, 0.78f, -0.219f, 1.081f, -0.614f)
                lineToRelative(3.775f, -4.996f)
                curveToRelative(0.623f, -0.828f, 1.513f, -1.302f, 2.434f, -1.302f)
                curveToRelative(0.923f, 0.0f, 1.809f, 0.474f, 2.435f, 1.302f)
                lineToRelative(3.632f, 4.804f)
                lineToRelative(0.156f, 0.192f)
                curveToRelative(0.3f, 0.394f, 0.681f, 0.611f, 1.074f, 0.614f)
                curveToRelative(0.392f, -0.003f, 0.774f, -0.22f, 1.072f, -0.614f)
                lineToRelative(0.16f, -0.192f)
                lineToRelative(3.632f, -4.804f)
                curveToRelative(0.624f, -0.828f, 1.512f, -1.302f, 2.434f, -1.302f)
                curveToRelative(0.146f, 0.0f, 0.294f, 0.016f, 0.437f, 0.039f)
                curveTo(21.952f, 3.556f, 17.392f, 0.0f, 12.0f, 0.0f)
            }
        }
        .build()
        return _cesium!!
    }

private var _cesium: ImageVector? = null
