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

public val Octicons.PivotColumn16: ImageVector
    get() {
        if (_pivotColumn16 != null) {
            return _pivotColumn16!!
        }
        _pivotColumn16 = Builder(name = "PivotColumn16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                horizontalLineToRelative(12.5f)
                curveTo(15.217f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(14.5f, 6.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                close()
                moveTo(1.5f, 6.5f)
                verticalLineToRelative(7.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                lineTo(5.0f, 14.5f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(6.5f, 5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(6.5f, 1.5f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 1.5f)
                lineTo(1.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(1.5f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.017f, 9.89f)
                lineToRelative(-2.882f, 2.677f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, 0.0f, 0.366f)
                lineToRelative(2.882f, 2.677f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.421f, -0.183f)
                verticalLineTo(13.5f)
                horizontalLineTo(12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.0f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.062f)
                verticalLineToRelative(-1.927f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.421f, -0.183f)
                close()
            }
        }
        .build()
        return _pivotColumn16!!
    }

private var _pivotColumn16: ImageVector? = null
