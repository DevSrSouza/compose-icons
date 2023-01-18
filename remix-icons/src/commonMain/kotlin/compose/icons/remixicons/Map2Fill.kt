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

public val RemixIcons.Map2Fill: ImageVector
    get() {
        if (_map2Fill != null) {
            return _map2Fill!!
        }
        _map2Fill = Builder(name = "Map2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineToRelative(7.0f, -3.0f)
                lineToRelative(6.0f, 3.0f)
                lineToRelative(6.303f, -2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.697f, 0.46f)
                lineTo(22.0f, 19.0f)
                lineToRelative(-7.0f, 3.0f)
                lineToRelative(-6.0f, -3.0f)
                lineToRelative(-6.303f, 2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.697f, -0.46f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(15.0f, 19.764f)
                lineTo(15.0f, 7.176f)
                lineToRelative(-0.065f, 0.028f)
                lineTo(9.0f, 4.236f)
                verticalLineToRelative(12.588f)
                lineToRelative(0.065f, -0.028f)
                lineTo(15.0f, 19.764f)
                close()
            }
        }
        .build()
        return _map2Fill!!
    }

private var _map2Fill: ImageVector? = null
