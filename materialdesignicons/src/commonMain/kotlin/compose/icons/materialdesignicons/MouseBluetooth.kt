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

public val MaterialDesignIcons.MouseBluetooth: ImageVector
    get() {
        if (_mouseBluetooth != null) {
            return _mouseBluetooth!!
        }
        _mouseBluetooth = Builder(name = "MouseBluetooth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                horizontalLineTo(20.5f)
                lineTo(23.35f, 9.85f)
                lineTo(21.21f, 12.0f)
                lineTo(23.35f, 14.14f)
                lineTo(20.5f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.21f)
                lineTo(17.71f, 15.5f)
                lineTo(17.0f, 14.79f)
                lineTo(19.79f, 12.0f)
                lineTo(17.0f, 9.21f)
                lineTo(17.71f, 8.5f)
                lineTo(20.0f, 10.79f)
                verticalLineTo(7.0f)
                moveTo(21.0f, 8.91f)
                verticalLineTo(10.79f)
                lineTo(21.94f, 9.85f)
                lineTo(21.0f, 8.91f)
                moveTo(21.0f, 13.21f)
                verticalLineTo(15.08f)
                lineTo(21.94f, 14.14f)
                lineTo(21.0f, 13.21f)
                moveTo(15.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.07f)
                curveTo(12.39f, 2.56f, 15.0f, 5.47f, 15.0f, 9.0f)
                moveTo(1.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(1.0f, 5.47f, 3.61f, 2.56f, 7.0f, 2.07f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.0f)
                moveTo(15.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.0f, 22.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 1.0f, 15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _mouseBluetooth!!
    }

private var _mouseBluetooth: ImageVector? = null
