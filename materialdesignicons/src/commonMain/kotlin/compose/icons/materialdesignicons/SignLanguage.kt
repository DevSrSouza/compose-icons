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

public val MaterialDesignIcons.SignLanguage: ImageVector
    get() {
        if (_signLanguage != null) {
            return _signLanguage!!
        }
        _signLanguage = Builder(name = "SignLanguage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                curveTo(7.9f, 3.6f, 8.5f, 3.6f, 8.9f, 4.0f)
                lineTo(11.8f, 7.0f)
                curveTo(11.0f, 7.4f, 10.6f, 7.6f, 10.2f, 8.2f)
                lineTo(7.5f, 5.5f)
                curveTo(7.1f, 5.1f, 7.1f, 4.4f, 7.5f, 4.0f)
                moveTo(6.3f, 7.2f)
                curveTo(6.7f, 6.8f, 7.3f, 6.8f, 7.7f, 7.2f)
                lineTo(9.6f, 9.2f)
                curveTo(9.4f, 9.8f, 9.3f, 10.5f, 9.4f, 11.0f)
                horizontalLineTo(8.6f)
                lineTo(6.3f, 8.6f)
                curveTo(5.9f, 8.2f, 5.9f, 7.6f, 6.3f, 7.2f)
                moveTo(19.0f, 21.5f)
                curveTo(19.0f, 22.9f, 17.9f, 24.0f, 16.5f, 24.0f)
                horizontalLineTo(5.5f)
                curveTo(5.0f, 24.0f, 4.5f, 23.5f, 4.5f, 23.0f)
                reflectiveCurveTo(5.0f, 22.0f, 5.5f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.5f, 21.0f, 3.0f, 20.5f, 3.0f, 20.0f)
                reflectiveCurveTo(3.5f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.5f, 18.0f, 2.0f, 17.5f, 2.0f, 17.0f)
                reflectiveCurveTo(2.5f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.5f)
                curveTo(4.0f, 15.0f, 3.5f, 14.5f, 3.5f, 14.0f)
                reflectiveCurveTo(4.0f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(12.5f)
                lineTo(11.6f, 11.1f)
                curveTo(11.2f, 10.4f, 11.5f, 9.5f, 12.3f, 9.1f)
                lineTo(12.5f, 9.0f)
                lineTo(18.2f, 14.5f)
                curveTo(18.7f, 15.0f, 19.0f, 15.6f, 19.0f, 16.3f)
                verticalLineTo(21.5f)
                moveTo(22.0f, 11.3f)
                curveTo(22.0f, 12.0f, 21.7f, 12.6f, 21.2f, 13.1f)
                lineTo(20.3f, 13.9f)
                curveTo(20.1f, 13.6f, 19.9f, 13.3f, 19.6f, 13.0f)
                lineTo(19.0f, 12.4f)
                lineTo(15.4f, 9.0f)
                lineTo(12.7f, 6.6f)
                lineTo(8.9f, 2.6f)
                curveTo(8.5f, 2.2f, 8.5f, 1.6f, 8.9f, 1.2f)
                curveTo(9.3f, 0.8f, 9.9f, 0.8f, 10.3f, 1.2f)
                lineTo(15.1f, 6.3f)
                lineTo(15.8f, 5.6f)
                lineTo(12.0f, 1.6f)
                curveTo(11.6f, 1.2f, 11.6f, 0.6f, 12.0f, 0.2f)
                reflectiveCurveTo(13.0f, -0.2f, 13.4f, 0.2f)
                lineTo(18.9f, 6.0f)
                lineTo(19.6f, 4.0f)
                curveTo(20.1f, 3.4f, 21.0f, 3.0f, 21.7f, 3.2f)
                lineTo(22.0f, 3.3f)
                verticalLineTo(11.3f)
                close()
            }
        }
        .build()
        return _signLanguage!!
    }

private var _signLanguage: ImageVector? = null
