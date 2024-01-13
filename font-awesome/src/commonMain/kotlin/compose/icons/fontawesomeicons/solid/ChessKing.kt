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

public val SolidGroup.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(256.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(408.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                curveToRelative(0.0f, 5.3f, -1.0f, 10.5f, -3.1f, 15.4f)
                lineTo(368.0f, 400.0f)
                horizontalLineTo(80.0f)
                lineTo(3.1f, 215.4f)
                curveTo(1.0f, 210.5f, 0.0f, 205.3f, 0.0f, 200.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(112.0f)
                horizontalLineTo(176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(38.6f, 473.4f)
                lineTo(80.0f, 432.0f)
                horizontalLineTo(368.0f)
                lineToRelative(41.4f, 41.4f)
                curveToRelative(4.2f, 4.2f, 6.6f, 10.0f, 6.6f, 16.0f)
                curveToRelative(0.0f, 12.5f, -10.1f, 22.6f, -22.6f, 22.6f)
                horizontalLineTo(54.6f)
                curveTo(42.1f, 512.0f, 32.0f, 501.9f, 32.0f, 489.4f)
                curveToRelative(0.0f, -6.0f, 2.4f, -11.8f, 6.6f, -16.0f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
