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

public val MaterialDesignIcons.GateXnor: ImageVector
    get() {
        if (_gateXnor != null) {
            return _gateXnor!!
        }
        _gateXnor = Builder(name = "GateXnor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(5.0f, 10.0f, 5.0f, 14.0f, 2.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(7.0f, 14.0f, 7.0f, 10.0f, 4.1f, 4.0f)
                horizontalLineTo(2.0f)
                moveTo(6.0f, 4.0f)
                curveTo(9.0f, 10.0f, 9.0f, 14.0f, 6.0f, 20.0f)
                horizontalLineTo(9.0f)
                curveTo(12.2f, 20.0f, 14.8f, 16.8f, 16.7f, 14.0f)
                curveTo(17.28f, 14.65f, 18.12f, 15.0f, 19.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 9.0f)
                curveTo(18.12f, 9.0f, 17.28f, 9.35f, 16.7f, 10.0f)
                curveTo(14.7f, 7.2f, 12.2f, 4.0f, 9.0f, 4.0f)
                horizontalLineTo(6.0f)
                moveTo(9.0f, 6.0f)
                curveTo(12.0f, 6.0f, 14.0f, 10.0f, 15.5f, 12.0f)
                curveTo(14.0f, 14.0f, 12.0f, 18.0f, 9.0f, 18.0f)
                curveTo(10.6f, 14.0f, 10.6f, 10.0f, 9.0f, 6.0f)
                moveTo(19.0f, 11.0f)
                curveTo(19.5f, 11.0f, 20.0f, 11.5f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5f, 19.5f, 13.0f, 19.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 11.5f, 18.5f, 11.0f, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _gateXnor!!
    }

private var _gateXnor: ImageVector? = null
