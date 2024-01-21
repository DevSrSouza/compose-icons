package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandSvelte: ImageVector
    get() {
        if (_brandSvelte != null) {
            return _brandSvelte!!
        }
        _brandSvelte = Builder(name = "BrandSvelte", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                lineToRelative(-5.0f, 3.0f)
                lineToRelative(0.821f, -0.495f)
                curveToRelative(1.86f, -1.15f, 4.412f, -0.49f, 5.574f, 1.352f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.264f, 5.42f)
                lineToRelative(-5.053f, 3.126f)
                curveToRelative(-1.86f, 1.151f, -4.312f, 0.591f, -5.474f, -1.251f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 1.263f, -5.42f)
                lineToRelative(0.26f, -0.16f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                lineToRelative(5.0f, -3.0f)
                lineToRelative(-0.822f, 0.496f)
                curveToRelative(-1.86f, 1.151f, -4.411f, 0.491f, -5.574f, -1.351f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 1.264f, -5.42f)
                lineToRelative(5.054f, -3.127f)
                curveToRelative(1.86f, -1.15f, 4.311f, -0.59f, 5.474f, 1.252f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.264f, 5.42f)
                lineToRelative(-0.26f, 0.16f)
            }
        }
        .build()
        return _brandSvelte!!
    }

private var _brandSvelte: ImageVector? = null
