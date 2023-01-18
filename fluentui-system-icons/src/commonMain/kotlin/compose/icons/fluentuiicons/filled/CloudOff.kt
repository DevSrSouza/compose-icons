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

public val FilledGroup.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) {
            return _cloudOff!!
        }
        _cloudOff = Builder(name = "CloudOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(6.7856f, 7.8464f)
                curveTo(6.4472f, 8.4236f, 6.2066f, 9.0656f, 6.0866f, 9.75f)
                lineTo(6.0f, 9.75f)
                curveTo(3.7909f, 9.75f, 2.0f, 11.5409f, 2.0f, 13.75f)
                curveTo(2.0f, 15.9591f, 3.7909f, 17.75f, 6.0f, 17.75f)
                horizontalLineTo(16.689f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(21.5f, 13.75f)
                curveTo(21.5f, 14.9994f, 20.9272f, 16.115f, 20.0298f, 16.8485f)
                lineTo(8.9234f, 5.7419f)
                curveTo(9.7592f, 5.2693f, 10.7242f, 5.0f, 11.75f, 5.0f)
                curveTo(14.5754f, 5.0f, 16.939f, 7.0428f, 17.4134f, 9.75f)
                lineTo(17.5f, 9.75f)
                curveTo(19.7091f, 9.75f, 21.5f, 11.5409f, 21.5f, 13.75f)
                close()
            }
        }
        .build()
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
