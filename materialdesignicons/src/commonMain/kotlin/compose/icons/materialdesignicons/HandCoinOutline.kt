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

public val MaterialDesignIcons.HandCoinOutline: ImageVector
    get() {
        if (_handCoinOutline != null) {
            return _handCoinOutline!!
        }
        _handCoinOutline = Builder(name = "HandCoinOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(13.24f, 2.0f, 11.0f, 4.24f, 11.0f, 7.0f)
                reflectiveCurveTo(13.24f, 12.0f, 16.0f, 12.0f)
                reflectiveCurveTo(21.0f, 9.76f, 21.0f, 7.0f)
                reflectiveCurveTo(18.76f, 2.0f, 16.0f, 2.0f)
                moveTo(16.0f, 10.0f)
                curveTo(14.34f, 10.0f, 13.0f, 8.66f, 13.0f, 7.0f)
                reflectiveCurveTo(14.34f, 4.0f, 16.0f, 4.0f)
                reflectiveCurveTo(19.0f, 5.34f, 19.0f, 7.0f)
                reflectiveCurveTo(17.66f, 10.0f, 16.0f, 10.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 14.8f, 16.25f, 13.72f, 15.13f, 13.3f)
                lineTo(8.97f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.56f)
                lineTo(14.0f, 22.5f)
                lineTo(22.0f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 17.34f, 20.66f, 16.0f, 19.0f, 16.0f)
                moveTo(5.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                moveTo(13.97f, 20.41f)
                lineTo(7.0f, 18.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.61f)
                lineTo(14.43f, 15.17f)
                curveTo(14.77f, 15.3f, 15.0f, 15.63f, 15.0f, 16.0f)
                curveTo(15.0f, 16.0f, 13.0f, 15.95f, 12.7f, 15.85f)
                lineTo(10.32f, 15.06f)
                lineTo(9.69f, 16.96f)
                lineTo(12.07f, 17.75f)
                curveTo(12.58f, 17.92f, 13.11f, 18.0f, 13.65f, 18.0f)
                horizontalLineTo(19.0f)
                curveTo(19.39f, 18.0f, 19.74f, 18.24f, 19.9f, 18.57f)
                lineTo(13.97f, 20.41f)
                close()
            }
        }
        .build()
        return _handCoinOutline!!
    }

private var _handCoinOutline: ImageVector? = null
