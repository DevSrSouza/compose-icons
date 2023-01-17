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

public val RegularGroup.FileLines: ImageVector
    get() {
        if (_fileLines != null) {
            return _fileLines!!
        }
        _fileLines = Builder(name = "FileLines", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.3f, 93.38f)
                lineToRelative(-74.63f, -74.64f)
                curveTo(278.6f, 6.742f, 262.3f, 0.0f, 245.4f, 0.0f)
                lineTo(64.0f, -0.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
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
                moveTo(96.0f, 280.0f)
                curveTo(96.0f, 293.3f, 106.8f, 304.0f, 120.0f, 304.0f)
                horizontalLineToRelative(144.0f)
                curveTo(277.3f, 304.0f, 288.0f, 293.3f, 288.0f, 280.0f)
                reflectiveCurveTo(277.3f, 256.0f, 264.0f, 256.0f)
                horizontalLineToRelative(-144.0f)
                curveTo(106.8f, 256.0f, 96.0f, 266.8f, 96.0f, 280.0f)
                close()
                moveTo(264.0f, 352.0f)
                horizontalLineToRelative(-144.0f)
                curveTo(106.8f, 352.0f, 96.0f, 362.8f, 96.0f, 376.0f)
                reflectiveCurveToRelative(10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(144.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveTo(277.3f, 352.0f, 264.0f, 352.0f)
                close()
            }
        }
        .build()
        return _fileLines!!
    }

private var _fileLines: ImageVector? = null