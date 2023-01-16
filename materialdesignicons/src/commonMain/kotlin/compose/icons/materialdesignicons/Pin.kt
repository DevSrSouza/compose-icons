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

public val MaterialDesignIcons.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                lineTo(6.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.2f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.8f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                lineTo(16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
