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

public val SimpleIcons.Pingup: VectorAsset
    get() {
        if (_pingup != null) {
            return _pingup!!
        }
        _pingup = VectorAssetBuilder(name = "Pingup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.667f, 0.0f)
                horizontalLineTo(1.721f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(7.536f)
                verticalLineTo(9.717f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-0.504f, 0.0f, -0.65f, -0.314f, -0.32f, -0.698f)
                lineToRelative(4.324f, -5.044f)
                curveToRelative(0.327f, -0.384f, 0.867f, -0.384f, 1.195f, 0.0f)
                lineToRelative(4.324f, 5.044f)
                curveToRelative(0.314f, 0.384f, 0.18f, 0.698f, -0.33f, 0.698f)
                horizontalLineToRelative(-2.759f)
                verticalLineToRelative(6.676f)
                horizontalLineToRelative(0.73f)
                curveToRelative(6.225f, 0.0f, 8.617f, -4.309f, 8.617f, -8.481f)
                curveTo(22.291f, 3.906f, 19.666f, 0.0f, 13.667f, 0.0f)
            }
        }
        .build()
        return _pingup!!
    }

private var _pingup: VectorAsset? = null
