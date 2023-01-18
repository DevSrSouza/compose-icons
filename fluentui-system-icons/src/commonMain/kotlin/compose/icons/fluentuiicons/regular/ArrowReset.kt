package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowReset: ImageVector
    get() {
        if (_arrowReset != null) {
            return _arrowReset!!
        }
        _arrowReset = Builder(name = "ArrowReset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7803f, 2.7197f)
                curveTo(7.0732f, 3.0126f, 7.0732f, 3.4874f, 6.7803f, 3.7803f)
                lineTo(4.5607f, 6.0f)
                horizontalLineTo(13.25f)
                curveTo(17.5302f, 6.0f, 21.0f, 9.4698f, 21.0f, 13.75f)
                curveTo(21.0f, 18.0302f, 17.5302f, 21.5f, 13.25f, 21.5f)
                curveTo(8.9698f, 21.5f, 5.5f, 18.0302f, 5.5f, 13.75f)
                curveTo(5.5f, 13.3358f, 5.8358f, 13.0f, 6.25f, 13.0f)
                curveTo(6.6642f, 13.0f, 7.0f, 13.3358f, 7.0f, 13.75f)
                curveTo(7.0f, 17.2018f, 9.7982f, 20.0f, 13.25f, 20.0f)
                curveTo(16.7018f, 20.0f, 19.5f, 17.2018f, 19.5f, 13.75f)
                curveTo(19.5f, 10.2982f, 16.7018f, 7.5f, 13.25f, 7.5f)
                horizontalLineTo(4.5607f)
                lineTo(6.7803f, 9.7197f)
                curveTo(7.0732f, 10.0126f, 7.0732f, 10.4874f, 6.7803f, 10.7803f)
                curveTo(6.4874f, 11.0732f, 6.0126f, 11.0732f, 5.7197f, 10.7803f)
                lineTo(2.2197f, 7.2803f)
                curveTo(1.9268f, 6.9874f, 1.9268f, 6.5126f, 2.2197f, 6.2197f)
                lineTo(5.7197f, 2.7197f)
                curveTo(6.0126f, 2.4268f, 6.4874f, 2.4268f, 6.7803f, 2.7197f)
                close()
            }
        }
        .build()
        return _arrowReset!!
    }

private var _arrowReset: ImageVector? = null
