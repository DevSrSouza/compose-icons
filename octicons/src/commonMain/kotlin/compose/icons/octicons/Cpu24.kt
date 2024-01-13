package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Cpu24: ImageVector
    get() {
        if (_cpu24 != null) {
            return _cpu24!!
        }
        _cpu24 = Builder(name = "Cpu24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 8.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.75f, 8.0f)
                close()
                moveTo(9.5f, 14.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(20.0f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(20.0f, 16.0f)
                verticalLineToRelative(2.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 18.25f, 20.0f)
                lineTo(16.0f, 20.0f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(14.5f, 20.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(8.0f, 20.0f)
                lineTo(5.75f, 20.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 4.0f, 18.25f)
                lineTo(4.0f, 16.0f)
                lineTo(1.75f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(4.0f, 14.5f)
                verticalLineToRelative(-5.0f)
                lineTo(1.75f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 5.75f)
                curveTo(4.0f, 4.784f, 4.784f, 4.0f, 5.75f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(9.5f, 4.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(18.25f, 18.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(18.5f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(5.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _cpu24!!
    }

private var _cpu24: ImageVector? = null
