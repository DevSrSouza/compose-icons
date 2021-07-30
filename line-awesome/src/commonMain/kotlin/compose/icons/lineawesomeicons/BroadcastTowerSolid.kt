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

public val LineAwesomeIcons.BroadcastTowerSolid: ImageVector
    get() {
        if (_broadcastTowerSolid != null) {
            return _broadcastTowerSolid!!
        }
        _broadcastTowerSolid = Builder(name = "BroadcastTowerSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1875f, 4.1875f)
                curveTo(2.8906f, 8.3711f, 2.9063f, 15.3125f, 7.1875f, 19.5938f)
                lineTo(8.5938f, 18.1875f)
                curveTo(5.0742f, 14.668f, 5.0898f, 9.0391f, 8.5938f, 5.625f)
                close()
                moveTo(24.8125f, 4.2813f)
                lineTo(23.4063f, 5.7188f)
                curveTo(26.9297f, 9.2422f, 26.9297f, 14.7578f, 23.4063f, 18.2813f)
                lineTo(24.8125f, 19.7188f)
                curveTo(29.0859f, 15.4453f, 29.0859f, 8.5547f, 24.8125f, 4.2813f)
                close()
                moveTo(9.9063f, 7.1875f)
                curveTo(7.3203f, 9.7734f, 7.3203f, 14.0078f, 9.9063f, 16.5938f)
                lineTo(11.3125f, 15.1875f)
                curveTo(9.5f, 13.375f, 9.5f, 10.4063f, 11.3125f, 8.5938f)
                close()
                moveTo(22.0938f, 7.2813f)
                lineTo(20.6875f, 8.7188f)
                curveTo(22.5f, 10.5313f, 22.5f, 13.4688f, 20.6875f, 15.2813f)
                lineTo(22.0938f, 16.7188f)
                curveTo(24.6797f, 14.1328f, 24.6797f, 9.8672f, 22.0938f, 7.2813f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(14.8945f, 10.0f, 14.0f, 10.8945f, 14.0f, 12.0f)
                curveTo(14.0f, 12.625f, 14.3008f, 13.1641f, 14.75f, 13.5313f)
                lineTo(10.3125f, 26.0f)
                lineTo(9.0f, 26.0f)
                lineTo(9.0f, 28.0f)
                lineTo(13.0f, 28.0f)
                lineTo(13.0f, 26.0f)
                lineTo(12.4063f, 26.0f)
                lineTo(16.0f, 15.9688f)
                lineTo(19.5938f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 26.0f)
                lineTo(21.6875f, 26.0f)
                lineTo(17.25f, 13.5313f)
                curveTo(17.6992f, 13.1641f, 18.0f, 12.625f, 18.0f, 12.0f)
                curveTo(18.0f, 10.8945f, 17.1055f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _broadcastTowerSolid!!
    }

private var _broadcastTowerSolid: ImageVector? = null
