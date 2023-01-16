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

public val MaterialDesignIcons.TableRemove: ImageVector
    get() {
        if (_tableRemove != null) {
            return _tableRemove!!
        }
        _tableRemove = Builder(name = "TableRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.46f, 15.88f)
                lineTo(16.88f, 14.46f)
                lineTo(19.0f, 16.59f)
                lineTo(21.12f, 14.46f)
                lineTo(22.54f, 15.88f)
                lineTo(20.41f, 18.0f)
                lineTo(22.54f, 20.12f)
                lineTo(21.12f, 21.54f)
                lineTo(19.0f, 19.41f)
                lineTo(16.88f, 21.54f)
                lineTo(15.46f, 20.12f)
                lineTo(17.59f, 18.0f)
                lineTo(15.46f, 15.88f)
                moveTo(4.0f, 3.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 5.0f)
                verticalLineTo(12.08f)
                curveTo(18.45f, 11.82f, 16.92f, 12.18f, 15.68f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.08f)
                curveTo(12.97f, 17.68f, 12.97f, 18.35f, 13.08f, 19.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 17.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 3.0f)
                moveTo(4.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                moveTo(4.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _tableRemove!!
    }

private var _tableRemove: ImageVector? = null
