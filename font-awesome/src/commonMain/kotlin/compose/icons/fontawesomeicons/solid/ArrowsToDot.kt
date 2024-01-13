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

public val SolidGroup.ArrowsToDot: ImageVector
    get() {
        if (_arrowsToDot != null) {
            return _arrowsToDot!!
        }
        _arrowsToDot = Builder(name = "ArrowsToDot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(288.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(12.9f, 0.0f, 24.6f, 7.8f, 29.6f, 19.8f)
                reflectiveCurveToRelative(2.2f, 25.7f, -6.9f, 34.9f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.2f, -9.2f, -11.9f, -22.9f, -6.9f, -34.9f)
                reflectiveCurveToRelative(16.6f, -19.8f, 29.6f, -19.8f)
                horizontalLineToRelative(32.0f)
                lineTo(224.1f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(169.4f, 393.4f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.2f, 9.2f, 11.9f, 22.9f, 6.9f, 34.9f)
                reflectiveCurveToRelative(-16.6f, 19.8f, -29.6f, 19.8f)
                lineTo(288.0f, 448.1f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 448.0f)
                lineTo(192.0f, 448.0f)
                curveToRelative(-12.9f, 0.0f, -24.6f, -7.8f, -29.6f, -19.8f)
                reflectiveCurveToRelative(-2.2f, -25.7f, 6.9f, -34.9f)
                close()
                moveTo(32.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 192.0f)
                curveToRelative(0.0f, -12.9f, 7.8f, -24.6f, 19.8f, -29.6f)
                reflectiveCurveToRelative(25.7f, -2.2f, 34.9f, 6.9f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-9.2f, 9.2f, -22.9f, 11.9f, -34.9f, 6.9f)
                reflectiveCurveToRelative(-19.8f, -16.6f, -19.8f, -29.6f)
                lineTo(64.0f, 288.0f)
                lineTo(32.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(329.4f, 278.6f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(9.2f, -9.2f, 22.9f, -11.9f, 34.9f, -6.9f)
                reflectiveCurveToRelative(19.8f, 16.6f, 19.8f, 29.6f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(448.0f, 288.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 12.9f, -7.8f, 24.6f, -19.8f, 29.6f)
                reflectiveCurveToRelative(-25.7f, 2.2f, -34.9f, -6.9f)
                lineToRelative(-64.0f, -64.0f)
                close()
                moveTo(256.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _arrowsToDot!!
    }

private var _arrowsToDot: ImageVector? = null
