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

public val MaterialDesignIcons.CogBox: ImageVector
    get() {
        if (_cogBox != null) {
            return _cogBox!!
        }
        _cogBox = Builder(name = "CogBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 12.0f)
                curveTo(17.25f, 12.23f, 17.23f, 12.46f, 17.2f, 12.68f)
                lineTo(18.68f, 13.84f)
                curveTo(18.81f, 13.95f, 18.85f, 14.13f, 18.76f, 14.29f)
                lineTo(17.36f, 16.71f)
                curveTo(17.27f, 16.86f, 17.09f, 16.92f, 16.93f, 16.86f)
                lineTo(15.19f, 16.16f)
                curveTo(14.83f, 16.44f, 14.43f, 16.67f, 14.0f, 16.85f)
                lineTo(13.75f, 18.7f)
                curveTo(13.72f, 18.87f, 13.57f, 19.0f, 13.4f, 19.0f)
                horizontalLineTo(10.6f)
                curveTo(10.43f, 19.0f, 10.28f, 18.87f, 10.25f, 18.7f)
                lineTo(10.0f, 16.85f)
                curveTo(9.56f, 16.67f, 9.17f, 16.44f, 8.81f, 16.16f)
                lineTo(7.07f, 16.86f)
                curveTo(6.91f, 16.92f, 6.73f, 16.86f, 6.64f, 16.71f)
                lineTo(5.24f, 14.29f)
                curveTo(5.15f, 14.13f, 5.19f, 13.95f, 5.32f, 13.84f)
                lineTo(6.8f, 12.68f)
                curveTo(6.77f, 12.46f, 6.75f, 12.23f, 6.75f, 12.0f)
                curveTo(6.75f, 11.77f, 6.77f, 11.54f, 6.8f, 11.32f)
                lineTo(5.32f, 10.16f)
                curveTo(5.19f, 10.05f, 5.15f, 9.86f, 5.24f, 9.71f)
                lineTo(6.64f, 7.29f)
                curveTo(6.73f, 7.13f, 6.91f, 7.07f, 7.07f, 7.13f)
                lineTo(8.81f, 7.84f)
                curveTo(9.17f, 7.56f, 9.56f, 7.32f, 10.0f, 7.15f)
                lineTo(10.25f, 5.29f)
                curveTo(10.28f, 5.13f, 10.43f, 5.0f, 10.6f, 5.0f)
                horizontalLineTo(13.4f)
                curveTo(13.57f, 5.0f, 13.72f, 5.13f, 13.75f, 5.29f)
                lineTo(14.0f, 7.15f)
                curveTo(14.43f, 7.32f, 14.83f, 7.56f, 15.19f, 7.84f)
                lineTo(16.93f, 7.13f)
                curveTo(17.09f, 7.07f, 17.27f, 7.13f, 17.36f, 7.29f)
                lineTo(18.76f, 9.71f)
                curveTo(18.85f, 9.86f, 18.81f, 10.05f, 18.68f, 10.16f)
                lineTo(17.2f, 11.32f)
                curveTo(17.23f, 11.54f, 17.25f, 11.77f, 17.25f, 12.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(12.0f, 10.0f)
                curveTo(10.89f, 10.0f, 10.0f, 10.89f, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                curveTo(14.0f, 10.89f, 13.1f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cogBox!!
    }

private var _cogBox: ImageVector? = null
