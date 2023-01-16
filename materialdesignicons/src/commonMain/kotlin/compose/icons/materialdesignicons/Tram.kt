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

public val MaterialDesignIcons.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.94f)
                verticalLineTo(8.5f)
                curveTo(19.0f, 5.71f, 16.39f, 5.1f, 13.0f, 5.0f)
                lineTo(13.75f, 3.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(11.75f)
                lineTo(11.0f, 5.0f)
                curveTo(7.86f, 5.11f, 5.0f, 5.73f, 5.0f, 8.5f)
                verticalLineTo(16.94f)
                curveTo(5.0f, 18.39f, 6.19f, 19.6f, 7.59f, 19.91f)
                lineTo(6.0f, 21.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.23f)
                lineTo(10.23f, 20.0f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.5f)
                lineTo(16.5f, 20.0f)
                horizontalLineTo(16.42f)
                curveTo(18.11f, 20.0f, 19.0f, 18.63f, 19.0f, 16.94f)
                moveTo(12.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 18.5f)
                moveTo(17.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
