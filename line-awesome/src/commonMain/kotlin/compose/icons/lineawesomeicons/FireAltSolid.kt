package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FireAltSolid: ImageVector
    get() {
        if (_fireAltSolid != null) {
            return _fireAltSolid!!
        }
        _fireAltSolid = Builder(name = "FireAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7988f, 4.3906f)
                lineTo(13.8027f, 9.3867f)
                lineTo(11.9531f, 7.5391f)
                lineTo(11.25f, 8.3379f)
                curveTo(7.767f, 12.2859f, 6.0f, 15.873f, 6.0f, 19.0f)
                curveTo(6.0f, 23.962f, 10.486f, 28.0f, 16.0f, 28.0f)
                curveTo(21.514f, 28.0f, 26.0f, 23.962f, 26.0f, 19.0f)
                curveTo(26.0f, 14.238f, 20.8031f, 8.3661f, 17.7051f, 5.2891f)
                lineTo(16.7988f, 4.3906f)
                close()
                moveTo(17.1914f, 7.623f)
                curveTo(19.7674f, 10.309f, 24.0f, 15.288f, 24.0f, 19.0f)
                curveTo(24.0f, 21.3912f, 22.6203f, 23.5043f, 20.5234f, 24.7676f)
                curveTo(20.822f, 24.0541f, 21.0f, 23.2675f, 21.0f, 22.4297f)
                curveTo(21.0f, 20.0487f, 19.3153f, 17.2244f, 17.9023f, 15.2754f)
                lineTo(17.0586f, 14.1094f)
                lineTo(14.8438f, 17.4316f)
                lineTo(13.4375f, 16.0254f)
                lineTo(12.7773f, 17.1152f)
                curveTo(11.5983f, 19.0612f, 11.0f, 20.8487f, 11.0f, 22.4297f)
                curveTo(11.0f, 23.2675f, 11.178f, 24.0541f, 11.4766f, 24.7676f)
                curveTo(9.3797f, 23.5043f, 8.0f, 21.3912f, 8.0f, 19.0f)
                curveTo(8.0f, 16.611f, 9.3976f, 13.6767f, 12.0566f, 10.4707f)
                lineTo(14.1973f, 12.6133f)
                lineTo(17.1914f, 7.623f)
                close()
                moveTo(17.1035f, 17.6484f)
                curveTo(18.3335f, 19.5654f, 19.0f, 21.2337f, 19.0f, 22.4297f)
                curveTo(19.0f, 24.3987f, 17.654f, 26.0f, 16.0f, 26.0f)
                curveTo(14.346f, 26.0f, 13.0f, 24.3987f, 13.0f, 22.4297f)
                curveTo(13.0f, 21.5077f, 13.2902f, 20.4522f, 13.8652f, 19.2813f)
                lineTo(15.1563f, 20.5703f)
                lineTo(17.1035f, 17.6484f)
                close()
            }
        }
        .build()
        return _fireAltSolid!!
    }

private var _fireAltSolid: ImageVector? = null
