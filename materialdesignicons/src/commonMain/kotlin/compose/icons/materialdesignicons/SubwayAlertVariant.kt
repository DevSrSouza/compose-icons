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

public val MaterialDesignIcons.SubwayAlertVariant: ImageVector
    get() {
        if (_subwayAlertVariant != null) {
            return _subwayAlertVariant!!
        }
        _subwayAlertVariant = Builder(name = "SubwayAlertVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                moveTo(14.5f, 17.0f)
                curveTo(15.3f, 17.0f, 16.0f, 16.3f, 16.0f, 15.5f)
                curveTo(16.0f, 14.7f, 15.3f, 14.0f, 14.5f, 14.0f)
                reflectiveCurveTo(13.0f, 14.7f, 13.0f, 15.5f)
                curveTo(13.0f, 16.3f, 13.7f, 17.0f, 14.5f, 17.0f)
                moveTo(9.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                moveTo(5.5f, 17.0f)
                curveTo(6.3f, 17.0f, 7.0f, 16.3f, 7.0f, 15.5f)
                curveTo(7.0f, 14.7f, 6.3f, 14.0f, 5.5f, 14.0f)
                reflectiveCurveTo(4.0f, 14.7f, 4.0f, 15.5f)
                curveTo(4.0f, 16.3f, 4.7f, 17.0f, 5.5f, 17.0f)
                moveTo(10.0f, 2.0f)
                curveTo(14.4f, 2.0f, 18.0f, 2.5f, 18.0f, 6.0f)
                verticalLineTo(15.5f)
                curveTo(18.0f, 17.4f, 16.4f, 19.0f, 14.5f, 19.0f)
                lineTo(16.0f, 20.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.5f)
                lineTo(5.5f, 19.0f)
                curveTo(3.6f, 19.0f, 2.0f, 17.4f, 2.0f, 15.5f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 2.5f, 5.6f, 2.0f, 10.0f, 2.0f)
                moveTo(20.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _subwayAlertVariant!!
    }

private var _subwayAlertVariant: ImageVector? = null
