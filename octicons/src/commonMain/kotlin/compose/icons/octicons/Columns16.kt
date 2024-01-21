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

public val Octicons.Columns16: ImageVector
    get() {
        if (_columns16 != null) {
            return _columns16!!
        }
        _columns16 = Builder(name = "Columns16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveTo(6.216f, 0.0f, 7.0f, 0.784f, 7.0f, 1.75f)
                verticalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 5.25f, 16.0f)
                horizontalLineToRelative(-2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 14.25f)
                lineTo(1.0f, 1.75f)
                curveTo(1.0f, 0.784f, 1.784f, 0.0f, 2.75f, 0.0f)
                close()
                moveTo(10.75f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveTo(14.216f, 0.0f, 15.0f, 0.784f, 15.0f, 1.75f)
                verticalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 16.0f)
                horizontalLineToRelative(-2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 9.0f, 14.25f)
                lineTo(9.0f, 1.75f)
                curveTo(9.0f, 0.784f, 9.784f, 0.0f, 10.75f, 0.0f)
                close()
                moveTo(2.5f, 1.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(5.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(10.5f, 1.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(13.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _columns16!!
    }

private var _columns16: ImageVector? = null
