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

public val MaterialDesignIcons.AppleKeyboardOption: ImageVector
    get() {
        if (_appleKeyboardOption != null) {
            return _appleKeyboardOption!!
        }
        _appleKeyboardOption = Builder(name = "AppleKeyboardOption", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(9.11f)
                lineTo(16.15f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.88f)
                lineTo(7.84f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                moveTo(14.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _appleKeyboardOption!!
    }

private var _appleKeyboardOption: ImageVector? = null
