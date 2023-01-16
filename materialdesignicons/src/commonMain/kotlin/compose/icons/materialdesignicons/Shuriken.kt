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

public val MaterialDesignIcons.Shuriken: ImageVector
    get() {
        if (_shuriken != null) {
            return _shuriken!!
        }
        _shuriken = Builder(name = "Shuriken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 9.5f)
                lineTo(12.0f, 2.0f)
                lineTo(9.5f, 9.5f)
                lineTo(2.0f, 12.0f)
                lineTo(9.5f, 14.5f)
                lineTo(12.0f, 22.0f)
                lineTo(14.5f, 14.5f)
                lineTo(22.0f, 12.0f)
                lineTo(14.5f, 9.5f)
                moveTo(12.0f, 13.7f)
                curveTo(11.1f, 13.7f, 10.3f, 13.0f, 10.3f, 12.0f)
                curveTo(10.3f, 11.1f, 11.0f, 10.3f, 12.0f, 10.3f)
                curveTo(12.9f, 10.3f, 13.7f, 11.0f, 13.7f, 12.0f)
                curveTo(13.7f, 12.9f, 12.9f, 13.7f, 12.0f, 13.7f)
                close()
            }
        }
        .build()
        return _shuriken!!
    }

private var _shuriken: ImageVector? = null
