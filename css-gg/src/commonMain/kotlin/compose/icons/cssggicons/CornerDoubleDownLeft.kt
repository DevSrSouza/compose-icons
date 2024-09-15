package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDoubleDownLeft: ImageVector
    get() {
        if (_cornerDoubleDownLeft != null) {
            return _cornerDoubleDownLeft!!
        }
        _cornerDoubleDownLeft = Builder(name = "CornerDoubleDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.295f, 7.694f)
                lineTo(16.136f, 2.638f)
                lineTo(21.192f, 7.478f)
                lineTo(19.809f, 8.923f)
                lineTo(17.347f, 6.566f)
                lineTo(17.509f, 12.6f)
                curveTo(17.58f, 15.25f, 15.49f, 17.456f, 12.84f, 17.527f)
                lineTo(6.914f, 17.686f)
                lineTo(9.208f, 19.934f)
                lineTo(7.808f, 21.362f)
                lineTo(2.808f, 16.464f)
                lineTo(7.706f, 11.463f)
                lineTo(9.135f, 12.863f)
                lineTo(6.758f, 15.29f)
                lineTo(12.776f, 15.128f)
                curveTo(14.101f, 15.092f, 15.146f, 13.99f, 15.11f, 12.665f)
                lineTo(14.952f, 6.767f)
                lineTo(12.74f, 9.077f)
                lineTo(11.295f, 7.694f)
                close()
            }
        }
        .build()
        return _cornerDoubleDownLeft!!
    }

private var _cornerDoubleDownLeft: ImageVector? = null
