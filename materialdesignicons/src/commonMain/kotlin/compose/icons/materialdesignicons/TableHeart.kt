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

public val MaterialDesignIcons.TableHeart: ImageVector
    get() {
        if (_tableHeart != null) {
            return _tableHeart!!
        }
        _tableHeart = Builder(name = "TableHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 3.0f, 20.0f, 3.9f, 20.0f, 5.0f)
                verticalLineTo(12.08f)
                curveTo(18.45f, 11.82f, 16.92f, 12.18f, 15.68f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.08f)
                curveTo(12.97f, 17.68f, 12.97f, 18.35f, 13.08f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 19.0f, 2.0f, 18.11f, 2.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.9f, 2.9f, 3.0f, 4.0f, 3.0f)
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
                moveTo(19.0f, 22.3f)
                lineTo(18.4f, 21.8f)
                curveTo(16.4f, 19.9f, 15.0f, 18.7f, 15.0f, 17.2f)
                curveTo(15.0f, 16.0f, 16.0f, 15.0f, 17.2f, 15.0f)
                curveTo(17.9f, 15.0f, 18.6f, 15.3f, 19.0f, 15.8f)
                curveTo(19.4f, 15.3f, 20.1f, 15.0f, 20.8f, 15.0f)
                curveTo(22.0f, 15.0f, 23.0f, 15.9f, 23.0f, 17.2f)
                curveTo(23.0f, 18.7f, 21.6f, 19.9f, 19.6f, 21.8f)
                lineTo(19.0f, 22.3f)
            }
        }
        .build()
        return _tableHeart!!
    }

private var _tableHeart: ImageVector? = null
