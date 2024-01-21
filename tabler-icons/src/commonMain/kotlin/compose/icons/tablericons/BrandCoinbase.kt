package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandCoinbase: ImageVector
    get() {
        if (_brandCoinbase != null) {
            return _brandCoinbase!!
        }
        _brandCoinbase = Builder(name = "BrandCoinbase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.95f, 22.0f)
                curveToRelative(-4.503f, 0.0f, -8.445f, -3.04f, -9.61f, -7.413f)
                curveToRelative(-1.165f, -4.373f, 0.737f, -8.988f, 4.638f, -11.25f)
                arcToRelative(9.906f, 9.906f, 0.0f, false, true, 12.008f, 1.598f)
                lineToRelative(-3.335f, 3.367f)
                arcToRelative(5.185f, 5.185f, 0.0f, false, false, -7.354f, 0.013f)
                arcToRelative(5.252f, 5.252f, 0.0f, false, false, 0.0f, 7.393f)
                arcToRelative(5.185f, 5.185f, 0.0f, false, false, 7.354f, 0.013f)
                lineToRelative(3.349f, 3.367f)
                arcToRelative(9.887f, 9.887f, 0.0f, false, true, -7.05f, 2.912f)
                close()
            }
        }
        .build()
        return _brandCoinbase!!
    }

private var _brandCoinbase: ImageVector? = null
