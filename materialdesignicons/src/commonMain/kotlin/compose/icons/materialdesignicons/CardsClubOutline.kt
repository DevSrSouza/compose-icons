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

public val MaterialDesignIcons.CardsClubOutline: ImageVector
    get() {
        if (_cardsClubOutline != null) {
            return _cardsClubOutline!!
        }
        _cardsClubOutline = Builder(name = "CardsClubOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6f, 9.5f)
                curveTo(16.8f, 8.9f, 17.0f, 8.2f, 17.0f, 7.5f)
                curveTo(17.0f, 4.5f, 14.8f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(7.0f, 4.5f, 7.0f, 7.5f)
                curveTo(7.0f, 8.2f, 7.1f, 8.9f, 7.4f, 9.5f)
                curveTo(4.9f, 9.6f, 3.0f, 11.4f, 3.0f, 13.8f)
                curveTo(3.0f, 16.3f, 5.0f, 18.0f, 7.5f, 18.0f)
                curveTo(7.5f, 18.0f, 10.0f, 18.0f, 11.0f, 17.0f)
                curveTo(11.0f, 17.0f, 11.3f, 19.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(12.7f, 19.0f, 13.0f, 17.0f, 13.0f, 17.0f)
                curveTo(14.0f, 18.0f, 16.5f, 18.0f, 16.5f, 18.0f)
                curveTo(19.0f, 18.0f, 21.0f, 16.3f, 21.0f, 13.8f)
                curveTo(21.0f, 11.4f, 19.1f, 9.6f, 16.6f, 9.5f)
                moveTo(16.5f, 16.0f)
                curveTo(16.5f, 16.0f, 14.0f, 16.0f, 13.0f, 15.0f)
                horizontalLineTo(11.0f)
                curveTo(10.0f, 16.0f, 7.5f, 16.0f, 7.5f, 16.0f)
                curveTo(6.3f, 16.0f, 5.0f, 15.3f, 5.0f, 13.8f)
                curveTo(5.0f, 12.5f, 6.1f, 11.5f, 7.5f, 11.5f)
                curveTo(7.8f, 11.5f, 8.3f, 11.6f, 8.8f, 11.7f)
                curveTo(8.9f, 11.7f, 9.0f, 11.8f, 9.1f, 11.8f)
                lineTo(10.0f, 10.1f)
                curveTo(9.8f, 9.9f, 9.7f, 9.7f, 9.6f, 9.5f)
                curveTo(9.2f, 8.9f, 9.0f, 8.3f, 9.0f, 7.5f)
                curveTo(9.0f, 5.6f, 10.3f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(15.0f, 5.6f, 15.0f, 7.5f)
                curveTo(15.0f, 8.3f, 14.8f, 9.0f, 14.4f, 9.6f)
                curveTo(14.3f, 9.8f, 14.2f, 9.9f, 14.1f, 10.1f)
                lineTo(15.0f, 11.8f)
                curveTo(15.1f, 11.8f, 15.2f, 11.7f, 15.3f, 11.7f)
                curveTo(15.7f, 11.6f, 16.2f, 11.5f, 16.6f, 11.5f)
                curveTo(18.0f, 11.5f, 19.1f, 12.5f, 19.1f, 13.8f)
                curveTo(19.0f, 15.3f, 17.7f, 16.0f, 16.5f, 16.0f)
                close()
            }
        }
        .build()
        return _cardsClubOutline!!
    }

private var _cardsClubOutline: ImageVector? = null
