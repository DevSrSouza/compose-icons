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

public val SimpleIcons.Swift: VectorAsset
    get() {
        if (_swift != null) {
            return _swift!!
        }
        _swift = VectorAssetBuilder(name = "Swift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.984f, 16.348f)
                curveToRelative(0.056f, -0.112f, 0.056f, -0.224f, 0.112f, -0.336f)
                curveToRelative(1.346f, -5.272f, -1.851f, -11.44f, -7.347f, -14.693f)
                curveToRelative(2.412f, 3.253f, 3.365f, 7.122f, 2.524f, 10.599f)
                curveToRelative(-0.056f, 0.28f, -0.168f, 0.617f, -0.28f, 0.897f)
                arcToRelative(5.173f, 5.173f, 0.0f, false, true, -0.45f, -0.28f)
                reflectiveCurveTo(11.104f, 9.17f, 5.273f, 3.282f)
                curveToRelative(-0.169f, -0.168f, 3.14f, 4.71f, 6.841f, 8.58f)
                curveToRelative(-1.738f, -1.01f, -6.673f, -4.542f, -9.758f, -7.403f)
                curveToRelative(0.337f, 0.617f, 0.842f, 1.234f, 1.346f, 1.851f)
                curveToRelative(2.58f, 3.309f, 5.945f, 7.346f, 9.983f, 10.43f)
                curveToRelative(-2.86f, 1.74f, -6.842f, 1.851f, -10.88f, 0.0f)
                curveToRelative(-1.01f, -0.448f, -1.85f, -1.009f, -2.804f, -1.682f)
                curveToRelative(1.682f, 2.636f, 4.318f, 5.048f, 7.459f, 6.337f)
                curveToRelative(3.757f, 1.627f, 7.57f, 1.515f, 10.318f, 0.0f)
                horizontalLineToRelative(0.057f)
                curveToRelative(0.112f, -0.056f, 0.224f, -0.112f, 0.336f, -0.224f)
                curveToRelative(1.346f, -0.673f, 3.982f, -1.402f, 5.44f, 1.402f)
                curveToRelative(0.392f, 0.785f, 1.121f, -2.86f, -1.626f, -6.225f)
                close()
            }
        }
        .build()
        return _swift!!
    }

private var _swift: VectorAsset? = null
