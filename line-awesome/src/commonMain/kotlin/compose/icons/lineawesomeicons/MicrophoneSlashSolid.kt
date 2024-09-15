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

public val LineAwesomeIcons.MicrophoneSlashSolid: ImageVector
    get() {
        if (_microphoneSlashSolid != null) {
            return _microphoneSlashSolid!!
        }
        _microphoneSlashSolid = Builder(name = "MicrophoneSlashSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.719f, 2.281f)
                lineTo(2.281f, 3.719f)
                lineTo(28.281f, 29.719f)
                lineTo(29.719f, 28.281f)
                lineTo(23.438f, 22.0f)
                curveTo(24.398f, 20.938f, 25.0f, 19.543f, 25.0f, 18.0f)
                lineTo(25.0f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 18.0f)
                curveTo(23.0f, 18.992f, 22.637f, 19.898f, 22.031f, 20.594f)
                lineTo(20.625f, 19.188f)
                curveTo(20.863f, 18.859f, 21.0f, 18.438f, 21.0f, 18.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 4.898f, 20.102f, 4.0f, 19.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                curveTo(11.898f, 4.0f, 11.0f, 4.898f, 11.0f, 6.0f)
                lineTo(11.0f, 9.563f)
                close()
                moveTo(13.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 17.563f)
                lineTo(13.0f, 11.563f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(7.0f, 18.0f)
                curveTo(7.0f, 21.309f, 9.691f, 24.0f, 13.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                lineTo(21.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                curveTo(19.254f, 24.0f, 19.504f, 23.969f, 19.75f, 23.938f)
                lineTo(17.813f, 22.0f)
                lineTo(13.0f, 22.0f)
                curveTo(10.793f, 22.0f, 9.0f, 20.207f, 9.0f, 18.0f)
                lineTo(9.0f, 14.0f)
                close()
                moveTo(11.0f, 15.188f)
                lineTo(11.0f, 18.0f)
                curveTo(11.0f, 19.102f, 11.898f, 20.0f, 13.0f, 20.0f)
                lineTo(15.813f, 20.0f)
                lineTo(13.813f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 17.188f)
                close()
            }
        }
        .build()
        return _microphoneSlashSolid!!
    }

private var _microphoneSlashSolid: ImageVector? = null
