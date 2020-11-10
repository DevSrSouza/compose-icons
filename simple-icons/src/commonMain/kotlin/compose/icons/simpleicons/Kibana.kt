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

public val SimpleIcons.Kibana: VectorAsset
    get() {
        if (_kibana != null) {
            return _kibana!!
        }
        _kibana = VectorAssetBuilder(name = "Kibana", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.04f, 23.99f)
                lineTo(4.18f, 23.99f)
                lineToRelative(9.88f, -11.86f)
                curveToRelative(4.23f, 2.76f, 6.98f, 7.04f, 6.98f, 11.86f)
                close()
                moveTo(21.04f, 0.04f)
                lineTo(3.08f, 0.04f)
                verticalLineToRelative(21.55f)
                close()
            }
        }
        .build()
        return _kibana!!
    }

private var _kibana: VectorAsset? = null
