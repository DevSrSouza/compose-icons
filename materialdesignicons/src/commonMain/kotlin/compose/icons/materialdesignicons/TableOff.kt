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

public val MaterialDesignIcons.TableOff: ImageVector
    get() {
        if (_tableOff != null) {
            return _tableOff!!
        }
        _tableOff = Builder(name = "TableOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.22f, 5.11f)
                curveTo(3.08f, 5.38f, 3.0f, 5.68f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.11f, 3.9f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10.11f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.11f)
                lineTo(10.11f, 12.0f)
                moveTo(11.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                moveTo(13.0f, 18.0f)
                verticalLineTo(14.89f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 9.8f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 4.0f, 21.0f, 4.89f, 21.0f, 6.0f)
                verticalLineTo(17.8f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.8f)
                close()
            }
        }
        .build()
        return _tableOff!!
    }

private var _tableOff: ImageVector? = null
