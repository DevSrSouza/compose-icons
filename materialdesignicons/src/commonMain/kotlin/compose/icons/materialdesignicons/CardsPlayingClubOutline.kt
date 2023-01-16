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

public val MaterialDesignIcons.CardsPlayingClubOutline: ImageVector
    get() {
        if (_cardsPlayingClubOutline != null) {
            return _cardsPlayingClubOutline!!
        }
        _cardsPlayingClubOutline = Builder(name = "CardsPlayingClubOutline", defaultWidth = 24.0.dp,
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
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 8.0f)
                curveTo(10.9f, 8.0f, 10.0f, 8.9f, 10.0f, 10.0f)
                curveTo(10.0f, 10.4f, 10.1f, 10.7f, 10.3f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 11.0f, 8.0f, 11.9f, 8.0f, 13.0f)
                reflectiveCurveTo(8.9f, 15.0f, 10.0f, 15.0f)
                curveTo(10.6f, 15.0f, 11.1f, 14.7f, 11.5f, 14.3f)
                lineTo(10.5f, 17.0f)
                horizontalLineTo(13.5f)
                lineTo(12.5f, 14.3f)
                curveTo(12.9f, 14.7f, 13.4f, 15.0f, 14.0f, 15.0f)
                curveTo(15.1f, 15.0f, 16.0f, 14.1f, 16.0f, 13.0f)
                reflectiveCurveTo(15.1f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(13.7f)
                curveTo(13.9f, 10.7f, 14.0f, 10.3f, 14.0f, 10.0f)
                curveTo(14.0f, 8.9f, 13.1f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _cardsPlayingClubOutline!!
    }

private var _cardsPlayingClubOutline: ImageVector? = null
