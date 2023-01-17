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

public val Octicons.SquareFill16: ImageVector
    get() {
        if (_squareFill16 != null) {
            return _squareFill16!!
        }
        _squareFill16 = Builder(name = "SquareFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 4.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(4.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 10.25f, 12.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 4.0f, 10.25f)
                verticalLineToRelative(-4.5f)
                curveTo(4.0f, 4.784f, 4.784f, 4.0f, 5.75f, 4.0f)
                close()
            }
        }
        .build()
        return _squareFill16!!
    }

private var _squareFill16: ImageVector? = null
