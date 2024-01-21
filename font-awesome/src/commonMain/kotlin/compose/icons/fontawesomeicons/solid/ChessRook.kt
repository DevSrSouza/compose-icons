package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 192.0f)
                lineTo(32.0f, 48.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineTo(128.0f, 88.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(176.0f, 48.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineTo(272.0f, 88.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(320.0f, 48.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineTo(416.0f, 192.0f)
                curveToRelative(0.0f, 10.1f, -4.7f, 19.6f, -12.8f, 25.6f)
                lineTo(352.0f, 256.0f)
                lineToRelative(16.0f, 144.0f)
                lineTo(80.0f, 400.0f)
                lineTo(96.0f, 256.0f)
                lineTo(44.8f, 217.6f)
                curveTo(36.7f, 211.6f, 32.0f, 202.1f, 32.0f, 192.0f)
                close()
                moveTo(208.0f, 288.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(256.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(22.6f, 473.4f)
                lineTo(64.0f, 432.0f)
                lineTo(384.0f, 432.0f)
                lineToRelative(41.4f, 41.4f)
                curveToRelative(4.2f, 4.2f, 6.6f, 10.0f, 6.6f, 16.0f)
                curveToRelative(0.0f, 12.5f, -10.1f, 22.6f, -22.6f, 22.6f)
                lineTo(38.6f, 512.0f)
                curveTo(26.1f, 512.0f, 16.0f, 501.9f, 16.0f, 489.4f)
                curveToRelative(0.0f, -6.0f, 2.4f, -11.8f, 6.6f, -16.0f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
