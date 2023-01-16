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

public val MaterialDesignIcons.ScaleOff: ImageVector
    get() {
        if (_scaleOff != null) {
            return _scaleOff!!
        }
        _scaleOff = Builder(name = "ScaleOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.11f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.89f)
                lineTo(12.11f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.89f)
                lineTo(10.31f, 12.2f)
                arcTo(7.92f, 7.92f, 0.0f, false, false, 7.09f, 13.68f)
                lineTo(8.46f, 15.06f)
                lineTo(7.05f, 16.47f)
                lineTo(5.68f, 15.1f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 4.06f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 8.68f, 10.57f)
                lineTo(3.85f, 5.74f)
                lineTo(2.0f, 5.0f)
                verticalLineTo(3.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                moveTo(21.91f, 18.71f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 14.0f, 10.2f)
                verticalLineTo(8.2f)
                lineTo(22.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.2f)
                moveTo(12.0f, 18.0f)
                arcTo(1.84f, 1.84f, 0.0f, false, false, 11.12f, 18.21f)
                lineTo(7.27f, 20.0f)
                lineTo(11.12f, 21.79f)
                arcTo(1.84f, 1.84f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _scaleOff!!
    }

private var _scaleOff: ImageVector? = null
