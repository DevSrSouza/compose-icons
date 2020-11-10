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

public val SimpleIcons.Envato: VectorAsset
    get() {
        if (_envato != null) {
            return _envato!!
        }
        _envato = VectorAssetBuilder(name = "Envato", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4f, 0.197f)
                curveToRelative(-0.74f, -0.371f, -2.721f, -0.247f, -5.195f, 0.62f)
                curveToRelative(-4.207f, 2.968f, -7.674f, 7.175f, -8.044f, 14.109f)
                curveToRelative(0.0f, 0.241f, -0.493f, 0.0f, -0.617f, -0.126f)
                curveToRelative(-1.114f, -2.104f, -1.61f, -4.455f, -0.62f, -7.921f)
                curveToRelative(0.247f, -0.247f, -0.37f, -0.617f, -0.37f, -0.494f)
                curveToRelative(-0.249f, 0.123f, -1.114f, 1.113f, -1.734f, 2.103f)
                curveToRelative(-2.847f, 4.947f, -0.99f, 11.511f, 3.961f, 14.231f)
                curveToRelative(4.947f, 2.721f, 11.382f, 0.988f, 14.231f, -4.086f)
                curveToRelative(3.342f, -5.814f, 0.369f, -17.322f, -1.612f, -18.436f)
            }
        }
        .build()
        return _envato!!
    }

private var _envato: VectorAsset? = null
