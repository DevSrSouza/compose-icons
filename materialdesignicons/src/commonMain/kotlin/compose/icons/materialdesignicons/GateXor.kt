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

public val MaterialDesignIcons.GateXor: ImageVector
    get() {
        if (_gateXor != null) {
            return _gateXor!!
        }
        _gateXor = Builder(name = "GateXor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                curveTo(14.0f, 20.0f, 18.0f, 17.0f, 22.0f, 12.0f)
                curveTo(18.0f, 7.0f, 14.0f, 4.0f, 9.0f, 4.0f)
                horizontalLineTo(6.0f)
                moveTo(9.0f, 6.0f)
                curveTo(12.8f, 6.0f, 16.0f, 8.1f, 19.3f, 12.0f)
                curveTo(15.9f, 15.9f, 12.8f, 18.0f, 9.0f, 18.0f)
                curveTo(10.5f, 14.0f, 10.5f, 10.0f, 9.0f, 6.0f)
                close()
            }
        }
        .build()
        return _gateXor!!
    }

private var _gateXor: ImageVector? = null
