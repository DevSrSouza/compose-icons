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

public val MaterialDesignIcons.EggOff: ImageVector
    get() {
        if (_eggOff != null) {
            return _eggOff!!
        }
        _eggOff = Builder(name = "EggOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(6.1f, 8.0f)
                curveTo(5.1f, 10.3f, 4.5f, 12.8f, 4.5f, 14.5f)
                curveTo(4.5f, 18.6f, 7.9f, 22.0f, 12.0f, 22.0f)
                curveTo(14.2f, 22.0f, 16.2f, 21.0f, 17.6f, 19.5f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(19.5f, 14.5f)
                curveTo(19.5f, 10.4f, 16.1f, 2.0f, 12.0f, 2.0f)
                curveTo(10.5f, 2.0f, 9.1f, 3.1f, 7.9f, 4.7f)
                lineTo(19.3f, 16.1f)
                curveTo(19.4f, 15.6f, 19.5f, 15.1f, 19.5f, 14.5f)
                close()
            }
        }
        .build()
        return _eggOff!!
    }

private var _eggOff: ImageVector? = null
