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

public val RemixIcons.MickeyFill: ImageVector
    get() {
        if (_mickeyFill != null) {
            return _mickeyFill!!
        }
        _mickeyFill = Builder(name = "MickeyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.883f, 8.913f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.765f, -0.001f)
                arcTo(4.499f, 4.499f, 0.0f, false, true, 5.5f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.493f, 4.254f)
                arcTo(7.998f, 7.998f, 0.0f, false, true, 12.0f, 6.0f)
                curveToRelative(0.693f, 0.0f, 1.365f, 0.088f, 2.006f, 0.254f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 18.5f, 2.0f)
                close()
            }
        }
        .build()
        return _mickeyFill!!
    }

private var _mickeyFill: ImageVector? = null
