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

public val Octicons.ProjectTemplate16: ImageVector
    get() {
        if (_projectTemplate16 != null) {
            return _projectTemplate16!!
        }
        _projectTemplate16 = Builder(name = "ProjectTemplate16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 1.75f)
                verticalLineToRelative(1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(0.0f, 1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                horizontalLineToRelative(1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(1.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(6.438f, 0.0f)
                horizontalLineToRelative(3.124f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(6.438f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                close()
                moveTo(12.688f, 0.0f)
                horizontalLineToRelative(1.562f)
                curveTo(15.217f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                close()
                moveTo(1.5f, 6.438f)
                verticalLineToRelative(3.124f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(0.0f, 6.438f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                close()
                moveTo(16.0f, 6.438f)
                verticalLineToRelative(3.124f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(14.5f, 6.438f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                close()
                moveTo(1.5f, 12.688f)
                verticalLineToRelative(1.562f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(1.75f, 16.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                verticalLineToRelative(-1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                close()
                moveTo(16.0f, 12.688f)
                verticalLineToRelative(1.562f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                horizontalLineToRelative(-1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.562f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-1.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                close()
                moveTo(6.438f, 14.5f)
                horizontalLineToRelative(3.124f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(6.438f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                close()
                moveTo(6.5f, 3.0f)
                verticalLineToRelative(1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 4.0f)
                lineTo(5.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(2.25f, 5.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.0f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(6.75f, 5.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(5.75f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(6.5f, 10.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(10.0f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _projectTemplate16!!
    }

private var _projectTemplate16: ImageVector? = null
