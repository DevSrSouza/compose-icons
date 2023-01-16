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

public val MaterialDesignIcons.Oar: ImageVector
    get() {
        if (_oar != null) {
            return _oar!!
        }
        _oar = Builder(name = "Oar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.23f, 15.21f)
                curveTo(18.77f, 13.75f, 14.97f, 10.2f, 12.77f, 11.27f)
                lineTo(4.5f, 3.0f)
                lineTo(3.0f, 4.5f)
                lineTo(11.28f, 12.79f)
                curveTo(10.3f, 15.0f, 13.88f, 18.62f, 15.35f, 20.08f)
                curveTo(17.11f, 21.84f, 18.26f, 20.92f, 19.61f, 19.57f)
                curveTo(21.1f, 18.08f, 21.61f, 16.61f, 20.23f, 15.21f)
                close()
            }
        }
        .build()
        return _oar!!
    }

private var _oar: ImageVector? = null
