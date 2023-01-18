package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TextDensity: ImageVector
    get() {
        if (_textDensity != null) {
            return _textDensity!!
        }
        _textDensity = Builder(name = "TextDensity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.25f, 2.0f)
                curveTo(12.6642f, 2.0f, 13.0f, 2.3358f, 13.0f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(13.0f, 21.6642f, 12.6642f, 22.0f, 12.25f, 22.0f)
                curveTo(11.8358f, 22.0f, 11.5f, 21.6642f, 11.5f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(11.5f, 2.3358f, 11.8358f, 2.0f, 12.25f, 2.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 5.0f, 2.0f, 5.3358f, 2.0f, 5.75f)
                curveTo(2.0f, 6.1642f, 2.3358f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 9.0f, 2.0f, 9.3358f, 2.0f, 9.75f)
                curveTo(2.0f, 10.1642f, 2.3358f, 10.5f, 2.75f, 10.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 13.0f, 2.0f, 13.3358f, 2.0f, 13.75f)
                curveTo(2.0f, 14.1642f, 2.3358f, 14.5f, 2.75f, 14.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 17.0f, 2.0f, 17.3358f, 2.0f, 17.75f)
                curveTo(2.0f, 18.1642f, 2.3358f, 18.5f, 2.75f, 18.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(19.75f, 18.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 13.5f, 22.0f, 14.5074f, 22.0f, 15.75f)
                curveTo(22.0f, 16.9926f, 20.9926f, 18.0f, 19.75f, 18.0f)
                close()
                moveTo(19.75f, 10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 6.0f, 22.0f, 7.0074f, 22.0f, 8.25f)
                curveTo(22.0f, 9.4926f, 20.9926f, 10.5f, 19.75f, 10.5f)
                close()
            }
        }
        .build()
        return _textDensity!!
    }

private var _textDensity: ImageVector? = null
