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
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 160.0f)
                lineTo(256.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(256.0f, 0.0f)
                lineTo(256.0f, 128.0f)
                lineTo(384.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                close()
                moveTo(258.0f, 226.3f)
                curveToRelative(37.1f, 22.4f, 62.0f, 63.1f, 62.0f, 109.7f)
                reflectiveCurveToRelative(-24.9f, 87.3f, -62.0f, 109.7f)
                curveToRelative(-7.6f, 4.6f, -17.4f, 2.1f, -22.0f, -5.4f)
                reflectiveCurveToRelative(-2.1f, -17.4f, 5.4f, -22.0f)
                curveTo(269.4f, 401.5f, 288.0f, 370.9f, 288.0f, 336.0f)
                reflectiveCurveToRelative(-18.6f, -65.5f, -46.5f, -82.3f)
                curveToRelative(-7.6f, -4.6f, -10.0f, -14.4f, -5.4f, -22.0f)
                reflectiveCurveToRelative(14.4f, -10.0f, 22.0f, -5.4f)
                close()
                moveTo(166.1f, 257.2f)
                curveToRelative(6.0f, 2.5f, 9.9f, 8.3f, 9.9f, 14.8f)
                lineTo(176.0f, 400.0f)
                curveToRelative(0.0f, 6.5f, -3.9f, 12.3f, -9.9f, 14.8f)
                reflectiveCurveToRelative(-12.9f, 1.1f, -17.4f, -3.5f)
                lineTo(113.4f, 376.0f)
                lineTo(80.0f, 376.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(64.0f, 312.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(33.4f)
                lineToRelative(35.3f, -35.3f)
                curveToRelative(4.6f, -4.6f, 11.5f, -5.9f, 17.4f, -3.5f)
                close()
                moveTo(217.1f, 292.1f)
                curveToRelative(6.6f, -5.9f, 16.7f, -5.3f, 22.6f, 1.3f)
                curveTo(249.8f, 304.6f, 256.0f, 319.6f, 256.0f, 336.0f)
                reflectiveCurveToRelative(-6.2f, 31.4f, -16.3f, 42.7f)
                curveToRelative(-5.9f, 6.6f, -16.0f, 7.1f, -22.6f, 1.3f)
                reflectiveCurveToRelative(-7.1f, -16.0f, -1.3f, -22.6f)
                curveToRelative(5.1f, -5.7f, 8.1f, -13.1f, 8.1f, -21.3f)
                reflectiveCurveToRelative(-3.1f, -15.7f, -8.1f, -21.3f)
                curveToRelative(-5.9f, -6.6f, -5.3f, -16.7f, 1.3f, -22.6f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
