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

public val MaterialDesignIcons.KeyboardTab: ImageVector
    get() {
        if (_keyboardTab != null) {
            return _keyboardTab!!
        }
        _keyboardTab = Builder(name = "KeyboardTab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                moveTo(11.59f, 7.41f)
                lineTo(15.17f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.17f)
                lineTo(11.59f, 16.58f)
                lineTo(13.0f, 18.0f)
                lineTo(19.0f, 12.0f)
                lineTo(13.0f, 6.0f)
                lineTo(11.59f, 7.41f)
                close()
            }
        }
        .build()
        return _keyboardTab!!
    }

private var _keyboardTab: ImageVector? = null
