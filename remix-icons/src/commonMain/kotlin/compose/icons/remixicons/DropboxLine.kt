package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DropboxLine: ImageVector
    get() {
        if (_dropboxLine != null) {
            return _dropboxLine!!
        }
        _dropboxLine = Builder(name = "DropboxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.646f, 17.26f)
                lineToRelative(3.392f, 2.162f)
                lineToRelative(3.392f, -2.161f)
                lineToRelative(1.86f, 1.185f)
                lineToRelative(-5.252f, 3.346f)
                lineToRelative(-5.252f, -3.346f)
                lineToRelative(1.86f, -1.185f)
                close()
                moveTo(7.769f, 8.98f)
                lineToRelative(2.393f, -1.553f)
                lineToRelative(-2.425f, -1.574f)
                lineTo(5.28f, 7.37f)
                lineTo(7.77f, 8.98f)
                close()
                moveTo(9.609f, 10.17f)
                lineTo(12.0f, 11.719f)
                lineToRelative(2.39f, -1.547f)
                lineTo(12.0f, 8.619f)
                lineToRelative(-2.391f, 1.552f)
                close()
                moveTo(13.84f, 12.91f)
                lineToRelative(2.424f, 1.568f)
                lineToRelative(2.45f, -1.502f)
                lineToRelative(-2.485f, -1.612f)
                lineToRelative(-2.389f, 1.545f)
                close()
                moveTo(12.0f, 6.234f)
                lineToRelative(4.237f, -2.748f)
                lineTo(22.46f, 7.33f)
                lineToRelative(-4.392f, 2.843f)
                lineToRelative(4.393f, 2.85f)
                lineToRelative(-6.226f, 3.819f)
                lineTo(12.0f, 14.1f)
                lineToRelative(-4.235f, 2.74f)
                lineToRelative(-6.23f, -3.817f)
                lineToRelative(4.396f, -2.851f)
                lineTo(1.539f, 7.33f)
                lineToRelative(6.224f, -3.843f)
                lineTo(12.0f, 6.235f)
                close()
                moveTo(13.837f, 7.426f)
                lineTo(16.23f, 8.98f)
                lineToRelative(2.489f, -1.61f)
                lineToRelative(-2.456f, -1.517f)
                lineToRelative(-2.426f, 1.574f)
                close()
                moveTo(10.16f, 12.91f)
                lineToRelative(-2.39f, -1.546f)
                lineToRelative(-2.486f, 1.613f)
                lineToRelative(2.451f, 1.502f)
                lineToRelative(2.425f, -1.569f)
                close()
            }
        }
        .build()
        return _dropboxLine!!
    }

private var _dropboxLine: ImageVector? = null
