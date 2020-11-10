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

public val SimpleIcons.Patreon: VectorAsset
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = VectorAssetBuilder(name = "Patreon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.386f, 0.524f)
                curveToRelative(-4.764f, 0.0f, -8.64f, 3.876f, -8.64f, 8.64f)
                curveToRelative(0.0f, 4.75f, 3.876f, 8.613f, 8.64f, 8.613f)
                curveToRelative(4.75f, 0.0f, 8.614f, -3.864f, 8.614f, -8.613f)
                curveTo(24.0f, 4.4f, 20.136f, 0.524f, 15.386f, 0.524f)
                moveTo(0.003f, 23.537f)
                horizontalLineToRelative(4.22f)
                verticalLineTo(0.524f)
                horizontalLineTo(0.003f)
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: VectorAsset? = null
