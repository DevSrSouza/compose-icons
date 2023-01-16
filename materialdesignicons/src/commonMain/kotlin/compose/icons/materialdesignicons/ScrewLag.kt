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

public val MaterialDesignIcons.ScrewLag: ImageVector
    get() {
        if (_screwLag != null) {
            return _screwLag!!
        }
        _screwLag = Builder(name = "ScrewLag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.3f)
                lineTo(14.0f, 16.6f)
                verticalLineTo(20.0f)
                lineTo(12.0f, 22.0f)
                lineTo(10.0f, 20.0f)
                verticalLineTo(19.3f)
                moveTo(14.0f, 12.7f)
                lineTo(10.0f, 15.4f)
                verticalLineTo(17.4f)
                lineTo(9.0f, 18.0f)
                verticalLineTo(19.0f)
                lineTo(15.0f, 15.1f)
                verticalLineTo(14.0f)
                lineTo(14.0f, 14.7f)
                verticalLineTo(12.7f)
                moveTo(7.0f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                moveTo(9.0f, 6.0f)
                verticalLineTo(9.0f)
                lineTo(10.0f, 9.7f)
                verticalLineTo(13.4f)
                lineTo(9.0f, 14.0f)
                verticalLineTo(15.0f)
                lineTo(15.0f, 11.1f)
                verticalLineTo(10.0f)
                lineTo(14.0f, 10.7f)
                curveTo(14.0f, 10.7f, 14.0f, 10.3f, 14.0f, 9.7f)
                lineTo(15.0f, 9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _screwLag!!
    }

private var _screwLag: ImageVector? = null
