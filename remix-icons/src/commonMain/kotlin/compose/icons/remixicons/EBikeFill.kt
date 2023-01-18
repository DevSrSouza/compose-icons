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

public val RemixIcons.EBikeFill: ImageVector
    get() {
        if (_eBikeFill != null) {
            return _eBikeFill!!
        }
        _eBikeFill = Builder(name = "EBikeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 6.937f)
                arcTo(6.997f, 6.997f, 0.0f, false, true, 19.0f, 13.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.17f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(6.997f, 6.997f, 0.0f, false, true, 3.5f, -6.063f)
                arcTo(3.974f, 3.974f, 0.0f, false, true, 8.125f, 6.0f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(3.126f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, 7.748f, 0.0f)
                lineTo(19.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.126f)
                curveToRelative(-0.085f, 0.33f, -0.212f, 0.645f, -0.373f, 0.937f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _eBikeFill!!
    }

private var _eBikeFill: ImageVector? = null
