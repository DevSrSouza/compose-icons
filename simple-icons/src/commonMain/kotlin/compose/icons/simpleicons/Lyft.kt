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

public val SimpleIcons.Lyft: ImageVector
    get() {
        if (_lyft != null) {
            return _lyft!!
        }
        _lyft = Builder(name = "Lyft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.38f, 15.883f)
                curveToRelative(0.036f, 0.042f, 0.125f, 0.135f, 0.125f, 0.135f)
                reflectiveCurveToRelative(-0.094f, 0.059f, -0.152f, 0.086f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, true, -1.28f, 0.286f)
                curveTo(1.593f, 16.39f, 0.0f, 15.29f, 0.0f, 12.878f)
                verticalLineToRelative(-8.78f)
                horizontalLineToRelative(3.512f)
                verticalLineToRelative(9.365f)
                curveToRelative(0.0f, 0.95f, 0.306f, 1.781f, 0.867f, 2.42f)
                close()
                moveTo(24.0f, 11.122f)
                lineTo(24.0f, 7.61f)
                horizontalLineToRelative(-1.253f)
                curveToRelative(-0.524f, -2.76f, -3.425f, -4.574f, -6.341f, -3.484f)
                curveToRelative(-1.624f, 0.607f, -2.943f, 2.548f, -2.943f, 4.282f)
                verticalLineToRelative(7.979f)
                arcToRelative(1608.8f, 1608.8f, 0.0f, false, false, 0.153f, 0.0f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, 2.38f, -1.077f)
                curveToRelative(0.632f, -0.658f, 0.98f, -1.522f, 0.98f, -2.432f)
                horizontalLineToRelative(1.463f)
                lineTo(18.439f, 9.366f)
                horizontalLineToRelative(-1.463f)
                lineTo(16.976f, 8.4f)
                curveToRelative(0.0f, -0.375f, 0.198f, -0.726f, 0.526f, -0.909f)
                curveToRelative(0.9f, -0.5f, 1.815f, 0.143f, 1.815f, 0.996f)
                verticalLineToRelative(3.22f)
                curveToRelative(0.0f, 1.273f, 0.48f, 2.456f, 1.354f, 3.329f)
                arcToRelative(4.666f, 4.666f, 0.0f, false, false, 3.178f, 1.351f)
                lineTo(24.0f, 16.387f)
                verticalLineToRelative(-3.51f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, true, -1.17f, -1.17f)
                verticalLineToRelative(-0.586f)
                lineTo(24.0f, 11.121f)
                close()
                moveTo(9.073f, 12.292f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, true, -1.17f, 0.0f)
                lineTo(7.903f, 7.61f)
                lineTo(4.39f, 7.61f)
                verticalLineToRelative(5.853f)
                arcToRelative(2.928f, 2.928f, 0.0f, false, false, 4.83f, 2.224f)
                curveToRelative(-0.055f, 0.433f, -0.294f, 0.792f, -0.69f, 1.04f)
                curveToRelative(-0.373f, 0.234f, -0.857f, 0.357f, -1.402f, 0.357f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, true, -1.65f, -0.382f)
                reflectiveCurveToRelative(-0.093f, -0.044f, -0.21f, -0.11f)
                verticalLineToRelative(3.119f)
                arcToRelative(6.65f, 6.65f, 0.0f, false, false, 2.468f, 0.484f)
                curveToRelative(1.312f, 0.0f, 2.51f, -0.41f, 3.371f, -1.155f)
                curveToRelative(0.967f, -0.836f, 1.478f, -2.056f, 1.478f, -3.528f)
                lineTo(12.585f, 7.61f)
                lineTo(9.073f, 7.61f)
                verticalLineToRelative(4.683f)
                close()
            }
        }
        .build()
        return _lyft!!
    }

private var _lyft: ImageVector? = null
