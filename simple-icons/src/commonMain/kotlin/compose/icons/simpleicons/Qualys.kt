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

public val SimpleIcons.Qualys: ImageVector
    get() {
        if (_qualys != null) {
            return _qualys!!
        }
        _qualys = Builder(name = "Qualys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9986f, 0.0f)
                curveTo(5.4353f, 0.0f, 2.1382f, 3.5117f, 2.1382f, 3.5117f)
                reflectiveCurveToRelative(-0.3775f, 2.5993f, -0.1366f, 7.8332f)
                curveTo(2.3654f, 19.2513f, 11.999f, 24.0005f, 11.9999f, 24.0f)
                curveToRelative(0.001f, -5.0E-4f, 9.6347f, -4.7488f, 9.9985f, -12.6551f)
                curveToRelative(0.2408f, -5.2339f, -0.1364f, -7.8332f, -0.1364f, -7.8332f)
                reflectiveCurveTo(18.562f, 0.0f, 11.9986f, 0.0f)
                close()
                moveTo(11.3204f, 2.9194f)
                arcToRelative(7.3657f, 7.3657f, 0.0f, false, true, 8.0454f, 7.3343f)
                arcToRelative(7.1158f, 7.1158f, 0.0f, false, true, -2.7712f, 5.6342f)
                curveToRelative(-1.1788f, -0.108f, -2.4098f, -0.4423f, -2.9676f, -0.7605f)
                curveToRelative(1.4379f, -0.9177f, 3.3036f, -2.7033f, 3.3036f, -4.8737f)
                arcToRelative(4.9361f, 4.9361f, 0.0f, false, false, -4.9305f, -4.9305f)
                curveToRelative(-2.7165f, 0.0f, -4.9266f, 2.2743f, -4.9266f, 5.0698f)
                curveToRelative(0.0f, 2.332f, 1.2355f, 4.1624f, 3.6718f, 5.4404f)
                curveToRelative(1.5943f, 0.8363f, 3.9724f, 1.449f, 6.4852f, 1.7723f)
                curveToRelative(-0.418f, 0.6225f, -1.533f, 1.686f, -2.1847f, 2.0462f)
                curveToRelative(-3.0087f, -0.4934f, -5.6513f, -1.5354f, -7.4578f, -3.0964f)
                curveToRelative(-1.9323f, -1.6699f, -2.9536f, -3.8488f, -2.9536f, -6.3018f)
                arcToRelative(7.3657f, 7.3657f, 0.0f, false, true, 6.686f, -7.3343f)
                close()
            }
        }
        .build()
        return _qualys!!
    }

private var _qualys: ImageVector? = null
