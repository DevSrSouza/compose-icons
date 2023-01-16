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

public val MaterialDesignIcons.RepeatOff: ImageVector
    get() {
        if (_repeatOff != null) {
            return _repeatOff!!
        }
        _repeatOff = Builder(name = "RepeatOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(15.73f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                lineTo(3.0f, 18.0f)
                lineTo(7.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.73f)
                lineTo(7.0f, 10.27f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.27f)
                lineTo(2.0f, 5.27f)
                moveTo(17.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.18f)
                lineTo(17.0f, 15.18f)
                verticalLineTo(13.0f)
                moveTo(17.0f, 5.0f)
                verticalLineTo(2.0f)
                lineTo(21.0f, 6.0f)
                lineTo(17.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.82f)
                lineTo(6.82f, 5.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _repeatOff!!
    }

private var _repeatOff: ImageVector? = null
