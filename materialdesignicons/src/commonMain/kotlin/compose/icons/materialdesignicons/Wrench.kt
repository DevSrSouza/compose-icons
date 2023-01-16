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

public val MaterialDesignIcons.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.7f, 19.0f)
                lineTo(13.6f, 9.9f)
                curveTo(14.5f, 7.6f, 14.0f, 4.9f, 12.1f, 3.0f)
                curveTo(10.1f, 1.0f, 7.1f, 0.6f, 4.7f, 1.7f)
                lineTo(9.0f, 6.0f)
                lineTo(6.0f, 9.0f)
                lineTo(1.6f, 4.7f)
                curveTo(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f)
                curveTo(4.8f, 14.0f, 7.5f, 14.5f, 9.8f, 13.6f)
                lineTo(18.9f, 22.7f)
                curveTo(19.3f, 23.1f, 19.9f, 23.1f, 20.3f, 22.7f)
                lineTo(22.6f, 20.4f)
                curveTo(23.1f, 20.0f, 23.1f, 19.3f, 22.7f, 19.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
