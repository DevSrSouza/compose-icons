package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.RomanNumeral10: ImageVector
    get() {
        if (_romanNumeral10 != null) {
            return _romanNumeral10!!
        }
        _romanNumeral10 = Builder(name = "RomanNumeral10", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                lineTo(11.0f, 12.0f)
                lineTo(9.0f, 17.0f)
                horizontalLineTo(11.0f)
                lineTo(12.0f, 14.5f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(15.0f)
                lineTo(13.0f, 12.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(13.0f)
                lineTo(12.0f, 9.5f)
                lineTo(11.0f, 7.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _romanNumeral10!!
    }

private var _romanNumeral10: ImageVector? = null
