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

public val FilledGroup.QuestionCircle: ImageVector
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
                moveTo(12.0f, 15.5f)
                curveTo(11.4477f, 15.5f, 11.0f, 15.9477f, 11.0f, 16.5f)
                curveTo(11.0f, 17.0523f, 11.4477f, 17.5f, 12.0f, 17.5f)
                curveTo(12.5523f, 17.5f, 13.0f, 17.0523f, 13.0f, 16.5f)
                curveTo(13.0f, 15.9477f, 12.5523f, 15.5f, 12.0f, 15.5f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(10.4812f, 6.75f, 9.25f, 7.9812f, 9.25f, 9.5f)
                curveTo(9.25f, 9.9142f, 9.5858f, 10.25f, 10.0f, 10.25f)
                curveTo(10.3797f, 10.25f, 10.6935f, 9.9678f, 10.7432f, 9.6018f)
                lineTo(10.75f, 9.5f)
                curveTo(10.75f, 8.8096f, 11.3096f, 8.25f, 12.0f, 8.25f)
                curveTo(12.6904f, 8.25f, 13.25f, 8.8096f, 13.25f, 9.5f)
                curveTo(13.25f, 10.0388f, 13.115f, 10.3053f, 12.6051f, 10.8322f)
                lineTo(12.4697f, 10.9697f)
                curveTo(11.5916f, 11.8478f, 11.25f, 12.4171f, 11.25f, 13.5f)
                curveTo(11.25f, 13.9142f, 11.5858f, 14.25f, 12.0f, 14.25f)
                curveTo(12.4142f, 14.25f, 12.75f, 13.9142f, 12.75f, 13.5f)
                curveTo(12.75f, 12.9612f, 12.885f, 12.6947f, 13.3949f, 12.1678f)
                lineTo(13.5303f, 12.0303f)
                curveTo(14.4084f, 11.1522f, 14.75f, 10.5829f, 14.75f, 9.5f)
                curveTo(14.75f, 7.9812f, 13.5188f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
