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

public val MaterialDesignIcons.LeafCircleOutline: ImageVector
    get() {
        if (_leafCircleOutline != null) {
            return _leafCircleOutline!!
        }
        _leafCircleOutline = Builder(name = "LeafCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.04f, 16.34f)
                curveTo(9.05f, 13.83f, 10.19f, 10.96f, 14.5f, 10.0f)
                curveTo(14.5f, 10.0f, 9.5f, 10.0f, 7.88f, 14.63f)
                curveTo(7.88f, 14.63f, 7.0f, 13.75f, 7.0f, 12.75f)
                reflectiveCurveTo(8.0f, 9.63f, 10.5f, 9.13f)
                curveTo(11.21f, 9.0f, 12.0f, 8.87f, 12.78f, 8.76f)
                curveTo(14.75f, 8.5f, 16.64f, 8.22f, 17.0f, 7.5f)
                curveTo(17.0f, 7.5f, 15.5f, 16.0f, 10.0f, 16.0f)
                curveTo(9.82f, 16.0f, 9.57f, 15.94f, 9.33f, 15.85f)
                lineTo(8.86f, 17.0f)
                lineTo(7.91f, 16.67f)
                lineTo(8.04f, 16.34f)
                moveTo(12.0f, 4.0f)
                curveTo(16.41f, 4.0f, 20.0f, 7.59f, 20.0f, 12.0f)
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(4.0f, 16.41f, 4.0f, 12.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _leafCircleOutline!!
    }

private var _leafCircleOutline: ImageVector? = null
