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

public val MaterialDesignIcons.SlotMachine: ImageVector
    get() {
        if (_slotMachine != null) {
            return _slotMachine!!
        }
        _slotMachine = Builder(name = "SlotMachine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                lineTo(7.0f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                lineTo(4.0f, 12.0f)
                moveTo(9.0f, 12.0f)
                lineTo(11.0f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                lineTo(8.0f, 12.0f)
                moveTo(13.0f, 12.0f)
                lineTo(15.0f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 12.0f)
                moveTo(21.0f, 2.0f)
                curveTo(19.9f, 2.0f, 19.0f, 2.9f, 19.0f, 4.0f)
                curveTo(19.0f, 4.7f, 19.4f, 5.4f, 20.0f, 5.7f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                curveTo(17.6f, 15.0f, 18.0f, 14.6f, 18.0f, 14.0f)
                verticalLineTo(5.0f)
                curveTo(18.0f, 4.4f, 17.6f, 4.0f, 17.0f, 4.0f)
                horizontalLineTo(13.2f)
                curveTo(12.4f, 2.8f, 11.0f, 2.0f, 9.5f, 2.0f)
                reflectiveCurveTo(6.6f, 2.8f, 5.8f, 4.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4f, 4.0f, 1.0f, 4.4f, 1.0f, 5.0f)
                verticalLineTo(14.0f)
                curveTo(1.0f, 14.6f, 1.4f, 15.0f, 2.0f, 15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 19.0f, 22.0f, 18.1f, 22.0f, 17.0f)
                verticalLineTo(5.7f)
                curveTo(22.6f, 5.4f, 23.0f, 4.7f, 23.0f, 4.0f)
                curveTo(23.0f, 2.9f, 22.1f, 2.0f, 21.0f, 2.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                moveTo(16.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _slotMachine!!
    }

private var _slotMachine: ImageVector? = null
