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

public val SolidGroup.LuggageCart: ImageVector
    get() {
        if (_luggageCart != null) {
            return _luggageCart!!
        }
        _luggageCart = Builder(name = "LuggageCart", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 320.0f)
                horizontalLineToRelative(32.0f)
                lineTo(256.0f, 96.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(576.0f, 288.0f)
                lineTo(576.0f, 128.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(224.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                close()
                moveTo(624.0f, 384.0f)
                lineTo(128.0f, 384.0f)
                lineTo(128.0f, 16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 0.0f)
                curveTo(7.16f, 0.0f, 0.0f, 7.16f, 0.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(368.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(82.94f)
                curveToRelative(-1.79f, 5.03f, -2.94f, 10.36f, -2.94f, 16.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                curveToRelative(0.0f, -5.64f, -1.15f, -10.97f, -2.94f, -16.0f)
                horizontalLineToRelative(197.88f)
                curveToRelative(-1.79f, 5.03f, -2.94f, 10.36f, -2.94f, 16.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                curveToRelative(0.0f, -5.64f, -1.15f, -10.97f, -2.94f, -16.0f)
                lineTo(624.0f, 448.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(480.0f, 96.0f)
                lineTo(480.0f, 48.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(272.0f)
                horizontalLineToRelative(192.0f)
                lineTo(480.0f, 96.0f)
                close()
                moveTo(432.0f, 96.0f)
                horizontalLineToRelative(-96.0f)
                lineTo(336.0f, 48.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _luggageCart!!
    }

private var _luggageCart: ImageVector? = null
