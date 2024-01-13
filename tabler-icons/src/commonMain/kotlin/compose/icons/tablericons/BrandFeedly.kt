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

public val TablerIcons.BrandFeedly: ImageVector
    get() {
        if (_brandFeedly != null) {
            return _brandFeedly!!
        }
        _brandFeedly = Builder(name = "BrandFeedly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.833f, 12.278f)
                lineToRelative(4.445f, -4.445f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.055f, 14.5f)
                lineToRelative(2.223f, -2.222f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.278f, 16.722f)
                lineToRelative(0.555f, -0.555f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.828f, 14.828f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.656f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.656f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.656f)
                lineToRelative(6.171f, 6.172f)
                horizontalLineToRelative(3.314f)
                lineToRelative(6.171f, -6.172f)
                close()
            }
        }
        .build()
        return _brandFeedly!!
    }

private var _brandFeedly: ImageVector? = null
