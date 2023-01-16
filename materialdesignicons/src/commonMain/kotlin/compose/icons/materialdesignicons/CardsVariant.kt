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

public val MaterialDesignIcons.CardsVariant: ImageVector
    get() {
        if (_cardsVariant != null) {
            return _cardsVariant!!
        }
        _cardsVariant = Builder(name = "CardsVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 3.0f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 14.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 13.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 2.0f)
                moveTo(6.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                moveTo(20.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 18.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                moveTo(20.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _cardsVariant!!
    }

private var _cardsVariant: ImageVector? = null
