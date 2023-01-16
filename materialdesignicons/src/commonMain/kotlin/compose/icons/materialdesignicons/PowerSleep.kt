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

public val MaterialDesignIcons.PowerSleep: ImageVector
    get() {
        if (_powerSleep != null) {
            return _powerSleep!!
        }
        _powerSleep = Builder(name = "PowerSleep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.73f, 18.0f)
                curveTo(15.4f, 21.69f, 9.71f, 22.0f, 6.0f, 18.64f)
                curveTo(2.33f, 15.31f, 2.04f, 9.62f, 5.37f, 5.93f)
                curveTo(6.9f, 4.25f, 9.0f, 3.2f, 11.27f, 3.0f)
                curveTo(7.96f, 6.7f, 8.27f, 12.39f, 12.0f, 15.71f)
                curveTo(13.63f, 17.19f, 15.78f, 18.0f, 18.0f, 18.0f)
                curveTo(18.25f, 18.0f, 18.5f, 18.0f, 18.73f, 18.0f)
                close()
            }
        }
        .build()
        return _powerSleep!!
    }

private var _powerSleep: ImageVector? = null
