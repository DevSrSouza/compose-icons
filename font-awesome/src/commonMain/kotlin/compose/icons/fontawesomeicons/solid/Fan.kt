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

public val SolidGroup.Fan: ImageVector
    get() {
        if (_fan != null) {
            return _fan!!
        }
        _fan = Builder(name = "Fan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(258.6f, 0.0f)
                curveToRelative(-1.7f, 0.0f, -3.4f, 0.1f, -5.1f, 0.5f)
                curveTo(168.0f, 17.0f, 115.6f, 102.3f, 130.5f, 189.3f)
                curveToRelative(2.9f, 17.0f, 8.4f, 32.9f, 15.9f, 47.4f)
                lineTo(32.0f, 224.0f)
                horizontalLineTo(29.4f)
                curveTo(13.2f, 224.0f, 0.0f, 237.2f, 0.0f, 253.4f)
                curveToRelative(0.0f, 1.7f, 0.1f, 3.4f, 0.5f, 5.1f)
                curveTo(17.0f, 344.0f, 102.3f, 396.4f, 189.3f, 381.5f)
                curveToRelative(17.0f, -2.9f, 32.9f, -8.4f, 47.4f, -15.9f)
                lineTo(224.0f, 480.0f)
                verticalLineToRelative(2.6f)
                curveToRelative(0.0f, 16.2f, 13.2f, 29.4f, 29.4f, 29.4f)
                curveToRelative(1.7f, 0.0f, 3.4f, -0.1f, 5.1f, -0.5f)
                curveTo(344.0f, 495.0f, 396.4f, 409.7f, 381.5f, 322.7f)
                curveToRelative(-2.9f, -17.0f, -8.4f, -32.9f, -15.9f, -47.4f)
                lineTo(480.0f, 288.0f)
                horizontalLineToRelative(2.6f)
                curveToRelative(16.2f, 0.0f, 29.4f, -13.2f, 29.4f, -29.4f)
                curveToRelative(0.0f, -1.7f, -0.1f, -3.4f, -0.5f, -5.1f)
                curveTo(495.0f, 168.0f, 409.7f, 115.6f, 322.7f, 130.5f)
                curveToRelative(-17.0f, 2.9f, -32.9f, 8.4f, -47.4f, 15.9f)
                lineTo(288.0f, 32.0f)
                verticalLineTo(29.4f)
                curveTo(288.0f, 13.2f, 274.8f, 0.0f, 258.6f, 0.0f)
                close()
                moveTo(256.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null
