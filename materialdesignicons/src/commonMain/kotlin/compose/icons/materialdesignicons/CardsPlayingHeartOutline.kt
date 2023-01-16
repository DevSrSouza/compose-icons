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

public val MaterialDesignIcons.CardsPlayingHeartOutline: ImageVector
    get() {
        if (_cardsPlayingHeartOutline != null) {
            return _cardsPlayingHeartOutline!!
        }
        _cardsPlayingHeartOutline = Builder(name = "CardsPlayingHeartOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                moveTo(10.2f, 9.0f)
                curveTo(9.0f, 9.0f, 8.0f, 10.0f, 8.0f, 11.2f)
                curveTo(8.0f, 12.7f, 9.4f, 13.9f, 11.4f, 15.8f)
                lineTo(12.0f, 16.3f)
                lineTo(12.6f, 15.8f)
                curveTo(14.6f, 13.9f, 16.0f, 12.7f, 16.0f, 11.2f)
                curveTo(16.0f, 9.9f, 15.0f, 9.0f, 13.8f, 9.0f)
                curveTo(13.1f, 9.0f, 12.4f, 9.3f, 12.0f, 9.8f)
                curveTo(11.6f, 9.3f, 10.9f, 9.0f, 10.2f, 9.0f)
                close()
            }
        }
        .build()
        return _cardsPlayingHeartOutline!!
    }

private var _cardsPlayingHeartOutline: ImageVector? = null
