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

public val Octicons.Container24: ImageVector
    get() {
        if (_container24 != null) {
            return _container24!!
        }
        _container24 = Builder(name = "Container24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.152f, 0.682f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.269f, 0.0f)
                lineToRelative(0.007f, 0.004f)
                lineToRelative(6.957f, 4.276f)
                arcToRelative(2.276f, 2.276f, 0.0f, false, true, 1.126f, 1.964f)
                verticalLineToRelative(7.516f)
                curveToRelative(0.0f, 0.81f, -0.432f, 1.56f, -1.133f, 1.968f)
                lineToRelative(-0.002f, 0.001f)
                lineToRelative(-11.964f, 7.037f)
                lineToRelative(-0.004f, 0.003f)
                arcToRelative(2.276f, 2.276f, 0.0f, false, true, -2.284f, 0.0f)
                lineToRelative(-0.026f, -0.015f)
                lineToRelative(-6.503f, -4.502f)
                arcToRelative(2.268f, 2.268f, 0.0f, false, true, -1.096f, -1.943f)
                lineTo(0.499f, 9.438f)
                curveToRelative(0.0f, -0.392f, 0.1f, -0.77f, 0.284f, -1.1f)
                lineToRelative(0.003f, -0.006f)
                lineToRelative(0.014f, -0.026f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 0.82f, -0.827f)
                horizontalLineToRelative(0.002f)
                lineTo(13.152f, 0.681f)
                close()
                moveTo(13.909f, 1.977f)
                horizontalLineToRelative(-0.001f)
                lineTo(2.648f, 8.616f)
                lineToRelative(6.248f, 4.247f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, false, 0.758f, -0.01f)
                horizontalLineToRelative(0.001f)
                lineToRelative(11.633f, -6.804f)
                lineToRelative(-6.629f, -4.074f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.003f)
                close()
                moveTo(18.0f, 9.709f)
                lineToRelative(-3.25f, 1.9f)
                verticalLineToRelative(7.548f)
                lineTo(18.0f, 17.245f)
                lineTo(18.0f, 9.709f)
                close()
                moveTo(19.5f, 8.831f)
                verticalLineToRelative(7.532f)
                lineToRelative(2.124f, -1.25f)
                arcToRelative(0.777f, 0.777f, 0.0f, false, false, 0.387f, -0.671f)
                lineTo(22.011f, 7.363f)
                lineTo(19.5f, 8.831f)
                close()
                moveTo(10.41f, 14.147f)
                lineToRelative(2.84f, -1.66f)
                verticalLineToRelative(7.552f)
                lineToRelative(-3.233f, 1.902f)
                verticalLineToRelative(-7.612f)
                curveToRelative(0.134f, -0.047f, 0.265f, -0.107f, 0.391f, -0.18f)
                lineToRelative(0.002f, -0.002f)
                close()
                moveTo(8.517f, 21.901f)
                lineTo(8.517f, 14.33f)
                arcToRelative(2.277f, 2.277f, 0.0f, false, true, -0.393f, -0.18f)
                lineToRelative(-0.023f, -0.014f)
                lineToRelative(-6.102f, -4.147f)
                verticalLineToRelative(7.003f)
                curveToRelative(0.0f, 0.275f, 0.145f, 0.528f, 0.379f, 0.664f)
                lineToRelative(0.025f, 0.014f)
                lineToRelative(6.114f, 4.232f)
                close()
            }
        }
        .build()
        return _container24!!
    }

private var _container24: ImageVector? = null
