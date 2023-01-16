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

public val MaterialDesignIcons.AppleKeyboardShift: ImageVector
    get() {
        if (_appleKeyboardShift != null) {
            return _appleKeyboardShift!!
        }
        _appleKeyboardShift = Builder(name = "AppleKeyboardShift", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.17f)
                lineTo(12.0f, 6.83f)
                lineTo(6.83f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                moveTo(12.0f, 4.0f)
                lineTo(22.0f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _appleKeyboardShift!!
    }

private var _appleKeyboardShift: ImageVector? = null
