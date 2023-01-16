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

public val MaterialDesignIcons.ConeOff: ImageVector
    get() {
        if (_coneOff != null) {
            return _coneOff!!
        }
        _coneOff = Builder(name = "ConeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.31f)
                lineTo(9.06f, 5.86f)
                lineTo(11.15f, 2.47f)
                curveTo(11.34f, 2.16f, 11.67f, 2.0f, 12.0f, 2.0f)
                curveTo(12.33f, 2.0f, 12.66f, 2.16f, 12.85f, 2.5f)
                lineTo(21.62f, 16.68f)
                horizontalLineTo(21.62f)
                curveTo(21.91f, 17.15f, 22.0f, 17.61f, 22.0f, 18.0f)
                curveTo(22.0f, 18.25f, 21.96f, 18.5f, 21.9f, 18.7f)
                lineTo(17.73f, 14.53f)
                curveTo(17.81f, 14.55f, 17.9f, 14.56f, 18.0f, 14.58f)
                lineTo(12.0f, 4.9f)
                lineTo(10.5f, 7.31f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.17f, 21.06f)
                curveTo(17.03f, 21.83f, 14.11f, 22.0f, 12.0f, 22.0f)
                curveTo(3.3f, 22.0f, 2.0f, 19.5f, 2.0f, 18.0f)
                curveTo(2.0f, 17.5f, 2.15f, 17.04f, 2.4f, 16.65f)
                horizontalLineTo(2.38f)
                lineTo(7.11f, 9.0f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(6.0f, 14.6f)
                curveTo(7.96f, 14.12f, 10.25f, 14.0f, 12.0f, 14.0f)
                lineTo(12.11f, 14.0f)
                lineTo(8.56f, 10.45f)
                lineTo(6.0f, 14.6f)
                moveTo(17.55f, 19.44f)
                lineTo(14.19f, 16.08f)
                curveTo(13.5f, 16.03f, 12.76f, 16.0f, 12.0f, 16.0f)
                curveTo(7.58f, 16.0f, 4.0f, 16.9f, 4.0f, 18.0f)
                reflectiveCurveTo(7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(14.16f, 20.0f, 16.11f, 19.79f, 17.55f, 19.44f)
                close()
            }
        }
        .build()
        return _coneOff!!
    }

private var _coneOff: ImageVector? = null
