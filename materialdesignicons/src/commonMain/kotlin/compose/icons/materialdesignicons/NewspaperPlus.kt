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

public val MaterialDesignIcons.NewspaperPlus: ImageVector
    get() {
        if (_newspaperPlus != null) {
            return _newspaperPlus!!
        }
        _newspaperPlus = Builder(name = "NewspaperPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                moveTo(20.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(14.68f)
                curveTo(12.37f, 15.63f, 12.0f, 16.77f, 12.0f, 18.0f)
                curveTo(12.0f, 19.09f, 12.29f, 20.12f, 12.8f, 21.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 19.0f)
                verticalLineTo(3.0f)
                lineTo(3.67f, 4.67f)
                lineTo(5.33f, 3.0f)
                lineTo(7.0f, 4.67f)
                lineTo(8.67f, 3.0f)
                lineTo(10.33f, 4.67f)
                lineTo(12.0f, 3.0f)
                lineTo(13.67f, 4.67f)
                lineTo(15.33f, 3.0f)
                lineTo(17.0f, 4.67f)
                lineTo(18.67f, 3.0f)
                lineTo(20.33f, 4.67f)
                lineTo(22.0f, 3.0f)
                verticalLineTo(13.5f)
                curveTo(20.93f, 12.58f, 19.53f, 12.0f, 18.0f, 12.0f)
                curveTo(16.77f, 12.0f, 15.63f, 12.37f, 14.68f, 13.0f)
                horizontalLineTo(13.0f)
                moveTo(11.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _newspaperPlus!!
    }

private var _newspaperPlus: ImageVector? = null
