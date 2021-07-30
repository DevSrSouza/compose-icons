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

public val SimpleIcons.Tumblr: ImageVector
    get() {
        if (_tumblr != null) {
            return _tumblr!!
        }
        _tumblr = Builder(name = "Tumblr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.563f, 24.0f)
                curveToRelative(-5.093f, 0.0f, -7.031f, -3.756f, -7.031f, -6.411f)
                verticalLineTo(9.747f)
                horizontalLineTo(5.116f)
                verticalLineTo(6.648f)
                curveToRelative(3.63f, -1.313f, 4.512f, -4.596f, 4.71f, -6.469f)
                curveTo(9.84f, 0.051f, 9.941f, 0.0f, 9.999f, 0.0f)
                horizontalLineToRelative(3.517f)
                verticalLineToRelative(6.114f)
                horizontalLineToRelative(4.801f)
                verticalLineToRelative(3.633f)
                horizontalLineToRelative(-4.82f)
                verticalLineToRelative(7.47f)
                curveToRelative(0.016f, 1.001f, 0.375f, 2.371f, 2.207f, 2.371f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.631f, -0.02f, 1.486f, -0.205f, 1.936f, -0.419f)
                lineToRelative(1.156f, 3.425f)
                curveToRelative(-0.436f, 0.636f, -2.4f, 1.374f, -4.156f, 1.404f)
                horizontalLineToRelative(-0.178f)
                lineToRelative(0.011f, 0.002f)
                close()
            }
        }
        .build()
        return _tumblr!!
    }

private var _tumblr: ImageVector? = null
