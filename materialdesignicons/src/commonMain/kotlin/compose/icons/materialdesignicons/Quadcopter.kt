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

public val MaterialDesignIcons.Quadcopter: ImageVector
    get() {
        if (_quadcopter != null) {
            return _quadcopter!!
        }
        _quadcopter = Builder(name = "Quadcopter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 1.0f)
                curveTo(8.0f, 1.0f, 10.0f, 3.0f, 10.0f, 5.5f)
                curveTo(10.0f, 6.38f, 9.75f, 7.2f, 9.31f, 7.9f)
                lineTo(9.41f, 8.0f)
                horizontalLineTo(14.59f)
                lineTo(14.69f, 7.9f)
                curveTo(14.25f, 7.2f, 14.0f, 6.38f, 14.0f, 5.5f)
                curveTo(14.0f, 3.0f, 16.0f, 1.0f, 18.5f, 1.0f)
                curveTo(21.0f, 1.0f, 23.0f, 3.0f, 23.0f, 5.5f)
                curveTo(23.0f, 8.0f, 21.0f, 10.0f, 18.5f, 10.0f)
                curveTo(17.62f, 10.0f, 16.8f, 9.75f, 16.1f, 9.31f)
                lineTo(15.0f, 10.41f)
                verticalLineTo(13.59f)
                lineTo(16.1f, 14.69f)
                curveTo(16.8f, 14.25f, 17.62f, 14.0f, 18.5f, 14.0f)
                curveTo(21.0f, 14.0f, 23.0f, 16.0f, 23.0f, 18.5f)
                curveTo(23.0f, 21.0f, 21.0f, 23.0f, 18.5f, 23.0f)
                curveTo(16.0f, 23.0f, 14.0f, 21.0f, 14.0f, 18.5f)
                curveTo(14.0f, 17.62f, 14.25f, 16.8f, 14.69f, 16.1f)
                lineTo(14.59f, 16.0f)
                horizontalLineTo(9.41f)
                lineTo(9.31f, 16.1f)
                curveTo(9.75f, 16.8f, 10.0f, 17.62f, 10.0f, 18.5f)
                curveTo(10.0f, 21.0f, 8.0f, 23.0f, 5.5f, 23.0f)
                curveTo(3.0f, 23.0f, 1.0f, 21.0f, 1.0f, 18.5f)
                curveTo(1.0f, 16.0f, 3.0f, 14.0f, 5.5f, 14.0f)
                curveTo(6.38f, 14.0f, 7.2f, 14.25f, 7.9f, 14.69f)
                lineTo(9.0f, 13.59f)
                verticalLineTo(10.41f)
                lineTo(7.9f, 9.31f)
                curveTo(7.2f, 9.75f, 6.38f, 10.0f, 5.5f, 10.0f)
                curveTo(3.0f, 10.0f, 1.0f, 8.0f, 1.0f, 5.5f)
                curveTo(1.0f, 3.0f, 3.0f, 1.0f, 5.5f, 1.0f)
                moveTo(5.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 3.0f)
                moveTo(5.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 16.0f)
                moveTo(18.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 3.0f)
                moveTo(18.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 16.0f)
                moveTo(3.91f, 17.25f)
                lineTo(5.04f, 17.91f)
                curveTo(5.17f, 17.81f, 5.33f, 17.75f, 5.5f, 17.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.25f, 18.5f)
                lineTo(6.24f, 18.6f)
                lineTo(7.37f, 19.25f)
                lineTo(7.09f, 19.75f)
                lineTo(5.96f, 19.09f)
                curveTo(5.83f, 19.19f, 5.67f, 19.25f, 5.5f, 19.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.75f, 18.5f)
                lineTo(4.76f, 18.4f)
                lineTo(3.63f, 17.75f)
                lineTo(3.91f, 17.25f)
                moveTo(3.63f, 6.25f)
                lineTo(4.76f, 5.6f)
                lineTo(4.75f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.5f, 4.75f)
                curveTo(5.67f, 4.75f, 5.83f, 4.81f, 5.96f, 4.91f)
                lineTo(7.09f, 4.25f)
                lineTo(7.37f, 4.75f)
                lineTo(6.24f, 5.4f)
                lineTo(6.25f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.5f, 6.25f)
                curveTo(5.33f, 6.25f, 5.17f, 6.19f, 5.04f, 6.09f)
                lineTo(3.91f, 6.75f)
                lineTo(3.63f, 6.25f)
                moveTo(16.91f, 4.25f)
                lineTo(18.04f, 4.91f)
                curveTo(18.17f, 4.81f, 18.33f, 4.75f, 18.5f, 4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 19.25f, 5.5f)
                lineTo(19.24f, 5.6f)
                lineTo(20.37f, 6.25f)
                lineTo(20.09f, 6.75f)
                lineTo(18.96f, 6.09f)
                curveTo(18.83f, 6.19f, 18.67f, 6.25f, 18.5f, 6.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 17.75f, 5.5f)
                lineTo(17.76f, 5.4f)
                lineTo(16.63f, 4.75f)
                lineTo(16.91f, 4.25f)
                moveTo(16.63f, 19.25f)
                lineTo(17.75f, 18.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 18.5f, 17.75f)
                curveTo(18.67f, 17.75f, 18.83f, 17.81f, 18.96f, 17.91f)
                lineTo(20.09f, 17.25f)
                lineTo(20.37f, 17.75f)
                lineTo(19.25f, 18.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 18.5f, 19.25f)
                curveTo(18.33f, 19.25f, 18.17f, 19.19f, 18.04f, 19.09f)
                lineTo(16.91f, 19.75f)
                lineTo(16.63f, 19.25f)
                close()
            }
        }
        .build()
        return _quadcopter!!
    }

private var _quadcopter: ImageVector? = null
