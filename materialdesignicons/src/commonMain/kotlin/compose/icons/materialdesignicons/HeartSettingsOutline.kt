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

public val MaterialDesignIcons.HeartSettingsOutline: ImageVector
    get() {
        if (_heartSettingsOutline != null) {
            return _heartSettingsOutline!!
        }
        _heartSettingsOutline = Builder(name = "HeartSettingsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                moveTo(22.0f, 8.5f)
                curveTo(22.0f, 12.27f, 18.6f, 15.36f, 13.45f, 20.03f)
                lineTo(12.0f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2.0f, 12.27f, 2.0f, 8.5f)
                curveTo(2.0f, 5.41f, 4.42f, 3.0f, 7.5f, 3.0f)
                curveTo(9.24f, 3.0f, 10.91f, 3.81f, 12.0f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f)
                curveTo(19.58f, 3.0f, 22.0f, 5.41f, 22.0f, 8.5f)
                moveTo(20.0f, 8.5f)
                curveTo(20.0f, 6.5f, 18.5f, 5.0f, 16.5f, 5.0f)
                curveTo(14.96f, 5.0f, 13.46f, 6.0f, 12.93f, 7.36f)
                horizontalLineTo(11.07f)
                curveTo(10.54f, 6.0f, 9.04f, 5.0f, 7.5f, 5.0f)
                curveTo(5.5f, 5.0f, 4.0f, 6.5f, 4.0f, 8.5f)
                curveTo(4.0f, 11.39f, 7.14f, 14.24f, 11.89f, 18.55f)
                lineTo(12.0f, 18.65f)
                lineTo(12.1f, 18.55f)
                curveTo(16.86f, 14.24f, 20.0f, 11.39f, 20.0f, 8.5f)
                close()
            }
        }
        .build()
        return _heartSettingsOutline!!
    }

private var _heartSettingsOutline: ImageVector? = null
