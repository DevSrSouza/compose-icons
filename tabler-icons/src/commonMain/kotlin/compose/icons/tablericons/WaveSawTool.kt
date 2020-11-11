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

public val TablerIcons.WaveSawTool: VectorAsset
    get() {
        if (_waveSawTool != null) {
            return _waveSawTool!!
        }
        _waveSawTool = VectorAssetBuilder(name = "WaveSawTool", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(4.0f, 8.0f)
                verticalLineToRelative(-16.0f)
                lineToRelative(4.0f, 8.0f)
                horizontalLineToRelative(5.0f)
            }
        }
        .build()
        return _waveSawTool!!
    }

private var _waveSawTool: VectorAsset? = null
