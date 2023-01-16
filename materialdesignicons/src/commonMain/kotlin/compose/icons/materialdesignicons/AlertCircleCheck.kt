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

public val MaterialDesignIcons.AlertCircleCheck: ImageVector
    get() {
        if (_alertCircleCheck != null) {
            return _alertCircleCheck!!
        }
        _alertCircleCheck = Builder(name = "AlertCircleCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 22.16f)
                lineTo(16.0f, 19.16f)
                lineTo(17.16f, 18.0f)
                lineTo(18.75f, 19.59f)
                lineTo(22.34f, 16.0f)
                lineTo(23.5f, 17.41f)
                lineTo(18.75f, 22.16f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                lineTo(21.91f, 13.31f)
                curveTo(21.31f, 13.11f, 20.67f, 13.0f, 20.0f, 13.0f)
                curveTo(16.69f, 13.0f, 14.0f, 15.69f, 14.0f, 19.0f)
                curveTo(14.0f, 19.95f, 14.22f, 20.85f, 14.62f, 21.65f)
                curveTo(13.78f, 21.88f, 12.91f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _alertCircleCheck!!
    }

private var _alertCircleCheck: ImageVector? = null
