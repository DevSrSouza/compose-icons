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

public val Octicons.Calendar24: ImageVector
    get() {
        if (_calendar24 != null) {
            return _calendar24!!
        }
        _calendar24 = Builder(name = "Calendar24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                lineTo(7.5f, 3.0f)
                horizontalLineToRelative(9.0f)
                lineTo(16.5f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(18.0f, 3.0f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                lineTo(3.25f, 22.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                verticalLineToRelative(-16.0f)
                curveTo(1.5f, 3.784f, 2.284f, 3.0f, 3.25f, 3.0f)
                lineTo(6.0f, 3.0f)
                lineTo(6.0f, 0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.75f, 0.0f)
                close()
                moveTo(21.0f, 9.5f)
                lineTo(3.0f, 9.5f)
                verticalLineToRelative(11.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(17.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(3.25f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _calendar24!!
    }

private var _calendar24: ImageVector? = null
