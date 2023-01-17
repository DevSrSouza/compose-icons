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

public val RegularGroup.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 320.6f)
                lineToRelative(14.5f, 6.5f)
                curveToRelative(-17.01f, 20.24f, -26.44f, 45.91f, -26.44f, 72.35f)
                curveTo(32.06f, 399.7f, 32.12f, 432.0f, 32.12f, 432.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -24.75f, 14.0f, -47.5f, 36.13f, -58.63f)
                lineToRelative(38.13f, -23.37f)
                curveToRelative(13.25f, -6.625f, 21.75f, -20.25f, 21.75f, -35.13f)
                verticalLineToRelative(-58.75f)
                lineToRelative(-15.37f, 9.0f)
                curveTo(155.6f, 235.8f, 151.9f, 240.4f, 150.5f, 245.9f)
                lineTo(143.0f, 271.0f)
                curveToRelative(-2.25f, 7.625f, -8.0f, 13.88f, -15.38f, 16.75f)
                lineTo(117.1f, 292.0f)
                curveTo(114.0f, 293.3f, 110.7f, 293.9f, 107.4f, 293.9f)
                curveToRelative(-3.626f, 0.0f, -7.263f, -0.751f, -10.66f, -2.254f)
                lineTo(63.5f, 276.9f)
                curveTo(54.12f, 272.6f, 48.0f, 263.2f, 48.0f, 252.9f)
                verticalLineTo(140.5f)
                curveToRelative(0.0f, -5.125f, 2.125f, -10.12f, 5.75f, -13.88f)
                lineToRelative(7.375f, -7.375f)
                lineTo(49.5f, 96.0f)
                curveTo(48.5f, 94.12f, 48.0f, 92.0f, 48.0f, 89.88f)
                curveTo(48.0f, 84.38f, 52.38f, 80.0f, 57.88f, 80.0f)
                horizontalLineToRelative(105.0f)
                curveToRelative(86.75f, 0.0f, 156.1f, 70.38f, 156.1f, 157.1f)
                verticalLineTo(432.0f)
                horizontalLineToRelative(48.06f)
                lineToRelative(-0.063f, -194.9f)
                curveTo(367.9f, 124.0f, 276.0f, 32.0f, 162.9f, 32.0f)
                horizontalLineTo(57.88f)
                curveTo(25.88f, 32.0f, 0.0f, 57.88f, 0.0f, 89.88f)
                curveToRelative(0.0f, 8.5f, 1.75f, 16.88f, 5.125f, 24.62f)
                curveTo(1.75f, 122.8f, 0.0f, 131.6f, 0.0f, 140.5f)
                verticalLineToRelative(112.4f)
                curveTo(0.0f, 282.2f, 17.25f, 308.8f, 44.0f, 320.6f)
                close()
                moveTo(80.12f, 164.0f)
                curveToRelative(0.0f, 11.0f, 8.875f, 20.0f, 20.0f, 20.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, -9.0f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-9.0f, -20.0f, -20.0f, -20.0f)
                curveTo(89.0f, 144.0f, 80.12f, 153.0f, 80.12f, 164.0f)
                close()
                moveTo(360.0f, 464.0f)
                horizontalLineTo(23.1f)
                curveTo(10.75f, 464.0f, 0.0f, 474.7f, 0.0f, 487.1f)
                reflectiveCurveTo(10.75f, 512.0f, 23.1f, 512.0f)
                horizontalLineTo(360.0f)
                curveTo(373.3f, 512.0f, 384.0f, 501.3f, 384.0f, 488.0f)
                reflectiveCurveTo(373.3f, 464.0f, 360.0f, 464.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
