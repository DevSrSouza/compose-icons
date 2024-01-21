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

public val Octicons.ChevronDown24: ImageVector
    get() {
        if (_chevronDown24 != null) {
            return _chevronDown24!!
        }
        _chevronDown24 = Builder(name = "ChevronDown24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.22f, 8.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(6.25f, -6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(12.0f, 13.939f)
                lineTo(6.28f, 8.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _chevronDown24!!
    }

private var _chevronDown24: ImageVector? = null
