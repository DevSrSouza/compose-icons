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

public val MaterialDesignIcons.GraveStone: ImageVector
    get() {
        if (_graveStone != null) {
            return _graveStone!!
        }
        _graveStone = Builder(name = "GraveStone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.31f, 2.0f, 19.0f, 4.69f, 19.0f, 8.0f)
                verticalLineTo(18.66f)
                curveTo(16.88f, 17.63f, 15.07f, 17.0f, 12.0f, 17.0f)
                curveTo(8.93f, 17.0f, 7.12f, 17.63f, 5.0f, 18.66f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 4.69f, 6.69f, 2.0f, 10.0f, 2.0f)
                moveTo(8.0f, 8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                moveTo(9.0f, 12.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                moveTo(3.0f, 22.0f)
                verticalLineTo(21.31f)
                curveTo(5.66f, 19.62f, 13.23f, 15.84f, 21.0f, 21.25f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _graveStone!!
    }

private var _graveStone: ImageVector? = null
