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

public val SimpleIcons.Wii: ImageVector
    get() {
        if (_wii != null) {
            return _wii!!
        }
        _wii = Builder(name = "Wii", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.904f, 6.261f)
                curveToRelative(-0.729f, -0.014f, -1.33f, 0.565f, -1.344f, 1.293f)
                verticalLineToRelative(0.018f)
                curveToRelative(0.012f, 0.732f, 0.612f, 1.315f, 1.344f, 1.305f)
                curveToRelative(0.783f, 0.0f, 1.404f, -0.579f, 1.404f, -1.305f)
                curveToRelative(0.001f, -0.732f, -0.62f, -1.311f, -1.404f, -1.311f)
                close()
                moveTo(22.614f, 6.261f)
                curveToRelative(-0.747f, 0.0f, -1.36f, 0.58f, -1.36f, 1.311f)
                curveToRelative(0.0f, 0.711f, 0.613f, 1.305f, 1.361f, 1.305f)
                curveToRelative(0.767f, 0.0f, 1.385f, -0.579f, 1.385f, -1.305f)
                curveToRelative(0.0f, -0.732f, -0.618f, -1.311f, -1.386f, -1.311f)
                close()
                moveTo(7.774f, 6.804f)
                curveToRelative(-0.748f, 0.0f, -1.252f, 0.374f, -1.514f, 1.215f)
                curveToRelative(-0.242f, 0.857f, -1.794f, 6.822f, -1.794f, 6.822f)
                lineTo(2.43f, 6.897f)
                lineTo(0.0f, 6.897f)
                reflectiveCurveToRelative(2.334f, 8.464f, 2.652f, 9.456f)
                curveToRelative(0.241f, 0.765f, 0.84f, 1.386f, 1.7f, 1.386f)
                curveToRelative(1.009f, 0.0f, 1.479f, -0.732f, 1.684f, -1.386f)
                curveToRelative(0.225f, -0.676f, 1.738f, -6.261f, 1.738f, -6.261f)
                reflectiveCurveToRelative(1.515f, 5.589f, 1.719f, 6.261f)
                curveToRelative(0.225f, 0.653f, 0.69f, 1.386f, 1.682f, 1.386f)
                curveToRelative(0.879f, 0.0f, 1.456f, -0.621f, 1.72f, -1.386f)
                curveToRelative(0.315f, -0.99f, 2.657f, -9.456f, 2.657f, -9.456f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(-2.021f, 7.944f)
                reflectiveCurveToRelative(-1.55f, -5.965f, -1.812f, -6.822f)
                curveToRelative(-0.242f, -0.844f, -0.77f, -1.215f, -1.495f, -1.215f)
                close()
                moveTo(16.782f, 10.167f)
                verticalLineToRelative(7.495f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(-7.495f)
                horizontalLineToRelative(-2.322f)
                close()
                moveTo(21.475f, 10.167f)
                verticalLineToRelative(7.495f)
                horizontalLineToRelative(2.317f)
                verticalLineToRelative(-7.495f)
                horizontalLineToRelative(-2.317f)
                close()
            }
        }
        .build()
        return _wii!!
    }

private var _wii: ImageVector? = null
