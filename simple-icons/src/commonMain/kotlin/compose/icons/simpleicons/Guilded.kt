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

public val SimpleIcons.Guilded: ImageVector
    get() {
        if (_guilded != null) {
            return _guilded!!
        }
        _guilded = Builder(name = "Guilded", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.297f, 6.255f)
                reflectiveCurveToRelative(0.02f, 2.846f, 1.481f, 5.79f)
                curveToRelative(1.502f, 2.834f, 3.572f, 4.654f, 5.28f, 5.38f)
                curveToRelative(1.765f, -0.826f, 3.47f, -2.258f, 4.4f, -3.8f)
                horizontalLineToRelative(-4.845f)
                curveToRelative(-1.253f, -1.04f, -2.24f, -2.763f, -2.466f, -4.755f)
                horizontalLineTo(23.36f)
                curveToRelative(-0.701f, 3.203f, -2.188f, 6.116f, -3.605f, 7.971f)
                arcToRelative(17.108f, 17.108f, 0.0f, false, true, -7.686f, 5.659f)
                horizontalLineToRelative(-0.045f)
                curveToRelative(-5.098f, -2.031f, -7.84f, -5.23f, -9.65f, -8.84f)
                curveTo(1.214f, 11.347f, 0.0f, 7.147f, 0.0f, 1.5f)
                horizontalLineToRelative(24.0f)
                arcToRelative(34.23f, 34.23f, 0.0f, false, true, -0.32f, 4.755f)
                close()
            }
        }
        .build()
        return _guilded!!
    }

private var _guilded: ImageVector? = null
