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

public val SimpleIcons.Thangs: ImageVector
    get() {
        if (_thangs != null) {
            return _thangs!!
        }
        _thangs = Builder(name = "Thangs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.18f, 13.902f)
                arcToRelative(1.902f, 1.902f, 0.0f, true, true, 0.0f, -3.804f)
                arcToRelative(1.902f, 1.902f, 0.0f, false, true, 0.0f, 3.804f)
                moveToRelative(0.0f, -5.722f)
                arcTo(3.82f, 3.82f, 0.0f, false, false, 16.36f, 12.0f)
                verticalLineToRelative(3.82f)
                horizontalLineToRelative(3.82f)
                arcToRelative(3.82f, 3.82f, 0.0f, true, false, 0.0f, -7.64f)
                moveToRelative(-8.656f, 5.722f)
                arcTo(1.907f, 1.907f, 0.0f, false, true, 9.611f, 12.0f)
                curveToRelative(0.0f, -1.05f, 0.857f, -1.902f, 1.913f, -1.902f)
                reflectiveCurveToRelative(1.913f, 0.852f, 1.913f, 1.902f)
                curveToRelative(0.0f, 1.05f, -0.857f, 1.902f, -1.913f, 1.902f)
                moveToRelative(-7.683f, 0.0f)
                arcTo(1.907f, 1.907f, 0.0f, false, true, 1.928f, 12.0f)
                curveToRelative(0.0f, -1.05f, 0.857f, -1.902f, 1.913f, -1.902f)
                curveToRelative(1.057f, 0.0f, 1.913f, 0.852f, 1.913f, 1.902f)
                curveToRelative(0.0f, 1.05f, -0.856f, 1.902f, -1.913f, 1.902f)
                moveToRelative(11.514f, -2.107f)
                lineToRelative(-0.002f, -0.032f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, -0.04f, -0.37f)
                lineToRelative(-0.004f, -0.019f)
                arcToRelative(3.693f, 3.693f, 0.0f, false, false, -0.081f, -0.373f)
                verticalLineTo(11.0f)
                arcToRelative(3.836f, 3.836f, 0.0f, false, false, -3.704f, -2.82f)
                horizontalLineTo(3.84f)
                arcToRelative(3.833f, 3.833f, 0.0f, false, false, -3.794f, 3.254f)
                lineToRelative(-0.001f, 0.008f)
                curveToRelative(-0.018f, 0.118f, -0.03f, 0.236f, -0.036f, 0.357f)
                lineToRelative(-0.002f, 0.02f)
                verticalLineToRelative(0.016f)
                curveTo(0.006f, 11.89f, 0.0f, 11.945f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.07f, 0.007f, 0.137f, 0.01f, 0.206f)
                lineToRelative(0.002f, 0.032f)
                curveToRelative(0.008f, 0.124f, 0.021f, 0.248f, 0.041f, 0.37f)
                lineToRelative(0.003f, 0.018f)
                arcToRelative(3.833f, 3.833f, 0.0f, false, false, 3.786f, 3.194f)
                horizontalLineToRelative(11.523f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -0.07f, -0.006f, -0.137f, -0.01f, -0.205f)
            }
        }
        .build()
        return _thangs!!
    }

private var _thangs: ImageVector? = null
