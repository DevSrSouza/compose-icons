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

public val RemixIcons.CheckboxMultipleFill: ImageVector
    get() {
        if (_checkboxMultipleFill != null) {
            return _checkboxMultipleFill!!
        }
        _checkboxMultipleFill = Builder(name = "CheckboxMultipleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.993f)
                curveToRelative(0.0f, 0.556f, -0.449f, 1.007f, -1.007f, 1.007f)
                lineTo(3.007f, 22.0f)
                arcTo(1.006f, 1.006f, 0.0f, false, true, 2.0f, 20.993f)
                lineToRelative(0.003f, -12.986f)
                curveTo(2.003f, 7.451f, 2.452f, 7.0f, 3.01f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(6.993f)
                curveTo(16.549f, 7.0f, 17.0f, 7.449f, 17.0f, 8.007f)
                lineTo(17.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.503f, 18.0f)
                lineToRelative(5.656f, -5.657f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-4.242f, 4.243f)
                lineTo(6.38f, 13.05f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(8.503f, 18.0f)
                close()
            }
        }
        .build()
        return _checkboxMultipleFill!!
    }

private var _checkboxMultipleFill: ImageVector? = null
