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

public val TablerIcons.ArrowWaveLeftUp: VectorAsset
    get() {
        if (_arrowWaveLeftUp != null) {
            return _arrowWaveLeftUp!!
        }
        _arrowWaveLeftUp = VectorAssetBuilder(name = "ArrowWaveLeftUp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.996f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 11.996f)
                curveToRelative(-0.887f, -1.285f, -2.48f, -2.033f, -4.0f, -2.0f)
                curveToRelative(-1.52f, -0.033f, -3.113f, 0.715f, -4.0f, 2.0f)
                curveToRelative(-0.887f, 1.284f, -2.48f, 2.033f, -4.0f, 2.0f)
                curveToRelative(-1.52f, 0.033f, -3.0f, -1.0f, -4.0f, -2.0f)
                lineToRelative(-2.0f, -2.0f)
            }
        }
        .build()
        return _arrowWaveLeftUp!!
    }

private var _arrowWaveLeftUp: VectorAsset? = null
