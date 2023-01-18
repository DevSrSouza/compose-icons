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

public val RemixIcons.DoubleQuotesL: ImageVector
    get() {
        if (_doubleQuotesL != null) {
            return _doubleQuotesL!!
        }
        _doubleQuotesL = Builder(name = "DoubleQuotesL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.583f, 17.321f)
                curveTo(3.553f, 16.227f, 3.0f, 15.0f, 3.0f, 13.011f)
                curveToRelative(0.0f, -3.5f, 2.457f, -6.637f, 6.03f, -8.188f)
                lineToRelative(0.893f, 1.378f)
                curveToRelative(-3.335f, 1.804f, -3.987f, 4.145f, -4.247f, 5.621f)
                curveToRelative(0.537f, -0.278f, 1.24f, -0.375f, 1.929f, -0.311f)
                curveToRelative(1.804f, 0.167f, 3.226f, 1.648f, 3.226f, 3.489f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                curveToRelative(-1.073f, 0.0f, -2.099f, -0.49f, -2.748f, -1.179f)
                close()
                moveTo(14.583f, 17.321f)
                curveTo(13.553f, 16.227f, 13.0f, 15.0f, 13.0f, 13.011f)
                curveToRelative(0.0f, -3.5f, 2.457f, -6.637f, 6.03f, -8.188f)
                lineToRelative(0.893f, 1.378f)
                curveToRelative(-3.335f, 1.804f, -3.987f, 4.145f, -4.247f, 5.621f)
                curveToRelative(0.537f, -0.278f, 1.24f, -0.375f, 1.929f, -0.311f)
                curveToRelative(1.804f, 0.167f, 3.226f, 1.648f, 3.226f, 3.489f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                curveToRelative(-1.073f, 0.0f, -2.099f, -0.49f, -2.748f, -1.179f)
                close()
            }
        }
        .build()
        return _doubleQuotesL!!
    }

private var _doubleQuotesL: ImageVector? = null
