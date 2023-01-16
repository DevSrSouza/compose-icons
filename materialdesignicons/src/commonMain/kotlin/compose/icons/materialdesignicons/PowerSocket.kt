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

public val MaterialDesignIcons.PowerSocket: ImageVector
    get() {
        if (_powerSocket != null) {
            return _powerSocket!!
        }
        _powerSocket = Builder(name = "PowerSocket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                moveTo(8.83f, 7.0f)
                horizontalLineTo(15.2f)
                lineTo(19.0f, 10.8f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.8f)
                moveTo(8.0f, 5.0f)
                lineTo(3.0f, 10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _powerSocket!!
    }

private var _powerSocket: ImageVector? = null
