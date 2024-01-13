package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Log24: ImageVector
    get() {
        if (_log24 != null) {
            return _log24!!
        }
        _log24 = Builder(name = "Log24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.197f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(6.815f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(5.234f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.125f, 0.0f)
                horizontalLineToRelative(15.75f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, true, 2.92f, 1.205f)
                arcTo(4.11f, 4.11f, 0.0f, false, true, 24.0f, 4.125f)
                curveToRelative(0.0f, 1.384f, -0.476f, 2.794f, -1.128f, 4.16f)
                curveToRelative(-0.652f, 1.365f, -1.515f, 2.757f, -2.352f, 4.104f)
                lineToRelative(-0.008f, 0.013f)
                curveToRelative(-0.849f, 1.368f, -1.669f, 2.691f, -2.28f, 3.97f)
                curveToRelative(-0.614f, 1.283f, -0.982f, 2.45f, -0.982f, 3.503f)
                arcToRelative(2.625f, 2.625f, 0.0f, true, false, 4.083f, -2.183f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.834f, -1.247f)
                arcTo(4.126f, 4.126f, 0.0f, false, true, 19.875f, 24.0f)
                horizontalLineTo(4.5f)
                arcToRelative(4.125f, 4.125f, 0.0f, false, true, -4.125f, -4.125f)
                curveToRelative(0.0f, -2.234f, 1.258f, -4.656f, 2.59f, -6.902f)
                curveToRelative(0.348f, -0.586f, 0.702f, -1.162f, 1.05f, -1.728f)
                curveToRelative(0.8f, -1.304f, 1.567f, -2.553f, 2.144f, -3.738f)
                horizontalLineTo(3.39f)
                curveToRelative(-0.823f, 0.0f, -1.886f, -0.193f, -2.567f, -1.035f)
                arcTo(3.647f, 3.647f, 0.0f, false, true, 0.0f, 4.125f)
                arcTo(4.125f, 4.125f, 0.0f, false, true, 4.125f, 0.0f)
                close()
                moveTo(15.75f, 19.875f)
                curveToRelative(0.0f, -1.38f, 0.476f, -2.786f, 1.128f, -4.15f)
                curveToRelative(0.649f, -1.358f, 1.509f, -2.743f, 2.343f, -4.086f)
                lineToRelative(0.017f, -0.028f)
                curveToRelative(0.849f, -1.367f, 1.669f, -2.692f, 2.28f, -3.972f)
                curveToRelative(0.614f, -1.285f, 0.982f, -2.457f, 0.982f, -3.514f)
                arcTo(2.615f, 2.615f, 0.0f, false, false, 19.875f, 1.5f)
                arcToRelative(2.625f, 2.625f, 0.0f, false, false, -2.625f, 2.625f)
                curveToRelative(0.0f, 0.865f, 0.421f, 1.509f, 1.167f, 2.009f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 18.0f, 7.507f)
                horizontalLineTo(7.812f)
                curveToRelative(-0.65f, 1.483f, -1.624f, 3.069f, -2.577f, 4.619f)
                curveToRelative(-0.334f, 0.544f, -0.666f, 1.083f, -0.98f, 1.612f)
                curveToRelative(-1.355f, 2.287f, -2.38f, 4.371f, -2.38f, 6.137f)
                arcTo(2.625f, 2.625f, 0.0f, false, false, 4.5f, 22.5f)
                horizontalLineToRelative(12.193f)
                arcToRelative(4.108f, 4.108f, 0.0f, false, true, -0.943f, -2.625f)
                close()
                moveTo(1.5f, 4.125f)
                curveToRelative(-0.01f, 0.511f, 0.163f, 1.008f, 0.487f, 1.403f)
                curveToRelative(0.254f, 0.313f, 0.74f, 0.479f, 1.402f, 0.479f)
                horizontalLineToRelative(12.86f)
                arcToRelative(3.648f, 3.648f, 0.0f, false, true, -0.499f, -1.882f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, true, 0.943f, -2.625f)
                horizontalLineTo(4.125f)
                arcTo(2.625f, 2.625f, 0.0f, false, false, 1.5f, 4.125f)
                close()
            }
        }
        .build()
        return _log24!!
    }

private var _log24: ImageVector? = null
