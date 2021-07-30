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

public val SimpleIcons.Tutanota: ImageVector
    get() {
        if (_tutanota != null) {
            return _tutanota!!
        }
        _tutanota = Builder(name = "Tutanota", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.158f, 0.934f)
                curveTo(0.978f, 0.934f, 0.025f, 1.895f, 0.023f, 3.08f)
                curveTo(0.017f, 9.74f, 0.005f, 16.413f, 0.0f, 23.066f)
                curveToRelative(0.793f, -0.297f, 1.67f, -0.56f, 2.56f, -0.918f)
                curveToRelative(6.188f, -2.485f, 11.249f, -4.598f, 11.253f, -6.983f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, false, -0.016f, -0.23f)
                curveToRelative(-0.32f, -2.356f, -5.916f, -3.087f, -5.908f, -4.166f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.05f, -0.177f)
                curveToRelative(0.673f, -1.184f, 3.336f, -1.128f, 4.316f, -1.212f)
                curveToRelative(0.982f, -0.085f, 3.285f, -0.067f, 3.397f, -0.773f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, 0.005f, -0.065f)
                curveToRelative(0.003f, -0.656f, -1.584f, -0.913f, -1.584f, -0.913f)
                reflectiveCurveToRelative(1.925f, 0.29f, 1.92f, 1.042f)
                arcToRelative(0.445f, 0.445f, 0.0f, false, true, -0.015f, 0.114f)
                curveToRelative(-0.207f, 0.81f, -1.901f, 0.962f, -3.021f, 1.017f)
                curveToRelative(-1.06f, 0.054f, -2.673f, 0.175f, -2.679f, 0.695f)
                curveToRelative(0.0f, 0.03f, 0.005f, 0.062f, 0.015f, 0.095f)
                curveToRelative(0.253f, 0.76f, 6.167f, 1.127f, 9.95f, 3.102f)
                curveToRelative(2.178f, 1.136f, 3.26f, 3.004f, 3.757f, 4.974f)
                verticalLineTo(3.08f)
                arcTo(2.14f, 2.14f, 0.0f, false, false, 21.866f, 0.934f)
                horizontalLineTo(2.158f)
                close()
            }
        }
        .build()
        return _tutanota!!
    }

private var _tutanota: ImageVector? = null
