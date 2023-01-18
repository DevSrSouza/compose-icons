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

public val RemixIcons.RemixiconLine: ImageVector
    get() {
        if (_remixiconLine != null) {
            return _remixiconLine!!
        }
        _remixiconLine = Builder(name = "RemixiconLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.364f, 6.0f)
                lineToRelative(8.784f, 9.663f)
                lineToRelative(0.72f, -0.283f)
                curveToRelative(1.685f, -0.661f, 2.864f, -2.156f, 3.092f, -3.896f)
                arcTo(6.502f, 6.502f, 0.0f, false, true, 12.077f, 6.0f)
                lineTo(6.363f, 6.0f)
                close()
                moveTo(14.0f, 5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.714f, 3.918f)
                curveToRelative(0.186f, 0.618f, 0.286f, 1.271f, 0.286f, 1.947f)
                curveToRelative(0.0f, 2.891f, -1.822f, 5.364f, -4.4f, 6.377f)
                lineTo(20.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 4.0f)
                horizontalLineToRelative(11.111f)
                arcTo(4.515f, 4.515f, 0.0f, false, false, 14.0f, 5.0f)
                close()
                moveTo(18.5f, 7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
                moveTo(5.0f, 7.47f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(10.48f)
                lineTo(5.0f, 7.47f)
                close()
            }
        }
        .build()
        return _remixiconLine!!
    }

private var _remixiconLine: ImageVector? = null
