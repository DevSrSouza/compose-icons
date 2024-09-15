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
                moveTo(7.188f, 4.188f)
                curveTo(2.891f, 8.371f, 2.906f, 15.313f, 7.188f, 19.594f)
                lineTo(8.594f, 18.188f)
                curveTo(5.074f, 14.668f, 5.09f, 9.039f, 8.594f, 5.625f)
                close()
                moveTo(24.813f, 4.281f)
                lineTo(23.406f, 5.719f)
                curveTo(26.93f, 9.242f, 26.93f, 14.758f, 23.406f, 18.281f)
                lineTo(24.813f, 19.719f)
                curveTo(29.086f, 15.445f, 29.086f, 8.555f, 24.813f, 4.281f)
                close()
                moveTo(9.906f, 7.188f)
                curveTo(7.32f, 9.773f, 7.32f, 14.008f, 9.906f, 16.594f)
                lineTo(11.313f, 15.188f)
                curveTo(9.5f, 13.375f, 9.5f, 10.406f, 11.313f, 8.594f)
                close()
                moveTo(22.094f, 7.281f)
                lineTo(20.688f, 8.719f)
                curveTo(22.5f, 10.531f, 22.5f, 13.469f, 20.688f, 15.281f)
                lineTo(22.094f, 16.719f)
                curveTo(24.68f, 14.133f, 24.68f, 9.867f, 22.094f, 7.281f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(14.895f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 12.625f, 14.301f, 13.164f, 14.75f, 13.531f)
                lineTo(10.313f, 26.0f)
                lineTo(9.0f, 26.0f)
                lineTo(9.0f, 28.0f)
                lineTo(13.0f, 28.0f)
                lineTo(13.0f, 26.0f)
                lineTo(12.406f, 26.0f)
                lineTo(16.0f, 15.969f)
                lineTo(19.594f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 26.0f)
                lineTo(21.688f, 26.0f)
                lineTo(17.25f, 13.531f)
                curveTo(17.699f, 13.164f, 18.0f, 12.625f, 18.0f, 12.0f)
                curveTo(18.0f, 10.895f, 17.105f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _broadcastTowerSolid!!
    }

private var _broadcastTowerSolid: ImageVector? = null
