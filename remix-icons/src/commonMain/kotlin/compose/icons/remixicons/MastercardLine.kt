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

public val RemixIcons.MastercardLine: ImageVector
    get() {
        if (_mastercardLine != null) {
            return _mastercardLine!!
        }
        _mastercardLine = Builder(name = "MastercardLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.294f)
                arcToRelative(7.3f, 7.3f, 0.0f, true, true, 0.0f, -12.588f)
                arcToRelative(7.3f, 7.3f, 0.0f, true, true, 0.0f, 12.588f)
                close()
                moveTo(13.702f, 16.91f)
                arcToRelative(5.3f, 5.3f, 0.0f, true, false, 0.0f, -9.82f)
                arcTo(7.273f, 7.273f, 0.0f, false, true, 15.6f, 12.0f)
                curveToRelative(0.0f, 1.89f, -0.719f, 3.614f, -1.898f, 4.91f)
                close()
                moveTo(10.298f, 7.09f)
                arcToRelative(5.3f, 5.3f, 0.0f, true, false, 0.0f, 9.82f)
                arcTo(7.273f, 7.273f, 0.0f, false, true, 8.4f, 12.0f)
                curveToRelative(0.0f, -1.89f, 0.719f, -3.614f, 1.898f, -4.91f)
                close()
                moveTo(12.0f, 8.205f)
                arcTo(5.284f, 5.284f, 0.0f, false, false, 10.4f, 12.0f)
                curveToRelative(0.0f, 1.488f, 0.613f, 2.832f, 1.6f, 3.795f)
                arcTo(5.284f, 5.284f, 0.0f, false, false, 13.6f, 12.0f)
                arcTo(5.284f, 5.284f, 0.0f, false, false, 12.0f, 8.205f)
                close()
            }
        }
        .build()
        return _mastercardLine!!
    }

private var _mastercardLine: ImageVector? = null
