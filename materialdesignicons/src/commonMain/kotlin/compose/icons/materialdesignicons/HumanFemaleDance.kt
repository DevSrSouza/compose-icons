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

public val MaterialDesignIcons.HumanFemaleDance: ImageVector
    get() {
        if (_humanFemaleDance != null) {
            return _humanFemaleDance!!
        }
        _humanFemaleDance = Builder(name = "HumanFemaleDance", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.88f)
                lineTo(9.34f, 18.93f)
                lineTo(11.71f, 21.29f)
                lineTo(10.29f, 22.71f)
                lineTo(7.93f, 20.34f)
                curveTo(7.58f, 20.0f, 7.38f, 19.53f, 7.35f, 19.04f)
                curveTo(7.32f, 18.55f, 7.47f, 18.06f, 7.78f, 17.68f)
                lineTo(8.32f, 17.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(8.38f, 10.47f, 7.88f, 11.07f, 7.53f, 11.76f)
                curveTo(7.18f, 12.46f, 7.0f, 13.22f, 7.0f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 12.14f, 5.74f, 10.36f, 7.05f, 9.05f)
                curveTo(8.36f, 7.74f, 10.14f, 7.0f, 12.0f, 7.0f)
                curveTo(13.33f, 7.0f, 14.6f, 6.47f, 15.54f, 5.54f)
                curveTo(16.47f, 4.6f, 17.0f, 3.33f, 17.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 3.32f, 18.62f, 4.62f, 17.91f, 5.73f)
                curveTo(17.2f, 6.85f, 16.2f, 7.74f, 15.0f, 8.31f)
                verticalLineTo(13.0f)
                lineTo(17.0f, 17.0f)
                moveTo(14.0f, 4.0f)
                curveTo(14.0f, 4.4f, 13.88f, 4.78f, 13.66f, 5.11f)
                curveTo(13.44f, 5.44f, 13.13f, 5.7f, 12.77f, 5.85f)
                curveTo(12.4f, 6.0f, 12.0f, 6.04f, 11.61f, 5.96f)
                curveTo(11.22f, 5.88f, 10.87f, 5.69f, 10.59f, 5.41f)
                curveTo(10.31f, 5.13f, 10.12f, 4.78f, 10.04f, 4.39f)
                curveTo(9.96f, 4.0f, 10.0f, 3.6f, 10.15f, 3.24f)
                curveTo(10.3f, 2.87f, 10.56f, 2.56f, 10.89f, 2.34f)
                curveTo(11.22f, 2.12f, 11.6f, 2.0f, 12.0f, 2.0f)
                curveTo(12.53f, 2.0f, 13.04f, 2.21f, 13.41f, 2.59f)
                curveTo(13.79f, 2.96f, 14.0f, 3.47f, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _humanFemaleDance!!
    }

private var _humanFemaleDance: ImageVector? = null
