package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Project16: ImageVector
    get() {
        if (_project16 != null) {
            return _project16!!
        }
        _project16 = Builder(name = "Project16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 0.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 1.75f)
                verticalLineToRelative(12.5f)
                curveTo(0.0f, 15.216f, 0.784f, 16.0f, 1.75f, 16.0f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 16.0f, 14.25f)
                lineTo(16.0f, 1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 0.0f)
                lineTo(1.75f, 0.0f)
                close()
                moveTo(1.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                lineTo(1.75f, 14.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(1.5f, 1.75f)
                close()
                moveTo(11.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(3.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(8.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.0f, 3.0f)
                close()
            }
        }
        .build()
        return _project16!!
    }

private var _project16: ImageVector? = null
