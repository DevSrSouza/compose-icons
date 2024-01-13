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

public val TablerIcons.CurrencyDollarOff: ImageVector
    get() {
        if (_currencyDollarOff != null) {
            return _currencyDollarOff!!
        }
        _currencyDollarOff = Builder(name = "CurrencyDollarOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.7f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.7f, -2.0f)
                horizontalLineToRelative(-4.0f)
                moveToRelative(-2.557f, 1.431f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.557f, 4.569f)
                horizontalLineToRelative(2.0f)
                moveToRelative(4.564f, 4.558f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.564f, 1.442f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.7f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(3.0f)
                moveToRelative(0.0f, 12.0f)
                verticalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _currencyDollarOff!!
    }

private var _currencyDollarOff: ImageVector? = null
