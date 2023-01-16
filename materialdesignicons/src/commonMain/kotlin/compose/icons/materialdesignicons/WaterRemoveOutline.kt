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

public val MaterialDesignIcons.WaterRemoveOutline: ImageVector
    get() {
        if (_waterRemoveOutline != null) {
            return _waterRemoveOutline!!
        }
        _waterRemoveOutline = Builder(name = "WaterRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(12.0f, 18.7f, 12.12f, 19.36f, 12.34f, 20.0f)
                curveTo(12.23f, 20.0f, 12.12f, 20.0f, 12.0f, 20.0f)
                curveTo(8.69f, 20.0f, 6.0f, 17.31f, 6.0f, 14.0f)
                curveTo(6.0f, 10.0f, 12.0f, 3.25f, 12.0f, 3.25f)
                reflectiveCurveTo(16.31f, 8.1f, 17.62f, 12.0f)
                curveTo(16.93f, 12.06f, 16.28f, 12.22f, 15.67f, 12.47f)
                curveTo(15.0f, 10.68f, 13.5f, 8.33f, 12.0f, 6.39f)
                curveTo(10.0f, 8.96f, 8.0f, 12.23f, 8.0f, 14.0f)
                curveTo(8.0f, 16.21f, 9.79f, 18.0f, 12.0f, 18.0f)
                moveTo(21.54f, 15.88f)
                lineTo(20.13f, 14.47f)
                lineTo(18.0f, 16.59f)
                lineTo(15.88f, 14.47f)
                lineTo(14.47f, 15.88f)
                lineTo(16.59f, 18.0f)
                lineTo(14.47f, 20.12f)
                lineTo(15.88f, 21.53f)
                lineTo(18.0f, 19.41f)
                lineTo(20.12f, 21.53f)
                lineTo(21.53f, 20.12f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 15.88f)
                close()
            }
        }
        .build()
        return _waterRemoveOutline!!
    }

private var _waterRemoveOutline: ImageVector? = null
