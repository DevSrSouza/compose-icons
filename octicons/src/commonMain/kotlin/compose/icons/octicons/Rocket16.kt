package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Rocket16: ImageVector
    get() {
        if (_rocket16 != null) {
            return _rocket16!!
        }
        _rocket16 = Builder(name = "Rocket16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.064f, 0.0f)
                horizontalLineToRelative(0.186f)
                curveTo(15.216f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(0.186f)
                arcToRelative(8.752f, 8.752f, 0.0f, false, true, -2.564f, 6.186f)
                lineToRelative(-0.458f, 0.459f)
                curveToRelative(-0.314f, 0.314f, -0.641f, 0.616f, -0.979f, 0.904f)
                verticalLineToRelative(3.207f)
                curveToRelative(0.0f, 0.608f, -0.315f, 1.172f, -0.833f, 1.49f)
                lineToRelative(-2.774f, 1.707f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.11f, -0.418f)
                lineToRelative(-0.954f, -3.102f)
                arcToRelative(1.214f, 1.214f, 0.0f, false, true, -0.145f, -0.125f)
                lineTo(3.754f, 9.816f)
                arcToRelative(1.218f, 1.218f, 0.0f, false, true, -0.124f, -0.145f)
                lineTo(0.528f, 8.717f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.418f, -1.11f)
                lineToRelative(1.71f, -2.774f)
                arcTo(1.748f, 1.748f, 0.0f, false, true, 3.31f, 4.0f)
                horizontalLineToRelative(3.204f)
                curveToRelative(0.288f, -0.338f, 0.59f, -0.665f, 0.904f, -0.979f)
                lineToRelative(0.459f, -0.458f)
                arcTo(8.749f, 8.749f, 0.0f, false, true, 14.064f, 0.0f)
                close()
                moveTo(8.938f, 3.623f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.458f, 0.458f)
                curveToRelative(-0.76f, 0.76f, -1.437f, 1.598f, -2.02f, 2.5f)
                lineToRelative(-1.5f, 2.317f)
                lineToRelative(2.143f, 2.143f)
                lineToRelative(2.317f, -1.5f)
                curveToRelative(0.902f, -0.583f, 1.74f, -1.26f, 2.499f, -2.02f)
                lineToRelative(0.459f, -0.458f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 2.123f, -5.127f)
                lineTo(14.499f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-0.186f)
                arcToRelative(7.249f, 7.249f, 0.0f, false, false, -5.125f, 2.123f)
                close()
                moveTo(3.56f, 14.56f)
                curveToRelative(-0.732f, 0.732f, -2.334f, 1.045f, -3.005f, 1.148f)
                arcToRelative(0.234f, 0.234f, 0.0f, false, true, -0.201f, -0.064f)
                arcToRelative(0.234f, 0.234f, 0.0f, false, true, -0.064f, -0.201f)
                curveToRelative(0.103f, -0.671f, 0.416f, -2.273f, 1.15f, -3.003f)
                arcToRelative(1.502f, 1.502f, 0.0f, true, true, 2.12f, 2.12f)
                close()
                moveTo(10.5f, 10.625f)
                curveToRelative(-0.088f, 0.06f, -0.177f, 0.118f, -0.266f, 0.175f)
                lineToRelative(-2.35f, 1.521f)
                lineToRelative(0.548f, 1.783f)
                lineToRelative(1.949f, -1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.119f, -0.213f)
                close()
                moveTo(3.678f, 8.116f)
                lineTo(5.2f, 5.766f)
                curveToRelative(0.058f, -0.09f, 0.117f, -0.178f, 0.176f, -0.266f)
                lineTo(3.309f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.213f, 0.119f)
                lineToRelative(-1.2f, 1.95f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _rocket16!!
    }

private var _rocket16: ImageVector? = null
