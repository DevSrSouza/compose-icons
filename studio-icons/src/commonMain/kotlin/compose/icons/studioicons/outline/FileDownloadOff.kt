package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FileDownloadOff: ImageVector
    get() {
        if (_fileDownloadOff != null) {
            return _fileDownloadOff!!
        }
        _fileDownloadOff = Builder(name = "FileDownloadOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.17f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.17f)
                lineTo(18.0f, 15.17f)
                close()
                moveTo(15.41f, 12.59f)
                lineTo(17.0f, 11.0f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(14.0f, 11.17f)
                lineTo(15.41f, 12.59f)
                close()
                moveTo(13.0f, 10.17f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.17f)
                lineTo(13.0f, 10.17f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-1.78f, -1.78f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(6.19f, 6.19f)
                lineTo(7.0f, 11.0f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.59f, -0.59f)
                lineTo(15.17f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(2.61f, 2.61f)
                lineTo(21.19f, 21.19f)
                close()
            }
        }
        .build()
        return _fileDownloadOff!!
    }

private var _fileDownloadOff: ImageVector? = null
