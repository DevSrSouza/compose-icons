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

public val MaterialDesignIcons.WaterSync: ImageVector
    get() {
        if (_waterSync != null) {
            return _waterSync!!
        }
        _waterSync = Builder(name = "WaterSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.2f)
                curveTo(12.0f, 3.2f, 6.0f, 10.0f, 6.0f, 14.0f)
                curveTo(6.0f, 17.3f, 8.7f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(18.0f, 17.3f, 18.0f, 14.0f)
                curveTo(18.0f, 10.0f, 12.0f, 3.2f, 12.0f, 3.2f)
                moveTo(12.0f, 8.5f)
                verticalLineTo(10.0f)
                curveTo(14.2f, 10.0f, 16.0f, 11.8f, 16.0f, 14.0f)
                curveTo(16.0f, 14.8f, 15.8f, 15.6f, 15.3f, 16.2f)
                lineTo(14.2f, 15.1f)
                curveTo(14.4f, 14.8f, 14.5f, 14.4f, 14.5f, 14.0f)
                curveTo(14.5f, 12.6f, 13.4f, 11.5f, 12.0f, 11.5f)
                verticalLineTo(13.0f)
                lineTo(9.8f, 10.8f)
                lineTo(12.0f, 8.5f)
                moveTo(8.7f, 11.8f)
                lineTo(9.8f, 12.9f)
                curveTo(9.6f, 13.2f, 9.5f, 13.6f, 9.5f, 14.0f)
                curveTo(9.5f, 15.4f, 10.6f, 16.5f, 12.0f, 16.5f)
                verticalLineTo(15.0f)
                lineTo(14.2f, 17.2f)
                lineTo(12.0f, 19.5f)
                verticalLineTo(18.0f)
                curveTo(9.8f, 18.0f, 8.0f, 16.2f, 8.0f, 14.0f)
                curveTo(8.0f, 13.2f, 8.2f, 12.4f, 8.7f, 11.8f)
                close()
            }
        }
        .build()
        return _waterSync!!
    }

private var _waterSync: ImageVector? = null
