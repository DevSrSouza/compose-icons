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

public val MaterialDesignIcons.Signal5g: ImageVector
    get() {
        if (_signal5g != null) {
            return _signal5g!!
        }
        _signal5g = Builder(name = "Signal5g", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 7.5f)
                verticalLineTo(16.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 19.5f)
                horizontalLineTo(19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 16.5f)
                moveTo(10.0f, 4.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                lineTo(3.0f, 13.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 18.0f)
                verticalLineTo(12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 10.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _signal5g!!
    }

private var _signal5g: ImageVector? = null
