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

public val MaterialDesignIcons.HandExtendedOutline: ImageVector
    get() {
        if (_handExtendedOutline != null) {
            return _handExtendedOutline!!
        }
        _handExtendedOutline = Builder(name = "HandExtendedOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                verticalLineTo(16.0f)
                lineTo(14.0f, 18.5f)
                lineTo(7.0f, 16.6f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                lineTo(15.2f, 9.3f)
                curveTo(16.2f, 9.7f, 17.0f, 10.8f, 17.0f, 12.0f)
                horizontalLineTo(19.0f)
                curveTo(20.7f, 12.0f, 22.0f, 13.3f, 22.0f, 15.0f)
                moveTo(5.0f, 16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                moveTo(19.9f, 14.6f)
                curveTo(19.7f, 14.2f, 19.4f, 14.0f, 19.0f, 14.0f)
                horizontalLineTo(13.6f)
                curveTo(13.1f, 14.0f, 12.5f, 13.9f, 12.0f, 13.8f)
                lineTo(9.7f, 13.0f)
                lineTo(10.3f, 11.1f)
                lineTo(12.7f, 11.9f)
                curveTo(13.0f, 11.9f, 15.0f, 12.0f, 15.0f, 12.0f)
                curveTo(15.0f, 11.6f, 14.8f, 11.3f, 14.4f, 11.2f)
                lineTo(8.6f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.5f)
                lineTo(14.0f, 16.4f)
                lineTo(19.9f, 14.6f)
                close()
            }
        }
        .build()
        return _handExtendedOutline!!
    }

private var _handExtendedOutline: ImageVector? = null
