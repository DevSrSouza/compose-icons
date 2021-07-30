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

public val LineAwesomeIcons.VolumeMuteSolid: ImageVector
    get() {
        if (_volumeMuteSolid != null) {
            return _volumeMuteSolid!!
        }
        _volumeMuteSolid = Builder(name = "VolumeMuteSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.5938f)
                lineTo(13.2813f, 6.2813f)
                lineTo(8.5625f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 21.0f)
                lineTo(8.5625f, 21.0f)
                lineTo(13.2813f, 25.7188f)
                lineTo(15.0f, 27.4063f)
                close()
                moveTo(13.0f, 9.4375f)
                lineTo(13.0f, 22.5625f)
                lineTo(9.7188f, 19.2813f)
                lineTo(9.4063f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 13.0f)
                lineTo(9.4063f, 13.0f)
                lineTo(9.7188f, 12.7188f)
                close()
                moveTo(20.2188f, 11.7813f)
                lineTo(18.7813f, 13.2188f)
                lineTo(21.5625f, 16.0f)
                lineTo(18.7813f, 18.7813f)
                lineTo(20.2188f, 20.2188f)
                lineTo(23.0f, 17.4375f)
                lineTo(25.7813f, 20.2188f)
                lineTo(27.2188f, 18.7813f)
                lineTo(24.4375f, 16.0f)
                lineTo(27.2188f, 13.2188f)
                lineTo(25.7813f, 11.7813f)
                lineTo(23.0f, 14.5625f)
                close()
            }
        }
        .build()
        return _volumeMuteSolid!!
    }

private var _volumeMuteSolid: ImageVector? = null
