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

public val MaterialDesignIcons.BagCarryOnOff: ImageVector
    get() {
        if (_bagCarryOnOff != null) {
            return _bagCarryOnOff!!
        }
        _bagCarryOnOff = Builder(name = "BagCarryOnOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 4.9f)
                lineTo(6.0f, 8.9f)
                verticalLineTo(19.0f)
                curveTo(6.0f, 19.5f, 6.2f, 20.0f, 6.6f, 20.4f)
                curveTo(7.0f, 20.8f, 7.5f, 21.0f, 8.0f, 21.0f)
                verticalLineTo(10.8f)
                lineTo(9.0f, 11.8f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.2f)
                curveTo(13.1f, 20.6f, 13.0f, 20.2f, 13.0f, 20.0f)
                curveTo(13.0f, 18.8f, 13.5f, 18.0f, 14.6f, 17.4f)
                lineTo(15.4f, 18.2f)
                curveTo(14.5f, 18.5f, 14.1f, 19.2f, 14.1f, 20.1f)
                curveTo(14.1f, 20.6f, 14.3f, 21.1f, 14.7f, 21.5f)
                curveTo(15.0f, 21.8f, 15.5f, 22.0f, 16.0f, 22.0f)
                curveTo(16.9f, 22.0f, 17.6f, 21.6f, 17.9f, 20.7f)
                lineTo(19.1f, 21.9f)
                lineTo(20.5f, 20.5f)
                lineTo(3.5f, 3.5f)
                lineTo(2.1f, 4.9f)
                moveTo(12.0f, 2.0f)
                curveTo(12.0f, 2.5f, 12.2f, 3.0f, 12.6f, 3.4f)
                reflectiveCurveTo(13.5f, 4.0f, 14.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.8f)
                lineTo(16.0f, 13.2f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _bagCarryOnOff!!
    }

private var _bagCarryOnOff: ImageVector? = null
