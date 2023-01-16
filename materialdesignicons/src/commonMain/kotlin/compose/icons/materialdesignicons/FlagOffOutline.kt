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

public val MaterialDesignIcons.FlagOffOutline: ImageVector
    get() {
        if (_flagOffOutline != null) {
            return _flagOffOutline!!
        }
        _flagOffOutline = Builder(name = "FlagOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.0f, 6.89f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.11f)
                lineTo(12.72f, 14.61f)
                lineTo(13.0f, 16.0f)
                horizontalLineTo(14.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7.0f, 12.0f)
                verticalLineTo(8.89f)
                lineTo(10.11f, 12.0f)
                horizontalLineTo(7.0f)
                moveTo(9.2f, 6.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(14.0f)
                lineTo(14.4f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.2f)
                lineTo(17.2f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.76f)
                lineTo(12.36f, 6.0f)
                horizontalLineTo(9.2f)
                close()
            }
        }
        .build()
        return _flagOffOutline!!
    }

private var _flagOffOutline: ImageVector? = null
