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

public val MaterialDesignIcons.Ocarina: ImageVector
    get() {
        if (_ocarina != null) {
            return _ocarina!!
        }
        _ocarina = Builder(name = "Ocarina", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(16.8f, 10.4f, 13.4f, 9.7f, 10.8f, 9.3f)
                lineTo(9.7f, 5.9f)
                curveTo(9.3f, 4.8f, 7.7f, 4.8f, 7.3f, 5.9f)
                lineTo(6.3f, 9.0f)
                curveTo(3.9f, 9.4f, 2.0f, 11.5f, 2.0f, 14.0f)
                curveTo(2.0f, 16.8f, 4.2f, 19.0f, 7.0f, 19.0f)
                curveTo(7.0f, 19.0f, 14.0f, 19.0f, 20.0f, 16.0f)
                curveTo(20.0f, 16.0f, 22.0f, 15.0f, 22.0f, 14.0f)
                curveTo(22.0f, 13.0f, 20.0f, 12.0f, 20.0f, 12.0f)
                moveTo(5.0f, 14.0f)
                curveTo(4.4f, 14.0f, 4.0f, 13.6f, 4.0f, 13.0f)
                curveTo(4.0f, 12.4f, 4.4f, 12.0f, 5.0f, 12.0f)
                curveTo(5.6f, 12.0f, 6.0f, 12.4f, 6.0f, 13.0f)
                curveTo(6.0f, 13.5f, 5.6f, 14.0f, 5.0f, 14.0f)
                moveTo(7.0f, 17.0f)
                curveTo(6.4f, 17.0f, 6.0f, 16.6f, 6.0f, 16.0f)
                curveTo(6.0f, 15.4f, 6.4f, 15.0f, 7.0f, 15.0f)
                curveTo(7.6f, 15.0f, 8.0f, 15.4f, 8.0f, 16.0f)
                curveTo(8.0f, 16.5f, 7.6f, 17.0f, 7.0f, 17.0f)
                moveTo(9.0f, 14.0f)
                curveTo(8.4f, 14.0f, 8.0f, 13.6f, 8.0f, 13.0f)
                curveTo(8.0f, 12.4f, 8.4f, 12.0f, 9.0f, 12.0f)
                curveTo(9.6f, 12.0f, 10.0f, 12.4f, 10.0f, 13.0f)
                curveTo(10.0f, 13.5f, 9.6f, 14.0f, 9.0f, 14.0f)
                moveTo(11.0f, 17.0f)
                curveTo(10.4f, 17.0f, 10.0f, 16.6f, 10.0f, 16.0f)
                curveTo(10.0f, 15.4f, 10.4f, 15.0f, 11.0f, 15.0f)
                curveTo(11.6f, 15.0f, 12.0f, 15.4f, 12.0f, 16.0f)
                curveTo(12.0f, 16.5f, 11.6f, 17.0f, 11.0f, 17.0f)
                moveTo(16.0f, 14.0f)
                curveTo(15.4f, 14.0f, 15.0f, 13.6f, 15.0f, 13.0f)
                curveTo(15.0f, 12.4f, 15.4f, 12.0f, 16.0f, 12.0f)
                curveTo(16.6f, 12.0f, 17.0f, 12.4f, 17.0f, 13.0f)
                curveTo(17.0f, 13.5f, 16.6f, 14.0f, 16.0f, 14.0f)
                moveTo(19.0f, 15.0f)
                curveTo(18.4f, 15.0f, 18.0f, 14.6f, 18.0f, 14.0f)
                curveTo(18.0f, 13.4f, 18.4f, 13.0f, 19.0f, 13.0f)
                curveTo(19.6f, 13.0f, 20.0f, 13.4f, 20.0f, 14.0f)
                curveTo(20.0f, 14.5f, 19.6f, 15.0f, 19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _ocarina!!
    }

private var _ocarina: ImageVector? = null
