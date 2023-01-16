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

public val MaterialDesignIcons.AllInclusiveBoxOutline: ImageVector
    get() {
        if (_allInclusiveBoxOutline != null) {
            return _allInclusiveBoxOutline!!
        }
        _allInclusiveBoxOutline = Builder(name = "AllInclusiveBoxOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 13.84f, 17.5f, 15.34f, 15.66f, 15.34f)
                curveTo(14.77f, 15.34f, 13.94f, 15.0f, 13.31f, 14.36f)
                lineTo(12.71f, 13.76f)
                lineTo(13.77f, 12.71f)
                curveTo(14.04f, 13.0f, 14.37f, 13.3f, 14.37f, 13.3f)
                curveTo(14.71f, 13.65f, 15.18f, 13.84f, 15.67f, 13.84f)
                curveTo(16.68f, 13.84f, 17.5f, 13.0f, 17.5f, 12.0f)
                reflectiveCurveTo(16.68f, 10.16f, 15.67f, 10.16f)
                curveTo(15.18f, 10.16f, 14.71f, 10.36f, 14.37f, 10.7f)
                lineTo(10.7f, 14.36f)
                curveTo(10.07f, 15.0f, 9.23f, 15.34f, 8.34f, 15.34f)
                curveTo(6.5f, 15.34f, 5.0f, 13.84f, 5.0f, 12.0f)
                reflectiveCurveTo(6.5f, 8.66f, 8.34f, 8.66f)
                curveTo(9.23f, 8.66f, 10.07f, 9.0f, 10.7f, 9.64f)
                lineTo(11.29f, 10.24f)
                lineTo(10.23f, 11.3f)
                lineTo(9.64f, 10.7f)
                curveTo(9.29f, 10.36f, 8.83f, 10.16f, 8.34f, 10.16f)
                curveTo(7.32f, 10.16f, 6.5f, 11.0f, 6.5f, 12.0f)
                reflectiveCurveTo(7.32f, 13.84f, 8.34f, 13.84f)
                curveTo(8.83f, 13.84f, 9.29f, 13.65f, 9.64f, 13.3f)
                lineTo(13.31f, 9.64f)
                curveTo(13.94f, 9.0f, 14.77f, 8.66f, 15.66f, 8.66f)
                curveTo(17.5f, 8.66f, 19.0f, 10.16f, 19.0f, 12.0f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.11f, 20.11f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                moveTo(19.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _allInclusiveBoxOutline!!
    }

private var _allInclusiveBoxOutline: ImageVector? = null
