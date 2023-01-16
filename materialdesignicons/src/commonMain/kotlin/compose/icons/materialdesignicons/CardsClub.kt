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

public val MaterialDesignIcons.CardsClub: ImageVector
    get() {
        if (_cardsClub != null) {
            return _cardsClub!!
        }
        _cardsClub = Builder(name = "CardsClub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(14.3f, 2.0f, 16.3f, 4.0f, 16.3f, 6.2f)
                curveTo(16.21f, 8.77f, 14.34f, 9.83f, 14.04f, 10.0f)
                curveTo(15.04f, 9.5f, 16.5f, 9.5f, 16.5f, 9.5f)
                curveTo(19.0f, 9.5f, 21.0f, 11.3f, 21.0f, 13.8f)
                curveTo(21.0f, 16.3f, 19.0f, 18.0f, 16.5f, 18.0f)
                curveTo(16.5f, 18.0f, 15.0f, 18.0f, 13.0f, 17.0f)
                curveTo(13.0f, 17.0f, 12.7f, 19.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(11.3f, 19.0f, 11.0f, 17.0f, 11.0f, 17.0f)
                curveTo(9.0f, 18.0f, 7.5f, 18.0f, 7.5f, 18.0f)
                curveTo(5.0f, 18.0f, 3.0f, 16.3f, 3.0f, 13.8f)
                curveTo(3.0f, 11.3f, 5.0f, 9.5f, 7.5f, 9.5f)
                curveTo(7.5f, 9.5f, 8.96f, 9.5f, 9.96f, 10.0f)
                curveTo(9.66f, 9.83f, 7.79f, 8.77f, 7.7f, 6.2f)
                curveTo(7.7f, 4.0f, 9.7f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cardsClub!!
    }

private var _cardsClub: ImageVector? = null
