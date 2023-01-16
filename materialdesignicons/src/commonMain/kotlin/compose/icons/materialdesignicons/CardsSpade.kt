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

public val MaterialDesignIcons.CardsSpade: ImageVector
    get() {
        if (_cardsSpade != null) {
            return _cardsSpade!!
        }
        _cardsSpade = Builder(name = "CardsSpade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.0f, 7.0f, 4.0f, 9.0f, 4.0f, 14.0f)
                curveTo(4.0f, 16.0f, 6.0f, 18.0f, 8.0f, 18.0f)
                curveTo(9.0f, 18.0f, 10.0f, 18.0f, 11.0f, 17.0f)
                curveTo(11.0f, 17.0f, 11.32f, 19.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(13.0f, 19.0f, 13.0f, 17.0f, 13.0f, 17.0f)
                curveTo(14.0f, 18.0f, 15.0f, 18.0f, 16.0f, 18.0f)
                curveTo(18.0f, 18.0f, 20.0f, 16.0f, 20.0f, 14.0f)
                curveTo(20.0f, 9.0f, 15.0f, 7.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cardsSpade!!
    }

private var _cardsSpade: ImageVector? = null