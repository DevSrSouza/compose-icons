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

public val MaterialDesignIcons.HeadLightbulb: ImageVector
    get() {
        if (_headLightbulb != null) {
            return _headLightbulb!!
        }
        _headLightbulb = Builder(name = "HeadLightbulb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.23f, 3.0f, 6.19f, 5.95f, 6.0f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.89f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20.0f, 12.8f, 20.0f, 10.0f)
                curveTo(20.0f, 6.14f, 16.88f, 3.0f, 13.0f, 3.0f)
                moveTo(14.0f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                moveTo(15.6f, 9.5f)
                curveTo(15.34f, 9.94f, 14.96f, 10.32f, 14.5f, 10.58f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(10.58f)
                curveTo(10.07f, 9.75f, 9.57f, 7.92f, 10.4f, 6.5f)
                reflectiveCurveTo(13.07f, 4.56f, 14.5f, 5.38f)
                reflectiveCurveTo(16.43f, 8.05f, 15.6f, 9.5f)
                close()
            }
        }
        .build()
        return _headLightbulb!!
    }

private var _headLightbulb: ImageVector? = null
