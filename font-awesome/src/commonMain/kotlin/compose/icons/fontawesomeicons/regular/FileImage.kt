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

public val RegularGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                lineTo(336.0f, 448.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 464.0f)
                close()
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 154.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(274.7f, 18.7f)
                curveTo(262.7f, 6.7f, 246.5f, 0.0f, 229.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(160.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(229.2f, 302.9f)
                curveToRelative(-3.0f, -4.3f, -7.9f, -6.9f, -13.2f, -6.9f)
                reflectiveCurveToRelative(-10.2f, 2.6f, -13.2f, 6.9f)
                lineToRelative(-41.3f, 59.7f)
                lineToRelative(-11.9f, -19.1f)
                curveToRelative(-2.9f, -4.7f, -8.1f, -7.5f, -13.6f, -7.5f)
                reflectiveCurveToRelative(-10.6f, 2.8f, -13.6f, 7.5f)
                lineToRelative(-40.0f, 64.0f)
                curveToRelative(-3.1f, 4.9f, -3.2f, 11.1f, -0.4f, 16.2f)
                reflectiveCurveToRelative(8.2f, 8.2f, 14.0f, 8.2f)
                horizontalLineToRelative(48.0f)
                horizontalLineToRelative(32.0f)
                horizontalLineToRelative(40.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(6.0f, 0.0f, 11.4f, -3.3f, 14.2f, -8.6f)
                reflectiveCurveToRelative(2.4f, -11.6f, -1.0f, -16.5f)
                lineToRelative(-72.0f, -104.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
