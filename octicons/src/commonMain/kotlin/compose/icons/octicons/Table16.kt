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

public val Octicons.Table16: ImageVector
    get() {
        if (_table16 != null) {
            return _table16!!
        }
        _table16 = Builder(name = "Table16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                horizontalLineToRelative(12.5f)
                curveTo(15.216f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                lineTo(1.75f, 16.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                close()
                moveTo(6.5f, 6.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(14.5f, 6.5f)
                close()
                moveTo(14.5f, 5.0f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(6.5f, 1.5f)
                lineTo(6.5f, 5.0f)
                close()
                moveTo(1.5f, 6.5f)
                verticalLineToRelative(7.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                lineTo(5.0f, 14.5f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 1.5f)
                lineTo(1.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(1.5f, 5.0f)
                close()
            }
        }
        .build()
        return _table16!!
    }

private var _table16: ImageVector? = null
