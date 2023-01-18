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

public val RemixIcons.ContrastDropLine: ImageVector
    get() {
        if (_contrastDropLine != null) {
            return _contrastDropLine!!
        }
        _contrastDropLine = Builder(name = "ContrastDropLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.1f)
                lineTo(7.05f, 8.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 9.9f, 0.0f)
                lineTo(12.0f, 3.1f)
                close()
                moveTo(12.0f, 0.272f)
                lineToRelative(6.364f, 6.364f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -12.728f, 0.0f)
                lineTo(12.0f, 0.272f)
                close()
                moveTo(12.0f, 18.0f)
                lineTo(12.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
            }
        }
        .build()
        return _contrastDropLine!!
    }

private var _contrastDropLine: ImageVector? = null