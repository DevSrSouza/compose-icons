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

public val SimpleIcons.Threads: ImageVector
    get() {
        if (_threads != null) {
            return _threads!!
        }
        _threads = Builder(name = "Threads", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.186f, 24.0f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-3.581f, -0.024f, -6.334f, -1.205f, -8.184f, -3.509f)
                curveTo(2.35f, 18.44f, 1.5f, 15.586f, 1.472f, 12.01f)
                verticalLineToRelative(-0.017f)
                curveToRelative(0.03f, -3.579f, 0.879f, -6.43f, 2.525f, -8.482f)
                curveTo(5.845f, 1.205f, 8.6f, 0.024f, 12.18f, 0.0f)
                horizontalLineToRelative(0.014f)
                curveToRelative(2.746f, 0.02f, 5.043f, 0.725f, 6.826f, 2.098f)
                curveToRelative(1.677f, 1.29f, 2.858f, 3.13f, 3.509f, 5.467f)
                lineToRelative(-2.04f, 0.569f)
                curveToRelative(-1.104f, -3.96f, -3.898f, -5.984f, -8.304f, -6.015f)
                curveToRelative(-2.91f, 0.022f, -5.11f, 0.936f, -6.54f, 2.717f)
                curveTo(4.307f, 6.504f, 3.616f, 8.914f, 3.589f, 12.0f)
                curveToRelative(0.027f, 3.086f, 0.718f, 5.496f, 2.057f, 7.164f)
                curveToRelative(1.43f, 1.783f, 3.631f, 2.698f, 6.54f, 2.717f)
                curveToRelative(2.623f, -0.02f, 4.358f, -0.631f, 5.8f, -2.045f)
                curveToRelative(1.647f, -1.613f, 1.618f, -3.593f, 1.09f, -4.798f)
                curveToRelative(-0.31f, -0.71f, -0.873f, -1.3f, -1.634f, -1.75f)
                curveToRelative(-0.192f, 1.352f, -0.622f, 2.446f, -1.284f, 3.272f)
                curveToRelative(-0.886f, 1.102f, -2.14f, 1.704f, -3.73f, 1.79f)
                curveToRelative(-1.202f, 0.065f, -2.361f, -0.218f, -3.259f, -0.801f)
                curveToRelative(-1.063f, -0.689f, -1.685f, -1.74f, -1.752f, -2.964f)
                curveToRelative(-0.065f, -1.19f, 0.408f, -2.285f, 1.33f, -3.082f)
                curveToRelative(0.88f, -0.76f, 2.119f, -1.207f, 3.583f, -1.291f)
                arcToRelative(13.853f, 13.853f, 0.0f, false, true, 3.02f, 0.142f)
                curveToRelative(-0.126f, -0.742f, -0.375f, -1.332f, -0.75f, -1.757f)
                curveToRelative(-0.513f, -0.586f, -1.308f, -0.883f, -2.359f, -0.89f)
                horizontalLineToRelative(-0.029f)
                curveToRelative(-0.844f, 0.0f, -1.992f, 0.232f, -2.721f, 1.32f)
                lineTo(7.734f, 7.847f)
                curveToRelative(0.98f, -1.454f, 2.568f, -2.256f, 4.478f, -2.256f)
                horizontalLineToRelative(0.044f)
                curveToRelative(3.194f, 0.02f, 5.097f, 1.975f, 5.287f, 5.388f)
                curveToRelative(0.108f, 0.046f, 0.216f, 0.094f, 0.321f, 0.142f)
                curveToRelative(1.49f, 0.7f, 2.58f, 1.761f, 3.154f, 3.07f)
                curveToRelative(0.797f, 1.82f, 0.871f, 4.79f, -1.548f, 7.158f)
                curveToRelative(-1.85f, 1.81f, -4.094f, 2.628f, -7.277f, 2.65f)
                close()
                moveTo(13.189f, 12.31f)
                curveToRelative(-0.242f, 0.0f, -0.487f, 0.007f, -0.739f, 0.021f)
                curveToRelative(-1.836f, 0.103f, -2.98f, 0.946f, -2.916f, 2.143f)
                curveToRelative(0.067f, 1.256f, 1.452f, 1.839f, 2.784f, 1.767f)
                curveToRelative(1.224f, -0.065f, 2.818f, -0.543f, 3.086f, -3.71f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, -2.215f, -0.221f)
                close()
            }
        }
        .build()
        return _threads!!
    }

private var _threads: ImageVector? = null
