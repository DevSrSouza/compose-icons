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

public val MaterialDesignIcons.Tournament: ImageVector
    get() {
        if (_tournament != null) {
            return _tournament!!
        }
        _tournament = Builder(name = "Tournament", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                curveTo(8.11f, 10.0f, 9.0f, 9.11f, 9.0f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                curveTo(9.0f, 14.89f, 8.11f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                curveTo(8.11f, 22.0f, 9.0f, 21.11f, 9.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 19.0f, 16.0f, 18.11f, 16.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 5.89f, 15.11f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                curveTo(9.0f, 2.89f, 8.11f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _tournament!!
    }

private var _tournament: ImageVector? = null
