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

public val MaterialDesignIcons.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.89f, 2.0f, 3.0f, 2.29f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 21.71f, 9.89f, 22.0f, 12.0f, 22.0f)
                curveTo(14.11f, 22.0f, 21.0f, 21.71f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 2.29f, 14.11f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 10.0f)
                curveTo(13.38f, 10.0f, 16.8f, 9.87f, 19.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(16.8f, 14.13f, 13.38f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(7.2f, 14.13f, 5.0f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(7.2f, 9.87f, 10.62f, 10.0f, 12.0f, 10.0f)
                moveTo(12.0f, 4.0f)
                curveTo(15.87f, 4.0f, 19.0f, 4.89f, 19.0f, 6.0f)
                curveTo(19.0f, 7.11f, 15.87f, 8.0f, 12.0f, 8.0f)
                curveTo(8.13f, 8.0f, 5.0f, 7.11f, 5.0f, 6.0f)
                curveTo(5.0f, 4.89f, 8.13f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                curveTo(8.13f, 20.0f, 5.0f, 19.11f, 5.0f, 18.0f)
                curveTo(5.0f, 16.9f, 8.13f, 16.0f, 12.0f, 16.0f)
                curveTo(15.87f, 16.0f, 19.0f, 16.9f, 19.0f, 18.0f)
                curveTo(19.0f, 19.11f, 15.87f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
