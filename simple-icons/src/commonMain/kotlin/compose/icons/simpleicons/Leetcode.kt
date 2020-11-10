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

public val SimpleIcons.Leetcode: VectorAsset
    get() {
        if (_leetcode != null) {
            return _leetcode!!
        }
        _leetcode = VectorAssetBuilder(name = "Leetcode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.102f, 17.93f)
                lineToRelative(-2.697f, 2.607f)
                curveToRelative(-0.466f, 0.467f, -1.111f, 0.662f, -1.823f, 0.662f)
                reflectiveCurveToRelative(-1.357f, -0.195f, -1.824f, -0.662f)
                lineToRelative(-4.332f, -4.363f)
                curveToRelative(-0.467f, -0.467f, -0.702f, -1.15f, -0.702f, -1.863f)
                reflectiveCurveToRelative(0.235f, -1.357f, 0.702f, -1.824f)
                lineToRelative(4.319f, -4.38f)
                curveToRelative(0.467f, -0.467f, 1.125f, -0.645f, 1.837f, -0.645f)
                reflectiveCurveToRelative(1.357f, 0.195f, 1.823f, 0.662f)
                lineToRelative(2.697f, 2.606f)
                curveToRelative(0.514f, 0.515f, 1.365f, 0.497f, 1.9f, -0.038f)
                curveToRelative(0.535f, -0.536f, 0.553f, -1.387f, 0.039f, -1.901f)
                lineToRelative(-2.609f, -2.636f)
                arcToRelative(5.055f, 5.055f, 0.0f, false, false, -2.445f, -1.337f)
                lineToRelative(2.467f, -2.503f)
                curveToRelative(0.516f, -0.514f, 0.498f, -1.366f, -0.037f, -1.901f)
                curveToRelative(-0.535f, -0.535f, -1.387f, -0.552f, -1.902f, -0.038f)
                lineToRelative(-10.1f, 10.101f)
                curveToRelative(-0.981f, 0.982f, -1.494f, 2.337f, -1.494f, 3.835f)
                curveToRelative(0.0f, 1.498f, 0.513f, 2.895f, 1.494f, 3.875f)
                lineToRelative(4.347f, 4.361f)
                curveToRelative(0.981f, 0.979f, 2.337f, 1.452f, 3.834f, 1.452f)
                reflectiveCurveToRelative(2.853f, -0.512f, 3.835f, -1.494f)
                lineToRelative(2.609f, -2.637f)
                curveToRelative(0.514f, -0.514f, 0.496f, -1.365f, -0.039f, -1.9f)
                reflectiveCurveToRelative(-1.386f, -0.553f, -1.899f, -0.039f)
                close()
                moveTo(20.811f, 13.01f)
                horizontalLineTo(10.666f)
                curveToRelative(-0.702f, 0.0f, -1.27f, 0.604f, -1.27f, 1.346f)
                reflectiveCurveToRelative(0.568f, 1.346f, 1.27f, 1.346f)
                horizontalLineToRelative(10.145f)
                curveToRelative(0.701f, 0.0f, 1.27f, -0.604f, 1.27f, -1.346f)
                reflectiveCurveToRelative(-0.569f, -1.346f, -1.27f, -1.346f)
                close()
            }
        }
        .build()
        return _leetcode!!
    }

private var _leetcode: VectorAsset? = null
