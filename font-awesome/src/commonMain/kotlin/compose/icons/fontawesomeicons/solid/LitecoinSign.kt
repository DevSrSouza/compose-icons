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

public val SolidGroup.LitecoinSign: ImageVector
    get() {
        if (_litecoinSign != null) {
            return _litecoinSign!!
        }
        _litecoinSign = Builder(name = "LitecoinSign", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(64.0f, 46.3f, 64.0f, 64.0f)
                verticalLineTo(213.6f)
                lineTo(23.2f, 225.2f)
                curveToRelative(-17.0f, 4.9f, -26.8f, 22.6f, -22.0f, 39.6f)
                reflectiveCurveToRelative(22.6f, 26.8f, 39.6f, 22.0f)
                lineTo(64.0f, 280.1f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(261.9f)
                lineToRelative(136.8f, -39.1f)
                curveToRelative(17.0f, -4.9f, 26.8f, -22.6f, 22.0f, -39.6f)
                reflectiveCurveToRelative(-22.6f, -26.8f, -39.6f, -22.0f)
                lineTo(128.0f, 195.3f)
                verticalLineTo(64.0f)
                close()
            }
        }
        .build()
        return _litecoinSign!!
    }

private var _litecoinSign: ImageVector? = null
