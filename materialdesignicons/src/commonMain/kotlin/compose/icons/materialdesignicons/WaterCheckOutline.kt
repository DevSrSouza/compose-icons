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

public val MaterialDesignIcons.WaterCheckOutline: ImageVector
    get() {
        if (_waterCheckOutline != null) {
            return _waterCheckOutline!!
        }
        _waterCheckOutline = Builder(name = "WaterCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 16.25f)
                lineTo(17.0f, 21.0f)
                lineTo(14.25f, 18.0f)
                lineTo(15.41f, 16.84f)
                lineTo(17.0f, 18.43f)
                lineTo(20.59f, 14.84f)
                lineTo(21.75f, 16.25f)
                moveTo(8.0f, 14.0f)
                curveTo(8.0f, 12.23f, 10.0f, 8.96f, 12.0f, 6.39f)
                curveTo(13.5f, 8.33f, 15.0f, 10.67f, 15.67f, 12.47f)
                curveTo(16.27f, 12.21f, 16.93f, 12.06f, 17.62f, 12.0f)
                curveTo(16.31f, 8.1f, 12.0f, 3.25f, 12.0f, 3.25f)
                reflectiveCurveTo(6.0f, 10.0f, 6.0f, 14.0f)
                curveTo(6.0f, 17.31f, 8.69f, 20.0f, 12.0f, 20.0f)
                curveTo(12.12f, 20.0f, 12.23f, 20.0f, 12.34f, 20.0f)
                curveTo(12.12f, 19.36f, 12.0f, 18.7f, 12.0f, 18.0f)
                curveTo(9.79f, 18.0f, 8.0f, 16.21f, 8.0f, 14.0f)
                close()
            }
        }
        .build()
        return _waterCheckOutline!!
    }

private var _waterCheckOutline: ImageVector? = null