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

public val TablerIcons.BrandCupra: ImageVector
    get() {
        if (_brandCupra != null) {
            return _brandCupra!!
        }
        _brandCupra = Builder(name = "BrandCupra", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 10.0f)
                lineToRelative(-2.5f, -4.0f)
                lineToRelative(15.298f, 6.909f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.09f, 0.283f)
                lineToRelative(-3.388f, 5.808f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                lineToRelative(-3.388f, -5.808f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.09f, -0.283f)
                lineToRelative(15.298f, -6.909f)
                lineToRelative(-2.5f, 4.0f)
            }
        }
        .build()
        return _brandCupra!!
    }

private var _brandCupra: ImageVector? = null
