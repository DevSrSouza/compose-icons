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

public val SimpleIcons.Lunacy: ImageVector
    get() {
        if (_lunacy != null) {
            return _lunacy!!
        }
        _lunacy = Builder(name = "Lunacy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.031f, 6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(11.996f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-5.996f, 5.996f)
                close()
                moveTo(18.594f, 8.309f)
                arcToRelative(4.013f, 4.013f, 0.0f, false, true, -2.371f, -2.375f)
                arcToRelative(4.03f, 4.03f, 0.0f, false, true, -2.375f, 2.375f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, true, 2.375f, 2.375f)
                arcToRelative(4.013f, 4.013f, 0.0f, false, true, 2.37f, -2.375f)
                close()
                moveTo(0.0f, 9.602f)
                curveToRelative(0.0f, -3.364f, 0.0f, -5.043f, 0.652f, -6.325f)
                arcTo(6.044f, 6.044f, 0.0f, false, true, 3.277f, 0.652f)
                curveTo(4.56f, 0.0f, 6.238f, 0.0f, 9.602f, 0.0f)
                horizontalLineToRelative(4.796f)
                curveToRelative(3.364f, 0.0f, 5.043f, 0.0f, 6.325f, 0.652f)
                arcToRelative(6.044f, 6.044f, 0.0f, false, true, 2.625f, 2.625f)
                curveTo(24.0f, 4.56f, 24.0f, 6.238f, 24.0f, 9.602f)
                verticalLineToRelative(4.796f)
                curveToRelative(0.0f, 3.364f, 0.0f, 5.043f, -0.652f, 6.325f)
                arcToRelative(6.044f, 6.044f, 0.0f, false, true, -2.625f, 2.625f)
                curveTo(19.44f, 24.0f, 17.762f, 24.0f, 14.398f, 24.0f)
                lineTo(9.602f, 24.0f)
                curveToRelative(-3.364f, 0.0f, -5.043f, 0.0f, -6.325f, -0.652f)
                arcToRelative(6.044f, 6.044f, 0.0f, false, true, -2.625f, -2.625f)
                curveTo(0.0f, 19.44f, 0.0f, 17.762f, 0.0f, 14.398f)
                close()
            }
        }
        .build()
        return _lunacy!!
    }

private var _lunacy: ImageVector? = null
