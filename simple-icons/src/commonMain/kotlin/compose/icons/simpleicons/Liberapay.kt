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

public val SimpleIcons.Liberapay: ImageVector
    get() {
        if (_liberapay != null) {
            return _liberapay!!
        }
        _liberapay = Builder(name = "Liberapay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.32f, 0.0f)
                arcTo(2.321f, 2.321f, 0.0f, false, false, 0.0f, 2.32f)
                verticalLineToRelative(19.36f)
                arcTo(2.321f, 2.321f, 0.0f, false, false, 2.32f, 24.0f)
                horizontalLineToRelative(19.36f)
                arcTo(2.32f, 2.32f, 0.0f, false, false, 24.0f, 21.68f)
                lineTo(24.0f, 2.32f)
                arcTo(2.32f, 2.32f, 0.0f, false, false, 21.68f, 0.0f)
                close()
                moveTo(11.528f, 3.98f)
                lineToRelative(-2.27f, 9.405f)
                arcToRelative(2.953f, 2.953f, 0.0f, false, false, -0.073f, 0.539f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, false, 0.09f, 0.432f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.334f, 0.302f)
                curveToRelative(0.157f, 0.077f, 0.378f, 0.126f, 0.661f, 0.147f)
                lineToRelative(-0.49f, 2.008f)
                curveToRelative(-0.772f, 0.0f, -1.38f, -0.1f, -1.82f, -0.3f)
                curveToRelative(-0.441f, -0.203f, -0.757f, -0.477f, -0.947f, -0.826f)
                arcToRelative(2.391f, 2.391f, 0.0f, false, true, -0.278f, -1.2f)
                curveToRelative(0.005f, -0.452f, 0.068f, -0.933f, 0.188f, -1.445f)
                lineToRelative(2.074f, -8.67f)
                close()
                moveTo(15.428f, 7.868f)
                curveToRelative(0.61f, 0.0f, 1.135f, 0.092f, 1.576f, 0.277f)
                curveToRelative(0.44f, 0.185f, 0.802f, 0.438f, 1.085f, 0.76f)
                curveToRelative(0.283f, 0.32f, 0.493f, 0.696f, 0.629f, 1.126f)
                curveToRelative(0.136f, 0.43f, 0.204f, 0.89f, 0.204f, 1.379f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.0f, 0.794f, -0.13f, 1.52f, -0.392f, 2.179f)
                arcToRelative(5.16f, 5.16f, 0.0f, false, true, -1.086f, 1.706f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, -1.665f, 1.118f)
                curveToRelative(-0.648f, 0.267f, -1.353f, 0.4f, -2.114f, 0.4f)
                curveToRelative(-0.37f, 0.0f, -0.74f, -0.033f, -1.11f, -0.098f)
                lineToRelative(-0.735f, 2.956f)
                lineTo(9.403f, 19.672f)
                lineToRelative(2.71f, -11.298f)
                curveToRelative(0.435f, -0.13f, 0.934f, -0.248f, 1.494f, -0.351f)
                arcToRelative(10.045f, 10.045f, 0.0f, false, true, 1.821f, -0.155f)
                close()
                moveTo(15.118f, 9.909f)
                arcToRelative(4.67f, 4.67f, 0.0f, false, false, -0.98f, 0.098f)
                lineToRelative(-1.143f, 4.752f)
                curveToRelative(0.185f, 0.044f, 0.413f, 0.065f, 0.685f, 0.065f)
                curveToRelative(0.425f, 0.0f, 0.812f, -0.079f, 1.16f, -0.237f)
                arcToRelative(2.556f, 2.556f, 0.0f, false, false, 0.89f, -0.661f)
                curveToRelative(0.244f, -0.283f, 0.435f, -0.623f, 0.571f, -1.02f)
                arcToRelative(4.03f, 4.03f, 0.0f, false, false, 0.204f, -1.315f)
                curveToRelative(0.0f, -0.468f, -0.104f, -0.865f, -0.31f, -1.192f)
                curveToRelative(-0.207f, -0.326f, -0.566f, -0.49f, -1.077f, -0.49f)
                close()
            }
        }
        .build()
        return _liberapay!!
    }

private var _liberapay: ImageVector? = null
