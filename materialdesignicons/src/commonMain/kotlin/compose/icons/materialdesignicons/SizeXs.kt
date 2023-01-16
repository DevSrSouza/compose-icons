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

public val MaterialDesignIcons.SizeXs: ImageVector
    get() {
        if (_sizeXs != null) {
            return _sizeXs!!
        }
        _sizeXs = Builder(name = "SizeXs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                horizontalLineTo(8.0f)
                lineTo(9.0f, 9.5f)
                lineTo(10.0f, 7.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(12.0f, 17.0f)
                horizontalLineTo(10.0f)
                lineTo(9.0f, 14.5f)
                lineTo(8.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(8.0f, 12.0f)
                lineTo(6.0f, 7.0f)
                moveTo(15.0f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 11.0f, 19.0f, 11.9f, 19.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 16.11f, 18.11f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 13.0f, 13.0f, 12.11f, 13.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 7.9f, 13.9f, 7.0f, 15.0f, 7.0f)
                close()
            }
        }
        .build()
        return _sizeXs!!
    }

private var _sizeXs: ImageVector? = null
