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

public val RegularGroup.TextAddSpaceAfter: ImageVector
    get() {
        if (_textAddSpaceAfter != null) {
            return _textAddSpaceAfter!!
        }
        _textAddSpaceAfter = Builder(name = "TextAddSpaceAfter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.75f)
                curveTo(3.0f, 6.3358f, 3.3358f, 6.0f, 3.75f, 6.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 6.0f, 21.0f, 6.3358f, 21.0f, 6.75f)
                curveTo(21.0f, 7.1642f, 20.6642f, 7.5f, 20.25f, 7.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 7.5f, 3.0f, 7.1642f, 3.0f, 6.75f)
                close()
                moveTo(3.0f, 12.75f)
                curveTo(3.0f, 12.3358f, 3.3358f, 12.0f, 3.75f, 12.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 12.0f, 21.0f, 12.3358f, 21.0f, 12.75f)
                curveTo(21.0f, 13.1642f, 20.6642f, 13.5f, 20.25f, 13.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 13.5f, 3.0f, 13.1642f, 3.0f, 12.75f)
                close()
                moveTo(9.4697f, 18.2197f)
                curveTo(9.1768f, 18.5126f, 9.1768f, 18.9874f, 9.4697f, 19.2803f)
                curveTo(9.7626f, 19.5732f, 10.2374f, 19.5732f, 10.5303f, 19.2803f)
                lineTo(12.0f, 17.8107f)
                lineTo(13.4697f, 19.2803f)
                curveTo(13.7626f, 19.5732f, 14.2374f, 19.5732f, 14.5303f, 19.2803f)
                curveTo(14.8232f, 18.9874f, 14.8232f, 18.5126f, 14.5303f, 18.2197f)
                lineTo(12.5303f, 16.2197f)
                curveTo(12.2374f, 15.9268f, 11.7626f, 15.9268f, 11.4697f, 16.2197f)
                lineTo(9.4697f, 18.2197f)
                close()
            }
        }
        .build()
        return _textAddSpaceAfter!!
    }

private var _textAddSpaceAfter: ImageVector? = null
