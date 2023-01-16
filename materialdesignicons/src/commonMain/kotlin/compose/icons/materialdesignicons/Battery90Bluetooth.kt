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

public val MaterialDesignIcons.Battery90Bluetooth: ImageVector
    get() {
        if (_battery90Bluetooth != null) {
            return _battery90Bluetooth!!
        }
        _battery90Bluetooth = Builder(name = "Battery90Bluetooth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 2.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2.0f, 21.4f, 2.6f, 22.0f, 3.33f, 22.0f)
                horizontalLineTo(12.67f)
                curveTo(13.4f, 22.0f, 14.0f, 21.4f, 14.0f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 12.67f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(19.0f, 8.0f)
                verticalLineTo(11.79f)
                lineTo(16.71f, 9.5f)
                lineTo(16.0f, 10.21f)
                lineTo(18.79f, 13.0f)
                lineTo(16.0f, 15.79f)
                lineTo(16.71f, 16.5f)
                lineTo(19.0f, 14.21f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 15.14f)
                lineTo(20.21f, 13.0f)
                lineTo(22.35f, 10.85f)
                lineTo(19.5f, 8.0f)
                horizontalLineTo(19.0f)
                moveTo(20.0f, 9.91f)
                lineTo(20.94f, 10.85f)
                lineTo(20.0f, 11.79f)
                verticalLineTo(9.91f)
                moveTo(20.0f, 14.21f)
                lineTo(20.94f, 15.14f)
                lineTo(20.0f, 16.08f)
                verticalLineTo(14.21f)
                close()
            }
        }
        .build()
        return _battery90Bluetooth!!
    }

private var _battery90Bluetooth: ImageVector? = null
