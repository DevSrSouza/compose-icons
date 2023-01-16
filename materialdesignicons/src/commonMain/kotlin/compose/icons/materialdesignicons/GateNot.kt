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

public val MaterialDesignIcons.GateNot: ImageVector
    get() {
        if (_gateNot != null) {
            return _gateNot!!
        }
        _gateNot = Builder(name = "GateNot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                verticalLineTo(20.0f)
                lineTo(16.2f, 13.0f)
                curveTo(16.62f, 14.19f, 17.74f, 15.0f, 19.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 9.0f)
                curveTo(17.74f, 9.0f, 16.62f, 9.81f, 16.2f, 11.0f)
                lineTo(2.0f, 4.0f)
                moveTo(4.0f, 7.3f)
                lineTo(13.7f, 12.0f)
                lineTo(4.0f, 16.7f)
                verticalLineTo(7.3f)
                moveTo(19.0f, 11.0f)
                curveTo(19.5f, 11.0f, 20.0f, 11.5f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5f, 19.5f, 13.0f, 19.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 11.5f, 18.5f, 11.0f, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _gateNot!!
    }

private var _gateNot: ImageVector? = null
