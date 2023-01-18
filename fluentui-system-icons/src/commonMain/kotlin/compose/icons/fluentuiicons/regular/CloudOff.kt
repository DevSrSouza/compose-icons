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

public val RegularGroup.CloudOff: ImageVector
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
                moveTo(15.1891f, 16.25f)
                horizontalLineTo(6.0f)
                curveTo(4.6193f, 16.25f, 3.5f, 15.1307f, 3.5f, 13.75f)
                curveTo(3.5f, 12.3693f, 4.6193f, 11.25f, 6.0f, 11.25f)
                lineTo(6.7561f, 11.25f)
                curveTo(7.156f, 11.25f, 7.4856f, 10.9363f, 7.5052f, 10.5369f)
                curveTo(7.533f, 9.9737f, 7.6701f, 9.4401f, 7.8956f, 8.9563f)
                lineTo(15.1891f, 16.25f)
                close()
                moveTo(20.0f, 13.75f)
                curveTo(20.0f, 14.5855f, 19.5902f, 15.3252f, 18.9606f, 15.7792f)
                lineTo(20.0298f, 16.8485f)
                curveTo(20.9272f, 16.115f, 21.5f, 14.9994f, 21.5f, 13.75f)
                curveTo(21.5f, 11.5409f, 19.7091f, 9.75f, 17.5f, 9.75f)
                lineTo(17.4134f, 9.75f)
                curveTo(16.939f, 7.0428f, 14.5754f, 5.0f, 11.75f, 5.0f)
                curveTo(10.7242f, 5.0f, 9.7592f, 5.2693f, 8.9234f, 5.7419f)
                lineTo(10.0399f, 6.8584f)
                curveTo(10.5637f, 6.6278f, 11.1424f, 6.5f, 11.75f, 6.5f)
                curveTo(14.018f, 6.5f, 15.8837f, 8.2813f, 15.9948f, 10.5369f)
                curveTo(16.0144f, 10.9363f, 16.344f, 11.25f, 16.7439f, 11.25f)
                lineTo(17.5f, 11.25f)
                curveTo(18.8807f, 11.25f, 20.0f, 12.3693f, 20.0f, 13.75f)
                close()
            }
        }
        .build()
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
