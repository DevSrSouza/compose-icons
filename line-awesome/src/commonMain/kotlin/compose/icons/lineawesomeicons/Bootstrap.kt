package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(11.0f, 10.0f)
                lineTo(11.0f, 15.5098f)
                lineTo(11.0f, 21.9902f)
                curveTo(16.93f, 21.9902f, 18.1166f, 22.0702f, 19.2266f, 21.7402f)
                curveTo(19.8766f, 21.5402f, 21.6563f, 20.9004f, 21.6563f, 18.6504f)
                curveTo(21.6563f, 17.6504f, 21.3565f, 15.9591f, 19.3965f, 15.5391f)
                lineTo(19.3965f, 15.5098f)
                lineTo(19.0273f, 15.5098f)
                curveTo(20.0273f, 15.0598f, 20.6563f, 14.2109f, 20.6563f, 12.9609f)
                curveTo(20.6563f, 12.6409f, 20.7461f, 10.0f, 17.2461f, 10.0f)
                lineTo(11.0f, 10.0f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                curveTo(18.509f, 12.0f, 18.6563f, 12.8532f, 18.6563f, 13.4902f)
                curveTo(18.6563f, 15.0442f, 17.03f, 15.0f, 17.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(17.7598f, 17.0f)
                curveTo(19.6208f, 17.0f, 19.6563f, 18.1765f, 19.6563f, 18.4805f)
                curveTo(19.6563f, 20.0405f, 18.0446f, 20.0f, 17.8496f, 20.0f)
                lineTo(13.0f, 20.0f)
                lineTo(13.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
