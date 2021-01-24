package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ExpandArrowsAlt: ImageVector
    get() {
        if (_expandArrowsAlt != null) {
            return _expandArrowsAlt!!
        }
        _expandArrowsAlt = Builder(name = "ExpandArrowsAlt", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 344.0f)
                verticalLineToRelative(112.0f)
                arcToRelative(23.94f, 23.94f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(312.0f)
                curveToRelative(-21.39f, 0.0f, -32.09f, -25.9f, -17.0f, -41.0f)
                lineToRelative(36.2f, -36.2f)
                lineTo(224.0f, 295.6f)
                lineTo(116.77f, 402.9f)
                lineTo(153.0f, 439.0f)
                curveToRelative(15.09f, 15.1f, 4.39f, 41.0f, -17.0f, 41.0f)
                horizontalLineTo(24.0f)
                arcToRelative(23.94f, 23.94f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, -21.4f, 25.89f, -32.1f, 41.0f, -17.0f)
                lineToRelative(36.19f, 36.2f)
                lineTo(184.46f, 256.0f)
                lineTo(77.18f, 148.7f)
                lineTo(41.0f, 185.0f)
                curveToRelative(-15.1f, 15.1f, -41.0f, 4.4f, -41.0f, -17.0f)
                verticalLineTo(56.0f)
                arcToRelative(23.94f, 23.94f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(21.39f, 0.0f, 32.09f, 25.9f, 17.0f, 41.0f)
                lineToRelative(-36.2f, 36.2f)
                lineTo(224.0f, 216.4f)
                lineToRelative(107.23f, -107.3f)
                lineTo(295.0f, 73.0f)
                curveToRelative(-15.09f, -15.1f, -4.39f, -41.0f, 17.0f, -41.0f)
                horizontalLineToRelative(112.0f)
                arcToRelative(23.94f, 23.94f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 21.4f, -25.89f, 32.1f, -41.0f, 17.0f)
                lineToRelative(-36.19f, -36.2f)
                lineTo(263.54f, 256.0f)
                lineToRelative(107.28f, 107.3f)
                lineTo(407.0f, 327.1f)
                curveToRelative(15.1f, -15.2f, 41.0f, -4.5f, 41.0f, 16.9f)
                close()
            }
        }
        .build()
        return _expandArrowsAlt!!
    }

private var _expandArrowsAlt: ImageVector? = null
