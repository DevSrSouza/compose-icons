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

public val MaterialDesignIcons.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5f, 22.0f, 22.0f, 17.5f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                curveTo(4.0f, 7.58f, 7.58f, 4.0f, 12.0f, 4.0f)
                curveTo(16.42f, 4.0f, 20.0f, 7.58f, 20.0f, 12.0f)
                curveTo(20.0f, 16.42f, 16.42f, 20.0f, 12.0f, 20.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                lineTo(12.0f, 19.0f)
                lineTo(9.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(5.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                lineTo(11.0f, 12.0f)
                lineTo(8.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                moveTo(11.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 5.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                moveTo(19.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                lineTo(13.0f, 12.0f)
                lineTo(16.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
