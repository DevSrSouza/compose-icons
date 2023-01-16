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

public val MaterialDesignIcons.TableAlert: ImageVector
    get() {
        if (_tableAlert != null) {
            return _tableAlert!!
        }
        _tableAlert = Builder(name = "TableAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 4.0f, 19.0f, 4.89f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 19.11f, 18.11f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 20.0f, 1.0f, 19.11f, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.89f, 1.9f, 4.0f, 3.0f, 4.0f)
                moveTo(3.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                moveTo(11.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                moveTo(3.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                moveTo(11.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                moveTo(23.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                moveTo(23.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _tableAlert!!
    }

private var _tableAlert: ImageVector? = null
