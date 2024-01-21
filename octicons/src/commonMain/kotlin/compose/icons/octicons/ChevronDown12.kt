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

public val Octicons.ChevronDown12: ImageVector
    get() {
        if (_chevronDown12 != null) {
            return _chevronDown12!!
        }
        _chevronDown12 = Builder(name = "ChevronDown12", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.825f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.1f, -0.5f, -0.2f)
                lineToRelative(-3.3f, -3.3f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.8f, 0.0f, -1.1f)
                curveToRelative(0.3f, -0.3f, 0.8f, -0.3f, 1.1f, 0.0f)
                lineToRelative(2.7f, 2.7f)
                lineToRelative(2.7f, -2.7f)
                curveToRelative(0.3f, -0.3f, 0.8f, -0.3f, 1.1f, 0.0f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.8f, 0.0f, 1.1f)
                lineToRelative(-3.2f, 3.2f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.6f, 0.3f)
                close()
            }
        }
        .build()
        return _chevronDown12!!
    }

private var _chevronDown12: ImageVector? = null
