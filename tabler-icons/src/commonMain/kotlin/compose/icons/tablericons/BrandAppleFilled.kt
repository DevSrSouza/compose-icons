package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandAppleFilled: ImageVector
    get() {
        if (_brandAppleFilled != null) {
            return _brandAppleFilled!!
        }
        _brandAppleFilled = Builder(name = "BrandAppleFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.079f, 5.999f)
                lineToRelative(0.239f, 0.012f)
                curveToRelative(1.43f, 0.097f, 3.434f, 1.013f, 4.508f, 2.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.344f, 1.44f)
                curveToRelative(-0.05f, 0.028f, -0.372f, 0.158f, -0.497f, 0.217f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, -0.722f, 0.431f)
                curveToRelative(-0.614f, 0.461f, -0.948f, 1.009f, -0.942f, 1.694f)
                curveToRelative(0.01f, 0.885f, 0.339f, 1.454f, 0.907f, 1.846f)
                curveToRelative(0.208f, 0.143f, 0.436f, 0.253f, 0.666f, 0.33f)
                curveToRelative(0.126f, 0.043f, 0.426f, 0.116f, 0.444f, 0.122f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.662f, 0.942f)
                curveToRelative(0.0f, 2.621f, -3.04f, 6.381f, -5.286f, 6.381f)
                curveToRelative(-0.79f, 0.0f, -1.272f, -0.091f, -1.983f, -0.315f)
                lineToRelative(-0.098f, -0.031f)
                curveToRelative(-0.463f, -0.146f, -0.702f, -0.192f, -1.133f, -0.192f)
                curveToRelative(-0.52f, 0.0f, -0.863f, 0.06f, -1.518f, 0.237f)
                lineToRelative(-0.197f, 0.053f)
                curveToRelative(-0.575f, 0.153f, -0.964f, 0.226f, -1.5f, 0.248f)
                curveToRelative(-2.749f, 0.0f, -5.285f, -5.093f, -5.285f, -9.072f)
                curveToRelative(0.0f, -3.87f, 1.786f, -6.92f, 5.286f, -6.92f)
                curveToRelative(0.297f, 0.0f, 0.598f, 0.045f, 0.909f, 0.128f)
                curveToRelative(0.403f, 0.107f, 0.774f, 0.26f, 1.296f, 0.508f)
                curveToRelative(0.787f, 0.374f, 0.948f, 0.44f, 1.009f, 0.44f)
                horizontalLineToRelative(0.016f)
                curveToRelative(0.03f, -0.003f, 0.128f, -0.047f, 1.056f, -0.457f)
                curveToRelative(1.061f, -0.467f, 1.864f, -0.685f, 2.746f, -0.616f)
                lineToRelative(-0.24f, -0.012f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _brandAppleFilled!!
    }

private var _brandAppleFilled: ImageVector? = null
