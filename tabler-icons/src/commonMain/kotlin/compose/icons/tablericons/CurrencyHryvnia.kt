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

public val TablerIcons.CurrencyHryvnia: ImageVector
    get() {
        if (_currencyHryvnia != null) {
            return _currencyHryvnia!!
        }
        _currencyHryvnia = Builder(name = "CurrencyHryvnia", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.562f, -2.0f)
                horizontalLineToRelative(3.376f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.562f, 2.0f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, true, -1.344f, 2.922f)
                lineToRelative(-5.876f, 2.938f)
                arcToRelative(3.338f, 3.338f, 0.0f, false, false, -1.78f, 3.64f)
                arcToRelative(3.11f, 3.11f, 0.0f, false, false, 3.05f, 2.5f)
                horizontalLineToRelative(2.888f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, 2.562f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(12.0f)
            }
        }
        .build()
        return _currencyHryvnia!!
    }

private var _currencyHryvnia: ImageVector? = null
