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

public val SimpleIcons.Automatic: ImageVector
    get() {
        if (_automatic != null) {
            return _automatic!!
        }
        _automatic = Builder(name = "Automatic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.768f)
                verticalLineToRelative(-1.235f)
                curveToRelative(-0.485f, 0.033f, -0.754f, 0.293f, -0.99f, 0.71f)
                lineTo(5.87f, 16.72f)
                horizontalLineToRelative(2.464f)
                lineToRelative(-0.753f, -0.96f)
                lineToRelative(0.654f, -1.363f)
                lineToRelative(0.005f, 0.007f)
                lineTo(12.0f, 6.774f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(10.526f, 13.123f)
                horizontalLineToRelative(2.946f)
                lineTo(12.0f, 10.076f)
                moveTo(8.233f, 14.416f)
                horizontalLineToRelative(0.017f)
                lineToRelative(-0.01f, -0.013f)
                moveTo(13.473f, 13.123f)
                verticalLineToRelative(0.002f)
                moveTo(21.496f, 5.066f)
                lineTo(13.26f, 0.308f)
                curveToRelative(-0.693f, -0.4f, -1.827f, -0.4f, -2.52f, 0.0f)
                lineTo(2.504f, 5.066f)
                curveToRelative(-0.693f, 0.398f, -1.26f, 1.38f, -1.26f, 2.182f)
                verticalLineToRelative(9.507f)
                curveToRelative(0.0f, 0.802f, 0.567f, 1.782f, 1.26f, 2.18f)
                lineToRelative(8.236f, 4.757f)
                curveToRelative(0.693f, 0.4f, 1.826f, 0.4f, 2.52f, 0.0f)
                lineToRelative(8.235f, -4.768f)
                curveToRelative(0.692f, -0.39f, 1.26f, -1.38f, 1.26f, -2.174f)
                lineTo(22.755f, 7.246f)
                curveToRelative(0.0f, -0.8f, -0.567f, -1.78f, -1.26f, -2.18f)
                close()
                moveTo(15.43f, 17.116f)
                lineToRelative(-0.687f, -1.384f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-0.673f, 1.384f)
                lineTo(5.287f, 17.116f)
                lineToRelative(5.396f, -11.033f)
                curveToRelative(0.305f, -0.607f, 0.777f, -0.9f, 1.317f, -0.9f)
                reflectiveCurveToRelative(1.034f, 0.328f, 1.316f, 0.89f)
                lineToRelative(5.396f, 11.043f)
                lineTo(15.43f, 17.116f)
                close()
                moveTo(12.0f, 6.77f)
                lineTo(12.0f, 9.244f)
                lineToRelative(2.518f, 5.173f)
                lineTo(8.25f, 14.417f)
                lineToRelative(0.758f, 0.94f)
                horizontalLineToRelative(5.972f)
                lineToRelative(0.674f, 1.35f)
                horizontalLineToRelative(2.474f)
                lineToRelative(-1.708f, -0.99f)
                verticalLineToRelative(0.04f)
                lineTo(12.0f, 6.77f)
            }
        }
        .build()
        return _automatic!!
    }

private var _automatic: ImageVector? = null
