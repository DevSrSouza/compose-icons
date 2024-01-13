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

public val SolidGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(64.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(216.0f, 288.0f)
                curveToRelative(5.3f, 0.0f, 10.2f, 2.6f, 13.2f, 6.9f)
                lineToRelative(88.0f, 128.0f)
                curveToRelative(3.4f, 4.9f, 3.7f, 11.3f, 1.0f, 16.5f)
                reflectiveCurveToRelative(-8.2f, 8.6f, -14.2f, 8.6f)
                lineTo(216.0f, 448.0f)
                lineTo(176.0f, 448.0f)
                lineTo(128.0f, 448.0f)
                lineTo(80.0f, 448.0f)
                curveToRelative(-5.8f, 0.0f, -11.1f, -3.1f, -13.9f, -8.1f)
                reflectiveCurveToRelative(-2.8f, -11.2f, 0.2f, -16.1f)
                lineToRelative(48.0f, -80.0f)
                curveToRelative(2.9f, -4.8f, 8.1f, -7.8f, 13.7f, -7.8f)
                reflectiveCurveToRelative(10.8f, 2.9f, 13.7f, 7.8f)
                lineToRelative(12.8f, 21.4f)
                lineToRelative(48.3f, -70.2f)
                curveToRelative(3.0f, -4.3f, 7.9f, -6.9f, 13.2f, -6.9f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
