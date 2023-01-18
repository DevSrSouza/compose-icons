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

public val RemixIcons.CaravanLine: ImageVector
    get() {
        if (_caravanLine != null) {
            return _caravanLine!!
        }
        _caravanLine = Builder(name = "CaravanLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.172f, 3.0f)
                curveToRelative(0.53f, 0.0f, 1.039f, 0.21f, 1.414f, 0.586f)
                lineToRelative(4.828f, 4.828f)
                curveToRelative(0.375f, 0.375f, 0.586f, 0.884f, 0.586f, 1.414f)
                lineTo(21.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.126f)
                curveToRelative(-0.445f, 1.726f, -2.01f, 3.0f, -3.874f, 3.0f)
                curveToRelative(-1.864f, 0.0f, -3.43f, -1.274f, -3.874f, -3.0f)
                lineTo(3.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.172f)
                close()
                moveTo(11.0f, 16.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.172f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.126f)
                curveToRelative(0.444f, -1.725f, 2.01f, -3.0f, 3.874f, -3.0f)
                curveToRelative(1.864f, 0.0f, 3.43f, 1.275f, 3.874f, 3.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 9.828f)
                lineTo(14.172f, 5.0f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(12.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _caravanLine!!
    }

private var _caravanLine: ImageVector? = null
