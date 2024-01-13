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

public val TablerIcons.CurrencyXrp: ImageVector
    get() {
        if (_currencyXrp != null) {
            return _currencyXrp!!
        }
        _currencyXrp = Builder(name = "CurrencyXrp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineToRelative(3.585f, 3.585f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, false, 6.83f, 0.0f)
                lineToRelative(3.585f, -3.585f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                lineToRelative(3.585f, -3.585f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, true, 6.83f, 0.0f)
                lineToRelative(3.585f, 3.584f)
            }
        }
        .build()
        return _currencyXrp!!
    }

private var _currencyXrp: ImageVector? = null
