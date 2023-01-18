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

public val RemixIcons.DropboxFill: ImageVector
    get() {
        if (_dropboxFill != null) {
            return _dropboxFill!!
        }
        _dropboxFill = Builder(name = "DropboxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.285f, 10.668f)
                lineToRelative(5.215f, 3.323f)
                lineToRelative(-5.252f, 3.346f)
                lineTo(12.0f, 13.993f)
                lineToRelative(-5.248f, 3.344f)
                lineTo(1.5f, 13.99f)
                lineToRelative(5.215f, -3.323f)
                lineTo(1.5f, 7.346f)
                lineTo(6.752f, 4.0f)
                lineTo(12.0f, 7.343f)
                lineTo(17.248f, 4.0f)
                lineTo(22.5f, 7.346f)
                lineToRelative(-5.215f, 3.322f)
                close()
                moveTo(17.211f, 10.668f)
                lineTo(12.0f, 7.348f)
                lineToRelative(-5.211f, 3.32f)
                lineTo(12.0f, 13.988f)
                lineToRelative(5.211f, -3.32f)
                close()
                moveTo(6.786f, 18.446f)
                lineToRelative(5.252f, -3.346f)
                lineToRelative(5.252f, 3.346f)
                lineToRelative(-5.252f, 3.346f)
                lineToRelative(-5.252f, -3.346f)
                close()
            }
        }
        .build()
        return _dropboxFill!!
    }

private var _dropboxFill: ImageVector? = null
