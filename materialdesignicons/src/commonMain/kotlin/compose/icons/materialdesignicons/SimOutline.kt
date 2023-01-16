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

public val MaterialDesignIcons.SimOutline: ImageVector
    get() {
        if (_simOutline != null) {
            return _simOutline!!
        }
        _simOutline = Builder(name = "SimOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.8f)
                lineTo(10.8f, 4.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 2.0f)
                horizontalLineTo(10.0f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f)
                moveTo(9.5f, 19.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.0f)
                moveTo(16.5f, 19.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(19.0f)
                moveTo(9.5f, 15.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                moveTo(16.5f, 15.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _simOutline!!
    }

private var _simOutline: ImageVector? = null
