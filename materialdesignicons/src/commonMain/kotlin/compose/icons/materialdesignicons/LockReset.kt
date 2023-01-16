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

public val MaterialDesignIcons.LockReset: ImageVector
    get() {
        if (_lockReset != null) {
            return _lockReset!!
        }
        _lockReset = Builder(name = "LockReset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.63f, 2.0f)
                curveTo(18.16f, 2.0f, 22.64f, 6.5f, 22.64f, 12.0f)
                curveTo(22.64f, 17.5f, 18.16f, 22.0f, 12.63f, 22.0f)
                curveTo(9.12f, 22.0f, 6.05f, 20.18f, 4.26f, 17.43f)
                lineTo(5.84f, 16.18f)
                curveTo(7.25f, 18.47f, 9.76f, 20.0f, 12.64f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.64f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.64f, 4.0f)
                curveTo(8.56f, 4.0f, 5.2f, 7.06f, 4.71f, 11.0f)
                horizontalLineTo(7.47f)
                lineTo(3.73f, 14.73f)
                lineTo(0.0f, 11.0f)
                horizontalLineTo(2.69f)
                curveTo(3.19f, 5.95f, 7.45f, 2.0f, 12.63f, 2.0f)
                moveTo(15.59f, 10.24f)
                curveTo(16.09f, 10.25f, 16.5f, 10.65f, 16.5f, 11.16f)
                verticalLineTo(15.77f)
                curveTo(16.5f, 16.27f, 16.09f, 16.69f, 15.58f, 16.69f)
                horizontalLineTo(10.05f)
                curveTo(9.54f, 16.69f, 9.13f, 16.27f, 9.13f, 15.77f)
                verticalLineTo(11.16f)
                curveTo(9.13f, 10.65f, 9.54f, 10.25f, 10.04f, 10.24f)
                verticalLineTo(9.23f)
                curveTo(10.04f, 7.7f, 11.29f, 6.46f, 12.81f, 6.46f)
                curveTo(14.34f, 6.46f, 15.59f, 7.7f, 15.59f, 9.23f)
                verticalLineTo(10.24f)
                moveTo(12.81f, 7.86f)
                curveTo(12.06f, 7.86f, 11.44f, 8.47f, 11.44f, 9.23f)
                verticalLineTo(10.24f)
                horizontalLineTo(14.19f)
                verticalLineTo(9.23f)
                curveTo(14.19f, 8.47f, 13.57f, 7.86f, 12.81f, 7.86f)
                close()
            }
        }
        .build()
        return _lockReset!!
    }

private var _lockReset: ImageVector? = null
