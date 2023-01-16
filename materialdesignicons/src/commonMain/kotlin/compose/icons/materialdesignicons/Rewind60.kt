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

public val MaterialDesignIcons.Rewind60: ImageVector
    get() {
        if (_rewind60 != null) {
            return _rewind60!!
        }
        _rewind60 = Builder(name = "Rewind60", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.1f, 18.1f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 22.0f, 13.0f, 21.1f, 13.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(13.0f, 12.9f, 13.9f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 12.0f, 19.0f, 12.9f, 19.0f, 14.0f)
                moveTo(15.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                moveTo(12.5f, 3.0f)
                curveTo(17.1f, 3.0f, 21.1f, 6.0f, 22.5f, 10.2f)
                lineTo(20.1f, 11.0f)
                curveTo(19.0f, 7.8f, 16.0f, 5.5f, 12.5f, 5.5f)
                curveTo(10.5f, 5.5f, 8.8f, 6.2f, 7.4f, 7.4f)
                lineTo(10.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                lineTo(5.6f, 5.6f)
                curveTo(7.4f, 4.0f, 9.9f, 3.0f, 12.5f, 3.0f)
                moveTo(7.0f, 12.0f)
                curveTo(5.9f, 12.0f, 5.0f, 12.9f, 5.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 21.1f, 5.9f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(10.1f, 22.0f, 11.0f, 21.1f, 11.0f, 20.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 16.9f, 10.1f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _rewind60!!
    }

private var _rewind60: ImageVector? = null
