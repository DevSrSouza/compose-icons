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

public val MaterialDesignIcons.GateBuffer: ImageVector
    get() {
        if (_gateBuffer != null) {
            return _gateBuffer!!
        }
        _gateBuffer = Builder(name = "GateBuffer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.24f)
                lineTo(15.53f, 12.0f)
                lineTo(6.0f, 16.76f)
                verticalLineTo(7.24f)
                moveTo(4.0f, 4.0f)
                verticalLineTo(20.0f)
                lineTo(20.0f, 12.0f)
                lineTo(4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _gateBuffer!!
    }

private var _gateBuffer: ImageVector? = null
