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

public val RegularGroup.QuestionCircle: ImageVector
    get() {
        if (_questionCircle != null) {
            return _questionCircle!!
        }
        _questionCircle = Builder(name = "QuestionCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.478f, 22.0f, 12.0f)
                curveTo(22.0f, 17.522f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 6.478f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.667f)
                curveTo(7.405f, 3.667f, 3.667f, 7.405f, 3.667f, 12.0f)
                curveTo(3.667f, 16.595f, 7.405f, 20.333f, 12.0f, 20.333f)
                curveTo(16.595f, 20.333f, 20.333f, 16.595f, 20.333f, 12.0f)
                curveTo(20.333f, 7.405f, 16.595f, 3.667f, 12.0f, 3.667f)
                close()
                moveTo(12.0f, 15.5f)
                curveTo(12.5523f, 15.5f, 13.0f, 15.9477f, 13.0f, 16.5f)
                curveTo(13.0f, 17.0523f, 12.5523f, 17.5f, 12.0f, 17.5f)
                curveTo(11.4477f, 17.5f, 11.0f, 17.0523f, 11.0f, 16.5f)
                curveTo(11.0f, 15.9477f, 11.4477f, 15.5f, 12.0f, 15.5f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(13.5188f, 6.75f, 14.75f, 7.9812f, 14.75f, 9.5f)
                curveTo(14.75f, 10.5108f, 14.4525f, 11.074f, 13.6989f, 11.8586f)
                lineTo(13.5303f, 12.0303f)
                curveTo(12.9084f, 12.6522f, 12.75f, 12.9163f, 12.75f, 13.5f)
                curveTo(12.75f, 13.9142f, 12.4142f, 14.25f, 12.0f, 14.25f)
                curveTo(11.5858f, 14.25f, 11.25f, 13.9142f, 11.25f, 13.5f)
                curveTo(11.25f, 12.4892f, 11.5475f, 11.926f, 12.3011f, 11.1414f)
                lineTo(12.4697f, 10.9697f)
                curveTo(13.0916f, 10.3478f, 13.25f, 10.0837f, 13.25f, 9.5f)
                curveTo(13.25f, 8.8096f, 12.6904f, 8.25f, 12.0f, 8.25f)
                curveTo(11.3528f, 8.25f, 10.8205f, 8.7419f, 10.7565f, 9.3722f)
                lineTo(10.75f, 9.5f)
                curveTo(10.75f, 9.9142f, 10.4142f, 10.25f, 10.0f, 10.25f)
                curveTo(9.5858f, 10.25f, 9.25f, 9.9142f, 9.25f, 9.5f)
                curveTo(9.25f, 7.9812f, 10.4812f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
