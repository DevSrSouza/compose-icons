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

public val MaterialDesignIcons.SoccerField: ImageVector
    get() {
        if (_soccerField != null) {
            return _soccerField!!
        }
        _soccerField = Builder(name = "SoccerField", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.13f)
                curveTo(9.24f, 8.59f, 8.0f, 10.18f, 8.0f, 12.0f)
                curveTo(8.0f, 13.82f, 9.24f, 15.41f, 11.0f, 15.87f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(13.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.87f)
                curveTo(14.76f, 15.41f, 16.0f, 13.82f, 16.0f, 12.0f)
                curveTo(16.0f, 10.18f, 14.76f, 8.59f, 13.0f, 8.13f)
                verticalLineTo(6.0f)
                moveTo(4.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                moveTo(19.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                moveTo(13.0f, 10.27f)
                curveTo(13.62f, 10.63f, 14.0f, 11.29f, 14.0f, 12.0f)
                curveTo(14.0f, 12.71f, 13.62f, 13.37f, 13.0f, 13.73f)
                verticalLineTo(10.27f)
                moveTo(11.0f, 10.27f)
                verticalLineTo(13.73f)
                curveTo(10.38f, 13.37f, 10.0f, 12.71f, 10.0f, 12.0f)
                curveTo(10.0f, 11.29f, 10.38f, 10.63f, 11.0f, 10.27f)
                close()
            }
        }
        .build()
        return _soccerField!!
    }

private var _soccerField: ImageVector? = null
