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

public val SimpleIcons.Baidu: VectorAsset
    get() {
        if (_baidu != null) {
            return _baidu!!
        }
        _baidu = VectorAssetBuilder(name = "Baidu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.312f, 12.65f)
                curveToRelative(2.61f, -0.562f, 2.25f, -3.684f, 2.176f, -4.366f)
                curveToRelative(-0.128f, -1.05f, -1.366f, -2.888f, -3.044f, -2.74f)
                curveToRelative(-2.11f, 0.186f, -2.418f, 3.24f, -2.418f, 3.24f)
                curveToRelative(-0.287f, 1.41f, 0.682f, 4.426f, 3.286f, 3.865f)
                moveToRelative(4.845f, -5.24f)
                curveToRelative(1.44f, 0.0f, 2.604f, -1.66f, 2.604f, -3.71f)
                curveToRelative(0.0f, -2.04f, -1.16f, -3.7f, -2.6f, -3.7f)
                reflectiveCurveTo(6.55f, 1.65f, 6.55f, 3.7f)
                curveToRelative(0.0f, 2.05f, 1.17f, 3.71f, 2.61f, 3.71f)
                moveToRelative(6.207f, 0.245f)
                curveToRelative(1.93f, 0.26f, 3.162f, -1.8f, 3.412f, -3.36f)
                curveToRelative(0.25f, -1.55f, -1.0f, -3.36f, -2.36f, -3.67f)
                curveToRelative(-1.37f, -0.316f, -3.06f, 1.874f, -3.23f, 3.3f)
                curveToRelative(-0.18f, 1.75f, 0.25f, 3.49f, 2.17f, 3.737f)
                moveTo(23.0f, 10.284f)
                curveToRelative(0.0f, -0.746f, -0.613f, -2.993f, -2.91f, -2.993f)
                curveToRelative(-2.295f, 0.0f, -2.61f, 2.12f, -2.61f, 3.62f)
                curveToRelative(0.0f, 1.43f, 0.118f, 3.42f, 2.985f, 3.36f)
                curveToRelative(2.855f, -0.07f, 2.543f, -3.24f, 2.543f, -3.99f)
                moveTo(20.1f, 16.82f)
                reflectiveCurveToRelative(-2.985f, -2.31f, -4.726f, -4.8f)
                curveToRelative(-2.36f, -3.677f, -5.715f, -2.18f, -6.834f, -0.316f)
                curveToRelative(-1.12f, 1.883f, -2.86f, 3.062f, -3.105f, 3.377f)
                curveToRelative(-0.25f, 0.31f, -3.6f, 2.12f, -2.854f, 5.42f)
                curveToRelative(0.75f, 3.3f, 3.36f, 3.24f, 3.36f, 3.24f)
                reflectiveCurveToRelative(1.92f, 0.19f, 4.16f, -0.31f)
                reflectiveCurveToRelative(4.16f, 0.12f, 4.16f, 0.12f)
                reflectiveCurveToRelative(5.207f, 1.75f, 6.648f, -1.61f)
                curveToRelative(1.424f, -3.37f, -0.81f, -5.11f, -0.81f, -5.11f)
            }
        }
        .build()
        return _baidu!!
    }

private var _baidu: VectorAsset? = null
