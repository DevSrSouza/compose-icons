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

public val RemixIcons.ScalesFill: ImageVector
    get() {
        if (_scalesFill != null) {
            return _scalesFill!!
        }
        _scalesFill = Builder(name = "ScalesFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 6.343f)
                lineToRelative(2.828f, 2.829f)
                curveTo(8.552f, 9.895f, 9.0f, 10.895f, 9.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.105f, 0.448f, -2.105f, 1.172f, -2.828f)
                lineTo(5.0f, 6.343f)
                close()
                moveTo(19.0f, 6.343f)
                lineToRelative(2.828f, 2.829f)
                curveTo(22.552f, 9.895f, 23.0f, 10.895f, 23.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.105f, 0.448f, -2.105f, 1.172f, -2.828f)
                lineTo(19.0f, 6.343f)
                close()
                moveTo(19.0f, 9.172f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(17.212f, 10.96f, 17.0f, 11.46f, 17.0f, 12.0f)
                lineToRelative(4.0f, 0.001f)
                curveToRelative(0.0f, -0.54f, -0.212f, -1.041f, -0.586f, -1.415f)
                lineTo(19.0f, 9.172f)
                close()
                moveTo(5.0f, 9.172f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(3.212f, 10.96f, 3.0f, 11.46f, 3.0f, 12.0f)
                lineToRelative(4.0f, 0.001f)
                curveToRelative(0.0f, -0.54f, -0.212f, -1.041f, -0.586f, -1.415f)
                lineTo(5.0f, 9.172f)
                close()
            }
        }
        .build()
        return _scalesFill!!
    }

private var _scalesFill: ImageVector? = null
