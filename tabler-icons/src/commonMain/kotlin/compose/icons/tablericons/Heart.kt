package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Heart: VectorAsset
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = VectorAssetBuilder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 13.572f)
                lineToRelative(-7.5f, 7.428f)
                lineToRelative(-7.5f, -7.428f)
                moveToRelative(0.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.5f, -6.566f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.5f, 6.572f)
            }
        }
        .build()
        return _heart!!
    }

private var _heart: VectorAsset? = null
