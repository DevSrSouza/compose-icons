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

public val MaterialDesignIcons.TabSearch: ImageVector
    get() {
        if (_tabSearch != null) {
            return _tabSearch!!
        }
        _tabSearch = Builder(name = "TabSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 11.0f)
                curveTo(5.0f, 11.0f, 3.0f, 13.0f, 3.0f, 15.5f)
                curveTo(3.0f, 16.38f, 3.25f, 17.21f, 3.69f, 17.9f)
                lineTo(0.61f, 21.0f)
                lineTo(2.0f, 22.39f)
                lineTo(5.12f, 19.32f)
                curveTo(5.81f, 19.75f, 6.63f, 20.0f, 7.5f, 20.0f)
                curveTo(10.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                reflectiveCurveTo(10.0f, 11.0f, 7.5f, 11.0f)
                moveTo(7.5f, 18.0f)
                curveTo(6.12f, 18.0f, 5.0f, 16.88f, 5.0f, 15.5f)
                reflectiveCurveTo(6.12f, 13.0f, 7.5f, 13.0f)
                reflectiveCurveTo(10.0f, 14.12f, 10.0f, 15.5f)
                reflectiveCurveTo(8.88f, 18.0f, 7.5f, 18.0f)
                moveTo(23.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(23.0f, 20.11f, 22.11f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(10.95f)
                curveTo(11.76f, 20.5f, 12.45f, 19.81f, 12.97f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.82f)
                curveTo(1.77f, 12.0f, 1.0f, 13.66f, 1.0f, 15.5f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 3.9f, 1.9f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 3.0f, 23.0f, 3.9f, 23.0f, 5.0f)
                close()
            }
        }
        .build()
        return _tabSearch!!
    }

private var _tabSearch: ImageVector? = null
