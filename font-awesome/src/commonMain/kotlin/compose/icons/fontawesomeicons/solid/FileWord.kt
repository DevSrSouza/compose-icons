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

public val SolidGroup.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(111.0f, 257.1f)
                lineToRelative(26.8f, 89.2f)
                lineToRelative(31.6f, -90.3f)
                curveToRelative(3.4f, -9.6f, 12.5f, -16.1f, 22.7f, -16.1f)
                reflectiveCurveToRelative(19.3f, 6.4f, 22.7f, 16.1f)
                lineToRelative(31.6f, 90.3f)
                lineTo(273.0f, 257.1f)
                curveToRelative(3.8f, -12.7f, 17.2f, -19.9f, 29.9f, -16.1f)
                reflectiveCurveToRelative(19.9f, 17.2f, 16.1f, 29.9f)
                lineToRelative(-48.0f, 160.0f)
                curveToRelative(-3.0f, 10.0f, -12.0f, 16.9f, -22.4f, 17.1f)
                reflectiveCurveToRelative(-19.8f, -6.2f, -23.2f, -16.1f)
                lineTo(192.0f, 336.6f)
                lineToRelative(-33.3f, 95.3f)
                curveToRelative(-3.4f, 9.8f, -12.8f, 16.3f, -23.2f, 16.1f)
                reflectiveCurveToRelative(-19.5f, -7.1f, -22.4f, -17.1f)
                lineToRelative(-48.0f, -160.0f)
                curveToRelative(-3.8f, -12.7f, 3.4f, -26.1f, 16.1f, -29.9f)
                reflectiveCurveToRelative(26.1f, 3.4f, 29.9f, 16.1f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
