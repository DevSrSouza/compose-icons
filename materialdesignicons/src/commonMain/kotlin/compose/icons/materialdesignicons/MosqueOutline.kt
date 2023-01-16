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

public val MaterialDesignIcons.MosqueOutline: ImageVector
    get() {
        if (_mosqueOutline != null) {
            return _mosqueOutline!!
        }
        _mosqueOutline = Builder(name = "MosqueOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                curveTo(24.0f, 5.9f, 22.0f, 4.0f, 22.0f, 4.0f)
                reflectiveCurveTo(20.0f, 5.9f, 20.0f, 7.0f)
                curveTo(20.0f, 7.7f, 20.4f, 8.4f, 21.0f, 8.7f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 10.1f, 18.3f, 9.3f, 17.5f, 9.1f)
                curveTo(17.8f, 8.5f, 18.0f, 7.9f, 18.0f, 7.1f)
                curveTo(18.0f, 5.8f, 17.4f, 4.6f, 16.3f, 3.9f)
                lineTo(12.0f, 1.0f)
                lineTo(7.7f, 3.8f)
                curveTo(6.7f, 4.6f, 6.0f, 5.8f, 6.0f, 7.1f)
                curveTo(6.0f, 7.8f, 6.2f, 8.5f, 6.6f, 9.1f)
                curveTo(5.7f, 9.3f, 5.0f, 10.1f, 5.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.7f)
                curveTo(3.6f, 8.4f, 4.0f, 7.7f, 4.0f, 7.0f)
                curveTo(4.0f, 5.9f, 2.0f, 4.0f, 2.0f, 4.0f)
                reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f)
                curveTo(0.0f, 7.7f, 0.4f, 8.4f, 1.0f, 8.7f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 16.5f, 11.4f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(13.0f, 16.5f, 13.0f, 17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(8.7f)
                curveTo(23.6f, 8.4f, 24.0f, 7.7f, 24.0f, 7.0f)
                moveTo(8.9f, 5.5f)
                lineTo(12.0f, 3.4f)
                lineTo(15.1f, 5.5f)
                curveTo(15.7f, 5.9f, 16.0f, 6.4f, 16.0f, 7.1f)
                curveTo(16.0f, 8.1f, 15.1f, 9.0f, 14.1f, 9.0f)
                horizontalLineTo(9.9f)
                curveTo(8.9f, 9.0f, 8.0f, 8.1f, 8.0f, 7.1f)
                curveTo(8.0f, 6.4f, 8.3f, 5.9f, 8.9f, 5.5f)
                moveTo(21.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 15.4f, 13.6f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(9.0f, 15.4f, 9.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _mosqueOutline!!
    }

private var _mosqueOutline: ImageVector? = null
