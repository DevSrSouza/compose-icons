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

public val RegularGroup.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 464.0f)
                horizontalLineTo(23.1f)
                curveTo(10.75f, 464.0f, 0.0f, 474.7f, 0.0f, 487.1f)
                reflectiveCurveTo(10.75f, 512.0f, 23.1f, 512.0f)
                horizontalLineTo(360.0f)
                curveTo(373.3f, 512.0f, 384.0f, 501.3f, 384.0f, 488.0f)
                reflectiveCurveTo(373.3f, 464.0f, 360.0f, 464.0f)
                close()
                moveTo(345.1f, 32.0f)
                horizontalLineToRelative(-308.0f)
                curveTo(17.0f, 32.0f, 0.0f, 49.0f, 0.0f, 70.0f)
                verticalLineToRelative(139.4f)
                curveTo(0.0f, 218.8f, 4.0f, 227.5f, 11.0f, 233.6f)
                lineTo(48.0f, 265.8f)
                curveToRelative(0.0f, 8.885f, 0.05f, 17.64f, 0.05f, 26.46f)
                curveToRelative(0.0f, 39.32f, -1.001f, 79.96f, -11.93f, 139.8f)
                horizontalLineToRelative(49.0f)
                curveTo(94.95f, 374.3f, 96.11f, 333.3f, 96.11f, 285.5f)
                curveTo(96.11f, 270.7f, 96.0f, 255.1f, 96.0f, 238.2f)
                lineTo(48.0f, 196.5f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(116.5f)
                lineTo(288.0f, 238.2f)
                curveToRelative(0.0f, 16.77f, -0.112f, 32.25f, -0.112f, 47.1f)
                curveToRelative(0.0f, 47.79f, 1.164f, 89.15f, 10.99f, 146.7f)
                horizontalLineToRelative(49.0f)
                curveToRelative(-10.92f, -59.83f, -11.93f, -100.6f, -11.93f, -139.9f)
                curveTo(335.9f, 283.3f, 336.0f, 274.6f, 336.0f, 265.8f)
                lineToRelative(37.0f, -32.13f)
                curveTo(380.0f, 227.5f, 384.0f, 218.8f, 384.0f, 209.4f)
                verticalLineTo(70.0f)
                curveTo(384.0f, 49.0f, 367.0f, 32.0f, 345.1f, 32.0f)
                close()
                moveTo(192.0f, 224.0f)
                curveTo(174.4f, 224.0f, 160.0f, 238.4f, 160.0f, 256.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(256.0f)
                curveTo(224.0f, 238.4f, 209.6f, 224.0f, 192.0f, 224.0f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
