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

public val SimpleIcons.Civo: ImageVector
    get() {
        if (_civo != null) {
            return _civo!!
        }
        _civo = Builder(name = "Civo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.229f, 7.985f)
                horizontalLineToRelative(-0.993f)
                curveToRelative(-0.183f, 0.0f, -0.303f, 0.14f, -0.303f, 0.318f)
                verticalLineToRelative(7.393f)
                curveToRelative(0.0f, 0.177f, 0.12f, 0.318f, 0.303f, 0.318f)
                horizontalLineToRelative(0.993f)
                arcToRelative(0.318f, 0.318f, 0.0f, false, false, 0.323f, -0.318f)
                lineTo(9.552f, 8.303f)
                arcToRelative(0.317f, 0.317f, 0.0f, false, false, -0.323f, -0.318f)
                moveToRelative(-3.1f, 5.838f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, -0.507f, -0.104f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -1.604f, 0.635f)
                curveToRelative(-1.627f, 0.0f, -2.868f, -1.65f, -2.141f, -3.368f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, 1.13f, -1.128f)
                curveToRelative(0.992f, -0.42f, 1.958f, -0.18f, 2.599f, 0.408f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, 0.507f, -0.103f)
                lineToRelative(0.43f, -0.943f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, false, -0.111f, -0.428f)
                curveTo(5.425f, 8.03f, 4.05f, 7.732f, 2.617f, 8.22f)
                arcToRelative(3.838f, 3.838f, 0.0f, false, false, -2.412f, 2.478f)
                curveToRelative(-0.874f, 2.772f, 1.172f, 5.32f, 3.813f, 5.32f)
                curveToRelative(0.92f, 0.0f, 1.764f, -0.31f, 2.44f, -0.831f)
                arcToRelative(0.348f, 0.348f, 0.0f, false, false, 0.101f, -0.42f)
                close()
                moveTo(23.795f, 10.698f)
                arcToRelative(3.838f, 3.838f, 0.0f, false, false, -2.412f, -2.478f)
                arcToRelative(4.176f, 4.176f, 0.0f, false, false, -2.329f, -0.13f)
                curveToRelative(-1.2f, 0.269f, -2.07f, 0.838f, -2.834f, 2.479f)
                lineToRelative(-1.534f, 3.326f)
                lineToRelative(-2.603f, -5.722f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, -0.29f, -0.187f)
                lineToRelative(-1.138f, -0.002f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, -0.292f, 0.453f)
                lineToRelative(3.376f, 7.382f)
                arcToRelative(0.324f, 0.324f, 0.0f, false, false, 0.291f, 0.19f)
                lineToRelative(0.056f, 0.005f)
                horizontalLineToRelative(1.276f)
                arcToRelative(0.236f, 0.236f, 0.0f, false, false, 0.076f, -0.013f)
                arcToRelative(0.335f, 0.335f, 0.0f, false, false, 0.2f, -0.18f)
                lineToRelative(1.71f, -3.893f)
                curveToRelative(0.515f, -1.213f, 0.827f, -1.718f, 1.643f, -2.065f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, 2.054f, 0.026f)
                curveToRelative(0.492f, 0.222f, 0.878f, 0.629f, 1.084f, 1.128f)
                arcToRelative(2.701f, 2.701f, 0.0f, false, true, 0.206f, 0.95f)
                arcToRelative(2.354f, 2.354f, 0.0f, false, true, -2.353f, 2.387f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -1.604f, -0.635f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, -0.507f, 0.104f)
                lineToRelative(-0.43f, 0.944f)
                arcToRelative(0.348f, 0.348f, 0.0f, false, false, 0.1f, 0.42f)
                curveToRelative(0.677f, 0.52f, 1.522f, 0.831f, 2.44f, 0.831f)
                curveToRelative(2.642f, 0.0f, 4.688f, -2.548f, 3.814f, -5.32f)
            }
        }
        .build()
        return _civo!!
    }

private var _civo: ImageVector? = null
