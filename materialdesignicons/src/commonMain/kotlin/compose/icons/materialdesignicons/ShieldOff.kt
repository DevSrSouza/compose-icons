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

public val MaterialDesignIcons.ShieldOff: ImageVector
    get() {
        if (_shieldOff != null) {
            return _shieldOff!!
        }
        _shieldOff = Builder(name = "ShieldOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(20.5f, 21.22f)
                lineTo(19.23f, 22.5f)
                lineTo(17.0f, 20.25f)
                curveTo(15.57f, 21.57f, 13.87f, 22.54f, 12.0f, 23.0f)
                curveTo(6.84f, 21.74f, 3.0f, 16.55f, 3.0f, 11.0f)
                verticalLineTo(6.27f)
                lineTo(1.0f, 4.27f)
                moveTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 13.28f, 20.35f, 15.5f, 19.23f, 17.41f)
                lineTo(5.65f, 3.82f)
                lineTo(12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _shieldOff!!
    }

private var _shieldOff: ImageVector? = null
