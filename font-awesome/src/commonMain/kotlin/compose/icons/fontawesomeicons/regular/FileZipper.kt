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

public val RegularGroup.FileZipper: ImageVector
    get() {
        if (_fileZipper != null) {
            return _fileZipper!!
        }
        _fileZipper = Builder(name = "FileZipper", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
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
                horizontalLineToRelative(48.0f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(48.13f)
                horizontalLineToRelative(48.01f)
                lineTo(224.0f, 128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(79.1f)
                verticalLineTo(448.0f)
                close()
                moveTo(176.0f, 96.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(176.0f, 160.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(160.0f)
                close()
                moveTo(176.0f, 224.0f)
                horizontalLineToRelative(-64.0f)
                lineToRelative(-30.56f, 116.5f)
                curveTo(73.51f, 379.5f, 103.7f, 416.0f, 144.3f, 416.0f)
                curveToRelative(40.26f, 0.0f, 70.45f, -36.3f, 62.68f, -75.15f)
                lineTo(176.0f, 224.0f)
                close()
                moveTo(160.0f, 368.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-8.836f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.836f, 0.0f, 16.0f, 7.164f, 16.0f, 16.0f)
                reflectiveCurveTo(168.8f, 368.0f, 160.0f, 368.0f)
                close()
            }
        }
        .build()
        return _fileZipper!!
    }

private var _fileZipper: ImageVector? = null
