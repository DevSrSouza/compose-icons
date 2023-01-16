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

public val MaterialDesignIcons.GateNand: ImageVector
    get() {
        if (_gateNand != null) {
            return _gateNand!!
        }
        _gateNand = Builder(name = "GateNand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                curveTo(13.43f, 20.0f, 16.5f, 17.84f, 17.6f, 14.6f)
                curveTo(18.0f, 14.8f, 18.5f, 15.0f, 19.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 9.0f)
                curveTo(18.5f, 9.0f, 18.03f, 9.15f, 17.6f, 9.4f)
                curveTo(16.5f, 6.16f, 13.43f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(2.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(19.0f, 11.0f)
                curveTo(19.5f, 11.0f, 20.0f, 11.5f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5f, 19.5f, 13.0f, 19.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 11.5f, 18.5f, 11.0f, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _gateNand!!
    }

private var _gateNand: ImageVector? = null
