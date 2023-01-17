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

public val RegularGroup.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 112.0f)
                curveToRelative(30.88f, 0.0f, 56.0f, -25.12f, 56.0f, -56.0f)
                reflectiveCurveTo(286.9f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(199.1f, 25.12f, 199.1f, 56.0f)
                reflectiveCurveTo(225.1f, 112.0f, 256.0f, 112.0f)
                close()
                moveTo(511.1f, 197.4f)
                curveToRelative(0.0f, -5.178f, -2.509f, -10.2f, -7.096f, -13.26f)
                lineTo(476.4f, 168.2f)
                curveToRelative(-2.5f, -1.75f, -5.497f, -2.62f, -8.497f, -2.62f)
                curveToRelative(-5.501f, 0.125f, -10.63f, 2.87f, -13.75f, 7.245f)
                curveToRelative(-9.001f, 12.0f, -23.16f, 19.13f, -38.16f, 19.13f)
                curveToRelative(-3.125f, 0.0f, -6.089f, -0.253f, -9.089f, -0.878f)
                curveToRelative(-23.13f, -4.25f, -38.88f, -26.25f, -38.88f, -49.75f)
                curveTo(367.1f, 134.0f, 361.1f, 128.0f, 354.6f, 128.0f)
                horizontalLineToRelative(-38.75f)
                curveToRelative(-6.001f, 0.0f, -11.63f, 4.0f, -12.88f, 9.875f)
                curveTo(298.2f, 160.1f, 278.7f, 176.0f, 255.1f, 176.0f)
                curveToRelative(-22.75f, 0.0f, -42.25f, -15.88f, -47.0f, -38.12f)
                curveTo(207.7f, 132.0f, 202.2f, 128.0f, 196.1f, 128.0f)
                horizontalLineToRelative(-38.75f)
                curveTo(149.1f, 128.0f, 143.1f, 134.0f, 143.1f, 141.4f)
                curveToRelative(0.0f, 18.49f, -13.66f, 50.62f, -47.95f, 50.62f)
                curveToRelative(-15.13f, 0.0f, -29.3f, -7.118f, -38.3f, -19.24f)
                curveTo(54.6f, 168.4f, 49.66f, 165.7f, 44.15f, 165.6f)
                curveToRelative(-3.0f, 0.0f, -5.931f, 0.895f, -8.432f, 2.645f)
                lineToRelative(-28.63f, 16.0f)
                curveTo(2.509f, 187.2f, 0.0f, 192.3f, 0.0f, 197.4f)
                curveToRelative(0.0f, 2.438f, 0.558f, 4.901f, 1.72f, 7.185f)
                lineTo(109.9f, 432.0f)
                horizontalLineToRelative(53.13f)
                lineTo(69.85f, 236.4f)
                curveTo(78.35f, 238.8f, 87.11f, 240.0f, 95.98f, 240.0f)
                curveToRelative(2.432f, 0.0f, 56.83f, 1.503f, 84.76f, -52.5f)
                curveTo(198.1f, 210.5f, 226.6f, 224.0f, 255.9f, 224.0f)
                curveToRelative(29.38f, 0.0f, 57.01f, -13.38f, 75.26f, -36.25f)
                curveTo(336.1f, 197.6f, 360.6f, 240.0f, 416.0f, 240.0f)
                curveToRelative(8.751f, 0.0f, 17.5f, -1.125f, 26.0f, -3.5f)
                lineTo(349.0f, 432.0f)
                horizontalLineToRelative(53.13f)
                lineToRelative(108.1f, -227.4f)
                curveTo(511.4f, 202.3f, 511.1f, 199.8f, 511.1f, 197.4f)
                close()
                moveTo(424.0f, 464.0f)
                horizontalLineTo(87.98f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.75f, -24.0f, 23.1f)
                reflectiveCurveTo(74.72f, 512.0f, 87.98f, 512.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.75f, 24.0f, -23.1f)
                reflectiveCurveTo(437.3f, 464.0f, 424.0f, 464.0f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
