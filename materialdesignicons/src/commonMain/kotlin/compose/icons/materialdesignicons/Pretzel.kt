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

public val MaterialDesignIcons.Pretzel: ImageVector
    get() {
        if (_pretzel != null) {
            return _pretzel!!
        }
        _pretzel = Builder(name = "Pretzel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.15f, 15.84f)
                curveTo(3.81f, 14.27f, 3.0f, 12.23f, 3.0f, 10.0f)
                verticalLineTo(9.97f)
                curveTo(3.0f, 7.22f, 5.25f, 5.0f, 8.0f, 5.0f)
                curveTo(9.64f, 5.0f, 11.09f, 5.79f, 12.0f, 7.0f)
                curveTo(12.91f, 5.79f, 14.37f, 5.0f, 16.0f, 5.0f)
                curveTo(18.76f, 5.0f, 21.0f, 7.24f, 21.0f, 10.0f)
                curveTo(21.0f, 12.23f, 20.19f, 14.27f, 18.85f, 15.84f)
                lineTo(20.21f, 17.2f)
                lineTo(18.79f, 18.61f)
                lineTo(17.39f, 17.21f)
                curveTo(15.89f, 18.33f, 14.0f, 19.0f, 12.0f, 19.0f)
                curveTo(10.0f, 19.0f, 8.11f, 18.33f, 6.61f, 17.21f)
                lineTo(5.21f, 18.61f)
                lineTo(3.79f, 17.2f)
                lineTo(5.15f, 15.84f)
                moveTo(15.96f, 15.77f)
                lineTo(12.0f, 11.82f)
                lineTo(8.04f, 15.77f)
                curveTo(9.17f, 16.55f, 10.53f, 17.0f, 12.0f, 17.0f)
                curveTo(13.47f, 17.0f, 14.83f, 16.55f, 15.96f, 15.77f)
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 8.34f, 9.65f, 7.0f, 8.0f, 7.0f)
                curveTo(6.34f, 7.0f, 5.0f, 8.34f, 5.0f, 10.0f)
                curveTo(5.0f, 11.68f, 5.59f, 13.21f, 6.57f, 14.42f)
                lineTo(11.0f, 10.0f)
                moveTo(17.43f, 14.42f)
                curveTo(18.41f, 13.21f, 19.0f, 11.68f, 19.0f, 10.0f)
                verticalLineTo(10.0f)
                curveTo(19.0f, 8.33f, 17.65f, 7.0f, 16.0f, 7.0f)
                curveTo(14.35f, 7.0f, 13.0f, 8.34f, 13.0f, 10.0f)
                lineTo(17.43f, 14.42f)
                close()
            }
        }
        .build()
        return _pretzel!!
    }

private var _pretzel: ImageVector? = null
