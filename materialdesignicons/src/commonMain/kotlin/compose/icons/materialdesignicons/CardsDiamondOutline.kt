package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.CardsDiamondOutline: ImageVector
    get() {
        if (_cardsDiamondOutline != null) {
            return _cardsDiamondOutline!!
        }
        _cardsDiamondOutline = Builder(name = "CardsDiamondOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(5.0f, 12.0f)
                lineTo(12.0f, 22.0f)
                lineTo(19.0f, 12.0f)
                moveTo(7.44f, 12.0f)
                lineTo(12.0f, 5.5f)
                lineTo(16.56f, 12.0f)
                lineTo(12.0f, 18.5f)
            }
        }
        .build()
        return _cardsDiamondOutline!!
    }

private var _cardsDiamondOutline: ImageVector? = null