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

public val RemixIcons.MastercardFill: ImageVector
    get() {
        if (_mastercardFill != null) {
            return _mastercardFill!!
        }
        _mastercardFill = Builder(name = "MastercardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.654f)
                arcToRelative(6.786f, 6.786f, 0.0f, false, true, 2.596f, 5.344f)
                arcTo(6.786f, 6.786f, 0.0f, false, true, 12.0f, 17.34f)
                arcToRelative(6.786f, 6.786f, 0.0f, false, true, -2.596f, -5.343f)
                arcTo(6.786f, 6.786f, 0.0f, false, true, 12.0f, 6.654f)
                close()
                moveTo(11.13f, 6.072f)
                arcTo(7.783f, 7.783f, 0.0f, false, false, 8.4f, 12.0f)
                arcToRelative(7.783f, 7.783f, 0.0f, false, false, 2.728f, 5.926f)
                arcToRelative(6.798f, 6.798f, 0.0f, true, true, 0.003f, -11.854f)
                close()
                moveTo(12.872f, 17.926f)
                arcTo(7.783f, 7.783f, 0.0f, false, false, 15.6f, 12.0f)
                arcToRelative(7.783f, 7.783f, 0.0f, false, false, -2.73f, -5.928f)
                arcToRelative(6.798f, 6.798f, 0.0f, true, true, 0.003f, 11.854f)
                close()
            }
        }
        .build()
        return _mastercardFill!!
    }

private var _mastercardFill: ImageVector? = null
