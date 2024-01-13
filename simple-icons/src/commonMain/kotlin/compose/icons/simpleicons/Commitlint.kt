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

public val SimpleIcons.Commitlint: ImageVector
    get() {
        if (_commitlint != null) {
            return _commitlint!!
        }
        _commitlint = Builder(name = "Commitlint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.988f, 4.822f)
                verticalLineToRelative(0.901f)
                horizontalLineToRelative(1.845f)
                verticalLineToRelative(6.337f)
                curveToRelative(0.0f, 0.809f, 0.187f, 1.433f, 0.563f, 1.875f)
                curveToRelative(0.379f, 0.438f, 0.913f, 0.657f, 1.6f, 0.657f)
                horizontalLineToRelative(1.458f)
                verticalLineToRelative(-0.97f)
                lineTo(12.11f, 13.622f)
                curveToRelative(-0.37f, 0.0f, -0.652f, -0.13f, -0.844f, -0.393f)
                curveToRelative(-0.187f, -0.263f, -0.281f, -0.652f, -0.281f, -1.17f)
                lineTo(10.985f, 4.823f)
                close()
                moveTo(3.459f, 7.418f)
                curveToRelative(-1.084f, 0.0f, -1.933f, 0.325f, -2.546f, 0.976f)
                curveTo(0.304f, 9.044f, 0.0f, 9.944f, 0.0f, 11.096f)
                curveToRelative(0.0f, 1.15f, 0.304f, 2.051f, 0.913f, 2.702f)
                curveToRelative(0.613f, 0.65f, 1.462f, 0.976f, 2.546f, 0.976f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, 1.0f, -0.137f)
                curveToRelative(0.33f, -0.088f, 0.65f, -0.221f, 0.958f, -0.4f)
                lineTo(5.417f, 13.04f)
                curveToRelative(-0.271f, 0.259f, -0.565f, 0.45f, -0.882f, 0.576f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.076f, 0.18f)
                curveToRelative(-0.717f, 0.0f, -1.272f, -0.232f, -1.664f, -0.7f)
                curveToRelative(-0.387f, -0.47f, -0.582f, -1.138f, -0.582f, -2.001f)
                curveToRelative(0.0f, -0.868f, 0.195f, -1.535f, 0.582f, -2.002f)
                curveToRelative(0.388f, -0.467f, 0.943f, -0.7f, 1.664f, -0.7f)
                curveToRelative(0.388f, 0.0f, 0.734f, 0.06f, 1.038f, 0.181f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 0.92f, 0.588f)
                lineTo(5.417f, 7.956f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, false, -0.97f, -0.406f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, false, -0.988f, -0.132f)
                close()
                moveTo(16.314f, 13.541f)
                verticalLineToRelative(1.128f)
                lineTo(24.0f, 14.669f)
                lineTo(24.0f, 13.54f)
                close()
                moveTo(19.47f, 15.796f)
                lineTo(17.168f, 19.178f)
                horizontalLineToRelative(1.3f)
                lineToRelative(1.694f, -2.204f)
                lineToRelative(1.684f, 2.204f)
                horizontalLineToRelative(1.3f)
                lineToRelative(-2.301f, -3.382f)
                close()
            }
        }
        .build()
        return _commitlint!!
    }

private var _commitlint: ImageVector? = null
