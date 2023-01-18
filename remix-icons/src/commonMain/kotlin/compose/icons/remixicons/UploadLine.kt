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

public val RemixIcons.UploadLine: ImageVector
    get() {
        if (_uploadLine != null) {
            return _uploadLine!!
        }
        _uploadLine = Builder(name = "UploadLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 5.828f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.828f)
                lineTo(4.929f, 11.9f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(12.0f, 2.0f)
                lineToRelative(8.485f, 8.485f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(13.0f, 5.83f)
                close()
            }
        }
        .build()
        return _uploadLine!!
    }

private var _uploadLine: ImageVector? = null
