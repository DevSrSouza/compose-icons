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

public val MaterialDesignIcons.LeakOff: ImageVector
    get() {
        if (_leakOff != null) {
            return _leakOff!!
        }
        _leakOff = Builder(name = "LeakOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 3.37f, 7.96f, 3.72f, 7.88f, 4.06f)
                lineTo(9.47f, 5.65f)
                curveTo(9.81f, 4.84f, 10.0f, 3.94f, 10.0f, 3.0f)
                moveTo(3.0f, 4.27f)
                lineTo(5.84f, 7.11f)
                curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(4.61f, 10.0f, 6.09f, 9.45f, 7.27f, 8.54f)
                lineTo(8.7f, 9.97f)
                curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(5.71f, 14.0f, 8.19f, 13.0f, 10.11f, 11.38f)
                lineTo(12.61f, 13.88f)
                curveTo(11.0f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 18.84f, 12.76f, 16.86f, 14.03f, 15.31f)
                lineTo(15.46f, 16.74f)
                curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 19.94f, 16.33f, 18.97f, 16.89f, 18.16f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                lineTo(4.27f, 3.0f)
                lineTo(3.0f, 4.27f)
                moveTo(14.0f, 3.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 4.5f, 11.63f, 5.91f, 11.0f, 7.16f)
                lineTo(12.44f, 8.62f)
                curveTo(13.42f, 7.0f, 14.0f, 5.06f, 14.0f, 3.0f)
                moveTo(19.94f, 16.12f)
                curveTo(20.28f, 16.04f, 20.63f, 16.0f, 21.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(20.06f, 14.0f, 19.16f, 14.19f, 18.34f, 14.5f)
                lineTo(19.94f, 16.12f)
                moveTo(15.38f, 11.56f)
                lineTo(16.84f, 13.0f)
                curveTo(18.09f, 12.37f, 19.5f, 12.0f, 21.0f, 12.0f)
                verticalLineTo(10.0f)
                curveTo(18.94f, 10.0f, 17.0f, 10.58f, 15.38f, 11.56f)
                close()
            }
        }
        .build()
        return _leakOff!!
    }

private var _leakOff: ImageVector? = null
