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

public val SimpleIcons.Hackerone: ImageVector
    get() {
        if (_hackerone != null) {
            return _hackerone!!
        }
        _hackerone = Builder(name = "Hackerone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.207f, 0.0f)
                curveToRelative(-0.4836f, 0.0f, -0.8774f, 0.1018f, -1.1823f, 0.3002f)
                curveToRelative(-0.3044f, 0.2003f, -0.4592f, 0.4627f, -0.4592f, 0.7798f)
                verticalLineToRelative(21.809f)
                curveToRelative(0.0f, 0.2766f, 0.1581f, 0.5277f, 0.4752f, 0.7609f)
                curveToRelative(0.315f, 0.2335f, 0.7031f, 0.3501f, 1.1664f, 0.3501f)
                curveToRelative(0.4427f, 0.0f, 0.8306f, -0.1166f, 1.1678f, -0.3501f)
                curveToRelative(0.3352f, -0.231f, 0.5058f, -0.4843f, 0.5058f, -0.761f)
                lineTo(8.8807f, 1.0815f)
                curveToRelative(0.0f, -0.319f, -0.1623f, -0.5769f, -0.4893f, -0.7813f)
                curveTo(8.0644f, 0.1018f, 7.6702f, 0.0f, 7.207f, 0.0f)
                close()
                moveTo(16.7304f, 8.662f)
                curveToRelative(-0.4836f, 0.0f, -0.8717f, 0.0981f, -1.1683f, 0.3007f)
                lineToRelative(-4.439f, 2.7822f)
                curveToRelative(-0.1988f, 0.1861f, -0.2841f, 0.4687f, -0.2473f, 0.855f)
                curveToRelative(0.0342f, 0.3826f, 0.2108f, 0.747f, 0.5238f, 1.0907f)
                curveToRelative(0.3145f, 0.346f, 0.6662f, 0.5626f, 1.0684f, 0.6547f)
                curveToRelative(0.3963f, 0.0899f, 0.6973f, 0.041f, 0.8962f, -0.143f)
                lineToRelative(1.7551f, -1.0951f)
                verticalLineToRelative(9.7817f)
                curveToRelative(0.0f, 0.2767f, 0.1522f, 0.5278f, 0.4607f, 0.761f)
                curveToRelative(0.3007f, 0.2335f, 0.6873f, 0.3501f, 1.1504f, 0.3501f)
                curveToRelative(0.463f, 0.0f, 0.863f, -0.1166f, 1.1983f, -0.3501f)
                curveToRelative(0.3371f, -0.2332f, 0.5058f, -0.4843f, 0.5058f, -0.761f)
                lineTo(18.4345f, 9.7381f)
                curveToRelative(0.0f, -0.3193f, -0.165f, -0.577f, -0.4898f, -0.7754f)
                curveToRelative(-0.3252f, -0.2026f, -0.7288f, -0.3007f, -1.2143f, -0.3007f)
                close()
            }
        }
        .build()
        return _hackerone!!
    }

private var _hackerone: ImageVector? = null
