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

public val FilledGroup.ConferenceRoom: ImageVector
    get() {
        if (_conferenceRoom != null) {
            return _conferenceRoom!!
        }
        _conferenceRoom = Builder(name = "ConferenceRoom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5981f, 2.0099f)
                lineTo(19.5981f, 4.0099f)
                curveTo(19.8318f, 4.0566f, 20.0f, 4.2618f, 20.0f, 4.5002f)
                verticalLineTo(19.5002f)
                curveTo(20.0f, 19.7385f, 19.8318f, 19.9437f, 19.5981f, 19.9905f)
                lineTo(10.5981f, 21.9905f)
                curveTo(10.2887f, 22.0523f, 10.0f, 21.8157f, 10.0f, 21.5002f)
                verticalLineTo(2.5002f)
                curveTo(10.0f, 2.1846f, 10.2887f, 1.948f, 10.5981f, 2.0099f)
                close()
                moveTo(9.0f, 4.0002f)
                verticalLineTo(20.0002f)
                horizontalLineTo(4.75f)
                curveTo(4.3703f, 20.0002f, 4.0565f, 19.718f, 4.0068f, 19.3519f)
                lineTo(4.0f, 19.2502f)
                verticalLineTo(4.7502f)
                curveTo(4.0f, 4.3705f, 4.2821f, 4.0567f, 4.6482f, 4.007f)
                lineTo(4.75f, 4.0002f)
                horizontalLineTo(9.0f)
                close()
                moveTo(13.0f, 11.0002f)
                curveTo(12.4477f, 11.0002f, 12.0f, 11.4479f, 12.0f, 12.0002f)
                curveTo(12.0f, 12.5525f, 12.4477f, 13.0002f, 13.0f, 13.0002f)
                curveTo(13.5523f, 13.0002f, 14.0f, 12.5525f, 14.0f, 12.0002f)
                curveTo(14.0f, 11.4479f, 13.5523f, 11.0002f, 13.0f, 11.0002f)
                close()
            }
        }
        .build()
        return _conferenceRoom!!
    }

private var _conferenceRoom: ImageVector? = null
