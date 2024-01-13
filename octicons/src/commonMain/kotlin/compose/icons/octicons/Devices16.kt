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

public val Octicons.Devices16: ImageVector
    get() {
        if (_devices16 != null) {
            return _devices16!!
        }
        _devices16 = Builder(name = "Devices16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.75f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineTo(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineTo(7.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 12.0f)
                horizontalLineToRelative(-0.268f)
                arcToRelative(5.712f, 5.712f, 0.0f, false, true, -0.765f, 2.5f)
                horizontalLineTo(7.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 16.0f)
                horizontalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.565f, -1.243f)
                curveToRelative(0.772f, -0.885f, 1.193f, -1.716f, 1.292f, -2.757f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 10.25f)
                verticalLineToRelative(-7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 7.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                horizontalLineToRelative(-3.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 9.0f, 14.25f)
                verticalLineToRelative(-5.5f)
                curveTo(9.0f, 7.784f, 9.783f, 7.0f, 10.75f, 7.0f)
                close()
                moveTo(10.5f, 8.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _devices16!!
    }

private var _devices16: ImageVector? = null
