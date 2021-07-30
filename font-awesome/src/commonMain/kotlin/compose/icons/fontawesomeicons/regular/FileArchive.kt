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

public val RegularGroup.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) {
            return _fileArchive!!
        }
        _fileArchive = Builder(name = "FileArchive", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.3f, 160.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-32.0f)
                close()
                moveTo(192.3f, 64.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(128.3f, 96.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                lineTo(160.3f, 96.0f)
                close()
                moveTo(192.3f, 128.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(369.9f, 97.9f)
                lineTo(286.0f, 14.0f)
                curveTo(277.0f, 5.0f, 264.8f, -0.1f, 252.1f, -0.1f)
                lineTo(48.0f, -0.1f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(384.0f, 131.9f)
                curveToRelative(0.0f, -12.7f, -5.1f, -25.0f, -14.1f, -34.0f)
                close()
                moveTo(256.0f, 51.9f)
                lineToRelative(76.1f, 76.1f)
                lineTo(256.0f, 128.0f)
                close()
                moveTo(336.0f, 464.0f)
                lineTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(79.7f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(32.0f)
                lineTo(159.7f, 48.0f)
                lineTo(208.0f, 48.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                close()
                moveTo(194.2f, 265.7f)
                curveToRelative(-1.1f, -5.6f, -6.0f, -9.7f, -11.8f, -9.7f)
                horizontalLineToRelative(-22.1f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(32.0f)
                lineToRelative(-19.7f, 97.1f)
                curveTo(102.0f, 385.6f, 126.8f, 416.0f, 160.0f, 416.0f)
                curveToRelative(33.1f, 0.0f, 57.9f, -30.2f, 51.5f, -62.6f)
                close()
                moveTo(160.3f, 390.1f)
                curveToRelative(-17.9f, 0.0f, -32.4f, -12.1f, -32.4f, -27.0f)
                reflectiveCurveToRelative(14.5f, -27.0f, 32.4f, -27.0f)
                reflectiveCurveToRelative(32.4f, 12.1f, 32.4f, 27.0f)
                reflectiveCurveToRelative(-14.5f, 27.0f, -32.4f, 27.0f)
                close()
                moveTo(192.3f, 192.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
