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

public val Octicons.Lock24: ImageVector
    get() {
        if (_lock24 != null) {
            return _lock24!!
        }
        _lock24 = Builder(name = "Lock24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                lineTo(6.0f, 7.25f)
                curveTo(6.0f, 3.845f, 8.503f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(6.0f, 2.845f, 6.0f, 6.25f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineToRelative(-8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 9.0f)
                close()
                moveTo(4.5f, 11.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(7.5f, 7.25f)
                lineTo(7.5f, 9.0f)
                horizontalLineToRelative(9.0f)
                lineTo(16.5f, 7.25f)
                curveToRelative(0.0f, -2.67f, -1.922f, -4.75f, -4.5f, -4.75f)
                curveToRelative(-2.578f, 0.0f, -4.5f, 2.08f, -4.5f, 4.75f)
                close()
            }
        }
        .build()
        return _lock24!!
    }

private var _lock24: ImageVector? = null
