package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Flame24: ImageVector
    get() {
        if (_flame24 != null) {
            return _flame24!!
        }
        _flame24 = Builder(name = "Flame24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.185f, 21.5f)
                curveToRelative(4.059f, 0.0f, 7.065f, -2.84f, 7.065f, -6.75f)
                curveToRelative(0.0f, -2.337f, -1.093f, -3.489f, -2.678f, -5.158f)
                lineToRelative(-0.021f, -0.023f)
                curveToRelative(-1.44f, -1.517f, -3.139f, -3.351f, -3.649f, -6.557f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, false, -1.911f, 1.76f)
                curveToRelative(-0.787f, 1.144f, -1.147f, 2.633f, -0.216f, 4.495f)
                curveToRelative(0.603f, 1.205f, 0.777f, 2.74f, -0.277f, 3.794f)
                curveToRelative(-0.657f, 0.657f, -1.762f, 1.1f, -2.956f, 0.586f)
                curveToRelative(-0.752f, -0.324f, -1.353f, -0.955f, -1.838f, -1.79f)
                curveToRelative(-0.567f, 0.706f, -0.954f, 1.74f, -0.954f, 2.893f)
                curveToRelative(0.0f, 3.847f, 3.288f, 6.75f, 7.435f, 6.75f)
                close()
                moveTo(14.265f, 1.627f)
                curveToRelative(-0.017f, -0.345f, -0.296f, -0.625f, -0.632f, -0.543f)
                curveToRelative(-2.337f, 0.575f, -6.605f, 4.042f, -4.2f, 8.854f)
                curveToRelative(0.474f, 0.946f, 0.392f, 1.675f, 0.004f, 2.062f)
                curveToRelative(-0.64f, 0.64f, -1.874f, 0.684f, -2.875f, -1.815f)
                curveToRelative(-0.131f, -0.327f, -0.498f, -0.509f, -0.803f, -0.334f)
                curveToRelative(-1.547f, 0.888f, -2.509f, 2.86f, -2.509f, 4.899f)
                curveToRelative(0.0f, 4.829f, 4.122f, 8.25f, 8.935f, 8.25f)
                curveToRelative(4.812f, 0.0f, 8.565f, -3.438f, 8.565f, -8.25f)
                curveToRelative(0.0f, -2.939f, -1.466f, -4.482f, -3.006f, -6.102f)
                curveToRelative(-1.61f, -1.694f, -3.479f, -3.476f, -3.479f, -7.021f)
                close()
            }
        }
        .build()
        return _flame24!!
    }

private var _flame24: ImageVector? = null
