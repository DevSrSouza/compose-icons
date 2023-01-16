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

public val MaterialDesignIcons.CardsOutline: ImageVector
    get() {
        if (_cardsOutline != null) {
            return _cardsOutline!!
        }
        _cardsOutline = Builder(name = "CardsOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.19f, 2.25f)
                curveTo(10.93f, 2.25f, 10.67f, 2.31f, 10.42f, 2.4f)
                lineTo(3.06f, 5.45f)
                curveTo(2.04f, 5.87f, 1.55f, 7.04f, 1.97f, 8.05f)
                lineTo(6.93f, 20.0f)
                curveTo(7.24f, 20.77f, 7.97f, 21.23f, 8.74f, 21.25f)
                curveTo(9.0f, 21.25f, 9.27f, 21.22f, 9.53f, 21.1f)
                lineTo(16.9f, 18.05f)
                curveTo(17.65f, 17.74f, 18.11f, 17.0f, 18.13f, 16.25f)
                curveTo(18.14f, 16.0f, 18.09f, 15.71f, 18.0f, 15.45f)
                lineTo(13.0f, 3.5f)
                curveTo(12.71f, 2.73f, 11.97f, 2.26f, 11.19f, 2.25f)
                moveTo(14.67f, 2.25f)
                lineTo(18.12f, 10.6f)
                verticalLineTo(4.25f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.12f, 2.25f)
                moveTo(20.13f, 3.79f)
                verticalLineTo(12.82f)
                lineTo(22.56f, 6.96f)
                curveTo(22.97f, 5.94f, 22.5f, 4.78f, 21.47f, 4.36f)
                moveTo(11.19f, 4.22f)
                lineTo(16.17f, 16.24f)
                lineTo(8.78f, 19.3f)
                lineTo(3.8f, 7.29f)
            }
        }
        .build()
        return _cardsOutline!!
    }

private var _cardsOutline: ImageVector? = null