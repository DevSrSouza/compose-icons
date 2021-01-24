package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.622f, 255.92f)
                lineToRelative(45.985f, -45.005f)
                curveToRelative(13.708f, -12.977f, 7.316f, -36.039f, -10.664f, -40.339f)
                lineToRelative(-62.65f, -15.99f)
                lineToRelative(17.661f, -62.015f)
                curveToRelative(4.991f, -17.838f, -11.829f, -34.663f, -29.661f, -29.671f)
                lineToRelative(-61.994f, 17.667f)
                lineToRelative(-15.984f, -62.671f)
                curveTo(337.085f, 0.197f, 313.765f, -6.276f, 300.99f, 7.228f)
                lineTo(256.0f, 53.57f)
                lineTo(211.011f, 7.229f)
                curveToRelative(-12.63f, -13.351f, -36.047f, -7.234f, -40.325f, 10.668f)
                lineToRelative(-15.984f, 62.671f)
                lineToRelative(-61.995f, -17.667f)
                curveTo(74.87f, 57.907f, 58.056f, 74.738f, 63.046f, 92.572f)
                lineToRelative(17.661f, 62.015f)
                lineToRelative(-62.65f, 15.99f)
                curveTo(0.069f, 174.878f, -6.31f, 197.944f, 7.392f, 210.915f)
                lineToRelative(45.985f, 45.005f)
                lineToRelative(-45.985f, 45.004f)
                curveToRelative(-13.708f, 12.977f, -7.316f, 36.039f, 10.664f, 40.339f)
                lineToRelative(62.65f, 15.99f)
                lineToRelative(-17.661f, 62.015f)
                curveToRelative(-4.991f, 17.838f, 11.829f, 34.663f, 29.661f, 29.671f)
                lineToRelative(61.994f, -17.667f)
                lineToRelative(15.984f, 62.671f)
                curveToRelative(4.439f, 18.575f, 27.696f, 24.018f, 40.325f, 10.668f)
                lineTo(256.0f, 458.61f)
                lineToRelative(44.989f, 46.001f)
                curveToRelative(12.5f, 13.488f, 35.987f, 7.486f, 40.325f, -10.668f)
                lineToRelative(15.984f, -62.671f)
                lineToRelative(61.994f, 17.667f)
                curveToRelative(17.836f, 4.994f, 34.651f, -11.837f, 29.661f, -29.671f)
                lineToRelative(-17.661f, -62.015f)
                lineToRelative(62.65f, -15.99f)
                curveToRelative(17.987f, -4.302f, 24.366f, -27.367f, 10.664f, -40.339f)
                lineToRelative(-45.984f, -45.004f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
