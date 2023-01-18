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

public val RemixIcons.SingleQuotesR: ImageVector
    get() {
        if (_singleQuotesR != null) {
            return _singleQuotesR!!
        }
        _singleQuotesR = Builder(name = "SingleQuotesR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.417f, 6.679f)
                curveTo(15.447f, 7.773f, 16.0f, 9.0f, 16.0f, 10.989f)
                curveToRelative(0.0f, 3.5f, -2.457f, 6.637f, -6.03f, 8.188f)
                lineToRelative(-0.893f, -1.378f)
                curveToRelative(3.335f, -1.804f, 3.987f, -4.145f, 4.247f, -5.621f)
                curveToRelative(-0.537f, 0.278f, -1.24f, 0.375f, -1.929f, 0.311f)
                curveTo(9.591f, 12.322f, 8.17f, 10.841f, 8.17f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                curveToRelative(1.073f, 0.0f, 2.099f, 0.49f, 2.748f, 1.179f)
                close()
            }
        }
        .build()
        return _singleQuotesR!!
    }

private var _singleQuotesR: ImageVector? = null
