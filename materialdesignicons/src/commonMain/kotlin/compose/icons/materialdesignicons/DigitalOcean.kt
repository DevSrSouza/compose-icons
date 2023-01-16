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

public val MaterialDesignIcons.DigitalOcean: ImageVector
    get() {
        if (_digitalOcean != null) {
            return _digitalOcean!!
        }
        _digitalOcean = Builder(name = "DigitalOcean", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                curveTo(15.32f, 18.0f, 18.0f, 15.31f, 18.0f, 12.0f)
                curveTo(18.0f, 8.69f, 15.31f, 6.0f, 12.0f, 6.0f)
                curveTo(8.69f, 6.0f, 6.0f, 8.69f, 6.0f, 12.0f)
                moveTo(8.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                moveTo(3.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _digitalOcean!!
    }

private var _digitalOcean: ImageVector? = null
