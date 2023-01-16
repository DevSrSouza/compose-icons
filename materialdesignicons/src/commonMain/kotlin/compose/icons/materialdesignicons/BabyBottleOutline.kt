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

public val MaterialDesignIcons.BabyBottleOutline: ImageVector
    get() {
        if (_babyBottleOutline != null) {
            return _babyBottleOutline!!
        }
        _babyBottleOutline = Builder(name = "BabyBottleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.28f, 2.8f)
                lineTo(10.78f, 3.3f)
                curveTo(9.44f, 2.55f, 7.84f, 2.4f, 6.41f, 2.87f)
                lineTo(6.33f, 2.8f)
                curveTo(5.36f, 1.82f, 3.77f, 1.82f, 2.8f, 2.8f)
                reflectiveCurveTo(1.82f, 5.36f, 2.8f, 6.33f)
                lineTo(2.87f, 6.41f)
                curveTo(2.4f, 7.84f, 2.55f, 9.44f, 3.3f, 10.78f)
                lineTo(2.8f, 11.28f)
                curveTo(2.21f, 11.87f, 2.21f, 12.81f, 2.8f, 13.4f)
                lineTo(4.21f, 14.82f)
                curveTo(4.8f, 15.4f, 5.74f, 15.4f, 6.33f, 14.82f)
                lineTo(6.68f, 14.46f)
                lineTo(13.76f, 21.53f)
                curveTo(14.34f, 22.12f, 15.29f, 22.12f, 15.88f, 21.53f)
                lineTo(21.53f, 15.88f)
                curveTo(22.12f, 15.29f, 22.12f, 14.34f, 21.53f, 13.75f)
                lineTo(14.46f, 6.68f)
                lineTo(14.82f, 6.33f)
                curveTo(15.4f, 5.74f, 15.4f, 4.8f, 14.82f, 4.21f)
                lineTo(13.4f, 2.79f)
                curveTo(12.82f, 2.21f, 11.87f, 2.21f, 11.28f, 2.8f)
                moveTo(4.25f, 7.05f)
                curveTo(4.33f, 6.71f, 4.47f, 6.38f, 4.66f, 6.07f)
                lineTo(3.86f, 5.27f)
                curveTo(3.75f, 5.16f, 3.67f, 5.04f, 3.63f, 4.9f)
                curveTo(3.5f, 4.56f, 3.57f, 4.14f, 3.86f, 3.86f)
                reflectiveCurveTo(4.56f, 3.5f, 4.9f, 3.63f)
                curveTo(5.04f, 3.67f, 5.16f, 3.75f, 5.27f, 3.86f)
                lineTo(6.07f, 4.66f)
                curveTo(6.38f, 4.47f, 6.71f, 4.33f, 7.05f, 4.25f)
                curveTo(7.91f, 4.0f, 8.83f, 4.06f, 9.65f, 4.42f)
                lineTo(4.42f, 9.65f)
                curveTo(4.06f, 8.83f, 4.0f, 7.91f, 4.25f, 7.05f)
                moveTo(20.47f, 14.82f)
                lineTo(14.82f, 20.47f)
                lineTo(7.75f, 13.4f)
                lineTo(13.4f, 7.75f)
                lineTo(20.47f, 14.82f)
                moveTo(13.76f, 5.27f)
                lineTo(5.27f, 13.76f)
                lineTo(3.86f, 12.34f)
                lineTo(12.34f, 3.86f)
                lineTo(13.76f, 5.27f)
                moveTo(14.82f, 11.63f)
                lineTo(11.63f, 14.82f)
                lineTo(10.57f, 13.76f)
                lineTo(13.76f, 10.57f)
                lineTo(14.82f, 11.63f)
                moveTo(16.94f, 13.76f)
                lineTo(13.76f, 16.94f)
                lineTo(12.69f, 15.88f)
                lineTo(15.88f, 12.69f)
                lineTo(16.94f, 13.76f)
                close()
            }
        }
        .build()
        return _babyBottleOutline!!
    }

private var _babyBottleOutline: ImageVector? = null
