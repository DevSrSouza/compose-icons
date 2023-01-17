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

public val SolidGroup.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = Builder(name = "ReplyAll", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.4f, 39.5f)
                curveToRelative(-9.1f, -9.6f, -24.3f, -10.0f, -33.9f, -0.9f)
                lineTo(33.8f, 173.2f)
                curveToRelative(-19.9f, 18.9f, -19.9f, 50.7f, 0.0f, 69.6f)
                lineTo(175.5f, 377.4f)
                curveToRelative(9.6f, 9.1f, 24.8f, 8.7f, 33.9f, -0.9f)
                reflectiveCurveToRelative(8.7f, -24.8f, -0.9f, -33.9f)
                lineTo(66.8f, 208.0f)
                lineTo(208.5f, 73.4f)
                curveToRelative(9.6f, -9.1f, 10.0f, -24.3f, 0.9f, -33.9f)
                close()
                moveTo(352.0f, 64.0f)
                curveToRelative(0.0f, -12.6f, -7.4f, -24.1f, -19.0f, -29.2f)
                reflectiveCurveToRelative(-25.0f, -3.0f, -34.4f, 5.4f)
                lineToRelative(-160.0f, 144.0f)
                curveToRelative(-6.7f, 6.1f, -10.6f, 14.7f, -10.6f, 23.8f)
                reflectiveCurveToRelative(3.9f, 17.7f, 10.6f, 23.8f)
                lineToRelative(160.0f, 144.0f)
                curveToRelative(9.4f, 8.5f, 22.9f, 10.6f, 34.4f, 5.4f)
                reflectiveCurveToRelative(19.0f, -16.6f, 19.0f, -29.2f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 30.4f, -12.8f, 47.9f, -22.2f, 56.7f)
                curveToRelative(-5.5f, 5.1f, -9.8f, 12.0f, -9.8f, 19.5f)
                curveToRelative(0.0f, 10.9f, 8.8f, 19.7f, 19.7f, 19.7f)
                curveToRelative(2.8f, 0.0f, 5.6f, -0.6f, 8.1f, -1.9f)
                curveTo(494.5f, 467.9f, 576.0f, 417.3f, 576.0f, 304.0f)
                curveToRelative(0.0f, -97.2f, -78.8f, -176.0f, -176.0f, -176.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(64.0f)
                close()
            }
        }
        .build()
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
