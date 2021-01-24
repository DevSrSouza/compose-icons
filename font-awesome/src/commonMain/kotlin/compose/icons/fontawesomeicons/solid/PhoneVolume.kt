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

public val SolidGroup.PhoneVolume: ImageVector
    get() {
        if (_phoneVolume != null) {
            return _phoneVolume!!
        }
        _phoneVolume = Builder(name = "PhoneVolume", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.333f, 506.966f)
                curveToRelative(-129.874f, -129.874f, -129.681f, -340.252f, 0.0f, -469.933f)
                curveToRelative(5.698f, -5.698f, 14.527f, -6.632f, 21.263f, -2.422f)
                lineToRelative(64.817f, 40.513f)
                arcToRelative(17.187f, 17.187f, 0.0f, false, true, 6.849f, 20.958f)
                lineToRelative(-32.408f, 81.021f)
                arcToRelative(17.188f, 17.188f, 0.0f, false, true, -17.669f, 10.719f)
                lineToRelative(-55.81f, -5.58f)
                curveToRelative(-21.051f, 58.261f, -20.612f, 122.471f, 0.0f, 179.515f)
                lineToRelative(55.811f, -5.581f)
                arcToRelative(17.188f, 17.188f, 0.0f, false, true, 17.669f, 10.719f)
                lineToRelative(32.408f, 81.022f)
                arcToRelative(17.188f, 17.188f, 0.0f, false, true, -6.849f, 20.958f)
                lineToRelative(-64.817f, 40.513f)
                arcToRelative(17.19f, 17.19f, 0.0f, false, true, -21.264f, -2.422f)
                close()
                moveTo(247.126f, 95.473f)
                curveToRelative(11.832f, 20.047f, 11.832f, 45.008f, 0.0f, 65.055f)
                curveToRelative(-3.95f, 6.693f, -13.108f, 7.959f, -18.718f, 2.581f)
                lineToRelative(-5.975f, -5.726f)
                curveToRelative(-3.911f, -3.748f, -4.793f, -9.622f, -2.261f, -14.41f)
                arcToRelative(32.063f, 32.063f, 0.0f, false, false, 0.0f, -29.945f)
                curveToRelative(-2.533f, -4.788f, -1.65f, -10.662f, 2.261f, -14.41f)
                lineToRelative(5.975f, -5.726f)
                curveToRelative(5.61f, -5.378f, 14.768f, -4.112f, 18.718f, 2.581f)
                close()
                moveTo(338.913f, 4.286f)
                curveToRelative(60.14f, 71.604f, 60.092f, 175.882f, 0.0f, 247.428f)
                curveToRelative(-4.474f, 5.327f, -12.53f, 5.746f, -17.552f, 0.933f)
                lineToRelative(-5.798f, -5.557f)
                curveToRelative(-4.56f, -4.371f, -4.977f, -11.529f, -0.93f, -16.379f)
                curveToRelative(49.687f, -59.538f, 49.646f, -145.933f, 0.0f, -205.422f)
                curveToRelative(-4.047f, -4.85f, -3.631f, -12.008f, 0.93f, -16.379f)
                lineToRelative(5.798f, -5.557f)
                curveToRelative(5.022f, -4.813f, 13.078f, -4.394f, 17.552f, 0.933f)
                close()
                moveTo(292.941f, 49.227f)
                curveToRelative(36.05f, 46.322f, 36.108f, 111.149f, 0.0f, 157.546f)
                curveToRelative(-4.39f, 5.641f, -12.697f, 6.251f, -17.856f, 1.304f)
                lineToRelative(-5.818f, -5.579f)
                curveToRelative(-4.4f, -4.219f, -4.998f, -11.095f, -1.285f, -15.931f)
                curveToRelative(26.536f, -34.564f, 26.534f, -82.572f, 0.0f, -117.134f)
                curveToRelative(-3.713f, -4.836f, -3.115f, -11.711f, 1.285f, -15.931f)
                lineToRelative(5.818f, -5.579f)
                curveToRelative(5.159f, -4.947f, 13.466f, -4.337f, 17.856f, 1.304f)
                close()
            }
        }
        .build()
        return _phoneVolume!!
    }

private var _phoneVolume: ImageVector? = null
