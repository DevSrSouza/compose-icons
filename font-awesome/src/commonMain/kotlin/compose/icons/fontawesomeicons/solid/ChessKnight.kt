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

public val SolidGroup.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 391.6f)
                verticalLineTo(416.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                horizontalLineTo(12.9f)
                curveTo(5.8f, 32.0f, 0.0f, 37.8f, 0.0f, 44.9f)
                curveToRelative(0.0f, 2.0f, 0.5f, 4.0f, 1.4f, 5.8f)
                lineTo(16.0f, 80.0f)
                lineTo(9.4f, 86.6f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                verticalLineTo(242.3f)
                curveToRelative(0.0f, 13.1f, 8.0f, 24.9f, 20.1f, 29.7f)
                lineToRelative(46.5f, 18.6f)
                curveToRelative(8.5f, 3.4f, 18.0f, 3.0f, 26.2f, -1.1f)
                lineToRelative(6.6f, -3.3f)
                curveToRelative(8.0f, -4.0f, 14.0f, -11.2f, 16.5f, -19.8f)
                lineToRelative(8.3f, -28.9f)
                curveToRelative(2.5f, -8.6f, 8.4f, -15.8f, 16.5f, -19.8f)
                lineTo(160.0f, 208.0f)
                verticalLineToRelative(40.4f)
                curveToRelative(0.0f, 24.2f, -13.7f, 46.4f, -35.4f, 57.2f)
                lineTo(67.4f, 334.3f)
                curveTo(45.7f, 345.2f, 32.0f, 367.3f, 32.0f, 391.6f)
                close()
                moveTo(72.0f, 148.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(9.0f, -20.0f, 20.0f, -20.0f)
                reflectiveCurveToRelative(20.0f, 9.0f, 20.0f, 20.0f)
                close()
                moveTo(352.0f, 448.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
