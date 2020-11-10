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

public val SimpleIcons.Openlayers: VectorAsset
    get() {
        if (_openlayers != null) {
            return _openlayers!!
        }
        _openlayers = VectorAssetBuilder(name = "Openlayers", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.7f, 13.08f)
                arcToRelative(3.498f, 3.498f, 0.0f, false, true, -1.119f, 1.619f)
                lineToRelative(-7.426f, 6.196f)
                arcToRelative(5.137f, 5.137f, 0.0f, false, true, -6.317f, 0.0f)
                lineTo(1.412f, 14.7f)
                arcToRelative(3.578f, 3.578f, 0.0f, false, true, -1.12f, -1.62f)
                arcToRelative(3.298f, 3.298f, 0.0f, false, false, 1.12f, 3.639f)
                lineToRelative(7.426f, 6.196f)
                arcToRelative(5.137f, 5.137f, 0.0f, false, false, 6.317f, 0.0f)
                lineToRelative(7.426f, -6.196f)
                arcToRelative(3.298f, 3.298f, 0.0f, false, false, 1.12f, -3.639f)
                moveTo(8.838f, 1.086f)
                arcToRelative(5.137f, 5.137f, 0.0f, false, true, 6.317f, 0.0f)
                lineToRelative(7.426f, 6.196f)
                arcToRelative(3.298f, 3.298f, 0.0f, false, true, 0.0f, 5.258f)
                lineToRelative(-7.426f, 6.187f)
                arcToRelative(5.137f, 5.137f, 0.0f, false, true, -6.317f, 0.0f)
                lineTo(1.412f, 12.53f)
                arcToRelative(3.298f, 3.298f, 0.0f, false, true, 0.0f, -5.248f)
                close()
            }
        }
        .build()
        return _openlayers!!
    }

private var _openlayers: VectorAsset? = null
