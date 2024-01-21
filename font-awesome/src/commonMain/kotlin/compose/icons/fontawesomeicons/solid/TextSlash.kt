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

public val SolidGroup.TextSlash: ImageVector
    get() {
        if (_textSlash != null) {
            return _textSlash!!
        }
        _textSlash = Builder(name = "TextSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(355.7f, 253.5f)
                lineTo(400.2f, 96.0f)
                lineTo(503.0f, 96.0f)
                lineTo(497.0f, 120.2f)
                curveToRelative(-4.3f, 17.1f, 6.1f, 34.5f, 23.3f, 38.8f)
                reflectiveCurveToRelative(34.5f, -6.1f, 38.8f, -23.3f)
                lineToRelative(11.0f, -44.1f)
                curveTo(577.6f, 61.3f, 554.7f, 32.0f, 523.5f, 32.0f)
                lineTo(376.1f, 32.0f)
                horizontalLineToRelative(-0.3f)
                lineTo(204.5f, 32.0f)
                curveToRelative(-22.0f, 0.0f, -41.2f, 15.0f, -46.6f, 36.4f)
                lineToRelative(-6.3f, 25.2f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(206.8f, 136.8f)
                curveToRelative(0.1f, -0.3f, 0.2f, -0.7f, 0.3f, -1.0f)
                lineTo(217.0f, 96.0f)
                lineTo(333.7f, 96.0f)
                lineTo(301.3f, 210.8f)
                lineToRelative(-94.5f, -74.1f)
                close()
                moveTo(327.3f, 353.9f)
                lineTo(272.9f, 311.0f)
                lineTo(243.3f, 416.0f)
                lineTo(192.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(352.0f, 480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(309.8f, 416.0f)
                lineToRelative(17.6f, -62.1f)
                close()
            }
        }
        .build()
        return _textSlash!!
    }

private var _textSlash: ImageVector? = null
