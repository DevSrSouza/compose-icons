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

public val MaterialDesignIcons.FlagOff: ImageVector
    get() {
        if (_flagOff != null) {
            return _flagOff!!
        }
        _flagOff = Builder(name = "FlagOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(14.11f, 16.0f)
                horizontalLineTo(13.0f)
                lineTo(12.72f, 14.61f)
                lineTo(12.11f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(20.0f, 16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.4f)
                lineTo(14.0f, 4.0f)
                horizontalLineTo(7.2f)
                lineTo(19.2f, 16.0f)
                horizontalLineTo(20.0f)
            }
        }
        .build()
        return _flagOff!!
    }

private var _flagOff: ImageVector? = null
