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

public val SimpleIcons.Resend: ImageVector
    get() {
        if (_resend != null) {
            return _resend!!
        }
        _resend = Builder(name = "Resend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.023f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(5.553f)
                verticalLineToRelative(-8.434f)
                horizontalLineToRelative(2.998f)
                lineTo(15.326f, 24.0f)
                horizontalLineToRelative(6.65f)
                lineToRelative(-5.372f, -9.258f)
                arcToRelative(7.652f, 7.652f, 0.0f, false, false, 3.316f, -3.016f)
                curveToRelative(0.709f, -1.21f, 1.062f, -2.57f, 1.062f, -4.08f)
                curveToRelative(0.0f, -1.462f, -0.353f, -2.767f, -1.062f, -3.91f)
                curveToRelative(-0.709f, -1.165f, -1.692f, -2.079f, -2.95f, -2.742f)
                curveTo(15.737f, 0.331f, 14.355f, 0.0f, 12.823f, 0.0f)
                close()
                moveTo(7.576f, 4.87f)
                horizontalLineToRelative(4.219f)
                curveToRelative(0.731f, 0.0f, 1.349f, 0.125f, 1.851f, 0.376f)
                curveToRelative(0.526f, 0.252f, 0.925f, 0.618f, 1.2f, 1.098f)
                curveToRelative(0.274f, 0.457f, 0.412f, 0.994f, 0.412f, 1.611f)
                reflectiveCurveTo(15.132f, 9.12f, 14.88f, 9.6f)
                curveToRelative(-0.229f, 0.48f, -0.572f, 0.856f, -1.03f, 1.13f)
                curveToRelative(-0.434f, 0.252f, -0.948f, 0.38f, -1.542f, 0.38f)
                lineTo(7.576f, 11.11f)
                close()
            }
        }
        .build()
        return _resend!!
    }

private var _resend: ImageVector? = null
