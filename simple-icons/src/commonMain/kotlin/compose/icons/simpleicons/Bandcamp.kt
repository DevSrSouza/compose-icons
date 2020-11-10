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

public val SimpleIcons.Bandcamp: VectorAsset
    get() {
        if (_bandcamp != null) {
            return _bandcamp!!
        }
        _bandcamp = VectorAssetBuilder(name = "Bandcamp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.75f)
                lineToRelative(7.437f, -13.5f)
                horizontalLineTo(24.0f)
                lineToRelative(-7.438f, 13.5f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _bandcamp!!
    }

private var _bandcamp: VectorAsset? = null
