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

public val Octicons.BellFill16: ImageVector
    get() {
        if (_bellFill16 != null) {
            return _bellFill16!!
        }
        _bellFill16 = Builder(name = "BellFill16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                curveToRelative(0.9f, 0.0f, 1.7f, -0.6f, 1.9f, -1.5f)
                curveToRelative(0.1f, -0.3f, -0.1f, -0.5f, -0.4f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.3f, 0.0f, -0.5f, 0.2f, -0.4f, 0.5f)
                curveToRelative(0.2f, 0.9f, 1.0f, 1.5f, 1.9f, 1.5f)
                close()
                moveTo(3.0f, 5.0f)
                curveToRelative(0.0f, -2.8f, 2.2f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.2f, 5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(1.7f, 2.6f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.5f, 0.3f, 0.8f)
                curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-0.8f, 0.1f, -1.5f, -0.6f, -1.5f, -1.4f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.6f, 0.3f, -0.8f)
                lineTo(3.0f, 8.1f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _bellFill16!!
    }

private var _bellFill16: ImageVector? = null
