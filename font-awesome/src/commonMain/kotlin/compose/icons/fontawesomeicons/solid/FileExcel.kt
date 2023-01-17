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

public val SolidGroup.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
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
                moveTo(155.7f, 250.2f)
                lineTo(192.0f, 302.1f)
                lineToRelative(36.3f, -51.9f)
                curveToRelative(7.6f, -10.9f, 22.6f, -13.5f, 33.4f, -5.9f)
                reflectiveCurveToRelative(13.5f, 22.6f, 5.9f, 33.4f)
                lineTo(221.3f, 344.0f)
                lineToRelative(46.4f, 66.2f)
                curveToRelative(7.6f, 10.9f, 5.0f, 25.8f, -5.9f, 33.4f)
                reflectiveCurveToRelative(-25.8f, 5.0f, -33.4f, -5.9f)
                lineTo(192.0f, 385.8f)
                lineToRelative(-36.3f, 51.9f)
                curveToRelative(-7.6f, 10.9f, -22.6f, 13.5f, -33.4f, 5.9f)
                reflectiveCurveToRelative(-13.5f, -22.6f, -5.9f, -33.4f)
                lineTo(162.7f, 344.0f)
                lineToRelative(-46.4f, -66.2f)
                curveToRelative(-7.6f, -10.9f, -5.0f, -25.8f, 5.9f, -33.4f)
                reflectiveCurveToRelative(25.8f, -5.0f, 33.4f, 5.9f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
