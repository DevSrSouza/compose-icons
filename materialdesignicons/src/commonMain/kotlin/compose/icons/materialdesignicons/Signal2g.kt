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

public val MaterialDesignIcons.Signal2g: ImageVector
    get() {
        if (_signal2g != null) {
            return _signal2g!!
        }
        _signal2g = Builder(name = "Signal2g", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 10.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 7.5f)
                verticalLineTo(10.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 13.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(11.0f)
                moveTo(22.0f, 10.5f)
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
            }
        }
        .build()
        return _signal2g!!
    }

private var _signal2g: ImageVector? = null
