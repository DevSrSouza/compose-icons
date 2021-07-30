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

public val SimpleIcons.Gotomeeting: ImageVector
    get() {
        if (_gotomeeting != null) {
            return _gotomeeting!!
        }
        _gotomeeting = Builder(name = "Gotomeeting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3f, 13.72f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, false, -3.462f, 0.124f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, true, -0.682f, 0.035f)
                lineToRelative(-3.137f, -1.81f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, 0.0f, -0.137f)
                lineToRelative(3.12f, -1.8f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, true, 0.685f, 0.036f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, false, 3.47f, 0.139f)
                arcTo(3.194f, 3.194f, 0.0f, false, false, 22.442f, 6.1f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, false, -5.924f, 1.773f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.311f, 0.606f)
                lineToRelative(-3.136f, 1.811f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, -0.118f, -0.068f)
                verticalLineTo(6.6f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, true, 0.372f, -0.573f)
                arcToRelative(3.158f, 3.158f, 0.0f, true, false, -2.64f, 0.0f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, true, 0.373f, 0.573f)
                verticalLineToRelative(3.622f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, -0.119f, 0.068f)
                lineTo(7.804f, 8.48f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, true, -0.311f, -0.605f)
                arcToRelative(3.157f, 3.157f, 0.0f, true, false, -1.307f, 2.294f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, 0.687f, -0.038f)
                lineToRelative(3.12f, 1.8f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, 0.0f, 0.137f)
                lineTo(6.854f, 13.88f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, true, -0.683f, -0.035f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, false, -3.461f, -0.124f)
                arcToRelative(3.194f, 3.194f, 0.0f, false, false, -1.143f, 4.202f)
                arcToRelative(3.159f, 3.159f, 0.0f, false, false, 5.924f, -1.792f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, 0.31f, -0.61f)
                lineToRelative(3.137f, -1.81f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, 0.119f, 0.068f)
                verticalLineTo(17.4f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, true, -0.372f, 0.573f)
                arcToRelative(3.158f, 3.158f, 0.0f, true, false, 2.64f, 0.0f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.373f, -0.573f)
                verticalLineToRelative(-3.621f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, 0.118f, -0.069f)
                lineToRelative(3.137f, 1.812f)
                arcToRelative(0.631f, 0.631f, 0.0f, false, true, 0.31f, 0.609f)
                arcToRelative(3.159f, 3.159f, 0.0f, false, false, 5.924f, 1.792f)
                arcTo(3.194f, 3.194f, 0.0f, false, false, 21.3f, 13.72f)
                close()
            }
        }
        .build()
        return _gotomeeting!!
    }

private var _gotomeeting: ImageVector? = null
