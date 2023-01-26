package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PriceCheck: ImageVector
    get() {
        if (_priceCheck != null) {
            return _priceCheck!!
        }
        _priceCheck = Builder(name = "PriceCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.5f, 0.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-2.5f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.5f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(2.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.59f, 12.52f)
                lineToRelative(-5.66f, 5.65f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(7.07f, -7.07f)
                close()
            }
        }
        .build()
        return _priceCheck!!
    }

private var _priceCheck: ImageVector? = null
