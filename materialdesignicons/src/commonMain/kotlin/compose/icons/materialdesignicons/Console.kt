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

public val MaterialDesignIcons.Console: ImageVector
    get() {
        if (_console != null) {
            return _console!!
        }
        _console = Builder(name = "Console", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.89f, 2.9f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                moveTo(13.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                moveTo(9.58f, 13.0f)
                lineTo(5.57f, 9.0f)
                horizontalLineTo(8.4f)
                lineTo(11.7f, 12.3f)
                curveTo(12.09f, 12.69f, 12.09f, 13.33f, 11.7f, 13.72f)
                lineTo(8.42f, 17.0f)
                horizontalLineTo(5.59f)
                lineTo(9.58f, 13.0f)
                close()
            }
        }
        .build()
        return _console!!
    }

private var _console: ImageVector? = null
