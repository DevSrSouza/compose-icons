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

public val MaterialDesignIcons.Food: ImageVector
    get() {
        if (_food != null) {
            return _food!!
        }
        _food = Builder(name = "Food", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.06f, 23.0f)
                horizontalLineTo(19.72f)
                curveTo(20.56f, 23.0f, 21.25f, 22.35f, 21.35f, 21.53f)
                lineTo(23.0f, 5.05f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.03f)
                verticalLineTo(5.05f)
                horizontalLineTo(11.06f)
                lineTo(11.36f, 7.39f)
                curveTo(13.07f, 7.86f, 14.67f, 8.71f, 15.63f, 9.65f)
                curveTo(17.07f, 11.07f, 18.06f, 12.54f, 18.06f, 14.94f)
                verticalLineTo(23.0f)
                moveTo(1.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.03f)
                verticalLineTo(22.0f)
                curveTo(16.03f, 22.54f, 15.58f, 23.0f, 15.0f, 23.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 23.0f, 1.0f, 22.54f, 1.0f, 22.0f)
                moveTo(16.03f, 15.0f)
                curveTo(16.03f, 7.0f, 1.0f, 7.0f, 1.0f, 15.0f)
                horizontalLineTo(16.03f)
                moveTo(1.0f, 17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _food!!
    }

private var _food: ImageVector? = null
