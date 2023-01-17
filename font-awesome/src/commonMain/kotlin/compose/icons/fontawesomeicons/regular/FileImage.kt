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
                moveTo(365.3f, 93.38f)
                lineToRelative(-74.63f, -74.64f)
                curveTo(278.6f, 6.742f, 262.3f, 0.0f, 245.4f, 0.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                lineToRelative(0.007f, 384.0f)
                curveToRelative(0.0f, 35.34f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(320.0f)
                curveToRelative(35.2f, 0.0f, 64.0f, -28.8f, 64.0f, -64.0f)
                verticalLineTo(138.6f)
                curveTo(384.0f, 121.7f, 377.3f, 105.4f, 365.3f, 93.38f)
                close()
                moveTo(336.0f, 448.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.02f)
                curveToRelative(-8.838f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                lineTo(48.0f, 64.13f)
                curveToRelative(0.0f, -8.836f, 7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(160.0f)
                lineTo(224.0f, 128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(79.1f)
                verticalLineTo(448.0f)
                close()
                moveTo(215.3f, 292.0f)
                curveToRelative(-4.68f, 0.0f, -9.051f, 2.34f, -11.65f, 6.234f)
                lineTo(164.0f, 357.8f)
                lineToRelative(-11.68f, -17.53f)
                curveTo(149.7f, 336.3f, 145.3f, 334.0f, 140.7f, 334.0f)
                curveToRelative(-4.682f, 0.0f, -9.053f, 2.34f, -11.65f, 6.234f)
                lineToRelative(-46.67f, 70.0f)
                curveToRelative(-2.865f, 4.297f, -3.131f, 9.82f, -0.695f, 14.37f)
                curveTo(84.09f, 429.2f, 88.84f, 432.0f, 93.1f, 432.0f)
                horizontalLineToRelative(196.0f)
                curveToRelative(5.163f, 0.0f, 9.907f, -2.844f, 12.34f, -7.395f)
                curveToRelative(2.436f, -4.551f, 2.17f, -10.07f, -0.695f, -14.37f)
                lineToRelative(-74.67f, -112.0f)
                curveTo(224.4f, 294.3f, 220.0f, 292.0f, 215.3f, 292.0f)
                close()
                moveTo(128.0f, 288.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveTo(145.7f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveTo(96.0f, 238.3f, 96.0f, 256.0f)
                reflectiveCurveTo(110.3f, 288.0f, 128.0f, 288.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
