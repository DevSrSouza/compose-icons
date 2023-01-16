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

public val MaterialDesignIcons.AlertCircleCheckOutline: ImageVector
    get() {
        if (_alertCircleCheckOutline != null) {
            return _alertCircleCheckOutline!!
        }
        _alertCircleCheckOutline = Builder(name = "AlertCircleCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                lineTo(21.92f, 13.31f)
                curveTo(21.31f, 13.11f, 20.67f, 13.0f, 19.94f, 13.0f)
                lineTo(20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(12.71f, 20.0f, 13.39f, 19.91f, 14.05f, 19.74f)
                curveTo(14.13f, 20.42f, 14.33f, 21.06f, 14.62f, 21.65f)
                curveTo(13.78f, 21.88f, 12.9f, 22.0f, 12.0f, 22.0f)
                curveTo(6.47f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.47f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _alertCircleCheckOutline!!
    }

private var _alertCircleCheckOutline: ImageVector? = null
