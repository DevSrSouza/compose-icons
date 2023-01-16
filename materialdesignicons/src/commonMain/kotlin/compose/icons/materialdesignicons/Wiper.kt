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

public val MaterialDesignIcons.Wiper: ImageVector
    get() {
        if (_wiper != null) {
            return _wiper!!
        }
        _wiper = Builder(name = "Wiper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(5.0f, 4.0f, 2.0f, 9.0f, 2.0f, 9.0f)
                lineTo(9.0f, 16.0f)
                curveTo(9.0f, 16.0f, 9.5f, 15.1f, 10.4f, 14.5f)
                lineTo(10.7f, 16.5f)
                curveTo(10.3f, 16.8f, 10.0f, 17.4f, 10.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 18.0f)
                curveTo(14.0f, 17.1f, 13.5f, 16.4f, 12.7f, 16.1f)
                lineTo(12.3f, 14.0f)
                curveTo(14.1f, 14.2f, 15.0f, 16.0f, 15.0f, 16.0f)
                lineTo(22.0f, 9.0f)
                curveTo(22.0f, 9.0f, 19.0f, 4.0f, 12.0f, 4.0f)
                moveTo(15.1f, 13.1f)
                curveTo(14.3f, 12.5f, 13.3f, 12.0f, 12.0f, 12.0f)
                lineTo(11.0f, 6.1f)
                curveTo(11.3f, 6.0f, 11.7f, 6.0f, 12.0f, 6.0f)
                curveTo(15.7f, 6.0f, 18.1f, 7.7f, 19.3f, 8.9f)
                lineTo(15.1f, 13.1f)
                moveTo(8.9f, 13.1f)
                lineTo(4.7f, 8.9f)
                curveTo(5.5f, 8.0f, 7.0f, 7.0f, 9.0f, 6.4f)
                lineTo(10.0f, 12.4f)
                curveTo(9.6f, 12.6f, 9.2f, 12.8f, 8.9f, 13.1f)
                close()
            }
        }
        .build()
        return _wiper!!
    }

private var _wiper: ImageVector? = null
