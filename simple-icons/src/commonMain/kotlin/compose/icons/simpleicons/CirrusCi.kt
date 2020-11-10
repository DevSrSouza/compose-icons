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

public val SimpleIcons.CirrusCi: VectorAsset
    get() {
        if (_cirrusCi != null) {
            return _cirrusCi!!
        }
        _cirrusCi = VectorAssetBuilder(name = "CirrusCi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.406f, 15.477f)
                arcTo(4.587f, 4.587f, 0.0f, false, true, 24.0f, 18.955f)
                curveToRelative(0.0f, 2.531f, -2.053f, 4.59f, -4.577f, 4.59f)
                horizontalLineTo(1.113f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, true, 0.0f, -2.226f)
                horizontalLineToRelative(18.31f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 2.35f, -2.364f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, -2.35f, -2.364f)
                horizontalLineTo(1.113f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, true, 0.0f, -2.227f)
                horizontalLineToRelative(18.31f)
                arcTo(2.36f, 2.36f, 0.0f, false, false, 21.773f, 12.0f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, -2.35f, -2.364f)
                horizontalLineTo(1.113f)
                arcToRelative(1.113f, 1.113f, 0.0f, true, true, 0.0f, -2.227f)
                horizontalLineToRelative(18.31f)
                curveToRelative(1.296f, 0.0f, 2.35f, -1.06f, 2.35f, -2.364f)
                reflectiveCurveToRelative(-1.054f, -2.364f, -2.35f, -2.364f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, true, 0.0f, -2.227f)
                curveTo(21.947f, 0.454f, 24.0f, 2.514f, 24.0f, 5.045f)
                curveToRelative(0.0f, 1.389f, -0.62f, 2.635f, -1.594f, 3.477f)
                arcTo(4.587f, 4.587f, 0.0f, false, true, 24.0f, 12.0f)
                curveToRelative(0.0f, 1.389f, -0.62f, 2.635f, -1.594f, 3.477f)
                close()
            }
        }
        .build()
        return _cirrusCi!!
    }

private var _cirrusCi: VectorAsset? = null
