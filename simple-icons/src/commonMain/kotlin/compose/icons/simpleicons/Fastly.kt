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

public val SimpleIcons.Fastly: ImageVector
    get() {
        if (_fastly != null) {
            return _fastly!!
        }
        _fastly = Builder(name = "Fastly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.919f, 3.036f)
                lineTo(13.919f, 1.3f)
                horizontalLineToRelative(0.632f)
                lineTo(14.551f, 0.0f)
                lineTo(9.377f, 0.0f)
                verticalLineToRelative(1.3f)
                horizontalLineToRelative(0.631f)
                verticalLineToRelative(1.749f)
                arcToRelative(10.572f, 10.572f, 0.0f, false, false, -8.575f, 10.384f)
                curveTo(1.433f, 19.275f, 6.17f, 24.0f, 12.0f, 24.0f)
                curveToRelative(5.842f, 0.0f, 10.567f, -4.737f, 10.567f, -10.567f)
                curveToRelative(0.0f, -5.186f, -3.729f, -9.486f, -8.648f, -10.397f)
                close()
                moveTo(12.291f, 18.862f)
                verticalLineToRelative(-0.607f)
                horizontalLineToRelative(-0.619f)
                verticalLineToRelative(0.607f)
                curveToRelative(-2.757f, -0.158f, -4.955f, -2.38f, -5.101f, -5.137f)
                horizontalLineToRelative(0.607f)
                verticalLineToRelative(-0.62f)
                horizontalLineToRelative(-0.607f)
                arcToRelative(5.436f, 5.436f, 0.0f, false, true, 5.101f, -5.089f)
                verticalLineToRelative(0.607f)
                horizontalLineToRelative(0.62f)
                verticalLineToRelative(-0.607f)
                arcToRelative(5.435f, 5.435f, 0.0f, false, true, 5.137f, 5.114f)
                horizontalLineToRelative(-0.607f)
                verticalLineToRelative(0.619f)
                horizontalLineToRelative(0.607f)
                arcToRelative(5.444f, 5.444f, 0.0f, false, true, -5.138f, 5.113f)
                close()
                moveTo(14.551f, 11.15f)
                lineToRelative(-0.39f, -0.389f)
                lineToRelative(-1.979f, 1.725f)
                arcToRelative(0.912f, 0.912f, 0.0f, false, false, -0.316f, -0.06f)
                curveToRelative(-0.534f, 0.0f, -0.971f, 0.448f, -0.971f, 0.995f)
                curveToRelative(0.0f, 0.547f, 0.437f, 0.996f, 0.971f, 0.996f)
                curveToRelative(0.535f, 0.0f, 0.972f, -0.45f, 0.972f, -0.996f)
                arcToRelative(0.839f, 0.839f, 0.0f, false, false, -0.049f, -0.304f)
                close()
            }
        }
        .build()
        return _fastly!!
    }

private var _fastly: ImageVector? = null
