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

public val MaterialDesignIcons.CardsPlaying: ImageVector
    get() {
        if (_cardsPlaying != null) {
            return _cardsPlaying!!
        }
        _cardsPlaying = Builder(name = "CardsPlaying", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7f, 2.2f)
                horizontalLineTo(16.2f)
                curveTo(17.3f, 2.2f, 18.2f, 3.1f, 18.2f, 4.2f)
                verticalLineTo(10.6f)
                lineTo(14.7f, 2.2f)
                moveTo(20.1f, 3.8f)
                lineTo(21.4f, 4.4f)
                curveTo(22.4f, 4.8f, 22.9f, 6.0f, 22.5f, 7.0f)
                lineTo(20.1f, 12.9f)
                verticalLineTo(3.8f)
                moveTo(18.0f, 15.5f)
                lineTo(13.0f, 3.5f)
                curveTo(12.7f, 2.7f, 12.0f, 2.3f, 11.2f, 2.3f)
                curveTo(10.9f, 2.3f, 10.7f, 2.4f, 10.4f, 2.5f)
                lineTo(3.0f, 5.5f)
                curveTo(2.0f, 5.9f, 1.5f, 7.0f, 2.0f, 8.0f)
                lineTo(7.0f, 20.0f)
                curveTo(7.3f, 20.8f, 8.0f, 21.2f, 8.8f, 21.2f)
                curveTo(9.1f, 21.2f, 9.3f, 21.2f, 9.6f, 21.0f)
                lineTo(17.0f, 18.0f)
                curveTo(17.8f, 17.7f, 18.2f, 17.0f, 18.2f, 16.2f)
                curveTo(18.1f, 16.0f, 18.1f, 15.7f, 18.0f, 15.5f)
                moveTo(11.4f, 15.0f)
                lineTo(8.2f, 12.6f)
                lineTo(8.6f, 8.6f)
                lineTo(11.8f, 11.0f)
                lineTo(11.4f, 15.0f)
            }
        }
        .build()
        return _cardsPlaying!!
    }

private var _cardsPlaying: ImageVector? = null
