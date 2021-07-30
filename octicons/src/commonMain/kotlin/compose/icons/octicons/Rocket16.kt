package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(14.064f, 0.0f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -6.187f, 2.563f)
                lineToRelative(-0.459f, 0.458f)
                curveToRelative(-0.314f, 0.314f, -0.616f, 0.641f, -0.904f, 0.979f)
                lineTo(3.31f, 4.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.49f, 0.833f)
                lineTo(0.11f, 7.607f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.418f, 1.11f)
                lineToRelative(3.102f, 0.954f)
                curveToRelative(0.037f, 0.051f, 0.079f, 0.1f, 0.124f, 0.145f)
                lineToRelative(2.429f, 2.428f)
                curveToRelative(0.046f, 0.046f, 0.094f, 0.088f, 0.145f, 0.125f)
                lineToRelative(0.954f, 3.102f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.11f, 0.418f)
                lineToRelative(2.774f, -1.707f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.833f, -1.49f)
                lineTo(11.999f, 9.485f)
                curveToRelative(0.338f, -0.288f, 0.665f, -0.59f, 0.979f, -0.904f)
                lineToRelative(0.458f, -0.459f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 16.0f, 1.936f)
                lineTo(16.0f, 1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 0.0f)
                horizontalLineToRelative(-0.186f)
                close()
                moveTo(10.5f, 10.625f)
                curveToRelative(-0.088f, 0.06f, -0.177f, 0.118f, -0.266f, 0.175f)
                lineToRelative(-2.35f, 1.521f)
                lineToRelative(0.548f, 1.783f)
                lineToRelative(1.949f, -1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.119f, -0.213f)
                verticalLineToRelative(-2.066f)
                close()
                moveTo(3.678f, 8.116f)
                lineTo(5.2f, 5.766f)
                curveToRelative(0.058f, -0.09f, 0.117f, -0.178f, 0.176f, -0.266f)
                lineTo(3.309f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.213f, 0.119f)
                lineToRelative(-1.2f, 1.95f)
                lineToRelative(1.782f, 0.547f)
                close()
                moveTo(8.938f, 3.623f)
                arcTo(7.25f, 7.25f, 0.0f, false, true, 14.063f, 1.5f)
                horizontalLineToRelative(0.186f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.186f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, -2.123f, 5.127f)
                lineToRelative(-0.459f, 0.458f)
                arcToRelative(15.21f, 15.21f, 0.0f, false, true, -2.499f, 2.02f)
                lineToRelative(-2.317f, 1.5f)
                lineToRelative(-2.143f, -2.143f)
                lineToRelative(1.5f, -2.317f)
                arcToRelative(15.25f, 15.25f, 0.0f, false, true, 2.02f, -2.5f)
                lineToRelative(0.458f, -0.458f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(3.56f, 14.56f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.12f, -2.12f)
                curveToRelative(-0.734f, 0.73f, -1.047f, 2.332f, -1.15f, 3.003f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, false, 0.265f, 0.265f)
                curveToRelative(0.671f, -0.103f, 2.273f, -0.416f, 3.005f, -1.148f)
                close()
            }
        }
        .build()
        return _rocket16!!
    }

private var _rocket16: ImageVector? = null
