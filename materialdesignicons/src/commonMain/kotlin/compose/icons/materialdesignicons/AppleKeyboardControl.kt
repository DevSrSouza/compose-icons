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

public val MaterialDesignIcons.AppleKeyboardControl: ImageVector
    get() {
        if (_appleKeyboardControl != null) {
            return _appleKeyboardControl!!
        }
        _appleKeyboardControl = Builder(name = "AppleKeyboardControl", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 11.78f)
                lineTo(18.36f, 13.19f)
                lineTo(12.0f, 6.83f)
                lineTo(5.64f, 13.19f)
                lineTo(4.22f, 11.78f)
                lineTo(12.0f, 4.0f)
                lineTo(19.78f, 11.78f)
                close()
            }
        }
        .build()
        return _appleKeyboardControl!!
    }

private var _appleKeyboardControl: ImageVector? = null
