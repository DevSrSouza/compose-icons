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

public val RemixIcons.SurgicalMaskFill: ImageVector
    get() {
        if (_surgicalMaskFill != null) {
            return _surgicalMaskFill!!
        }
        _surgicalMaskFill = Builder(name = "SurgicalMaskFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.485f, 3.121f)
                lineToRelative(7.758f, 1.94f)
                curveToRelative(0.445f, 0.11f, 0.757f, 0.51f, 0.757f, 0.97f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-0.421f)
                curveToRelative(-0.535f, 1.35f, -1.552f, 2.486f, -2.896f, 3.158f)
                lineToRelative(-4.789f, 2.395f)
                curveToRelative(-0.563f, 0.281f, -1.225f, 0.281f, -1.788f, 0.0f)
                lineToRelative(-4.79f, -2.395f)
                curveTo(4.974f, 17.486f, 3.957f, 16.35f, 3.422f, 15.0f)
                lineTo(3.0f, 15.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                lineTo(0.0f, 9.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0.0f, -0.458f, 0.312f, -0.858f, 0.757f, -0.97f)
                lineToRelative(7.758f, -1.939f)
                curveToRelative(0.318f, -0.08f, 0.652f, -0.08f, 0.97f, 0.0f)
                close()
                moveTo(3.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(3.0f, 9.0f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _surgicalMaskFill!!
    }

private var _surgicalMaskFill: ImageVector? = null
