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

public val MaterialDesignIcons.RomanNumeral3: ImageVector
    get() {
        if (_romanNumeral3 != null) {
            return _romanNumeral3!!
        }
        _romanNumeral3 = Builder(name = "RomanNumeral3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                moveTo(14.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                moveTo(19.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _romanNumeral3!!
    }

private var _romanNumeral3: ImageVector? = null
