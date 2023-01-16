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

public val MaterialDesignIcons.TableRefresh: ImageVector
    get() {
        if (_tableRefresh != null) {
            return _tableRefresh!!
        }
        _tableRefresh = Builder(name = "TableRefresh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22.0f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.0f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16.0f, 18.0f, 16.0f)
                curveTo(16.62f, 16.0f, 15.5f, 17.12f, 15.5f, 18.5f)
                curveTo(15.5f, 19.88f, 16.62f, 21.0f, 18.0f, 21.0f)
                curveTo(18.82f, 21.0f, 19.55f, 20.61f, 20.0f, 20.0f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18.0f, 22.5f)
                curveTo(15.79f, 22.5f, 14.0f, 20.71f, 14.0f, 18.5f)
                curveTo(14.0f, 16.29f, 15.79f, 14.5f, 18.0f, 14.5f)
                moveTo(4.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 3.0f, 20.0f, 3.9f, 20.0f, 5.0f)
                verticalLineTo(12.17f)
                curveTo(19.5f, 12.06f, 19.0f, 12.0f, 18.5f, 12.0f)
                curveTo(17.23f, 12.0f, 16.04f, 12.37f, 15.04f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.18f)
                curveTo(12.06f, 17.5f, 12.0f, 18.0f, 12.0f, 18.5f)
                lineTo(12.0f, 19.0f)
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
                close()
            }
        }
        .build()
        return _tableRefresh!!
    }

private var _tableRefresh: ImageVector? = null
