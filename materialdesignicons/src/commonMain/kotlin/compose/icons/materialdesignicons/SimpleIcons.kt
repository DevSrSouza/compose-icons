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

public val MaterialDesignIcons.SimpleIcons: ImageVector
    get() {
        if (_simpleIcons != null) {
            return _simpleIcons!!
        }
        _simpleIcons = Builder(name = "SimpleIcons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 17.0f)
                curveTo(18.25f, 17.88f, 18.07f, 18.74f, 17.71f, 19.53f)
                horizontalLineTo(16.31f)
                curveTo(17.71f, 17.15f, 16.91f, 14.09f, 14.53f, 12.69f)
                curveTo(13.76f, 12.24f, 12.89f, 12.0f, 12.0f, 12.0f)
                curveTo(9.24f, 12.0f, 7.0f, 9.76f, 7.0f, 7.0f)
                curveTo(7.0f, 4.24f, 9.24f, 2.0f, 12.0f, 2.0f)
                curveTo(14.76f, 2.0f, 17.0f, 4.24f, 17.0f, 7.0f)
                horizontalLineTo(15.75f)
                curveTo(15.75f, 4.93f, 14.07f, 3.25f, 12.0f, 3.25f)
                curveTo(9.93f, 3.25f, 8.25f, 4.93f, 8.25f, 7.0f)
                curveTo(8.25f, 9.07f, 9.93f, 10.75f, 12.0f, 10.75f)
                curveTo(15.45f, 10.75f, 18.25f, 13.56f, 18.25f, 17.0f)
                moveTo(6.29f, 19.53f)
                curveTo(5.93f, 18.74f, 5.75f, 17.87f, 5.75f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 17.93f, 7.25f, 18.79f, 7.69f, 19.53f)
                horizontalLineTo(6.29f)
                moveTo(18.25f, 20.75f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.75f)
                verticalLineTo(20.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(15.75f)
                verticalLineTo(15.75f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.75f)
                horizontalLineTo(18.25f)
                moveTo(13.25f, 15.75f)
                horizontalLineTo(10.75f)
                verticalLineTo(20.75f)
                horizontalLineTo(13.25f)
                verticalLineTo(15.75f)
                moveTo(14.44f, 7.07f)
                curveTo(14.4f, 8.4f, 13.33f, 9.47f, 12.0f, 9.5f)
                curveTo(10.62f, 9.46f, 9.53f, 8.32f, 9.57f, 6.94f)
                curveTo(9.6f, 5.61f, 10.67f, 4.53f, 12.0f, 4.5f)
                curveTo(13.38f, 4.54f, 14.47f, 5.68f, 14.44f, 7.07f)
                moveTo(13.25f, 7.0f)
                curveTo(13.25f, 6.31f, 12.69f, 5.75f, 12.0f, 5.75f)
                curveTo(11.31f, 5.75f, 10.75f, 6.31f, 10.75f, 7.0f)
                curveTo(10.75f, 7.69f, 11.31f, 8.25f, 12.0f, 8.25f)
                curveTo(12.69f, 8.25f, 13.25f, 7.69f, 13.25f, 7.0f)
                close()
            }
        }
        .build()
        return _simpleIcons!!
    }

private var _simpleIcons: ImageVector? = null
