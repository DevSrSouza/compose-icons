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

public val MaterialDesignIcons.RomanNumeral9: ImageVector
    get() {
        if (_romanNumeral9 != null) {
            return _romanNumeral9!!
        }
        _romanNumeral9 = Builder(name = "RomanNumeral9", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 7.0f)
                lineTo(14.0f, 12.0f)
                lineTo(12.0f, 17.0f)
                horizontalLineTo(14.0f)
                lineTo(15.0f, 14.5f)
                lineTo(16.0f, 17.0f)
                horizontalLineTo(18.0f)
                lineTo(16.0f, 12.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineTo(16.0f)
                lineTo(15.0f, 9.5f)
                lineTo(14.0f, 7.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _romanNumeral9!!
    }

private var _romanNumeral9: ImageVector? = null
