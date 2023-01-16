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

public val MaterialDesignIcons.ContentSaveSettingsOutline: ImageVector
    get() {
        if (_contentSaveSettingsOutline != null) {
            return _contentSaveSettingsOutline!!
        }
        _contentSaveSettingsOutline = Builder(name = "ContentSaveSettingsOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 2.0f, 3.0f, 2.9f, 3.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.1f, 3.89f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 20.0f, 21.0f, 19.1f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                lineTo(17.0f, 2.0f)
                moveTo(19.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.17f)
                lineTo(19.0f, 6.83f)
                verticalLineTo(18.0f)
                moveTo(12.0f, 11.0f)
                curveTo(10.34f, 11.0f, 9.0f, 12.34f, 9.0f, 14.0f)
                reflectiveCurveTo(10.34f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(15.0f, 15.66f, 15.0f, 14.0f)
                reflectiveCurveTo(13.66f, 11.0f, 12.0f, 11.0f)
                moveTo(6.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _contentSaveSettingsOutline!!
    }

private var _contentSaveSettingsOutline: ImageVector? = null
