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
                moveTo(64.0f, 464.0f)
                lineTo(320.0f, 464.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(336.0f, 160.0f)
                lineTo(256.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 48.0f)
                lineTo(64.0f, 48.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(48.0f, 448.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(229.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineToRelative(90.5f, 90.5f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(384.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(192.0f, 272.0f)
                lineTo(192.0f, 400.0f)
                curveToRelative(0.0f, 6.5f, -3.9f, 12.3f, -9.9f, 14.8f)
                reflectiveCurveToRelative(-12.9f, 1.1f, -17.4f, -3.5f)
                lineTo(129.4f, 376.0f)
                lineTo(112.0f, 376.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(96.0f, 312.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(17.4f)
                lineToRelative(35.3f, -35.3f)
                curveToRelative(4.6f, -4.6f, 11.5f, -5.9f, 17.4f, -3.5f)
                reflectiveCurveToRelative(9.9f, 8.3f, 9.9f, 14.8f)
                close()
                moveTo(277.8f, 268.0f)
                curveToRelative(11.6f, 20.0f, 18.2f, 43.3f, 18.2f, 68.0f)
                reflectiveCurveToRelative(-6.6f, 48.0f, -18.2f, 68.0f)
                curveToRelative(-6.6f, 11.5f, -21.3f, 15.4f, -32.8f, 8.8f)
                reflectiveCurveToRelative(-15.4f, -21.3f, -8.8f, -32.8f)
                curveToRelative(7.5f, -12.9f, 11.8f, -27.9f, 11.8f, -44.0f)
                reflectiveCurveToRelative(-4.3f, -31.1f, -11.8f, -44.0f)
                curveToRelative(-6.6f, -11.5f, -2.7f, -26.2f, 8.8f, -32.8f)
                reflectiveCurveToRelative(26.2f, -2.7f, 32.8f, 8.8f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
