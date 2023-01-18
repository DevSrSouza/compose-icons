package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FunnelOutline: ImageVector
    get() {
        if (_funnelOutline != null) {
            return _funnelOutline!!
        }
        _funnelOutline = Builder(name = "FunnelOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(35.4f, 87.12f)
                lineTo(204.05f, 283.56f)
                arcTo(16.07f, 16.07f, 0.0f, false, true, 208.0f, 294.0f)
                verticalLineTo(413.32f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 5.39f, 7.59f)
                lineToRelative(80.15f, 26.67f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 304.0f, 440.0f)
                verticalLineTo(294.0f)
                arcTo(16.07f, 16.07f, 0.0f, false, true, 308.0f, 283.56f)
                lineTo(476.6f, 87.12f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 466.0f, 64.0f)
                horizontalLineTo(46.05f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 35.4f, 87.12f)
                close()
            }
        }
        .build()
        return _funnelOutline!!
    }

private var _funnelOutline: ImageVector? = null
