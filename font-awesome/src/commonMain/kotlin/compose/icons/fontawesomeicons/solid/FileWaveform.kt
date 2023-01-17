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

public val SolidGroup.FileWaveform: ImageVector
    get() {
        if (_fileWaveform != null) {
            return _fileWaveform!!
        }
        _fileWaveform = Builder(name = "FileWaveform", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(112.0f)
                curveToRelative(6.1f, 0.0f, 11.6f, 3.4f, 14.3f, 8.8f)
                lineTo(144.0f, 332.2f)
                lineToRelative(49.7f, -99.4f)
                curveToRelative(2.7f, -5.4f, 8.2f, -8.8f, 14.3f, -8.8f)
                reflectiveCurveToRelative(11.6f, 3.4f, 14.3f, 8.8f)
                lineTo(249.9f, 288.0f)
                horizontalLineTo(320.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(240.0f)
                curveToRelative(-6.1f, 0.0f, -11.6f, -3.4f, -14.3f, -8.8f)
                lineTo(208.0f, 275.8f)
                lineToRelative(-49.7f, 99.4f)
                curveToRelative(-2.7f, 5.4f, -8.3f, 8.8f, -14.3f, 8.8f)
                reflectiveCurveToRelative(-11.6f, -3.4f, -14.3f, -8.8f)
                lineTo(102.1f, 320.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(256.0f, 0.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(384.0f)
                lineTo(256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fileWaveform!!
    }

private var _fileWaveform: ImageVector? = null
