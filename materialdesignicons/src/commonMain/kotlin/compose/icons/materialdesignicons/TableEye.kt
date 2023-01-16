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

public val MaterialDesignIcons.TableEye: ImageVector
    get() {
        if (_tableEye != null) {
            return _tableEye!!
        }
        _tableEye = Builder(name = "TableEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.88f)
                curveTo(17.56f, 16.88f, 18.0f, 17.32f, 18.0f, 17.88f)
                reflectiveCurveTo(17.56f, 18.88f, 17.0f, 18.88f)
                reflectiveCurveTo(16.0f, 18.43f, 16.0f, 17.88f)
                reflectiveCurveTo(16.44f, 16.88f, 17.0f, 16.88f)
                moveTo(17.0f, 13.88f)
                curveTo(19.73f, 13.88f, 22.06f, 15.54f, 23.0f, 17.88f)
                curveTo(22.06f, 20.22f, 19.73f, 21.88f, 17.0f, 21.88f)
                reflectiveCurveTo(11.94f, 20.22f, 11.0f, 17.88f)
                curveTo(11.94f, 15.54f, 14.27f, 13.88f, 17.0f, 13.88f)
                moveTo(17.0f, 15.38f)
                curveTo(15.62f, 15.38f, 14.5f, 16.5f, 14.5f, 17.88f)
                reflectiveCurveTo(15.62f, 20.38f, 17.0f, 20.38f)
                reflectiveCurveTo(19.5f, 19.26f, 19.5f, 17.88f)
                reflectiveCurveTo(18.38f, 15.38f, 17.0f, 15.38f)
                moveTo(18.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.1f, 2.9f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(9.42f)
                curveTo(9.26f, 18.68f, 9.12f, 18.34f, 9.0f, 18.0f)
                curveTo(9.12f, 17.66f, 9.26f, 17.32f, 9.42f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.97f)
                curveTo(10.55f, 15.11f, 11.23f, 14.37f, 12.0f, 13.76f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.15f)
                curveTo(14.31f, 12.36f, 15.62f, 12.0f, 17.0f, 12.0f)
                curveTo(18.06f, 12.0f, 19.07f, 12.21f, 20.0f, 12.59f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 3.9f, 19.1f, 3.0f, 18.0f, 3.0f)
                moveTo(10.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _tableEye!!
    }

private var _tableEye: ImageVector? = null
