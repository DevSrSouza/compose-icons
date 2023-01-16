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

public val MaterialDesignIcons.MagnifyRemoveOutline: ImageVector
    get() {
        if (_magnifyRemoveOutline != null) {
            return _magnifyRemoveOutline!!
        }
        _magnifyRemoveOutline = Builder(name = "MagnifyRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.0f)
                horizontalLineTo(14.71f)
                lineTo(14.43f, 13.73f)
                curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f)
                curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f)
                reflectiveCurveTo(3.0f, 5.91f, 3.0f, 9.5f)
                reflectiveCurveTo(5.91f, 16.0f, 9.5f, 16.0f)
                curveTo(11.11f, 16.0f, 12.59f, 15.41f, 13.73f, 14.43f)
                lineTo(14.0f, 14.71f)
                verticalLineTo(15.5f)
                lineTo(19.0f, 20.5f)
                lineTo(20.5f, 19.0f)
                lineTo(15.5f, 14.0f)
                moveTo(9.5f, 14.0f)
                curveTo(7.0f, 14.0f, 5.0f, 12.0f, 5.0f, 9.5f)
                reflectiveCurveTo(7.0f, 5.0f, 9.5f, 5.0f)
                reflectiveCurveTo(14.0f, 7.0f, 14.0f, 9.5f)
                reflectiveCurveTo(12.0f, 14.0f, 9.5f, 14.0f)
                moveTo(10.91f, 11.62f)
                lineTo(9.5f, 10.21f)
                lineTo(8.09f, 11.62f)
                lineTo(7.38f, 10.91f)
                lineTo(8.79f, 9.5f)
                lineTo(7.38f, 8.09f)
                lineTo(8.09f, 7.38f)
                lineTo(9.5f, 8.79f)
                lineTo(10.91f, 7.38f)
                lineTo(11.62f, 8.09f)
                lineTo(10.21f, 9.5f)
                lineTo(11.62f, 10.91f)
                lineTo(10.91f, 11.62f)
                close()
            }
        }
        .build()
        return _magnifyRemoveOutline!!
    }

private var _magnifyRemoveOutline: ImageVector? = null
