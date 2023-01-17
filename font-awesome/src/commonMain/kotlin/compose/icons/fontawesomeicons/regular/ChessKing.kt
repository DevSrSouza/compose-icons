package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.9f, 464.0f)
                horizontalLineTo(55.95f)
                curveToRelative(-13.25f, 0.0f, -23.1f, 10.75f, -23.1f, 23.1f)
                reflectiveCurveTo(42.7f, 512.0f, 55.95f, 512.0f)
                horizontalLineToRelative(335.1f)
                curveToRelative(13.25f, 0.0f, 23.1f, -10.75f, 23.1f, -23.1f)
                reflectiveCurveTo(405.2f, 464.0f, 391.9f, 464.0f)
                close()
                moveTo(448.0f, 216.0f)
                curveToRelative(0.0f, -11.82f, -3.783f, -23.51f, -11.08f, -33.17f)
                curveToRelative(-10.3f, -14.39f, -27.0f, -22.88f, -44.73f, -22.88f)
                lineTo(247.9f, 160.0f)
                verticalLineTo(104.0f)
                horizontalLineToRelative(31.1f)
                curveToRelative(13.2f, 0.0f, 24.06f, -10.8f, 24.06f, -24.0f)
                reflectiveCurveTo(293.1f, 56.0f, 279.9f, 56.0f)
                horizontalLineToRelative(-31.1f)
                verticalLineTo(23.1f)
                curveTo(247.9f, 10.8f, 237.2f, 0.0f, 223.1f, 0.0f)
                reflectiveCurveTo(199.9f, 10.8f, 199.9f, 23.1f)
                verticalLineTo(56.0f)
                horizontalLineTo(167.9f)
                curveToRelative(-13.2f, 0.0f, -23.97f, 10.8f, -23.97f, 24.0f)
                reflectiveCurveTo(154.7f, 104.0f, 167.9f, 104.0f)
                horizontalLineToRelative(31.1f)
                verticalLineTo(160.0f)
                horizontalLineTo(55.95f)
                curveTo(24.72f, 160.0f, 0.0f, 185.3f, 0.0f, 215.9f)
                curveTo(0.0f, 221.6f, 0.889f, 227.4f, 2.704f, 233.0f)
                lineTo(68.45f, 432.0f)
                horizontalLineToRelative(50.5f)
                lineTo(48.33f, 218.4f)
                curveTo(48.09f, 217.6f, 47.98f, 216.9f, 47.98f, 216.1f)
                curveTo(47.98f, 212.3f, 50.93f, 208.0f, 55.95f, 208.0f)
                horizontalLineToRelative(335.9f)
                curveToRelative(6.076f, 0.0f, 8.115f, 5.494f, 8.115f, 8.113f)
                curveToRelative(0.0f, 0.634f, -0.078f, 1.269f, -0.241f, 1.887f)
                lineTo(328.8f, 432.0f)
                horizontalLineToRelative(50.62f)
                lineToRelative(65.1f, -199.2f)
                curveTo(447.2f, 227.3f, 448.0f, 221.7f, 448.0f, 216.0f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
