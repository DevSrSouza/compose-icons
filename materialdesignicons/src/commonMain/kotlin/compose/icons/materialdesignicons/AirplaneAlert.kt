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

public val MaterialDesignIcons.AirplaneAlert: ImageVector
    get() {
        if (_airplaneAlert != null) {
            return _airplaneAlert!!
        }
        _airplaneAlert = Builder(name = "AirplaneAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.56f, 3.91f)
                curveTo(18.15f, 4.5f, 18.15f, 5.45f, 17.56f, 6.03f)
                lineTo(13.67f, 9.92f)
                lineTo(15.79f, 19.11f)
                lineTo(14.38f, 20.53f)
                lineTo(10.5f, 13.1f)
                lineTo(6.6f, 17.0f)
                lineTo(6.96f, 19.47f)
                lineTo(5.89f, 20.53f)
                lineTo(4.13f, 17.35f)
                lineTo(0.944f, 15.58f)
                lineTo(2.0f, 14.5f)
                lineTo(4.5f, 14.87f)
                lineTo(8.37f, 11.0f)
                lineTo(0.944f, 7.09f)
                lineTo(2.36f, 5.68f)
                lineTo(11.55f, 7.8f)
                lineTo(15.44f, 3.91f)
                curveTo(16.0f, 3.33f, 17.0f, 3.33f, 17.56f, 3.91f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _airplaneAlert!!
    }

private var _airplaneAlert: ImageVector? = null
