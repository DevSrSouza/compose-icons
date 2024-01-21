package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.HomeHand: ImageVector
    get() {
        if (_homeHand != null) {
            return _homeHand!!
        }
        _homeHand = Builder(name = "HomeHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.5f)
                lineToRelative(-0.585f, -0.578f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(-0.477f, 0.433f, -0.551f, 1.112f, -0.177f, 1.622f)
                lineToRelative(1.762f, 2.456f)
                curveToRelative(0.37f, 0.506f, 1.331f, 1.0f, 2.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.009f, 0.0f, 1.497f, -0.683f, 1.622f, -1.593f)
                curveToRelative(0.252f, -0.938f, 0.378f, -1.74f, 0.378f, -2.407f)
                curveToRelative(0.0f, -1.0f, -0.939f, -1.843f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.636f)
                curveToRelative(0.0f, -0.754f, -0.672f, -1.364f, -1.5f, -1.364f)
                reflectiveCurveToRelative(-1.5f, 0.61f, -1.5f, 1.364f)
                verticalLineToRelative(4.136f)
                close()
            }
        }
        .build()
        return _homeHand!!
    }

private var _homeHand: ImageVector? = null
