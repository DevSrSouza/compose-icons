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

public val Octicons.Container16: ImageVector
    get() {
        if (_container16 != null) {
            return _container16!!
        }
        _container16 = Builder(name = "Container16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.41f, 0.24f)
                lineToRelative(4.711f, 2.774f)
                arcTo(1.767f, 1.767f, 0.0f, false, true, 16.0f, 4.54f)
                verticalLineToRelative(5.01f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -0.88f, 1.53f)
                lineToRelative(-7.753f, 4.521f)
                lineToRelative(-0.002f, 0.001f)
                arcToRelative(1.767f, 1.767f, 0.0f, false, true, -1.774f, 0.0f)
                lineTo(5.59f, 15.602f)
                lineTo(0.873f, 12.85f)
                arcTo(1.762f, 1.762f, 0.0f, false, true, 0.0f, 11.327f)
                lineTo(0.0f, 6.292f)
                curveToRelative(0.0f, -0.304f, 0.078f, -0.598f, 0.22f, -0.855f)
                lineToRelative(0.004f, -0.005f)
                lineToRelative(0.01f, -0.019f)
                curveToRelative(0.15f, -0.262f, 0.369f, -0.486f, 0.64f, -0.643f)
                lineTo(8.641f, 0.239f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.765f, 0.0f)
                lineToRelative(0.002f, 0.001f)
                close()
                moveTo(9.397f, 1.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.252f, 0.0f)
                lineToRelative(4.115f, 2.422f)
                lineToRelative(-7.152f, 4.148f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, -0.269f, 0.0f)
                lineTo(2.227f, 5.716f)
                lineToRelative(7.17f, -4.182f)
                close()
                moveTo(7.365f, 9.402f)
                lineTo(8.73f, 8.61f)
                verticalLineToRelative(4.46f)
                lineToRelative(-1.5f, 0.875f)
                lineTo(7.23f, 9.473f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, false, 0.136f, -0.071f)
                close()
                moveTo(10.229f, 12.196f)
                lineTo(10.229f, 7.741f)
                lineToRelative(1.521f, -0.882f)
                verticalLineToRelative(4.45f)
                lineToRelative(-1.521f, 0.887f)
                close()
                moveTo(13.25f, 10.434f)
                lineToRelative(1.115f, -0.65f)
                horizontalLineToRelative(0.002f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, false, 0.133f, -0.232f)
                lineTo(14.5f, 5.264f)
                lineToRelative(-1.25f, 0.725f)
                verticalLineToRelative(4.445f)
                close()
                moveTo(1.629f, 11.554f)
                lineToRelative(4.1f, 2.393f)
                lineTo(5.729f, 9.474f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -0.138f, -0.072f)
                lineTo(1.5f, 7.029f)
                verticalLineToRelative(4.298f)
                curveToRelative(0.0f, 0.095f, 0.05f, 0.181f, 0.129f, 0.227f)
                close()
            }
        }
        .build()
        return _container16!!
    }

private var _container16: ImageVector? = null
