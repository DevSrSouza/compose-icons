package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.RvHookup: ImageVector
    get() {
        if (_rvHookup != null) {
            return _rvHookup!!
        }
        _rvHookup = Builder(name = "RvHookup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(-0.74f)
                curveToRelative(0.0f, -0.46f, -0.56f, -0.7f, -0.89f, -0.37f)
                lineTo(4.37f, 9.63f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.53f, 0.0f, 0.74f)
                lineToRelative(1.74f, 1.74f)
                curveToRelative(0.33f, 0.33f, 0.89f, 0.1f, 0.89f, -0.37f)
                lineTo(7.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 20.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.0f, 0.46f, 0.56f, 0.7f, 0.89f, 0.37f)
                lineToRelative(1.74f, -1.74f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.53f, 0.0f, -0.74f)
                lineToRelative(-1.74f, -1.74f)
                curveToRelative(-0.33f, -0.33f, -0.89f, -0.1f, -0.89f, 0.37f)
                lineTo(17.0f, 4.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _rvHookup!!
    }

private var _rvHookup: ImageVector? = null
