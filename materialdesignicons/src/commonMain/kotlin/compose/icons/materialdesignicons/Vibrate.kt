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

public val MaterialDesignIcons.Vibrate: ImageVector
    get() {
        if (_vibrate != null) {
            return _vibrate!!
        }
        _vibrate = Builder(name = "Vibrate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                moveTo(16.5f, 3.0f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 4.5f)
                verticalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 21.0f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 19.5f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 3.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                moveTo(22.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                moveTo(3.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                moveTo(0.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
