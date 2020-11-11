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

public val TablerIcons.RoadSign: VectorAsset
    get() {
        if (_roadSign != null) {
            return _roadSign!!
        }
        _roadSign = VectorAssetBuilder(name = "RoadSign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 20.4f)
                lineToRelative(-6.9f, -6.9f)
                curveToRelative(-0.781f, -0.781f, -0.781f, -2.219f, 0.0f, -3.0f)
                lineToRelative(6.9f, -6.9f)
                curveToRelative(0.781f, -0.781f, 2.219f, -0.781f, 3.0f, 0.0f)
                lineToRelative(6.9f, 6.9f)
                curveToRelative(0.781f, 0.781f, 0.781f, 2.219f, 0.0f, 3.0f)
                lineToRelative(-6.9f, 6.9f)
                curveToRelative(-0.781f, 0.781f, -2.219f, 0.781f, -3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.59f, 0.414f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(-2.0f, 2.0f)
            }
        }
        .build()
        return _roadSign!!
    }

private var _roadSign: VectorAsset? = null
