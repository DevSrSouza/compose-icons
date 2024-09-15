package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(369.94f, 97.94f)
                lineToRelative(-83.88f, -83.88f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 252.12f, 0.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.49f, 0.0f, 0.0f, 21.49f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(384.0f, 131.88f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -14.06f, -33.94f)
                close()
                moveTo(332.12f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 51.88f)
                lineTo(332.12f, 128.0f)
                close()
                moveTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(288.0f)
                lineTo(48.0f, 464.0f)
                close()
                moveTo(192.0f, 387.98f)
                curveToRelative(0.0f, 10.69f, -12.93f, 16.05f, -20.49f, 8.48f)
                lineTo(136.0f, 360.49f)
                horizontalLineToRelative(-28.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.63f, 5.37f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(28.0f)
                lineToRelative(35.51f, -36.95f)
                curveToRelative(7.56f, -7.56f, 20.49f, -2.21f, 20.49f, 8.48f)
                verticalLineToRelative(135.95f)
                close()
                moveTo(233.2f, 340.85f)
                curveToRelative(9.05f, -9.3f, 9.06f, -24.13f, 0.0f, -33.44f)
                curveToRelative(-22.15f, -22.75f, 12.23f, -56.25f, 34.4f, -33.48f)
                curveToRelative(27.2f, 27.94f, 27.21f, 72.44f, 0.0f, 100.4f)
                curveToRelative(-21.79f, 22.39f, -56.95f, -10.31f, -34.4f, -33.48f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
