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

public val LineAwesomeIcons.HeartBrokenSolid: ImageVector
    get() {
        if (_heartBrokenSolid != null) {
            return _heartBrokenSolid!!
        }
        _heartBrokenSolid = Builder(name = "HeartBrokenSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 4.0f)
                curveTo(5.3622f, 4.0f, 2.0f, 7.4035f, 2.0f, 11.5f)
                curveTo(2.0f, 12.9283f, 2.6518f, 14.1534f, 3.252f, 15.0488f)
                curveTo(3.8521f, 15.9442f, 4.4648f, 16.5449f, 4.4648f, 16.5449f)
                lineTo(16.0f, 28.082f)
                lineTo(27.5352f, 16.5449f)
                curveTo(27.5352f, 16.5449f, 30.0f, 14.3574f, 30.0f, 11.5f)
                curveTo(30.0f, 7.4035f, 26.6378f, 4.0f, 22.5f, 4.0f)
                curveTo(20.9303f, 4.0f, 19.5269f, 4.5233f, 18.3906f, 5.1484f)
                lineTo(18.0605f, 5.3301f)
                lineTo(16.0039f, 11.0f)
                lineTo(19.625f, 11.0f)
                lineTo(16.0f, 17.2148f)
                lineTo(16.0f, 13.0f)
                lineTo(12.4531f, 13.0f)
                lineTo(13.998f, 5.3594f)
                lineTo(13.3262f, 5.0137f)
                curveTo(12.2494f, 4.4595f, 10.9521f, 4.0f, 9.5f, 4.0f)
                close()
                moveTo(9.5f, 6.0f)
                curveTo(10.2781f, 6.0f, 10.9965f, 6.3086f, 11.707f, 6.6016f)
                lineTo(10.0078f, 15.0f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 21.0f)
                lineTo(16.1094f, 21.0f)
                lineTo(22.0f, 10.8945f)
                lineTo(22.0f, 9.0f)
                lineTo(18.8555f, 9.0f)
                lineTo(19.6484f, 6.8164f)
                curveTo(20.522f, 6.3737f, 21.4865f, 6.0f, 22.5f, 6.0f)
                curveTo(25.5422f, 6.0f, 28.0f, 8.4965f, 28.0f, 11.5f)
                curveTo(28.0f, 13.0446f, 26.1309f, 15.1211f, 26.1309f, 15.1211f)
                lineTo(26.1289f, 15.123f)
                lineTo(16.0f, 25.252f)
                lineTo(5.8711f, 15.123f)
                lineTo(5.8691f, 15.1211f)
                curveTo(5.8691f, 15.1211f, 5.3974f, 14.6567f, 4.9141f, 13.9355f)
                curveTo(4.4307f, 13.2145f, 4.0f, 12.2717f, 4.0f, 11.5f)
                curveTo(4.0f, 8.4965f, 6.4578f, 6.0f, 9.5f, 6.0f)
                close()
            }
        }
        .build()
        return _heartBrokenSolid!!
    }

private var _heartBrokenSolid: ImageVector? = null
