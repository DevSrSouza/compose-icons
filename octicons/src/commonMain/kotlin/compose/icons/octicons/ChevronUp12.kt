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

public val Octicons.ChevronUp12: ImageVector
    get() {
        if (_chevronUp12 != null) {
            return _chevronUp12!!
        }
        _chevronUp12 = Builder(name = "ChevronUp12", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveToRelative(-0.2f, 0.0f, -0.4f, 0.1f, -0.5f, 0.2f)
                lineTo(2.2f, 7.5f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.8f, 0.0f, 1.1f)
                curveToRelative(0.3f, 0.3f, 0.8f, 0.3f, 1.1f, 0.0f)
                lineTo(6.0f, 5.9f)
                lineToRelative(2.7f, 2.7f)
                curveToRelative(0.3f, 0.3f, 0.8f, 0.3f, 1.1f, 0.0f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.8f, 0.0f, -1.1f)
                lineTo(6.6f, 4.3f)
                curveTo(6.4f, 4.1f, 6.2f, 4.0f, 6.0f, 4.0f)
                close()
            }
        }
        .build()
        return _chevronUp12!!
    }

private var _chevronUp12: ImageVector? = null
