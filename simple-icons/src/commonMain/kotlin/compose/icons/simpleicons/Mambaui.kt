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

public val SimpleIcons.Mambaui: ImageVector
    get() {
        if (_mambaui != null) {
            return _mambaui!!
        }
        _mambaui = Builder(name = "Mambaui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0454f, 15.831f)
                curveToRelative(1.3027f, 0.3488f, 2.4956f, 0.7732f, 3.9102f, 1.0423f)
                arcToRelative(30.7131f, 30.7131f, 0.0f, false, false, 0.4045f, 6.0695f)
                curveToRelative(-1.6978f, -1.9082f, -4.1376f, -5.1865f, -4.3147f, -7.1117f)
                close()
                moveTo(19.888f, 15.831f)
                curveToRelative(-1.2583f, 0.3488f, -2.4104f, 0.7732f, -3.7766f, 1.0423f)
                arcToRelative(31.7724f, 31.7724f, 0.0f, false, true, -0.3904f, 6.0695f)
                curveToRelative(1.6439f, -1.9082f, 4.0012f, -5.1865f, 4.167f, -7.1117f)
                close()
                moveTo(6.7826f, 1.0573f)
                curveToRelative(2.3175f, 4.1689f, 9.686f, 3.6288f, 11.4596f, 0.0f)
                arcToRelative(6.223f, 6.223f, 0.0f, false, true, 2.3374f, 1.3862f)
                curveToRelative(-0.0862f, 3.607f, -2.3374f, 4.8974f, -2.3374f, 4.8974f)
                lineToRelative(0.0777f, 0.8376f)
                curveToRelative(2.5657f, -0.7428f, 3.5217f, -0.6632f, 3.336f, -5.0216f)
                curveToRelative(1.2895f, 1.0583f, 2.4559f, 3.067f, 2.3355f, 4.3584f)
                curveToRelative(-0.125f, 1.3416f, -2.037f, 5.3768f, -1.8002f, 5.3058f)
                arcToRelative(87.7487f, 87.7487f, 0.0f, false, true, -8.4447f, 3.2043f)
                arcToRelative(2.9305f, 2.9305f, 0.0f, false, false, -1.9433f, -1.6723f)
                arcToRelative(12.7813f, 12.7813f, 0.0f, false, false, -1.784f, 1.7794f)
                curveToRelative(-2.347f, -0.8527f, -4.4238f, -1.8002f, -6.5944f, -2.7211f)
                lineToRelative(-1.7055f, -0.6282f)
                lineToRelative(-0.776f, -1.9897f)
                curveToRelative(-1.0422f, -2.579f, -1.5159f, -4.0154f, 0.1554f, -6.2789f)
                curveToRelative(0.3639f, -0.4917f, 0.9977f, -1.5604f, 1.5558f, -1.7945f)
                curveToRelative(-0.109f, 3.6952f, -1.2242f, 5.4537f, 2.9438f, 5.4574f)
                lineToRelative(0.0776f, -0.8375f)
                reflectiveCurveToRelative(-1.8096f, -0.2265f, -2.2492f, -4.8975f)
                close()
                moveTo(8.8556f, 12.2602f)
                curveToRelative(-0.2074f, 0.2785f, -0.3363f, 0.3486f, -0.5428f, 0.6282f)
                curveToRelative(0.052f, 0.1392f, -0.2066f, 0.1743f, -0.1554f, 0.3136f)
                arcTo(2.8651f, 2.8651f, 0.0f, false, false, 9.01f, 14.353f)
                arcToRelative(2.6643f, 2.6643f, 0.0f, false, false, 1.7054f, -1.1511f)
                curveToRelative(-0.2065f, -0.4397f, -1.443f, -1.1626f, -1.8599f, -0.9409f)
                close()
                moveTo(14.5186f, 12.2602f)
                curveToRelative(-0.414f, 0.2785f, -0.9048f, 0.6632f, -1.3188f, 0.9418f)
                curveToRelative(0.1288f, 0.2094f, 0.8015f, 0.7324f, 0.9313f, 0.9417f)
                curveToRelative(0.3904f, 0.235f, 0.2957f, 0.4274f, 0.776f, 0.2094f)
                arcToRelative(1.4013f, 1.4013f, 0.0f, false, false, 0.8527f, -1.2554f)
                curveToRelative(-0.2065f, -0.2444f, -0.414f, -0.593f, -0.6205f, -0.8375f)
                close()
            }
        }
        .build()
        return _mambaui!!
    }

private var _mambaui: ImageVector? = null
