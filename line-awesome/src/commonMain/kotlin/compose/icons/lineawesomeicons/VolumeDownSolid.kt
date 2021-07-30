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

public val LineAwesomeIcons.VolumeDownSolid: ImageVector
    get() {
        if (_volumeDownSolid != null) {
            return _volumeDownSolid!!
        }
        _volumeDownSolid = Builder(name = "VolumeDownSolid", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(18.5f, 12.0313f)
                lineTo(17.0625f, 13.4688f)
                curveTo(17.6406f, 14.1641f, 18.0f, 15.0273f, 18.0f, 16.0f)
                curveTo(18.0f, 16.9727f, 17.6406f, 17.8359f, 17.0625f, 18.5313f)
                lineTo(18.5f, 19.9688f)
                curveTo(19.4375f, 18.9102f, 20.0f, 17.5234f, 20.0f, 16.0f)
                curveTo(20.0f, 14.4766f, 19.4375f, 13.0898f, 18.5f, 12.0313f)
                close()
            }
        }
        .build()
        return _volumeDownSolid!!
    }

private var _volumeDownSolid: ImageVector? = null
