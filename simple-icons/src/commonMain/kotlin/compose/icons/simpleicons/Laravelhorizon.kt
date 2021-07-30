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

public val SimpleIcons.Laravelhorizon: ImageVector
    get() {
        if (_laravelhorizon != null) {
            return _laravelhorizon!!
        }
        _laravelhorizon = Builder(name = "Laravelhorizon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.486f, 3.516f)
                curveTo(15.8f, -1.171f, 8.202f, -1.172f, 3.516f, 3.513f)
                arcTo(11.963f, 11.963f, 0.0f, false, false, 0.0f, 11.998f)
                arcToRelative(11.975f, 11.975f, 0.0f, false, false, 4.2f, 9.13f)
                horizontalLineToRelative(0.01f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.274f, -0.642f)
                curveToRelative(4.687f, -4.685f, 4.688f, -12.283f, 0.002f, -16.97f)
                close()
                moveTo(16.0f, 13.998f)
                curveToRelative(-4.0f, 0.0f, -4.0f, -4.0f, -8.0f, -4.0f)
                curveToRelative(-2.5f, 0.0f, -3.44f, 1.565f, -4.765f, 2.74f)
                horizontalLineTo(3.23f)
                arcToRelative(8.801f, 8.801f, 0.0f, false, true, 17.54f, -1.48f)
                curveToRelative(-1.33f, 1.175f, -2.27f, 2.74f, -4.77f, 2.74f)
                close()
            }
        }
        .build()
        return _laravelhorizon!!
    }

private var _laravelhorizon: ImageVector? = null
