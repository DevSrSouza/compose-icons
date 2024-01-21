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

public val Octicons.ChevronRight12: ImageVector
    get() {
        if (_chevronRight12 != null) {
            return _chevronRight12!!
        }
        _chevronRight12 = Builder(name = "ChevronRight12", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.7f, 10.0f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.1f, -0.5f, -0.2f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.8f, 0.0f, -1.1f)
                lineTo(6.9f, 6.0f)
                lineTo(4.2f, 3.3f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.8f, 0.0f, -1.1f)
                curveToRelative(0.3f, -0.3f, 0.8f, -0.3f, 1.1f, 0.0f)
                lineToRelative(3.3f, 3.2f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.8f, 0.0f, 1.1f)
                lineTo(5.3f, 9.7f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.6f, 0.3f)
                close()
            }
        }
        .build()
        return _chevronRight12!!
    }

private var _chevronRight12: ImageVector? = null
