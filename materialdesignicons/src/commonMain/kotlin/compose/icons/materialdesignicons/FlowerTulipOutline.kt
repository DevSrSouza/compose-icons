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

public val MaterialDesignIcons.FlowerTulipOutline: ImageVector
    get() {
        if (_flowerTulipOutline != null) {
            return _flowerTulipOutline!!
        }
        _flowerTulipOutline = Builder(name = "FlowerTulipOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 13.0f)
                moveTo(5.44f, 15.44f)
                curveTo(7.35f, 16.15f, 8.85f, 17.65f, 9.56f, 19.56f)
                curveTo(7.65f, 18.85f, 6.15f, 17.35f, 5.44f, 15.44f)
                moveTo(12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                moveTo(14.42f, 19.57f)
                curveTo(15.11f, 17.64f, 16.64f, 16.11f, 18.57f, 15.42f)
                curveTo(17.86f, 17.34f, 16.34f, 18.86f, 14.42f, 19.57f)
                moveTo(12.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 8.0f)
                verticalLineTo(3.0f)
                curveTo(17.26f, 3.0f, 16.53f, 3.12f, 15.84f, 3.39f)
                curveTo(15.29f, 3.62f, 14.8f, 3.96f, 14.39f, 4.39f)
                lineTo(12.0f, 2.0f)
                lineTo(9.61f, 4.39f)
                curveTo(9.2f, 3.96f, 8.71f, 3.62f, 8.16f, 3.39f)
                curveTo(7.47f, 3.12f, 6.74f, 3.0f, 6.0f, 3.0f)
                verticalLineTo(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 14.0f)
                moveTo(8.0f, 5.61f)
                lineTo(9.57f, 7.26f)
                lineTo(12.0f, 4.83f)
                lineTo(14.43f, 7.26f)
                lineTo(16.0f, 5.61f)
                verticalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(5.61f)
                close()
            }
        }
        .build()
        return _flowerTulipOutline!!
    }

private var _flowerTulipOutline: ImageVector? = null
