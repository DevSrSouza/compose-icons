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

public val MaterialDesignIcons.TableLargePlus: ImageVector
    get() {
        if (_tableLargePlus != null) {
            return _tableLargePlus!!
        }
        _tableLargePlus = Builder(name = "TableLargePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.35f, 20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.09f)
                curveTo(12.21f, 16.28f, 12.46f, 15.61f, 12.81f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.54f)
                curveTo(14.58f, 13.0f, 15.25f, 12.61f, 16.0f, 12.35f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.35f)
                curveTo(20.75f, 12.61f, 21.42f, 13.0f, 22.0f, 13.54f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(13.54f)
                curveTo(13.0f, 21.42f, 12.61f, 20.75f, 12.35f, 20.0f)
                moveTo(16.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                moveTo(8.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                moveTo(8.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                moveTo(8.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
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
            }
        }
        .build()
        return _tableLargePlus!!
    }

private var _tableLargePlus: ImageVector? = null
