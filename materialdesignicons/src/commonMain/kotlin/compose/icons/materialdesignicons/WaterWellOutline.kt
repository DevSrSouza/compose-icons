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

public val MaterialDesignIcons.WaterWellOutline: ImageVector
    get() {
        if (_waterWellOutline != null) {
            return _waterWellOutline!!
        }
        _waterWellOutline = Builder(name = "WaterWellOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.62f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.61f)
                curveTo(21.16f, 8.0f, 21.61f, 7.56f, 21.61f, 7.0f)
                curveTo(21.61f, 6.89f, 21.6f, 6.78f, 21.56f, 6.68f)
                lineTo(19.0f, 2.0f)
                horizontalLineTo(5.0f)
                lineTo(2.72f, 6.55f)
                curveTo(2.47f, 7.04f, 2.67f, 7.64f, 3.16f, 7.89f)
                curveTo(3.31f, 7.96f, 3.46f, 8.0f, 3.62f, 8.0f)
                moveTo(6.24f, 4.0f)
                horizontalLineTo(17.76f)
                lineTo(18.76f, 6.0f)
                horizontalLineTo(5.24f)
                lineTo(6.24f, 4.0f)
                moveTo(2.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                moveTo(13.93f, 11.0f)
                curveTo(14.21f, 11.0f, 14.43f, 11.22f, 14.43f, 11.5f)
                curveTo(14.43f, 11.5f, 14.43f, 11.54f, 14.43f, 11.56f)
                lineTo(14.05f, 14.56f)
                curveTo(14.0f, 14.81f, 13.81f, 15.0f, 13.56f, 15.0f)
                horizontalLineTo(10.44f)
                curveTo(10.19f, 15.0f, 10.0f, 14.81f, 9.95f, 14.56f)
                lineTo(9.57f, 11.56f)
                curveTo(9.54f, 11.29f, 9.73f, 11.04f, 10.0f, 11.0f)
                curveTo(10.03f, 11.0f, 10.05f, 11.0f, 10.07f, 11.0f)
                horizontalLineTo(13.93f)
                close()
            }
        }
        .build()
        return _waterWellOutline!!
    }

private var _waterWellOutline: ImageVector? = null
