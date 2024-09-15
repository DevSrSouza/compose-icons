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

public val LineAwesomeIcons.VolumeUpSolid: ImageVector
    get() {
        if (_volumeUpSolid != null) {
            return _volumeUpSolid!!
        }
        _volumeUpSolid = Builder(name = "VolumeUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.594f)
                lineTo(15.281f, 5.281f)
                lineTo(9.563f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 21.0f)
                lineTo(9.563f, 21.0f)
                lineTo(15.281f, 26.719f)
                lineTo(17.0f, 28.406f)
                close()
                moveTo(23.813f, 8.188f)
                lineTo(22.406f, 9.594f)
                curveTo(25.926f, 13.113f, 25.926f, 18.762f, 22.406f, 22.281f)
                lineTo(23.813f, 23.719f)
                curveTo(28.094f, 19.438f, 28.094f, 12.469f, 23.813f, 8.188f)
                close()
                moveTo(15.0f, 8.438f)
                lineTo(15.0f, 23.563f)
                lineTo(10.719f, 19.281f)
                lineTo(10.406f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 13.0f)
                lineTo(10.406f, 13.0f)
                lineTo(10.719f, 12.719f)
                close()
                moveTo(20.906f, 11.094f)
                lineTo(19.5f, 12.5f)
                curveTo(21.41f, 14.41f, 21.402f, 17.574f, 19.469f, 19.594f)
                lineTo(20.938f, 21.0f)
                curveTo(23.602f, 18.219f, 23.594f, 13.781f, 20.906f, 11.094f)
                close()
            }
        }
        .build()
        return _volumeUpSolid!!
    }

private var _volumeUpSolid: ImageVector? = null
