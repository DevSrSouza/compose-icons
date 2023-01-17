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

public val TablerIcons.CurrencyGuarani: ImageVector
    get() {
        if (_currencyGuarani != null) {
            return _currencyGuarani!!
        }
        _currencyGuarani = Builder(name = "CurrencyGuarani", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.007f, 7.54f)
                arcToRelative(5.965f, 5.965f, 0.0f, false, false, -4.008f, -1.54f)
                arcToRelative(5.996f, 5.996f, 0.0f, false, false, -5.992f, 6.0f)
                curveToRelative(0.0f, 3.314f, 2.682f, 6.0f, 5.992f, 6.0f)
                arcToRelative(5.965f, 5.965f, 0.0f, false, false, 4.004f, -1.536f)
                curveToRelative(0.732f, -0.66f, 1.064f, -2.148f, 0.997f, -4.464f)
                horizontalLineToRelative(-5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                verticalLineToRelative(-16.0f)
            }
        }
        .build()
        return _currencyGuarani!!
    }

private var _currencyGuarani: ImageVector? = null
