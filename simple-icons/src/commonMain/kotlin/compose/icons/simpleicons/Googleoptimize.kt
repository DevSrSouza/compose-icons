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

public val SimpleIcons.Googleoptimize: ImageVector
    get() {
        if (_googleoptimize != null) {
            return _googleoptimize!!
        }
        _googleoptimize = Builder(name = "Googleoptimize", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.661f, 11.997f)
                arcToRelative(3.242f, 3.242f, 0.0f, true, true, -6.479f, 0.0f)
                lineTo(17.182f, 6.55f)
                lineTo(11.51f, 6.55f)
                arcToRelative(3.293f, 3.293f, 0.0f, false, true, 0.0f, -6.55f)
                horizontalLineToRelative(8.854f)
                arcToRelative(3.291f, 3.291f, 0.0f, false, true, 3.291f, 3.259f)
                lineToRelative(0.006f, 8.738f)
                close()
                moveTo(6.886f, 11.986f)
                arcToRelative(3.275f, 3.275f, 0.0f, true, false, -6.55f, 0.0f)
                arcToRelative(3.275f, 3.275f, 0.0f, false, false, 6.55f, 0.0f)
                close()
                moveTo(12.306f, 8.706f)
                lineTo(5.442f, 8.706f)
                curveToRelative(1.153f, 0.647f, 1.944f, 1.867f, 1.944f, 3.28f)
                arcToRelative(3.766f, 3.766f, 0.0f, false, true, -1.802f, 3.204f)
                horizontalLineToRelative(3.672f)
                verticalLineToRelative(5.453f)
                arcTo(3.181f, 3.181f, 0.0f, false, false, 12.372f, 24.0f)
                arcToRelative(3.323f, 3.323f, 0.0f, false, false, 3.291f, -3.357f)
                verticalLineToRelative(-8.695f)
                arcToRelative(3.318f, 3.318f, 0.0f, false, false, -3.357f, -3.242f)
                close()
            }
        }
        .build()
        return _googleoptimize!!
    }

private var _googleoptimize: ImageVector? = null
