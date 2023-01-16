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

public val MaterialDesignIcons.TableKey: ImageVector
    get() {
        if (_tableKey != null) {
            return _tableKey!!
        }
        _tableKey = Builder(name = "TableKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8f, 17.0f)
                curveTo(16.4f, 15.8f, 15.3f, 15.0f, 14.0f, 15.0f)
                curveTo(12.3f, 15.0f, 11.0f, 16.3f, 11.0f, 18.0f)
                reflectiveCurveTo(12.3f, 21.0f, 14.0f, 21.0f)
                curveTo(15.3f, 21.0f, 16.4f, 20.2f, 16.8f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.8f)
                moveTo(14.0f, 19.0f)
                curveTo(13.4f, 19.0f, 13.0f, 18.5f, 13.0f, 18.0f)
                reflectiveCurveTo(13.4f, 17.0f, 14.0f, 17.0f)
                reflectiveCurveTo(15.0f, 17.5f, 15.0f, 18.0f)
                reflectiveCurveTo(14.6f, 19.0f, 14.0f, 19.0f)
                moveTo(9.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                curveTo(10.9f, 13.8f, 12.4f, 13.0f, 14.0f, 13.0f)
                curveTo(15.1f, 13.0f, 16.1f, 13.4f, 17.0f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.9f, 19.1f, 4.0f, 18.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(9.4f)
                curveTo(9.1f, 19.4f, 9.0f, 18.7f, 9.0f, 18.0f)
                moveTo(12.0f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _tableKey!!
    }

private var _tableKey: ImageVector? = null
