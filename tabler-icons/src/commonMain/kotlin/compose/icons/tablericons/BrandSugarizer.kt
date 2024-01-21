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

public val TablerIcons.BrandSugarizer: ImageVector
    get() {
        if (_brandSugarizer != null) {
            return _brandSugarizer!!
        }
        _brandSugarizer = Builder(name = "BrandSugarizer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.277f, 16.0f)
                lineToRelative(3.252f, -3.252f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, false, -2.277f, -2.276f)
                lineToRelative(-3.252f, 3.251f)
                lineToRelative(-3.252f, -3.251f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, false, -2.276f, 2.276f)
                lineToRelative(3.251f, 3.252f)
                lineToRelative(-3.251f, 3.252f)
                arcToRelative(1.61f, 1.61f, 0.0f, true, false, 2.276f, 2.277f)
                lineToRelative(3.252f, -3.252f)
                lineToRelative(3.252f, 3.252f)
                arcToRelative(1.61f, 1.61f, 0.0f, true, false, 2.277f, -2.277f)
                lineToRelative(-3.252f, -3.252f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
            }
        }
        .build()
        return _brandSugarizer!!
    }

private var _brandSugarizer: ImageVector? = null
