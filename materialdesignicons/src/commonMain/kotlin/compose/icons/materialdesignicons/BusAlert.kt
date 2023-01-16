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

public val MaterialDesignIcons.BusAlert: ImageVector
    get() {
        if (_busAlert != null) {
            return _busAlert!!
        }
        _busAlert = Builder(name = "BusAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 23.0f, 8.0f)
                curveTo(23.0f, 11.53f, 20.39f, 14.45f, 17.0f, 14.93f)
                verticalLineTo(18.0f)
                curveTo(17.0f, 18.84f, 16.65f, 19.58f, 15.96f, 20.2f)
                verticalLineTo(22.0f)
                curveTo(15.96f, 22.27f, 15.87f, 22.5f, 15.68f, 22.71f)
                curveTo(15.5f, 22.91f, 15.26f, 23.0f, 15.0f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(13.71f, 23.0f, 13.47f, 22.91f, 13.27f, 22.71f)
                curveTo(13.06f, 22.5f, 12.96f, 22.27f, 12.96f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.04f)
                verticalLineTo(22.0f)
                curveTo(5.04f, 22.27f, 4.94f, 22.5f, 4.73f, 22.71f)
                curveTo(4.53f, 22.91f, 4.29f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(3.0f)
                curveTo(2.74f, 23.0f, 2.5f, 22.91f, 2.32f, 22.71f)
                curveTo(2.13f, 22.5f, 2.04f, 22.27f, 2.04f, 22.0f)
                verticalLineTo(20.2f)
                curveTo(1.35f, 19.58f, 1.0f, 18.84f, 1.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(1.0f, 6.42f, 1.7f, 5.35f, 3.07f, 4.8f)
                curveTo(4.44f, 4.26f, 6.42f, 4.0f, 9.0f, 4.0f)
                lineTo(10.23f, 4.03f)
                curveTo(11.5f, 2.2f, 13.61f, 1.0f, 16.0f, 1.0f)
                moveTo(16.0f, 3.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.0f, 3.0f)
                moveTo(15.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                moveTo(15.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                moveTo(3.0f, 13.0f)
                horizontalLineTo(11.09f)
                curveTo(9.8f, 11.72f, 9.0f, 9.96f, 9.0f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                moveTo(4.5f, 16.0f)
                curveTo(3.69f, 16.0f, 3.0f, 16.67f, 3.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 19.0f)
                curveTo(5.35f, 19.0f, 6.0f, 18.33f, 6.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 16.0f)
                moveTo(13.5f, 16.0f)
                curveTo(12.65f, 16.0f, 12.0f, 16.67f, 12.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 19.0f)
                curveTo(14.31f, 19.0f, 15.0f, 18.33f, 15.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 16.0f)
                close()
            }
        }
        .build()
        return _busAlert!!
    }

private var _busAlert: ImageVector? = null
