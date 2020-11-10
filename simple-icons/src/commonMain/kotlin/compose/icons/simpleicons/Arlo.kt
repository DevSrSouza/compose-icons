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

public val SimpleIcons.Arlo: VectorAsset
    get() {
        if (_arlo != null) {
            return _arlo!!
        }
        _arlo = VectorAssetBuilder(name = "Arlo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.493f, 16.075f)
                curveToRelative(1.38f, 1.042f, 2.642f, 2.295f, 2.495f, 2.218f)
                curveToRelative(-3.829f, -2.005f, -6.533f, -1.494f, -7.6f, -0.805f)
                curveToRelative(-4.155f, 2.683f, -7.952f, -1.534f, -9.87f, -4.341f)
                curveToRelative(-0.63f, -0.918f, -6.518f, -0.87f, -6.518f, -0.87f)
                curveToRelative(0.47f, -0.347f, 5.526f, -0.414f, 6.593f, -1.613f)
                curveToRelative(2.145f, -2.409f, 4.027f, -2.14f, 5.558f, -1.4f)
                curveToRelative(0.21f, 0.1f, 0.567f, 0.325f, 1.02f, 0.633f)
                verticalLineToRelative(1.712f)
                curveToRelative(-0.983f, -0.623f, -1.726f, -1.08f, -1.885f, -1.147f)
                curveToRelative(-0.556f, -0.235f, -1.573f, -0.886f, -3.084f, 0.067f)
                curveToRelative(-1.652f, 1.043f, -0.024f, 2.892f, 1.28f, 4.403f)
                curveToRelative(1.64f, 1.905f, 4.531f, 3.538f, 7.318f, 0.571f)
                curveToRelative(0.559f, -0.593f, 2.888f, 0.303f, 2.888f, 0.303f)
                reflectiveCurveToRelative(-1.941f, -1.264f, -3.962f, -2.565f)
                horizontalLineToRelative(2.035f)
                curveToRelative(1.65f, 1.243f, 3.156f, 2.398f, 3.732f, 2.834f)
                moveTo(10.302f, 11.84f)
                arcToRelative(0.797f, 0.797f, 0.0f, false, true, -0.788f, 0.806f)
                arcToRelative(0.797f, 0.797f, 0.0f, false, true, -0.787f, -0.806f)
                curveToRelative(0.0f, -0.445f, 0.352f, -0.807f, 0.787f, -0.807f)
                curveToRelative(0.436f, 0.0f, 0.788f, 0.362f, 0.788f, 0.807f)
                moveToRelative(6.847f, -2.636f)
                arcToRelative(4.217f, 4.217f, 0.0f, false, true, 1.192f, 2.965f)
                horizontalLineToRelative(-1.08f)
                arcToRelative(3.099f, 3.099f, 0.0f, false, false, -0.876f, -2.182f)
                arcToRelative(2.953f, 2.953f, 0.0f, false, false, -2.098f, -0.9f)
                verticalLineTo(7.984f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, 2.862f, 1.22f)
                moveToRelative(1.688f, -1.567f)
                arcToRelative(6.807f, 6.807f, 0.0f, false, true, 1.932f, 4.53f)
                horizontalLineToRelative(-1.202f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, false, -1.57f, -3.67f)
                arcToRelative(5.286f, 5.286f, 0.0f, false, false, -3.71f, -1.613f)
                verticalLineToRelative(-1.23f)
                arcToRelative(6.486f, 6.486f, 0.0f, false, true, 4.55f, 1.982f)
                moveToRelative(-3.22f, 3.136f)
                curveToRelative(0.375f, 0.382f, 0.56f, 0.885f, 0.558f, 1.388f)
                horizontalLineToRelative(-1.888f)
                verticalLineToRelative(-1.956f)
                curveToRelative(0.501f, 0.005f, 0.98f, 0.21f, 1.33f, 0.57f)
                close()
            }
        }
        .build()
        return _arlo!!
    }

private var _arlo: VectorAsset? = null
