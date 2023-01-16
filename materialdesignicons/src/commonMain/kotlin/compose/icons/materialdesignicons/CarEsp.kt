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

public val MaterialDesignIcons.CarEsp: ImageVector
    get() {
        if (_carEsp != null) {
            return _carEsp!!
        }
        _carEsp = Builder(name = "CarEsp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.31f, 6.0f)
                curveTo(6.95f, 4.16f, 9.34f, 3.0f, 12.0f, 3.0f)
                curveTo(14.66f, 3.0f, 17.05f, 4.16f, 18.69f, 6.0f)
                horizontalLineTo(15.58f)
                curveTo(14.53f, 5.37f, 13.31f, 5.0f, 12.0f, 5.0f)
                curveTo(10.69f, 5.0f, 9.47f, 5.37f, 8.42f, 6.0f)
                horizontalLineTo(5.31f)
                moveTo(14.4f, 9.6f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.2f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 9.6f, 9.6f)
                verticalLineTo(11.2f)
                curveTo(9.6f, 12.08f, 10.32f, 12.8f, 11.2f, 12.8f)
                horizontalLineTo(12.8f)
                verticalLineTo(14.4f)
                horizontalLineTo(9.6f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.8f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 14.4f, 14.4f)
                verticalLineTo(12.8f)
                curveTo(14.4f, 11.92f, 13.68f, 11.2f, 12.8f, 11.2f)
                horizontalLineTo(11.2f)
                verticalLineTo(9.6f)
                horizontalLineTo(14.4f)
                moveTo(18.4f, 8.0f)
                horizontalLineTo(15.2f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.8f)
                verticalLineTo(12.8f)
                horizontalLineTo(18.4f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 20.0f, 11.2f)
                verticalLineTo(9.6f)
                curveTo(20.0f, 8.72f, 19.28f, 8.0f, 18.4f, 8.0f)
                moveTo(18.4f, 11.2f)
                horizontalLineTo(16.8f)
                verticalLineTo(9.6f)
                horizontalLineTo(18.4f)
                verticalLineTo(11.2f)
                moveTo(8.8f, 9.6f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.8f)
                verticalLineTo(14.4f)
                horizontalLineTo(5.6f)
                verticalLineTo(12.8f)
                horizontalLineTo(8.8f)
                verticalLineTo(11.2f)
                horizontalLineTo(5.6f)
                verticalLineTo(9.6f)
                horizontalLineTo(8.8f)
                moveTo(15.58f, 18.0f)
                curveTo(14.53f, 18.63f, 13.31f, 19.0f, 12.0f, 19.0f)
                curveTo(10.69f, 19.0f, 9.47f, 18.63f, 8.42f, 18.0f)
                horizontalLineTo(5.31f)
                curveTo(6.95f, 19.84f, 9.34f, 21.0f, 12.0f, 21.0f)
                curveTo(14.66f, 21.0f, 17.05f, 19.84f, 18.69f, 18.0f)
                horizontalLineTo(15.58f)
                moveTo(20.5f, 3.5f)
                lineTo(19.42f, 4.58f)
                curveTo(21.32f, 6.5f, 22.5f, 9.11f, 22.5f, 12.0f)
                curveTo(22.5f, 14.9f, 21.32f, 17.5f, 19.42f, 19.42f)
                lineTo(20.5f, 20.5f)
                curveTo(22.66f, 18.31f, 24.0f, 15.31f, 24.0f, 12.0f)
                curveTo(24.0f, 8.69f, 22.66f, 5.69f, 20.5f, 3.5f)
                moveTo(4.58f, 4.58f)
                lineTo(3.5f, 3.5f)
                curveTo(1.34f, 5.69f, 0.0f, 8.69f, 0.0f, 12.0f)
                curveTo(0.0f, 15.31f, 1.34f, 18.31f, 3.5f, 20.5f)
                lineTo(4.58f, 19.42f)
                curveTo(2.68f, 17.5f, 1.5f, 14.9f, 1.5f, 12.0f)
                curveTo(1.5f, 9.11f, 2.68f, 6.5f, 4.58f, 4.58f)
                close()
            }
        }
        .build()
        return _carEsp!!
    }

private var _carEsp: ImageVector? = null
