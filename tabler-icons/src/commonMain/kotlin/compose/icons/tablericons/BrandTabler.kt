package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandTabler: ImageVector
    get() {
        if (_brandTabler != null) {
            return _brandTabler!!
        }
        _brandTabler = Builder(name = "BrandTabler", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                lineTo(16.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                lineTo(16.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 8.0f)
                lineTo(20.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 16.0f)
                lineTo(4.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _brandTabler!!
    }

private var _brandTabler: ImageVector? = null
