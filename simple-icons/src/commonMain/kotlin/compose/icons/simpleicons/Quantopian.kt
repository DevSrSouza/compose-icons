package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Quantopian: ImageVector
    get() {
        if (_quantopian != null) {
            return _quantopian!!
        }
        _quantopian = Builder(name = "Quantopian", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(9.5f, 9.5f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(12.5f, 6.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(8.5f, 12.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.603f, 0.4f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.403f, 0.0f, -0.494f, -0.275f, -0.5f, -0.5f)
                lineTo(12.5f, 15.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(15.5f, 9.5f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                moveTo(1.0f, 21.5f)
                verticalLineToRelative(-19.0f)
                curveTo(1.0f, 1.673f, 1.673f, 1.0f, 2.5f, 1.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-19.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 21.5f)
                verticalLineToRelative(-19.0f)
                curveTo(24.0f, 1.121f, 22.878f, 0.0f, 21.5f, 0.0f)
                horizontalLineToRelative(-19.0f)
                arcTo(2.503f, 2.503f, 0.0f, false, false, 0.0f, 2.5f)
                verticalLineToRelative(19.0f)
                curveTo(0.0f, 22.878f, 1.121f, 24.0f, 2.5f, 24.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _quantopian!!
    }

private var _quantopian: ImageVector? = null
