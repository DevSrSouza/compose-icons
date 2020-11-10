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

public val SimpleIcons.Bulma: VectorAsset
    get() {
        if (_bulma != null) {
            return _bulma!!
        }
        _bulma = VectorAssetBuilder(name = "Bulma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 0.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-1.5f, 10.5f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(9.0f, -6.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-7.5f, -7.5f)
                close()
            }
        }
        .build()
        return _bulma!!
    }

private var _bulma: VectorAsset? = null
