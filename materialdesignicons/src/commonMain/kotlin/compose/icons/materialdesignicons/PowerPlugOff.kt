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

public val MaterialDesignIcons.PowerPlugOff: ImageVector
    get() {
        if (_powerPlugOff != null) {
            return _powerPlugOff!!
        }
        _powerPlugOff = Builder(name = "PowerPlugOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(15.31f, 17.2f)
                lineTo(14.5f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.0f)
                lineTo(6.0f, 14.5f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 8.7f, 6.1f, 8.41f, 6.25f, 8.14f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(18.0f, 14.5f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.0f, 17.0f, 7.0f, 16.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.2f)
                lineTo(17.85f, 14.65f)
                lineTo(18.0f, 14.5f)
                moveTo(10.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.8f)
                lineTo(10.0f, 6.8f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _powerPlugOff!!
    }

private var _powerPlugOff: ImageVector? = null
