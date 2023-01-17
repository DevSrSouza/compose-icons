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

public val RegularGroup.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.1f, 257.8f)
                curveToRelative(-7.812f, -7.812f, -20.47f, -7.812f, -28.28f, 0.0f)
                lineToRelative(-48.0f, 48.0f)
                curveToRelative(-7.812f, 7.812f, -7.812f, 20.5f, 0.0f, 28.31f)
                lineToRelative(48.0f, 48.0f)
                curveTo(137.8f, 386.1f, 142.9f, 388.0f, 148.0f, 388.0f)
                reflectiveCurveToRelative(10.23f, -1.938f, 14.14f, -5.844f)
                curveToRelative(7.812f, -7.812f, 7.812f, -20.5f, 0.0f, -28.31f)
                lineTo(128.3f, 320.0f)
                lineToRelative(33.86f, -33.84f)
                curveTo(169.1f, 278.3f, 169.1f, 265.7f, 162.1f, 257.8f)
                close()
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
                moveTo(221.9f, 257.8f)
                curveToRelative(-7.812f, 7.812f, -7.812f, 20.5f, 0.0f, 28.31f)
                lineTo(255.7f, 320.0f)
                lineToRelative(-33.86f, 33.84f)
                curveToRelative(-7.812f, 7.812f, -7.812f, 20.5f, 0.0f, 28.31f)
                curveTo(225.8f, 386.1f, 230.9f, 388.0f, 236.0f, 388.0f)
                reflectiveCurveToRelative(10.23f, -1.938f, 14.14f, -5.844f)
                lineToRelative(48.0f, -48.0f)
                curveToRelative(7.812f, -7.812f, 7.812f, -20.5f, 0.0f, -28.31f)
                lineToRelative(-48.0f, -48.0f)
                curveTo(242.3f, 250.0f, 229.7f, 250.0f, 221.9f, 257.8f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
