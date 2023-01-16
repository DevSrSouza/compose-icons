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

public val MaterialDesignIcons.SetSquare: ImageVector
    get() {
        if (_setSquare != null) {
            return _setSquare!!
        }
        _setSquare = Builder(name = "SetSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7f, 17.7f)
                lineTo(16.6f, 18.8f)
                lineTo(15.9f, 18.0f)
                lineTo(17.0f, 17.0f)
                lineTo(15.0f, 15.0f)
                lineTo(14.0f, 16.1f)
                lineTo(13.3f, 15.4f)
                lineTo(14.4f, 14.3f)
                lineTo(12.5f, 12.4f)
                lineTo(11.4f, 13.5f)
                lineTo(10.7f, 12.8f)
                lineTo(11.8f, 11.7f)
                lineTo(9.8f, 9.8f)
                lineTo(8.7f, 10.9f)
                lineTo(8.0f, 10.2f)
                lineTo(9.0f, 9.0f)
                lineTo(7.1f, 7.1f)
                lineTo(6.0f, 8.1f)
                lineTo(5.3f, 7.4f)
                lineTo(6.4f, 6.3f)
                lineTo(4.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                lineTo(17.7f, 17.7f)
                moveTo(7.0f, 17.0f)
                verticalLineTo(11.2f)
                lineTo(12.8f, 17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _setSquare!!
    }

private var _setSquare: ImageVector? = null
