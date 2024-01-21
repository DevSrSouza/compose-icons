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

public val Octicons.SquareFill24: ImageVector
    get() {
        if (_squareFill24 != null) {
            return _squareFill24!!
        }
        _squareFill24 = Builder(name = "SquareFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 6.0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 16.25f, 18.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 6.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                curveTo(6.0f, 6.784f, 6.784f, 6.0f, 7.75f, 6.0f)
                close()
            }
        }
        .build()
        return _squareFill24!!
    }

private var _squareFill24: ImageVector? = null
