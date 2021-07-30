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

public val SimpleIcons.Vivaldi: ImageVector
    get() {
        if (_vivaldi != null) {
            return _vivaldi!!
        }
        _vivaldi = Builder(name = "Vivaldi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.75f, 0.0f, 3.817f, 0.0f, 1.912f, 1.904f)
                curveTo(0.007f, 3.81f, 0.0f, 6.75f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.0f, 8.175f, 1.912f, 10.08f)
                curveTo(3.825f, 23.985f, 6.75f, 24.0f, 12.0f, 24.0f)
                curveToRelative(5.25f, 0.0f, 8.183f, 0.0f, 10.088f, -1.904f)
                curveTo(23.993f, 20.19f, 24.0f, 17.25f, 24.0f, 12.0f)
                reflectiveCurveToRelative(0.0f, -8.175f, -1.912f, -10.08f)
                curveTo(20.175f, 0.015f, 17.25f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.832f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 6.49f, 2.648f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, 12.704f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 11.832f, 3.0f)
                close()
                moveTo(7.568f, 7.496f)
                arcToRelative(1.433f, 1.433f, 0.0f, false, false, -0.142f, 0.004f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.21f, 9.75f)
                lineToRelative(1.701f, 3.0f)
                curveToRelative(0.93f, 1.582f, 1.839f, 3.202f, 2.791f, 4.822f)
                arcToRelative(1.417f, 1.417f, 0.0f, false, false, 1.41f, 0.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.223f, -0.81f)
                lineToRelative(4.447f, -7.762f)
                arcTo(1.56f, 1.56f, 0.0f, false, false, 18.0f, 8.768f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.828f, 0.914f)
                arcToRelative(2.513f, 2.513f, 0.0f, false, true, 0.256f, 1.119f)
                verticalLineToRelative(0.246f)
                arcToRelative(2.393f, 2.393f, 0.0f, false, true, -2.52f, 2.13f)
                arcToRelative(2.348f, 2.348f, 0.0f, false, true, -1.965f, -1.214f)
                curveToRelative(-0.307f, -0.51f, -0.6f, -1.035f, -0.9f, -1.553f)
                curveToRelative(-0.42f, -0.72f, -0.826f, -1.41f, -1.246f, -2.16f)
                arcToRelative(1.433f, 1.433f, 0.0f, false, false, -1.229f, -0.754f)
                close()
            }
        }
        .build()
        return _vivaldi!!
    }

private var _vivaldi: ImageVector? = null
