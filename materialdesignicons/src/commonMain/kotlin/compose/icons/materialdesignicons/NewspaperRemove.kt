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

public val MaterialDesignIcons.NewspaperRemove: ImageVector
    get() {
        if (_newspaperRemove != null) {
            return _newspaperRemove!!
        }
        _newspaperRemove = Builder(name = "NewspaperRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.47f, 20.12f)
                lineTo(16.59f, 18.0f)
                lineTo(14.47f, 15.88f)
                lineTo(15.88f, 14.47f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.46f)
                moveTo(20.33f, 4.67f)
                lineTo(18.67f, 3.0f)
                lineTo(17.0f, 4.67f)
                lineTo(15.33f, 3.0f)
                lineTo(13.67f, 4.67f)
                lineTo(12.0f, 3.0f)
                lineTo(10.33f, 4.67f)
                lineTo(8.67f, 3.0f)
                lineTo(7.0f, 4.67f)
                lineTo(5.33f, 3.0f)
                lineTo(3.67f, 4.67f)
                lineTo(2.0f, 3.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.11f, 2.9f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(12.8f)
                curveTo(12.29f, 20.12f, 12.0f, 19.09f, 12.0f, 18.0f)
                curveTo(12.0f, 16.77f, 12.37f, 15.63f, 13.0f, 14.68f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.68f)
                curveTo(15.63f, 12.37f, 16.77f, 12.0f, 18.0f, 12.0f)
                curveTo(19.53f, 12.0f, 20.93f, 12.58f, 22.0f, 13.5f)
                verticalLineTo(3.0f)
                lineTo(20.33f, 4.67f)
                moveTo(11.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _newspaperRemove!!
    }

private var _newspaperRemove: ImageVector? = null
