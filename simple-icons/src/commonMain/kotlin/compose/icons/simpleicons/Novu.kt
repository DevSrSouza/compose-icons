package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Novu: ImageVector
    get() {
        if (_novu != null) {
            return _novu!!
        }
        _novu = Builder(name = "Novu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.48f, 9.6193f)
                curveToRelative(0.0f, 0.6452f, -0.7834f, 0.9647f, -1.2347f, 0.5035f)
                lineTo(8.0067f, 0.6804f)
                curveTo(9.256f, 0.2398f, 10.6f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.387f, 0.0f, 4.611f, 0.6969f, 6.48f, 1.8983f)
                close()
                moveTo(21.84f, 5.1298f)
                verticalLineToRelative(4.4895f)
                curveToRelative(0.0f, 3.6564f, -4.4392f, 5.4669f, -6.9962f, 2.8534f)
                lineTo(4.9087f, 2.3185f)
                curveTo(1.9323f, 4.5022f, 0.0f, 8.0255f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.5553f, 0.7987f, 4.924f, 2.16f, 6.8701f)
                verticalLineToRelative(-4.4654f)
                curveToRelative(0.0f, -3.6564f, 4.4392f, -5.4669f, 6.9963f, -2.8534f)
                lineToRelative(9.9214f, 10.1403f)
                curveTo(22.0617f, 19.5086f, 24.0f, 15.9806f, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.5553f, -0.7987f, -4.924f, -2.16f, -6.8702f)
                close()
                moveTo(6.7546f, 13.9012f)
                lineToRelative(9.2212f, 9.4245f)
                curveTo(14.7316f, 23.7625f, 13.3934f, 24.0f, 12.0f, 24.0f)
                curveToRelative(-2.3869f, 0.0f, -4.611f, -0.6968f, -6.48f, -1.8983f)
                verticalLineToRelative(-7.697f)
                curveToRelative(0.0f, -0.6453f, 0.7834f, -0.9647f, 1.2346f, -0.5035f)
                close()
            }
        }
        .build()
        return _novu!!
    }

private var _novu: ImageVector? = null
