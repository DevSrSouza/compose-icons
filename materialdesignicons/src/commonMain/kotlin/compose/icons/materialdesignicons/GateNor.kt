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

public val MaterialDesignIcons.GateNor: ImageVector
    get() {
        if (_gateNor != null) {
            return _gateNor!!
        }
        _gateNor = Builder(name = "GateNor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(5.0f, 10.0f, 5.0f, 14.0f, 2.0f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(9.4f, 20.0f, 13.0f, 17.7f, 16.6f, 13.7f)
                curveTo(17.15f, 14.5f, 18.04f, 15.0f, 19.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 9.0f)
                curveTo(18.04f, 9.0f, 17.15f, 9.5f, 16.6f, 10.3f)
                curveTo(13.0f, 6.3f, 9.4f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(2.0f)
                moveTo(5.0f, 6.0f)
                curveTo(8.8f, 6.0f, 12.0f, 8.1f, 15.3f, 12.0f)
                curveTo(12.0f, 15.9f, 8.8f, 18.0f, 5.0f, 18.0f)
                curveTo(6.5f, 14.0f, 6.5f, 10.0f, 5.0f, 6.0f)
                moveTo(19.0f, 11.0f)
                curveTo(19.5f, 11.0f, 20.0f, 11.5f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5f, 19.5f, 13.0f, 19.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 11.5f, 18.5f, 11.0f, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _gateNor!!
    }

private var _gateNor: ImageVector? = null
