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

public val MaterialDesignIcons.UmbrellaClosedOutline: ImageVector
    get() {
        if (_umbrellaClosedOutline != null) {
            return _umbrellaClosedOutline!!
        }
        _umbrellaClosedOutline = Builder(name = "UmbrellaClosedOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.4f, 2.0f, 12.8f, 2.2f, 12.9f, 2.6f)
                lineTo(17.5f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                curveTo(13.0f, 20.7f, 11.7f, 22.0f, 10.0f, 22.0f)
                reflectiveCurveTo(7.0f, 20.7f, 7.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 19.6f, 9.4f, 20.0f, 10.0f, 20.0f)
                curveTo(10.6f, 20.0f, 11.0f, 19.6f, 11.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.5f)
                lineTo(11.1f, 2.6f)
                curveTo(11.2f, 2.2f, 11.6f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 5.9f)
                lineTo(9.4f, 13.0f)
                horizontalLineTo(14.7f)
                lineTo(12.0f, 5.9f)
                close()
            }
        }
        .build()
        return _umbrellaClosedOutline!!
    }

private var _umbrellaClosedOutline: ImageVector? = null
