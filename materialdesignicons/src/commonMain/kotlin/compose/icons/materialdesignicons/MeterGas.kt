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

public val MaterialDesignIcons.MeterGas: ImageVector
    get() {
        if (_meterGas != null) {
            return _meterGas!!
        }
        _meterGas = Builder(name = "MeterGas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 20.21f, 5.79f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(18.21f, 22.0f, 20.0f, 20.21f, 20.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 5.79f, 18.21f, 4.0f, 16.0f, 4.0f)
                moveTo(12.0f, 18.0f)
                curveTo(10.62f, 18.0f, 9.5f, 16.9f, 9.5f, 15.54f)
                curveTo(9.5f, 14.45f, 9.93f, 14.15f, 12.0f, 11.75f)
                curveTo(14.05f, 14.13f, 14.5f, 14.45f, 14.5f, 15.54f)
                curveTo(14.5f, 16.9f, 13.38f, 18.0f, 12.0f, 18.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _meterGas!!
    }

private var _meterGas: ImageVector? = null
