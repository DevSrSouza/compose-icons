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

public val MaterialDesignIcons.Bash: ImageVector
    get() {
        if (_bash != null) {
            return _bash!!
        }
        _bash = Builder(name = "Bash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                horizontalLineTo(7.31f)
                lineTo(7.63f, 6.0f)
                horizontalLineTo(9.63f)
                lineTo(9.31f, 9.0f)
                horizontalLineTo(11.31f)
                lineTo(11.63f, 6.0f)
                horizontalLineTo(13.63f)
                lineTo(13.31f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.1f)
                lineTo(12.9f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.69f)
                lineTo(12.37f, 18.0f)
                horizontalLineTo(10.37f)
                lineTo(10.69f, 15.0f)
                horizontalLineTo(8.69f)
                lineTo(8.37f, 18.0f)
                horizontalLineTo(6.37f)
                lineTo(6.69f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.9f)
                lineTo(7.1f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                moveTo(9.1f, 11.0f)
                lineTo(8.9f, 13.0f)
                horizontalLineTo(10.9f)
                lineTo(11.1f, 11.0f)
                moveTo(19.0f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _bash!!
    }

private var _bash: ImageVector? = null
