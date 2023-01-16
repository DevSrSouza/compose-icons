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

public val MaterialDesignIcons.HandCoin: ImageVector
    get() {
        if (_handCoin != null) {
            return _handCoin!!
        }
        _handCoin = Builder(name = "HandCoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                curveTo(18.76f, 12.0f, 21.0f, 9.76f, 21.0f, 7.0f)
                reflectiveCurveTo(18.76f, 2.0f, 16.0f, 2.0f)
                reflectiveCurveTo(11.0f, 4.24f, 11.0f, 7.0f)
                reflectiveCurveTo(13.24f, 12.0f, 16.0f, 12.0f)
                moveTo(21.45f, 17.6f)
                curveTo(21.06f, 17.2f, 20.57f, 17.0f, 20.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(10.92f, 16.27f)
                lineTo(11.25f, 15.33f)
                lineTo(13.0f, 16.0f)
                horizontalLineTo(15.8f)
                curveTo(16.15f, 16.0f, 16.43f, 15.86f, 16.66f, 15.63f)
                reflectiveCurveTo(17.0f, 15.12f, 17.0f, 14.81f)
                curveTo(17.0f, 14.27f, 16.74f, 13.9f, 16.22f, 13.69f)
                lineTo(8.95f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                lineTo(14.0f, 22.0f)
                lineTo(22.03f, 19.0f)
                curveTo(22.04f, 18.47f, 21.84f, 18.0f, 21.45f, 17.6f)
                moveTo(5.0f, 11.0f)
                horizontalLineTo(0.984f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _handCoin!!
    }

private var _handCoin: ImageVector? = null
