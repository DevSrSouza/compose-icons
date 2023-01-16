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

public val MaterialDesignIcons.OrnamentVariant: ImageVector
    get() {
        if (_ornamentVariant != null) {
            return _ornamentVariant!!
        }
        _ornamentVariant = Builder(name = "OrnamentVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 4.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 6.0f)
                verticalLineTo(7.07f)
                curveTo(18.39f, 8.45f, 20.0f, 11.04f, 20.0f, 14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 14.0f)
                curveTo(4.0f, 11.04f, 5.61f, 8.45f, 8.0f, 7.07f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 5.0f)
                verticalLineTo(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 1.0f)
                moveTo(12.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(12.0f, 8.0f)
                curveTo(10.22f, 8.0f, 8.63f, 8.77f, 7.53f, 10.0f)
                horizontalLineTo(16.47f)
                curveTo(15.37f, 8.77f, 13.78f, 8.0f, 12.0f, 8.0f)
                moveTo(12.0f, 20.0f)
                curveTo(13.78f, 20.0f, 15.37f, 19.23f, 16.47f, 18.0f)
                horizontalLineTo(7.53f)
                curveTo(8.63f, 19.23f, 10.22f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 12.0f)
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 13.31f, 17.88f, 12.65f, 17.67f, 12.0f)
                curveTo(16.72f, 12.19f, 16.0f, 13.0f, 16.0f, 14.0f)
                curveTo(16.0f, 15.0f, 16.72f, 15.81f, 17.67f, 15.97f)
                curveTo(17.88f, 15.35f, 18.0f, 14.69f, 18.0f, 14.0f)
                moveTo(6.0f, 14.0f)
                curveTo(6.0f, 14.69f, 6.12f, 15.35f, 6.33f, 15.97f)
                curveTo(7.28f, 15.81f, 8.0f, 15.0f, 8.0f, 14.0f)
                curveTo(8.0f, 13.0f, 7.28f, 12.19f, 6.33f, 12.0f)
                curveTo(6.12f, 12.65f, 6.0f, 13.31f, 6.0f, 14.0f)
                close()
            }
        }
        .build()
        return _ornamentVariant!!
    }

private var _ornamentVariant: ImageVector? = null
