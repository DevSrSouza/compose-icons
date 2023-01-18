package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SlackFill: ImageVector
    get() {
        if (_slackFill != null) {
            return _slackFill!!
        }
        _slackFill = Builder(name = "SlackFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.527f, 14.514f)
                arcTo(1.973f, 1.973f, 0.0f, false, true, 4.56f, 16.48f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.967f, -1.967f)
                curveToRelative(0.0f, -1.083f, 0.884f, -1.968f, 1.967f, -1.968f)
                horizontalLineToRelative(1.968f)
                verticalLineToRelative(1.968f)
                close()
                moveTo(7.519f, 14.514f)
                curveToRelative(0.0f, -1.083f, 0.884f, -1.968f, 1.967f, -1.968f)
                curveToRelative(1.083f, 0.0f, 1.968f, 0.885f, 1.968f, 1.968f)
                verticalLineToRelative(4.927f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.968f, 1.967f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.967f, -1.967f)
                verticalLineToRelative(-4.927f)
                close()
                moveTo(9.486f, 6.527f)
                arcTo(1.973f, 1.973f, 0.0f, false, true, 7.52f, 4.56f)
                curveToRelative(0.0f, -1.083f, 0.884f, -1.967f, 1.967f, -1.967f)
                curveToRelative(1.083f, 0.0f, 1.968f, 0.884f, 1.968f, 1.967f)
                verticalLineToRelative(1.968f)
                lineTo(9.486f, 6.528f)
                close()
                moveTo(9.486f, 7.519f)
                curveToRelative(1.083f, 0.0f, 1.968f, 0.884f, 1.968f, 1.967f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.968f, 1.968f)
                lineTo(4.56f, 11.454f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.967f, -1.968f)
                curveToRelative(0.0f, -1.083f, 0.884f, -1.967f, 1.967f, -1.967f)
                horizontalLineToRelative(4.927f)
                close()
                moveTo(17.473f, 9.486f)
                curveToRelative(0.0f, -1.083f, 0.885f, -1.967f, 1.968f, -1.967f)
                reflectiveCurveToRelative(1.967f, 0.884f, 1.967f, 1.967f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.967f, 1.968f)
                horizontalLineToRelative(-1.968f)
                lineTo(17.473f, 9.486f)
                close()
                moveTo(16.481f, 9.486f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.967f, 1.968f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.968f, -1.968f)
                lineTo(12.546f, 4.56f)
                curveToRelative(0.0f, -1.083f, 0.885f, -1.967f, 1.968f, -1.967f)
                reflectiveCurveToRelative(1.967f, 0.884f, 1.967f, 1.967f)
                verticalLineToRelative(4.927f)
                close()
                moveTo(14.514f, 17.473f)
                curveToRelative(1.083f, 0.0f, 1.967f, 0.885f, 1.967f, 1.968f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.967f, 1.967f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.968f, -1.967f)
                verticalLineToRelative(-1.968f)
                horizontalLineToRelative(1.968f)
                close()
                moveTo(14.514f, 16.481f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.968f, -1.967f)
                curveToRelative(0.0f, -1.083f, 0.885f, -1.968f, 1.968f, -1.968f)
                horizontalLineToRelative(4.927f)
                curveToRelative(1.083f, 0.0f, 1.967f, 0.885f, 1.967f, 1.968f)
                arcToRelative(1.973f, 1.973f, 0.0f, false, true, -1.967f, 1.967f)
                horizontalLineToRelative(-4.927f)
                close()
            }
        }
        .build()
        return _slackFill!!
    }

private var _slackFill: ImageVector? = null
