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

public val Octicons.Paste24: ImageVector
    get() {
        if (_paste24 != null) {
            return _paste24!!
        }
        _paste24 = Builder(name = "Paste24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.962f, 2.513f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.475f, 0.949f)
                lineToRelative(-0.816f, 0.272f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.171f, 0.237f)
                verticalLineTo(21.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(3.97f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.17f, -0.236f)
                lineToRelative(-0.817f, -0.272f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.474f, -1.424f)
                lineToRelative(0.816f, 0.273f)
                arcTo(1.751f, 1.751f, 0.0f, false, true, 21.0f, 3.97f)
                verticalLineToRelative(17.28f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 19.25f, 23.0f)
                horizontalLineTo(4.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 21.25f)
                verticalLineTo(3.97f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.197f, -1.66f)
                lineToRelative(0.816f, -0.272f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.949f, 0.475f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.75f)
                curveTo(7.0f, 0.784f, 7.784f, 0.0f, 8.75f, 0.0f)
                horizontalLineToRelative(6.5f)
                curveTo(16.216f, 0.0f, 17.0f, 0.784f, 17.0f, 1.75f)
                verticalLineToRelative(1.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 15.25f, 5.0f)
                horizontalLineToRelative(-6.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 7.0f, 3.25f)
                close()
                moveTo(8.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _paste24!!
    }

private var _paste24: ImageVector? = null
