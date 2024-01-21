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

public val Octicons.ChevronDown16: ImageVector
    get() {
        if (_chevronDown16 != null) {
            return _chevronDown16!!
        }
        _chevronDown16 = Builder(name = "ChevronDown16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.78f, 5.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.06f, 0.0f)
                lineTo(3.22f, 6.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, -1.06f)
                lineTo(8.0f, 8.939f)
                lineToRelative(3.72f, -3.719f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _chevronDown16!!
    }

private var _chevronDown16: ImageVector? = null
