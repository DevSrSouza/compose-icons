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

public val LineAwesomeIcons.VolumeOffSolid: ImageVector
    get() {
        if (_volumeOffSolid != null) {
            return _volumeOffSolid!!
        }
        _volumeOffSolid = Builder(name = "VolumeOffSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.594f)
                lineTo(13.281f, 6.281f)
                lineTo(8.563f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 21.0f)
                lineTo(8.563f, 21.0f)
                lineTo(13.281f, 25.719f)
                lineTo(15.0f, 27.406f)
                close()
                moveTo(13.0f, 9.438f)
                lineTo(13.0f, 22.563f)
                lineTo(9.719f, 19.281f)
                lineTo(9.406f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 13.0f)
                lineTo(9.406f, 13.0f)
                lineTo(9.719f, 12.719f)
                close()
                moveTo(20.219f, 11.781f)
                lineTo(18.781f, 13.219f)
                lineTo(21.563f, 16.0f)
                lineTo(18.781f, 18.781f)
                lineTo(20.219f, 20.219f)
                lineTo(23.0f, 17.438f)
                lineTo(25.781f, 20.219f)
                lineTo(27.219f, 18.781f)
                lineTo(24.438f, 16.0f)
                lineTo(27.219f, 13.219f)
                lineTo(25.781f, 11.781f)
                lineTo(23.0f, 14.563f)
                close()
            }
        }
        .build()
        return _volumeOffSolid!!
    }

private var _volumeOffSolid: ImageVector? = null
