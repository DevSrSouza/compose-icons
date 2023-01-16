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

public val MaterialDesignIcons.LedOn: ImageVector
    get() {
        if (_ledOn != null) {
            return _ledOn!!
        }
        _ledOn = Builder(name = "LedOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 0.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(11.0f)
                moveTo(18.3f, 2.29f)
                lineTo(15.24f, 5.29f)
                lineTo(16.64f, 6.71f)
                lineTo(19.7f, 3.71f)
                lineTo(18.3f, 2.29f)
                moveTo(5.71f, 2.29f)
                lineTo(4.29f, 3.71f)
                lineTo(7.29f, 6.71f)
                lineTo(8.71f, 5.29f)
                lineTo(5.71f, 2.29f)
                moveTo(12.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 6.0f)
                moveTo(2.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                moveTo(18.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _ledOn!!
    }

private var _ledOn: ImageVector? = null
