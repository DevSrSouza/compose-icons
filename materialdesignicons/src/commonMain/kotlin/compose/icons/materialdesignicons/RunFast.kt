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

public val MaterialDesignIcons.RunFast: ImageVector
    get() {
        if (_runFast != null) {
            return _runFast!!
        }
        _runFast = Builder(name = "RunFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 5.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.5f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.5f, 1.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.5f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.5f, 5.5f)
                moveTo(12.9f, 19.4f)
                lineTo(13.9f, 15.0f)
                lineTo(16.0f, 17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.5f)
                lineTo(15.9f, 13.5f)
                lineTo(16.5f, 10.5f)
                curveTo(17.89f, 12.09f, 19.89f, 13.0f, 22.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(20.24f, 11.03f, 18.6f, 10.11f, 17.7f, 8.6f)
                lineTo(16.7f, 7.0f)
                curveTo(16.34f, 6.4f, 15.7f, 6.0f, 15.0f, 6.0f)
                curveTo(14.7f, 6.0f, 14.5f, 6.1f, 14.2f, 6.1f)
                lineTo(9.0f, 8.3f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.6f)
                lineTo(12.8f, 8.9f)
                lineTo(11.2f, 17.0f)
                lineTo(6.3f, 16.0f)
                lineTo(5.9f, 18.0f)
                lineTo(12.9f, 19.4f)
                moveTo(4.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                moveTo(5.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                moveTo(3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _runFast!!
    }

private var _runFast: ImageVector? = null
