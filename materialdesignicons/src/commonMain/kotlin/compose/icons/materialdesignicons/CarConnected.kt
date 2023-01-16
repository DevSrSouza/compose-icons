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

public val MaterialDesignIcons.CarConnected: ImageVector
    get() {
        if (_carConnected != null) {
            return _carConnected!!
        }
        _carConnected = Builder(name = "CarConnected", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 14.0f)
                horizontalLineTo(19.0f)
                lineTo(17.5f, 9.5f)
                horizontalLineTo(6.5f)
                lineTo(5.0f, 14.0f)
                moveTo(17.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 19.0f)
                moveTo(6.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 19.0f)
                moveTo(18.92f, 9.0f)
                lineTo(21.0f, 15.0f)
                verticalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 24.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 24.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 23.0f)
                verticalLineTo(15.0f)
                lineTo(5.08f, 9.0f)
                curveTo(5.28f, 8.42f, 5.85f, 8.0f, 6.5f, 8.0f)
                horizontalLineTo(17.5f)
                curveTo(18.15f, 8.0f, 18.72f, 8.42f, 18.92f, 9.0f)
                moveTo(12.0f, 0.0f)
                curveTo(14.12f, 0.0f, 16.15f, 0.86f, 17.65f, 2.35f)
                lineTo(16.23f, 3.77f)
                curveTo(15.11f, 2.65f, 13.58f, 2.0f, 12.0f, 2.0f)
                curveTo(10.42f, 2.0f, 8.89f, 2.65f, 7.77f, 3.77f)
                lineTo(6.36f, 2.35f)
                curveTo(7.85f, 0.86f, 9.88f, 0.0f, 12.0f, 0.0f)
                moveTo(12.0f, 4.0f)
                curveTo(13.06f, 4.0f, 14.07f, 4.44f, 14.82f, 5.18f)
                lineTo(13.4f, 6.6f)
                curveTo(13.03f, 6.23f, 12.53f, 6.0f, 12.0f, 6.0f)
                curveTo(11.5f, 6.0f, 10.97f, 6.23f, 10.6f, 6.6f)
                lineTo(9.18f, 5.18f)
                curveTo(9.93f, 4.44f, 10.94f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _carConnected!!
    }

private var _carConnected: ImageVector? = null
