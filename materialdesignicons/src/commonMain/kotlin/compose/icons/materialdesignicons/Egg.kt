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

public val MaterialDesignIcons.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 14.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 4.5f, 14.5f)
                curveTo(4.5f, 10.36f, 7.86f, 2.0f, 12.0f, 2.0f)
                curveTo(16.14f, 2.0f, 19.5f, 10.36f, 19.5f, 14.5f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
