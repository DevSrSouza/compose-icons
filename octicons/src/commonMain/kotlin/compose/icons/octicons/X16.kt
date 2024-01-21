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

public val Octicons.X16: ImageVector
    get() {
        if (_x16 != null) {
            return _x16!!
        }
        _x16 = Builder(name = "X16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineTo(8.0f, 6.94f)
                lineToRelative(3.22f, -3.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.275f, 0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.215f, 0.734f)
                lineTo(9.06f, 8.0f)
                lineToRelative(3.22f, 3.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineTo(8.0f, 9.06f)
                lineToRelative(-3.22f, 3.22f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, -0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, -1.042f)
                lineTo(6.94f, 8.0f)
                lineTo(3.72f, 4.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _x16!!
    }

private var _x16: ImageVector? = null
