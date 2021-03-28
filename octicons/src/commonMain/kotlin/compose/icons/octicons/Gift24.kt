package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Gift24: ImageVector
    get() {
        if (_gift24 != null) {
            return _gift24!!
        }
        _gift24 = Builder(name = "Gift24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.75f, 3.75f)
                curveToRelative(0.0f, 0.844f, 0.279f, 1.623f, 0.75f, 2.25f)
                lineTo(2.75f, 6.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 1.0f, 7.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.698f, 0.409f, 1.3f, 1.0f, 1.582f)
                verticalLineToRelative(8.418f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 22.0f, 20.25f)
                verticalLineToRelative(-8.418f)
                curveToRelative(0.591f, -0.281f, 1.0f, -0.884f, 1.0f, -1.582f)
                verticalLineToRelative(-2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 21.25f, 6.0f)
                lineTo(19.5f, 6.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -3.0f, -6.0f)
                curveToRelative(-1.456f, 0.0f, -3.436f, 0.901f, -4.5f, 3.11f)
                curveTo(10.936f, 0.901f, 8.955f, 0.0f, 7.5f, 0.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -3.75f, 3.75f)
                close()
                moveTo(11.22f, 6.0f)
                curveToRelative(-0.287f, -3.493f, -2.57f, -4.5f, -3.72f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                horizontalLineToRelative(3.72f)
                close()
                moveTo(20.5f, 12.0f)
                verticalLineToRelative(8.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-7.5f)
                lineTo(12.75f, 12.0f)
                horizontalLineToRelative(7.75f)
                close()
                moveTo(11.25f, 20.5f)
                lineTo(11.25f, 12.0f)
                lineTo(3.5f, 12.0f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(21.25f, 10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(2.75f, 10.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
                moveTo(18.75f, 3.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 16.5f, 6.0f)
                horizontalLineToRelative(-3.72f)
                curveToRelative(0.287f, -3.493f, 2.57f, -4.5f, 3.72f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.25f, 2.25f)
                close()
            }
        }
        .build()
        return _gift24!!
    }

private var _gift24: ImageVector? = null
