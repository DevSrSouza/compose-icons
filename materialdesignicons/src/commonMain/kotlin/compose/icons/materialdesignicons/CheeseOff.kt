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

public val MaterialDesignIcons.CheeseOff: ImageVector
    get() {
        if (_cheeseOff != null) {
            return _cheeseOff!!
        }
        _cheeseOff = Builder(name = "CheeseOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 1.7f)
                lineTo(2.2f, 3.0f)
                lineTo(6.1f, 6.9f)
                verticalLineTo(9.0f)
                curveTo(7.2f, 9.2f, 8.1f, 10.2f, 8.1f, 11.5f)
                reflectiveCurveTo(7.2f, 13.7f, 6.1f, 14.0f)
                verticalLineTo(21.0f)
                lineTo(12.1f, 17.5f)
                curveTo(12.1f, 16.7f, 12.8f, 16.0f, 13.6f, 16.0f)
                curveTo(13.9f, 16.0f, 14.2f, 16.1f, 14.4f, 16.2f)
                lineTo(15.1f, 15.8f)
                lineTo(20.3f, 21.0f)
                lineTo(21.6f, 19.7f)
                lineTo(3.5f, 1.7f)
                moveTo(10.1f, 16.0f)
                curveTo(9.6f, 16.0f, 9.1f, 15.5f, 9.1f, 15.0f)
                reflectiveCurveTo(9.6f, 14.0f, 10.1f, 14.0f)
                reflectiveCurveTo(11.1f, 14.5f, 11.1f, 15.0f)
                reflectiveCurveTo(10.6f, 16.0f, 10.1f, 16.0f)
                moveTo(13.8f, 9.5f)
                lineTo(9.9f, 5.6f)
                curveTo(10.2f, 5.9f, 10.6f, 6.0f, 11.1f, 6.0f)
                curveTo(12.1f, 6.0f, 12.9f, 5.2f, 13.1f, 4.2f)
                curveTo(15.4f, 5.2f, 17.6f, 6.6f, 19.3f, 8.4f)
                curveTo(19.2f, 8.6f, 19.1f, 8.7f, 19.1f, 8.9f)
                curveTo(19.1f, 9.4f, 19.6f, 9.9f, 20.1f, 9.9f)
                curveTo(20.3f, 9.9f, 20.4f, 9.9f, 20.5f, 9.8f)
                curveTo(21.0f, 10.4f, 21.4f, 11.1f, 21.8f, 11.8f)
                lineTo(18.3f, 13.8f)
                lineTo(16.6f, 12.1f)
                curveTo(16.9f, 11.8f, 17.1f, 11.3f, 17.1f, 10.8f)
                curveTo(17.1f, 9.7f, 16.2f, 8.8f, 15.1f, 8.8f)
                curveTo(14.6f, 9.0f, 14.1f, 9.2f, 13.8f, 9.5f)
                moveTo(9.5f, 5.2f)
                lineTo(7.3f, 3.0f)
                curveTo(8.0f, 3.0f, 8.6f, 3.1f, 9.2f, 3.2f)
                curveTo(9.1f, 3.5f, 9.1f, 3.7f, 9.1f, 4.0f)
                curveTo(9.1f, 4.4f, 9.2f, 4.9f, 9.5f, 5.2f)
                close()
            }
        }
        .build()
        return _cheeseOff!!
    }

private var _cheeseOff: ImageVector? = null
