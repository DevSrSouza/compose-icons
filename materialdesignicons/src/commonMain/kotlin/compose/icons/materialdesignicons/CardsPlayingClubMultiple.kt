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

public val MaterialDesignIcons.CardsPlayingClubMultiple: ImageVector
    get() {
        if (_cardsPlayingClubMultiple != null) {
            return _cardsPlayingClubMultiple!!
        }
        _cardsPlayingClubMultiple = Builder(name = "CardsPlayingClubMultiple", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineTo(22.0f)
                curveTo(3.0f, 23.1f, 3.9f, 24.0f, 5.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                moveTo(19.0f, 0.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 0.0f, 7.0f, 0.9f, 7.0f, 2.0f)
                verticalLineTo(18.0f)
                curveTo(7.0f, 19.1f, 7.9f, 20.0f, 9.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 20.0f, 21.0f, 19.1f, 21.0f, 18.0f)
                verticalLineTo(2.0f)
                curveTo(21.0f, 0.9f, 20.1f, 0.0f, 19.0f, 0.0f)
                moveTo(16.0f, 13.0f)
                curveTo(15.4f, 13.0f, 14.9f, 12.7f, 14.5f, 12.3f)
                lineTo(15.5f, 15.0f)
                horizontalLineTo(12.5f)
                lineTo(13.5f, 12.3f)
                curveTo(13.1f, 12.7f, 12.6f, 13.0f, 12.0f, 13.0f)
                curveTo(10.9f, 13.0f, 10.0f, 12.1f, 10.0f, 11.0f)
                reflectiveCurveTo(10.9f, 9.0f, 12.0f, 9.0f)
                horizontalLineTo(12.3f)
                curveTo(12.1f, 8.7f, 12.0f, 8.4f, 12.0f, 8.0f)
                curveTo(12.0f, 6.9f, 12.9f, 6.0f, 14.0f, 6.0f)
                reflectiveCurveTo(16.0f, 6.9f, 16.0f, 8.0f)
                curveTo(16.0f, 8.4f, 15.9f, 8.7f, 15.7f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 9.0f, 18.0f, 9.9f, 18.0f, 11.0f)
                reflectiveCurveTo(17.1f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _cardsPlayingClubMultiple!!
    }

private var _cardsPlayingClubMultiple: ImageVector? = null
