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

public val RegularGroup.TextAddSpaceBefore: ImageVector
    get() {
        if (_textAddSpaceBefore != null) {
            return _textAddSpaceBefore!!
        }
        _textAddSpaceBefore = Builder(name = "TextAddSpaceBefore", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4697f, 6.2803f)
                curveTo(9.1768f, 5.9874f, 9.1768f, 5.5126f, 9.4697f, 5.2197f)
                curveTo(9.7626f, 4.9268f, 10.2374f, 4.9268f, 10.5303f, 5.2197f)
                lineTo(12.0f, 6.6893f)
                lineTo(13.4697f, 5.2197f)
                curveTo(13.7626f, 4.9268f, 14.2374f, 4.9268f, 14.5303f, 5.2197f)
                curveTo(14.8232f, 5.5126f, 14.8232f, 5.9874f, 14.5303f, 6.2803f)
                lineTo(12.5303f, 8.2803f)
                curveTo(12.2374f, 8.5732f, 11.7626f, 8.5732f, 11.4697f, 8.2803f)
                lineTo(9.4697f, 6.2803f)
                close()
                moveTo(3.0f, 11.75f)
                curveTo(3.0f, 11.3358f, 3.3358f, 11.0f, 3.75f, 11.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 11.0f, 21.0f, 11.3358f, 21.0f, 11.75f)
                curveTo(21.0f, 12.1642f, 20.6642f, 12.5f, 20.25f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 12.5f, 3.0f, 12.1642f, 3.0f, 11.75f)
                close()
                moveTo(3.0f, 17.75f)
                curveTo(3.0f, 17.3358f, 3.3358f, 17.0f, 3.75f, 17.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 17.0f, 21.0f, 17.3358f, 21.0f, 17.75f)
                curveTo(21.0f, 18.1642f, 20.6642f, 18.5f, 20.25f, 18.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 18.5f, 3.0f, 18.1642f, 3.0f, 17.75f)
                close()
            }
        }
        .build()
        return _textAddSpaceBefore!!
    }

private var _textAddSpaceBefore: ImageVector? = null
