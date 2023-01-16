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

public val MaterialDesignIcons.WaterOpacity: ImageVector
    get() {
        if (_waterOpacity != null) {
            return _waterOpacity!!
        }
        _waterOpacity = Builder(name = "WaterOpacity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.61f)
                curveTo(17.85f, 12.71f, 18.0f, 13.39f, 18.0f, 14.0f)
                horizontalLineTo(16.0f)
                moveTo(15.58f, 8.0f)
                curveTo(15.12f, 7.29f, 14.65f, 6.61f, 14.2f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.58f)
                moveTo(16.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 8.68f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.74f)
                curveTo(16.5f, 9.56f, 16.26f, 9.11f, 16.0f, 8.68f)
                moveTo(12.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.73f)
                curveTo(12.9f, 4.26f, 12.0f, 3.25f, 12.0f, 3.25f)
                reflectiveCurveTo(6.0f, 10.0f, 6.0f, 14.0f)
                curveTo(6.0f, 17.31f, 8.69f, 20.0f, 12.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                moveTo(14.0f, 19.65f)
                curveTo(14.75f, 19.39f, 15.42f, 19.0f, 16.0f, 18.46f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.65f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                moveTo(16.0f, 18.0f)
                horizontalLineTo(16.46f)
                curveTo(17.0f, 17.42f, 17.39f, 16.75f, 17.65f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _waterOpacity!!
    }

private var _waterOpacity: ImageVector? = null
