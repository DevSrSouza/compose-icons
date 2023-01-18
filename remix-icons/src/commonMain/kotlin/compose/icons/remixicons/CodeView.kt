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

public val RemixIcons.CodeView: ImageVector
    get() {
        if (_codeView != null) {
            return _codeView!!
        }
        _codeView = Builder(name = "CodeView", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 8.464f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(20.485f, 12.0f)
                lineTo(16.95f, 8.464f)
                close()
                moveTo(7.05f, 8.464f)
                lineTo(3.515f, 12.0f)
                lineToRelative(3.535f, 3.536f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.686f, 12.0f)
                lineToRelative(4.95f, -4.95f)
                lineTo(7.05f, 8.464f)
                close()
            }
        }
        .build()
        return _codeView!!
    }

private var _codeView: ImageVector? = null
