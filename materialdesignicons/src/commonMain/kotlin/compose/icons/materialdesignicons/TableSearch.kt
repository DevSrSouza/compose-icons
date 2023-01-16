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

public val MaterialDesignIcons.TableSearch: ImageVector
    get() {
        if (_tableSearch != null) {
            return _tableSearch!!
        }
        _tableSearch = Builder(name = "TableSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3f, 17.89f)
                curveTo(20.62f, 15.79f, 20.0f, 13.0f, 17.89f, 11.68f)
                curveTo(15.79f, 10.36f, 13.0f, 11.0f, 11.68f, 13.09f)
                curveTo(10.36f, 15.2f, 11.0f, 18.0f, 13.09f, 19.3f)
                curveTo(14.56f, 20.22f, 16.42f, 20.22f, 17.89f, 19.3f)
                lineTo(21.0f, 22.39f)
                lineTo(22.39f, 21.0f)
                lineTo(19.3f, 17.89f)
                moveTo(17.3f, 17.27f)
                curveTo(16.32f, 18.25f, 14.74f, 18.24f, 13.76f, 17.27f)
                curveTo(12.79f, 16.29f, 12.79f, 14.71f, 13.77f, 13.73f)
                curveTo(14.74f, 12.76f, 16.32f, 12.76f, 17.3f, 13.73f)
                curveTo(18.26f, 14.72f, 18.25f, 16.3f, 17.27f, 17.27f)
                horizontalLineTo(17.3f)
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(10.81f)
                curveTo(10.25f, 19.42f, 9.8f, 18.74f, 9.5f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.18f)
                curveTo(9.34f, 13.29f, 9.61f, 12.61f, 10.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.81f)
                curveTo(11.58f, 10.25f, 12.26f, 9.8f, 13.0f, 9.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                curveTo(19.4f, 10.25f, 19.77f, 10.55f, 20.1f, 10.88f)
                curveTo(20.44f, 11.22f, 20.74f, 11.59f, 21.0f, 12.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 4.0f)
                close()
            }
        }
        .build()
        return _tableSearch!!
    }

private var _tableSearch: ImageVector? = null
