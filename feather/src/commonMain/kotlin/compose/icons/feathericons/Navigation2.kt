package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Navigation2: VectorAsset
    get() {
        if (_navigation2 != null) {
            return _navigation2!!
        }
        _navigation2 = VectorAssetBuilder(name = "Navigation2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(7.0f, 19.0f)
                lineToRelative(-7.0f, -4.0f)
                lineToRelative(-7.0f, 4.0f)
                lineToRelative(7.0f, -19.0f)
                close()
            }
        }
        .build()
        return _navigation2!!
    }

private var _navigation2: VectorAsset? = null
