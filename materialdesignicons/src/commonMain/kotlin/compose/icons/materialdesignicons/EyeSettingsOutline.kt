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

public val MaterialDesignIcons.EyeSettingsOutline: ImageVector
    get() {
        if (_eyeSettingsOutline != null) {
            return _eyeSettingsOutline!!
        }
        _eyeSettingsOutline = Builder(name = "EyeSettingsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(12.0f, 4.5f)
                curveTo(16.86f, 4.5f, 21.22f, 7.5f, 23.0f, 12.0f)
                curveTo(20.61f, 18.08f, 13.75f, 21.06f, 7.67f, 18.67f)
                curveTo(4.62f, 17.47f, 2.2f, 15.06f, 1.0f, 12.0f)
                curveTo(2.78f, 7.5f, 7.14f, 4.5f, 12.0f, 4.5f)
                moveTo(3.18f, 12.0f)
                curveTo(5.56f, 16.87f, 11.45f, 18.89f, 16.32f, 16.5f)
                curveTo(18.28f, 15.54f, 19.86f, 13.96f, 20.82f, 12.0f)
                curveTo(18.44f, 7.13f, 12.55f, 5.11f, 7.68f, 7.5f)
                curveTo(5.72f, 8.46f, 4.14f, 10.04f, 3.18f, 12.0f)
                moveTo(9.0f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                moveTo(13.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _eyeSettingsOutline!!
    }

private var _eyeSettingsOutline: ImageVector? = null
