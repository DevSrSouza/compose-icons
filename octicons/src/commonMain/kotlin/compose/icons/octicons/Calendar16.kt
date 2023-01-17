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

public val Octicons.Calendar16: ImageVector
    get() {
        if (_calendar16 != null) {
            return _calendar16!!
        }
        _calendar16 = Builder(name = "Calendar16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                lineTo(5.5f, 2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.5f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 16.0f)
                lineTo(2.75f, 16.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 14.25f)
                lineTo(1.0f, 3.75f)
                curveTo(1.0f, 2.784f, 1.784f, 2.0f, 2.75f, 2.0f)
                lineTo(4.0f, 2.0f)
                lineTo(4.0f, 0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.75f, 0.0f)
                close()
                moveTo(2.5f, 7.5f)
                verticalLineToRelative(6.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(13.5f, 7.5f)
                close()
                moveTo(13.25f, 3.5f)
                lineTo(2.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(2.5f, 6.0f)
                horizontalLineToRelative(11.0f)
                lineTo(13.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _calendar16!!
    }

private var _calendar16: ImageVector? = null
