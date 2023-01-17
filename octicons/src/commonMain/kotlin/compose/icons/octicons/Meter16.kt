package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Meter16: ImageVector
    get() {
        if (_meter16 != null) {
            return _meter16!!
        }
        _meter16 = Builder(name = "Meter16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 6.016f, 4.035f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.388f, -0.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -4.37f, -4.37f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.569f, 1.389f)
                arcTo(6.473f, 6.473f, 0.0f, false, false, 8.0f, 1.5f)
                close()
                moveTo(14.28f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-4.063f, 4.064f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(13.22f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
                moveTo(7.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _meter16!!
    }

private var _meter16: ImageVector? = null
