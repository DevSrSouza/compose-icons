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

public val SimpleIcons.Dlib: ImageVector
    get() {
        if (_dlib != null) {
            return _dlib!!
        }
        _dlib = Builder(name = "Dlib", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2188f, 0.0022f)
                curveToRelative(-0.5082f, -0.01f, -1.0158f, 0.015f, -1.5223f, 0.046f)
                verticalLineToRelative(23.9085f)
                curveToRelative(0.9724f, 0.068f, 1.954f, 0.055f, 2.9238f, -0.032f)
                curveToRelative(0.2836f, -0.9399f, 0.5742f, -1.8784f, 0.8605f, -2.8177f)
                curveToRelative(1.488f, -0.2455f, 2.9172f, -0.7078f, 4.192f, -1.361f)
                curveToRelative(1.04f, 0.5022f, 2.0797f, 1.0049f, 3.12f, 1.5067f)
                arcToRelative(14.2125f, 14.2125f, 0.0f, false, false, 2.0759f, -1.5805f)
                curveToRelative(-0.6353f, -0.8301f, -1.2734f, -1.6589f, -1.9098f, -2.4884f)
                curveToRelative(0.8294f, -1.02f, 1.4426f, -2.1614f, 1.7261f, -3.3565f)
                curveToRelative(1.1902f, -0.2287f, 2.3801f, -0.4583f, 3.5705f, -0.6865f)
                arcToRelative(10.5282f, 10.5282f, 0.0f, false, false, -0.0302f, -2.2869f)
                curveToRelative(-1.1825f, -0.2277f, -2.3653f, -0.4548f, -3.5479f, -0.6824f)
                curveToRelative(-0.2922f, -1.1939f, -0.8713f, -2.3444f, -1.7235f, -3.3545f)
                curveToRelative(0.6384f, -0.8293f, 1.2757f, -1.6593f, 1.9148f, -2.4884f)
                curveToRelative(-0.6128f, -0.5881f, -1.297f, -1.117f, -2.0432f, -1.5984f)
                curveToRelative(-1.0537f, 0.5102f, -2.1086f, 1.019f, -3.1628f, 1.5285f)
                curveToRelative(-1.2667f, -0.6671f, -2.6973f, -1.1432f, -4.187f, -1.3868f)
                curveTo(7.1875f, 1.9292f, 6.898f, 0.987f, 6.6103f, 0.0442f)
                curveToRelative(-0.463f, -0.028f, -0.927f, -0.049f, -1.3914f, -0.042f)
                close()
                moveTo(7.5488f, 5.3902f)
                curveToRelative(3.6866f, 0.8142f, 6.464f, 3.7461f, 6.2778f, 6.8008f)
                curveToRelative(-0.0934f, 2.8969f, -2.6816f, 5.6581f, -6.2426f, 6.3976f)
                curveToRelative(-0.1694f, -0.2268f, -0.0253f, -0.7803f, -0.0734f, -1.1335f)
                curveToRelative(-0.002f, -4.0243f, -0.003f, -8.0486f, -0.005f, -12.073f)
                lineToRelative(0.0428f, 0.01f)
                close()
            }
        }
        .build()
        return _dlib!!
    }

private var _dlib: ImageVector? = null
