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

public val MaterialDesignIcons.CardsPlayingDiamond: ImageVector
    get() {
        if (_cardsPlayingDiamond != null) {
            return _cardsPlayingDiamond!!
        }
        _cardsPlayingDiamond = Builder(name = "CardsPlayingDiamond", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 2.0f, 5.0f, 2.9f, 5.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 21.1f, 5.9f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 22.0f, 19.0f, 21.1f, 19.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(19.0f, 2.9f, 18.1f, 2.0f, 17.0f, 2.0f)
                moveTo(12.0f, 17.0f)
                lineTo(9.0f, 12.0f)
                lineTo(12.0f, 7.0f)
                lineTo(15.0f, 12.0f)
                lineTo(12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _cardsPlayingDiamond!!
    }

private var _cardsPlayingDiamond: ImageVector? = null
