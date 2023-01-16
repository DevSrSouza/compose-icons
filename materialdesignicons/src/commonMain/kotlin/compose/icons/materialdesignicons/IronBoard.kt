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

public val MaterialDesignIcons.IronBoard: ImageVector
    get() {
        if (_ironBoard != null) {
            return _ironBoard!!
        }
        _ironBoard = Builder(name = "IronBoard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.8f)
                curveTo(16.0f, 3.68f, 16.56f, 2.63f, 17.5f, 2.0f)
                curveTo(18.44f, 2.63f, 19.0f, 3.68f, 19.0f, 4.8f)
                verticalLineTo(6.0f)
                moveTo(15.28f, 13.63f)
                lineTo(19.59f, 19.0f)
                curveTo(20.38f, 19.06f, 21.0f, 19.7f, 21.0f, 20.5f)
                curveTo(21.0f, 21.33f, 20.33f, 22.0f, 19.5f, 22.0f)
                reflectiveCurveTo(18.0f, 21.33f, 18.0f, 20.5f)
                curveTo(18.0f, 20.42f, 18.0f, 20.34f, 18.0f, 20.26f)
                lineTo(14.0f, 15.23f)
                lineTo(10.0f, 20.26f)
                curveTo(10.0f, 20.34f, 10.0f, 20.42f, 10.0f, 20.5f)
                curveTo(10.0f, 21.33f, 9.33f, 22.0f, 8.5f, 22.0f)
                reflectiveCurveTo(7.0f, 21.33f, 7.0f, 20.5f)
                curveTo(7.0f, 19.7f, 7.63f, 19.06f, 8.41f, 19.0f)
                lineTo(12.72f, 13.63f)
                lineTo(9.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                lineTo(15.28f, 13.63f)
                moveTo(14.0f, 12.0f)
                lineTo(16.42f, 9.0f)
                horizontalLineTo(11.58f)
                lineTo(14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _ironBoard!!
    }

private var _ironBoard: ImageVector? = null
