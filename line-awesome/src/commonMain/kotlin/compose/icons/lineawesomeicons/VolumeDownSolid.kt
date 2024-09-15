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
                moveTo(18.5f, 12.031f)
                lineTo(17.063f, 13.469f)
                curveTo(17.641f, 14.164f, 18.0f, 15.027f, 18.0f, 16.0f)
                curveTo(18.0f, 16.973f, 17.641f, 17.836f, 17.063f, 18.531f)
                lineTo(18.5f, 19.969f)
                curveTo(19.438f, 18.91f, 20.0f, 17.523f, 20.0f, 16.0f)
                curveTo(20.0f, 14.477f, 19.438f, 13.09f, 18.5f, 12.031f)
                close()
            }
        }
        .build()
        return _volumeDownSolid!!
    }

private var _volumeDownSolid: ImageVector? = null
