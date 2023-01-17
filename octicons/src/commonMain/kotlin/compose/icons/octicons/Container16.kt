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

public val Octicons.Container16: ImageVector
    get() {
        if (_container16 != null) {
            return _container16!!
        }
        _container16 = Builder(name = "Container16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.41f, 0.24f)
                lineToRelative(4.711f, 2.774f)
                curveToRelative(0.544f, 0.316f, 0.878f, 0.897f, 0.879f, 1.526f)
                verticalLineToRelative(5.01f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -0.88f, 1.53f)
                lineToRelative(-7.753f, 4.521f)
                lineToRelative(-0.002f, 0.001f)
                arcToRelative(1.769f, 1.769f, 0.0f, false, true, -1.774f, 0.0f)
                lineTo(5.59f, 15.602f)
                lineTo(0.873f, 12.85f)
                arcTo(1.761f, 1.761f, 0.0f, false, true, 0.0f, 11.327f)
                lineTo(0.0f, 6.292f)
                curveToRelative(0.0f, -0.304f, 0.078f, -0.598f, 0.22f, -0.855f)
                lineToRelative(0.004f, -0.005f)
                lineToRelative(0.01f, -0.019f)
                curveToRelative(0.15f, -0.262f, 0.369f, -0.486f, 0.64f, -0.643f)
                lineTo(8.641f, 0.239f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, true, 1.765f, 0.0f)
                lineToRelative(0.002f, 0.001f)
                close()
                moveTo(9.397f, 1.534f)
                lineToRelative(-7.17f, 4.182f)
                lineToRelative(4.116f, 2.388f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.269f, 0.0f)
                lineToRelative(7.152f, -4.148f)
                lineToRelative(-4.115f, -2.422f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.252f, 0.0f)
                close()
                moveTo(1.629f, 11.554f)
                lineTo(5.729f, 13.947f)
                lineTo(5.729f, 9.474f)
                arcToRelative(1.807f, 1.807f, 0.0f, false, true, -0.138f, -0.072f)
                lineTo(1.5f, 7.029f)
                verticalLineToRelative(4.298f)
                curveToRelative(0.0f, 0.095f, 0.05f, 0.181f, 0.129f, 0.227f)
                close()
                moveTo(10.229f, 12.196f)
                lineTo(11.75f, 11.309f)
                verticalLineToRelative(-4.45f)
                lineToRelative(-1.521f, 0.882f)
                close()
                moveTo(7.365f, 9.402f)
                horizontalLineToRelative(0.001f)
                curveToRelative(-0.044f, 0.026f, -0.09f, 0.049f, -0.136f, 0.071f)
                verticalLineToRelative(4.472f)
                lineToRelative(1.5f, -0.875f)
                lineTo(8.73f, 8.61f)
                close()
                moveTo(13.25f, 10.434f)
                lineTo(14.365f, 9.784f)
                horizontalLineToRelative(0.002f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, false, 0.133f, -0.232f)
                lineTo(14.5f, 5.264f)
                lineToRelative(-1.25f, 0.725f)
                close()
            }
        }
        .build()
        return _container16!!
    }

private var _container16: ImageVector? = null
