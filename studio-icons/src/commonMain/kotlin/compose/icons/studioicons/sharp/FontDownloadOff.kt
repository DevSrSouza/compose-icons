package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FontDownloadOff: ImageVector
    get() {
        if (_fontDownloadOff != null) {
            return _fontDownloadOff!!
        }
        _fontDownloadOff = Builder(name = "FontDownloadOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.58f, 9.75f)
                lineToRelative(-0.87f, -0.87f)
                lineToRelative(0.23f, -0.66f)
                horizontalLineToRelative(0.1f)
                lineTo(12.58f, 9.75f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(19.17f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(12.1f, 14.93f)
                lineToRelative(-3.3f, -3.3f)
                lineTo(6.41f, 18.0f)
                horizontalLineToRelative(2.08f)
                lineToRelative(1.09f, -3.07f)
                horizontalLineTo(12.1f)
                close()
                moveTo(10.35f, 7.52f)
                lineTo(10.92f, 6.0f)
                horizontalLineToRelative(2.14f)
                lineToRelative(2.55f, 6.79f)
                lineTo(22.0f, 19.17f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.83f)
                lineTo(10.35f, 7.52f)
                close()
            }
        }
        .build()
        return _fontDownloadOff!!
    }

private var _fontDownloadOff: ImageVector? = null
