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

public val RemixIcons.AttachmentFill: ImageVector
    get() {
        if (_attachmentFill != null) {
            return _attachmentFill!!
        }
        _attachmentFill = Builder(name = "AttachmentFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.997f, 2.992f)
                lineTo(21.0f, 21.008f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, 0.992f)
                horizontalLineTo(3.993f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.993f, 2.0f)
                horizontalLineToRelative(16.01f)
                curveToRelative(0.549f, 0.0f, 0.994f, 0.444f, 0.994f, 0.992f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _attachmentFill!!
    }

private var _attachmentFill: ImageVector? = null
