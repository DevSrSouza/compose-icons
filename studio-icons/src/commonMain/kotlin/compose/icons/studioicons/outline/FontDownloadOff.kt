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

public val OutlineGroup.FontDownloadOff: ImageVector
    get() {
        if (_fontDownloadOff != null) {
            return _fontDownloadOff!!
        }
        _fontDownloadOff = Builder(name = "FontDownloadOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.83f, 2.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(15.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.83f)
                lineTo(4.83f, 2.0f)
                close()
                moveTo(10.92f, 6.0f)
                lineToRelative(-0.57f, 1.52f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(0.23f, -0.66f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.54f, 1.52f)
                lineToRelative(3.04f, 3.04f)
                lineTo(13.07f, 6.0f)
                horizontalLineTo(10.92f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(19.17f, 22.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(4.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(17.17f, 20.0f)
                lineToRelative(-5.07f, -5.07f)
                horizontalLineTo(9.58f)
                lineTo(8.49f, 18.0f)
                horizontalLineTo(6.41f)
                lineToRelative(2.39f, -6.37f)
                lineTo(4.0f, 6.83f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.17f)
                close()
            }
        }
        .build()
        return _fontDownloadOff!!
    }

private var _fontDownloadOff: ImageVector? = null
