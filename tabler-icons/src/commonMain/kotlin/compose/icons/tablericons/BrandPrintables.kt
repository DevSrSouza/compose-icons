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

public val TablerIcons.BrandPrintables: ImageVector
    get() {
        if (_brandPrintables != null) {
            return _brandPrintables!!
        }
        _brandPrintables = Builder(name = "BrandPrintables", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 21.0f)
                lineToRelative(12.0f, -7.0f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-6.0f, -3.5f)
                lineToRelative(-6.0f, 3.5f)
                lineToRelative(6.0f, 3.5f)
                verticalLineToRelative(7.5f)
                lineToRelative(-6.0f, -3.5f)
                close()
            }
        }
        .build()
        return _brandPrintables!!
    }

private var _brandPrintables: ImageVector? = null
