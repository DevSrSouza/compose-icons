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

public val MaterialDesignIcons.CardsPlayingOutline: ImageVector
    get() {
        if (_cardsPlayingOutline != null) {
            return _cardsPlayingOutline!!
        }
        _cardsPlayingOutline = Builder(name = "CardsPlayingOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.19f, 2.25f)
                curveTo(11.97f, 2.26f, 12.71f, 2.73f, 13.0f, 3.5f)
                lineTo(18.0f, 15.45f)
                curveTo(18.09f, 15.71f, 18.14f, 16.0f, 18.13f, 16.25f)
                curveTo(18.11f, 17.0f, 17.65f, 17.74f, 16.9f, 18.05f)
                lineTo(9.53f, 21.1f)
                curveTo(9.27f, 21.22f, 9.0f, 21.25f, 8.74f, 21.25f)
                curveTo(7.97f, 21.23f, 7.24f, 20.77f, 6.93f, 20.0f)
                lineTo(1.97f, 8.05f)
                curveTo(1.55f, 7.04f, 2.04f, 5.87f, 3.06f, 5.45f)
                lineTo(10.42f, 2.4f)
                curveTo(10.67f, 2.31f, 10.93f, 2.25f, 11.19f, 2.25f)
                moveTo(14.67f, 2.25f)
                horizontalLineTo(16.12f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.12f, 4.25f)
                verticalLineTo(10.6f)
                lineTo(14.67f, 2.25f)
                moveTo(20.13f, 3.79f)
                lineTo(21.47f, 4.36f)
                curveTo(22.5f, 4.78f, 22.97f, 5.94f, 22.56f, 6.96f)
                lineTo(20.13f, 12.82f)
                verticalLineTo(3.79f)
                moveTo(11.19f, 4.22f)
                lineTo(3.8f, 7.29f)
                lineTo(8.77f, 19.3f)
                lineTo(16.17f, 16.24f)
                lineTo(11.19f, 4.22f)
                moveTo(8.65f, 8.54f)
                lineTo(11.88f, 10.95f)
                lineTo(11.44f, 14.96f)
                lineTo(8.21f, 12.54f)
                lineTo(8.65f, 8.54f)
                close()
            }
        }
        .build()
        return _cardsPlayingOutline!!
    }

private var _cardsPlayingOutline: ImageVector? = null
