package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 136.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(160.0f, 404.0f)
                curveToRelative(0.0f, 10.7f, -12.9f, 16.0f, -20.5f, 8.5f)
                lineTo(104.0f, 376.0f)
                lineTo(76.0f, 376.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(28.0f)
                lineToRelative(35.5f, -36.5f)
                curveToRelative(7.6f, -7.6f, 20.5f, -2.2f, 20.5f, 8.5f)
                verticalLineToRelative(136.0f)
                close()
                moveTo(193.2f, 356.4f)
                curveToRelative(9.1f, -9.3f, 9.1f, -24.1f, 0.0f, -33.4f)
                curveToRelative(-22.1f, -22.8f, 12.2f, -56.2f, 34.4f, -33.5f)
                curveToRelative(27.2f, 27.9f, 27.2f, 72.4f, 0.0f, 100.4f)
                curveToRelative(-21.8f, 22.3f, -56.9f, -10.4f, -34.4f, -33.5f)
                close()
                moveTo(279.2f, 239.3f)
                curveToRelative(54.4f, 55.9f, 54.4f, 144.8f, 0.0f, 200.8f)
                curveToRelative(-21.8f, 22.4f, -57.0f, -10.3f, -34.4f, -33.5f)
                curveToRelative(36.2f, -37.2f, 36.3f, -96.5f, 0.0f, -133.8f)
                curveToRelative(-22.1f, -22.8f, 12.3f, -56.3f, 34.4f, -33.5f)
                close()
                moveTo(384.0f, 121.9f)
                verticalLineToRelative(6.1f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0.0f, 12.5f, 2.5f, 17.0f, 7.0f)
                lineToRelative(97.9f, 98.0f)
                curveToRelative(4.5f, 4.5f, 7.0f, 10.6f, 7.0f, 16.9f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
