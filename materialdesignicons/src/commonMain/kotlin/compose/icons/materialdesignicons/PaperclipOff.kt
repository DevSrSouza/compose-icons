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

public val MaterialDesignIcons.PaperclipOff: ImageVector
    get() {
        if (_paperclipOff != null) {
            return _paperclipOff!!
        }
        _paperclipOff = Builder(name = "PaperclipOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.3f)
                lineTo(7.16f, 3.96f)
                curveTo(7.62f, 2.26f, 9.15f, 1.0f, 11.0f, 1.0f)
                curveTo(13.21f, 1.0f, 15.0f, 2.79f, 15.0f, 5.0f)
                verticalLineTo(11.8f)
                lineTo(13.5f, 10.3f)
                verticalLineTo(5.0f)
                curveTo(13.5f, 3.62f, 12.38f, 2.5f, 11.0f, 2.5f)
                reflectiveCurveTo(8.5f, 3.62f, 8.5f, 5.0f)
                verticalLineTo(5.3f)
                moveTo(18.0f, 6.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.3f)
                lineTo(18.0f, 14.8f)
                verticalLineTo(6.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.62f, 19.5f)
                curveTo(16.81f, 21.55f, 14.83f, 23.0f, 12.5f, 23.0f)
                curveTo(9.46f, 23.0f, 7.0f, 20.54f, 7.0f, 17.5f)
                verticalLineTo(8.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11.5f, 15.5f)
                curveTo(11.5f, 16.05f, 11.95f, 16.5f, 12.5f, 16.5f)
                reflectiveCurveTo(13.5f, 16.05f, 13.5f, 15.5f)
                verticalLineTo(15.39f)
                lineTo(11.5f, 13.39f)
                verticalLineTo(15.5f)
                moveTo(16.42f, 18.31f)
                lineTo(14.73f, 16.62f)
                curveTo(14.32f, 17.43f, 13.5f, 18.0f, 12.5f, 18.0f)
                curveTo(11.12f, 18.0f, 10.0f, 16.88f, 10.0f, 15.5f)
                verticalLineTo(11.89f)
                lineTo(8.5f, 10.39f)
                verticalLineTo(17.5f)
                curveTo(8.5f, 19.71f, 10.29f, 21.5f, 12.5f, 21.5f)
                curveTo(14.43f, 21.5f, 16.04f, 20.13f, 16.42f, 18.31f)
                moveTo(10.0f, 6.8f)
                lineTo(11.5f, 8.3f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.8f)
                close()
            }
        }
        .build()
        return _paperclipOff!!
    }

private var _paperclipOff: ImageVector? = null
