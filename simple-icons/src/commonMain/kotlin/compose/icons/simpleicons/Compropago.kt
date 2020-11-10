package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Compropago: VectorAsset
    get() {
        if (_compropago != null) {
            return _compropago!!
        }
        _compropago = VectorAssetBuilder(name = "Compropago", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.32f, 7.778f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.604f, -0.604f, -1.508f, -0.604f, -2.11f, 0.0f)
                lineToRelative(-0.15f, 0.15f)
                lineToRelative(-0.905f, 0.904f)
                lineToRelative(-6.926f, 6.934f)
                lineToRelative(-1.512f, 1.507f)
                curveToRelative(-0.45f, 0.452f, -1.2f, 0.755f, -1.962f, 0.755f)
                curveToRelative(-0.75f, 0.0f, -1.5f, -0.303f, -2.102f, -0.904f)
                curveToRelative(-0.6f, -0.603f, -0.903f, -1.355f, -0.903f, -2.11f)
                curveToRelative(0.0f, -0.754f, 0.3f, -1.507f, 0.9f, -2.11f)
                lineToRelative(8.89f, -8.893f)
                curveToRelative(-1.206f, -1.205f, -3.015f, -1.205f, -4.222f, 0.0f)
                lineToRelative(-6.63f, 6.783f)
                curveToRelative(-2.263f, 2.262f, -2.263f, 6.03f, 0.0f, 8.44f)
                curveToRelative(2.26f, 2.264f, 6.028f, 2.264f, 8.44f, 0.0f)
                lineTo(19.47f, 9.89f)
                curveToRelative(0.453f, -0.605f, 0.453f, -1.507f, -0.15f, -2.112f)
                close()
                moveTo(22.18f, 4.772f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-2.26f, -2.26f, -6.028f, -2.26f, -8.438f, 0.0f)
                lineToRelative(-9.19f, 9.347f)
                curveToRelative(-0.6f, 0.603f, -0.6f, 1.507f, 0.0f, 2.11f)
                curveToRelative(0.61f, 0.603f, 1.512f, 0.603f, 2.112f, 0.0f)
                lineToRelative(0.15f, -0.15f)
                lineToRelative(0.91f, -0.905f)
                lineToRelative(6.934f, -6.935f)
                lineToRelative(1.344f, -1.355f)
                lineToRelative(0.15f, -0.15f)
                curveToRelative(0.45f, -0.453f, 1.205f, -0.754f, 1.96f, -0.754f)
                reflectiveCurveToRelative(1.507f, 0.302f, 2.108f, 0.905f)
                curveToRelative(0.605f, 0.61f, 0.904f, 1.362f, 0.904f, 2.113f)
                curveToRelative(0.0f, 0.75f, -0.3f, 1.512f, -0.904f, 2.11f)
                lineToRelative(-8.893f, 8.89f)
                curveToRelative(1.207f, 1.212f, 3.014f, 1.212f, 4.22f, 0.0f)
                lineToRelative(6.786f, -6.776f)
                curveToRelative(2.262f, -2.413f, 2.262f, -6.027f, -0.152f, -8.44f)
                close()
            }
        }
        .build()
        return _compropago!!
    }

private var _compropago: VectorAsset? = null
