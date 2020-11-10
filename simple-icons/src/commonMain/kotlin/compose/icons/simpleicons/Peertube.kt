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

public val SimpleIcons.Peertube: VectorAsset
    get() {
        if (_peertube != null) {
            return _peertube!!
        }
        _peertube = VectorAssetBuilder(name = "Peertube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(9.0f, -6.0f)
                lineTo(3.0f, 0.0f)
                close()
                moveTo(3.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(9.0f, -6.0f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(12.0f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(9.0f, -6.0f)
                lineTo(12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _peertube!!
    }

private var _peertube: VectorAsset? = null
