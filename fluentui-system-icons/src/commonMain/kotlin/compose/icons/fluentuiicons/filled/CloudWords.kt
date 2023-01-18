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

public val FilledGroup.CloudWords: ImageVector
    get() {
        if (_cloudWords != null) {
            return _cloudWords!!
        }
        _cloudWords = Builder(name = "CloudWords", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 5.0f)
                curveTo(8.9246f, 5.0f, 6.561f, 7.0428f, 6.0866f, 9.75f)
                lineTo(6.0f, 9.75f)
                curveTo(3.7909f, 9.75f, 2.0f, 11.5409f, 2.0f, 13.75f)
                curveTo(2.0f, 15.9591f, 3.7909f, 17.75f, 6.0f, 17.75f)
                horizontalLineTo(17.5f)
                curveTo(19.7091f, 17.75f, 21.5f, 15.9591f, 21.5f, 13.75f)
                curveTo(21.5f, 11.5409f, 19.7091f, 9.75f, 17.5f, 9.75f)
                lineTo(17.4134f, 9.75f)
                curveTo(16.939f, 7.0428f, 14.5754f, 5.0f, 11.75f, 5.0f)
                close()
                moveTo(9.75f, 9.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 9.0f, 14.5f, 9.3358f, 14.5f, 9.75f)
                curveTo(14.5f, 10.1642f, 14.1642f, 10.5f, 13.75f, 10.5f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 10.5f, 9.0f, 10.1642f, 9.0f, 9.75f)
                curveTo(9.0f, 9.3358f, 9.3358f, 9.0f, 9.75f, 9.0f)
                close()
                moveTo(5.0f, 13.75f)
                curveTo(5.0f, 13.3358f, 5.3358f, 13.0f, 5.75f, 13.0f)
                horizontalLineTo(9.75f)
                curveTo(10.1642f, 13.0f, 10.5f, 13.3358f, 10.5f, 13.75f)
                curveTo(10.5f, 14.1642f, 10.1642f, 14.5f, 9.75f, 14.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 14.5f, 5.0f, 14.1642f, 5.0f, 13.75f)
                close()
                moveTo(13.75f, 13.0f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 13.0f, 18.5f, 13.3358f, 18.5f, 13.75f)
                curveTo(18.5f, 14.1642f, 18.1642f, 14.5f, 17.75f, 14.5f)
                horizontalLineTo(13.75f)
                curveTo(13.3358f, 14.5f, 13.0f, 14.1642f, 13.0f, 13.75f)
                curveTo(13.0f, 13.3358f, 13.3358f, 13.0f, 13.75f, 13.0f)
                close()
            }
        }
        .build()
        return _cloudWords!!
    }

private var _cloudWords: ImageVector? = null
