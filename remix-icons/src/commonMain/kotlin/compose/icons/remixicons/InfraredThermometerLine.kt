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

public val RemixIcons.InfraredThermometerLine: ImageVector
    get() {
        if (_infraredThermometerLine != null) {
            return _infraredThermometerLine!!
        }
        _infraredThermometerLine = Builder(name = "InfraredThermometerLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.001f)
                lineTo(18.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-1.379f)
                lineToRelative(-0.613f, 3.111f)
                lineToRelative(0.911f, 1.321f)
                curveToRelative(0.314f, 0.455f, 0.2f, 1.078f, -0.255f, 1.391f)
                curveToRelative(-0.167f, 0.115f, -0.365f, 0.177f, -0.568f, 0.177f)
                lineTo(3.0f, 22.0f)
                lineToRelative(2.313f, -10.024f)
                lineTo(3.0f, 11.0f)
                lineToRelative(4.0f, -9.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(19.0f, 4.0f)
                lineTo(8.3f, 4.0f)
                lineTo(5.655f, 9.95f)
                lineToRelative(1.985f, 0.837f)
                lineTo(5.514f, 20.0f)
                horizontalLineToRelative(4.678f)
                lineToRelative(-0.309f, -0.448f)
                lineTo(11.96f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(15.999f, 11.0f)
                horizontalLineToRelative(-2.394f)
                lineToRelative(-0.591f, 3.0f)
                lineTo(14.0f, 14.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineToRelative(-0.001f, -1.0f)
                close()
            }
        }
        .build()
        return _infraredThermometerLine!!
    }

private var _infraredThermometerLine: ImageVector? = null
