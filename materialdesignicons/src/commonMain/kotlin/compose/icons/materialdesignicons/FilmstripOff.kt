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

public val MaterialDesignIcons.FilmstripOff: ImageVector
    get() {
        if (_filmstripOff != null) {
            return _filmstripOff!!
        }
        _filmstripOff = Builder(name = "FilmstripOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(21.0f, 21.72f)
                lineTo(19.73f, 23.0f)
                lineTo(16.0f, 19.27f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.27f)
                lineTo(1.0f, 4.27f)
                moveTo(18.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 15.0f)
                horizontalLineTo(16.82f)
                lineTo(6.82f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.18f)
                lineTo(18.0f, 16.18f)
                verticalLineTo(15.0f)
                moveTo(8.0f, 13.0f)
                verticalLineTo(11.27f)
                lineTo(7.73f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                moveTo(6.0f, 3.0f)
                verticalLineTo(4.18f)
                lineTo(4.82f, 3.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _filmstripOff!!
    }

private var _filmstripOff: ImageVector? = null
