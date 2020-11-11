package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Link: VectorAsset
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = VectorAssetBuilder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 5.0f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -5.0f, -5.0f)
                lineToRelative(-0.5f, 0.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -5.0f, 0.0f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 5.0f, 5.0f)
                lineToRelative(0.5f, -0.5f)
            }
        }
        .build()
        return _link!!
    }

private var _link: VectorAsset? = null
