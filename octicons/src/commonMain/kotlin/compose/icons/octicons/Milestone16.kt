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

public val Octicons.Milestone16: ImageVector
    get() {
        if (_milestone16 != null) {
            return _milestone16!!
        }
        _milestone16 = Builder(name = "Milestone16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                lineTo(8.5f, 3.0f)
                horizontalLineToRelative(3.634f)
                curveToRelative(0.414f, 0.0f, 0.814f, 0.147f, 1.13f, 0.414f)
                lineToRelative(2.07f, 1.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.672f)
                lineToRelative(-2.07f, 1.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.13f, 0.414f)
                lineTo(8.5f, 10.0f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(7.0f, 10.0f)
                lineTo(2.75f, 10.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 8.25f)
                verticalLineToRelative(-3.5f)
                curveTo(1.0f, 3.784f, 1.784f, 3.0f, 2.75f, 3.0f)
                lineTo(7.0f, 3.0f)
                lineTo(7.0f, 0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.75f, 0.0f)
                close()
                moveTo(12.134f, 8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.161f, -0.06f)
                lineToRelative(2.07f, -1.75f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.0f, -0.38f)
                lineToRelative(-2.07f, -1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.161f, -0.06f)
                lineTo(2.75f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(9.384f)
                close()
            }
        }
        .build()
        return _milestone16!!
    }

private var _milestone16: ImageVector? = null
