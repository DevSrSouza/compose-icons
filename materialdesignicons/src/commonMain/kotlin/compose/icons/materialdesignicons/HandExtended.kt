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

public val MaterialDesignIcons.HandExtended: ImageVector
    get() {
        if (_handExtended != null) {
            return _handExtended!!
        }
        _handExtended = Builder(name = "HandExtended", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveTo(20.6f, 13.0f, 21.1f, 13.2f, 21.5f, 13.6f)
                curveTo(21.8f, 14.0f, 22.0f, 14.5f, 22.0f, 15.0f)
                lineTo(14.0f, 18.0f)
                lineTo(7.0f, 16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.9f)
                lineTo(16.2f, 9.7f)
                curveTo(16.7f, 9.9f, 17.0f, 10.3f, 17.0f, 10.8f)
                curveTo(17.0f, 11.1f, 16.9f, 11.4f, 16.7f, 11.6f)
                reflectiveCurveTo(16.1f, 12.0f, 15.8f, 12.0f)
                horizontalLineTo(13.0f)
                lineTo(11.2f, 11.3f)
                lineTo(10.9f, 12.2f)
                lineTo(13.0f, 13.0f)
                horizontalLineTo(20.0f)
                moveTo(1.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _handExtended!!
    }

private var _handExtended: ImageVector? = null
