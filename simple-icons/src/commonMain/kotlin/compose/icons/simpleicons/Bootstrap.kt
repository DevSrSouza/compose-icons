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

public val SimpleIcons.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.77f, 11.24f)
                lineTo(9.956f, 11.24f)
                lineTo(9.956f, 8.202f)
                horizontalLineToRelative(2.152f)
                curveToRelative(1.17f, 0.0f, 1.834f, 0.522f, 1.834f, 1.466f)
                curveToRelative(0.0f, 1.008f, -0.773f, 1.572f, -2.174f, 1.572f)
                close()
                moveTo(12.094f, 12.446f)
                lineTo(9.957f, 12.446f)
                verticalLineToRelative(3.348f)
                horizontalLineToRelative(2.231f)
                curveToRelative(1.459f, 0.0f, 2.232f, -0.585f, 2.232f, -1.685f)
                reflectiveCurveToRelative(-0.795f, -1.663f, -2.326f, -1.663f)
                close()
                moveTo(24.0f, 11.39f)
                verticalLineToRelative(1.218f)
                curveToRelative(-1.128f, 0.108f, -1.817f, 0.944f, -2.226f, 2.268f)
                curveToRelative(-0.407f, 1.319f, -0.463f, 2.937f, -0.42f, 4.186f)
                curveToRelative(0.045f, 1.3f, -0.968f, 2.5f, -2.337f, 2.5f)
                lineTo(4.985f, 21.562f)
                curveToRelative(-1.37f, 0.0f, -2.383f, -1.2f, -2.337f, -2.5f)
                curveToRelative(0.043f, -1.249f, -0.013f, -2.867f, -0.42f, -4.186f)
                curveToRelative(-0.41f, -1.324f, -1.1f, -2.16f, -2.228f, -2.268f)
                lineTo(0.0f, 11.39f)
                curveToRelative(1.128f, -0.108f, 1.819f, -0.944f, 2.227f, -2.268f)
                curveToRelative(0.408f, -1.319f, 0.464f, -2.937f, 0.42f, -4.186f)
                curveToRelative(-0.045f, -1.3f, 0.968f, -2.5f, 2.338f, -2.5f)
                horizontalLineToRelative(14.032f)
                curveToRelative(1.37f, 0.0f, 2.382f, 1.2f, 2.337f, 2.5f)
                curveToRelative(-0.043f, 1.249f, 0.013f, 2.867f, 0.42f, 4.186f)
                curveToRelative(0.409f, 1.324f, 1.098f, 2.16f, 2.226f, 2.268f)
                close()
                moveTo(16.073f, 14.207f)
                curveToRelative(0.0f, -1.354f, -0.953f, -2.333f, -2.368f, -2.488f)
                verticalLineToRelative(-0.057f)
                curveToRelative(1.04f, -0.169f, 1.856f, -1.135f, 1.856f, -2.213f)
                curveToRelative(0.0f, -1.537f, -1.213f, -2.538f, -3.062f, -2.538f)
                horizontalLineToRelative(-4.16f)
                verticalLineToRelative(10.172f)
                horizontalLineToRelative(4.181f)
                curveToRelative(2.218f, 0.0f, 3.553f, -1.086f, 3.553f, -2.876f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
