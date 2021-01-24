package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.941f, 97.941f)
                lineToRelative(-83.882f, -83.882f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 252.118f, 0.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.49f, 0.0f, 0.0f, 21.49f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(384.0f, 131.882f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(332.118f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 51.882f)
                lineTo(332.118f, 128.0f)
                close()
                moveTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(288.0f)
                lineTo(48.0f, 464.0f)
                close()
                moveTo(192.0f, 387.976f)
                curveToRelative(0.0f, 10.691f, -12.926f, 16.045f, -20.485f, 8.485f)
                lineTo(136.0f, 360.486f)
                horizontalLineToRelative(-28.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, -5.373f, -12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.627f, 5.373f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(28.0f)
                lineToRelative(35.515f, -36.947f)
                curveToRelative(7.56f, -7.56f, 20.485f, -2.206f, 20.485f, 8.485f)
                verticalLineToRelative(135.952f)
                close()
                moveTo(233.201f, 340.846f)
                curveToRelative(9.051f, -9.297f, 9.06f, -24.133f, 0.001f, -33.439f)
                curveToRelative(-22.149f, -22.752f, 12.235f, -56.246f, 34.395f, -33.481f)
                curveToRelative(27.198f, 27.94f, 27.212f, 72.444f, 0.001f, 100.401f)
                curveToRelative(-21.793f, 22.386f, -56.947f, -10.315f, -34.397f, -33.481f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
