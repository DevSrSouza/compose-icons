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

public val MaterialDesignIcons.ZWave: ImageVector
    get() {
        if (_zWave != null) {
            return _zWave!!
        }
        _zWave = Builder(name = "ZWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3f, 10.58f)
                curveTo(13.14f, 10.58f, 10.6f, 13.13f, 10.6f, 16.28f)
                curveTo(10.6f, 19.43f, 13.15f, 22.0f, 16.3f, 22.0f)
                curveTo(19.45f, 22.0f, 22.0f, 19.43f, 22.0f, 16.28f)
                curveTo(22.0f, 13.13f, 19.45f, 10.58f, 16.3f, 10.58f)
                moveTo(18.0f, 19.08f)
                horizontalLineTo(13.19f)
                lineTo(15.81f, 15.0f)
                horizontalLineTo(13.31f)
                lineTo(14.4f, 13.23f)
                horizontalLineTo(19.18f)
                lineTo(16.63f, 17.28f)
                horizontalLineTo(19.18f)
                lineTo(18.0f, 19.08f)
                moveTo(16.3f, 3.93f)
                verticalLineTo(2.0f)
                curveTo(8.41f, 2.0f, 2.0f, 8.42f, 2.0f, 16.31f)
                horizontalLineTo(3.92f)
                curveTo(3.94f, 9.46f, 9.5f, 3.93f, 16.3f, 3.93f)
                moveTo(16.3f, 7.74f)
                verticalLineTo(5.82f)
                curveTo(10.5f, 5.82f, 5.81f, 10.53f, 5.81f, 16.31f)
                horizontalLineTo(7.73f)
                curveTo(7.75f, 11.58f, 11.59f, 7.74f, 16.3f, 7.74f)
            }
        }
        .build()
        return _zWave!!
    }

private var _zWave: ImageVector? = null
