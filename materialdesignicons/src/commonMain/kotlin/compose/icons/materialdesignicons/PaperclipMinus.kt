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

public val MaterialDesignIcons.PaperclipMinus: ImageVector
    get() {
        if (_paperclipMinus != null) {
            return _paperclipMinus!!
        }
        _paperclipMinus = Builder(name = "PaperclipMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.09f)
                curveTo(17.47f, 13.18f, 16.97f, 13.34f, 16.5f, 13.55f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.09f)
                moveTo(12.5f, 21.5f)
                curveTo(10.29f, 21.5f, 8.5f, 19.71f, 8.5f, 17.5f)
                verticalLineTo(5.0f)
                curveTo(8.5f, 3.62f, 9.62f, 2.5f, 11.0f, 2.5f)
                reflectiveCurveTo(13.5f, 3.62f, 13.5f, 5.0f)
                verticalLineTo(15.5f)
                curveTo(13.5f, 16.05f, 13.05f, 16.5f, 12.5f, 16.5f)
                reflectiveCurveTo(11.5f, 16.05f, 11.5f, 15.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                curveTo(10.0f, 16.88f, 11.12f, 18.0f, 12.5f, 18.0f)
                curveTo(12.71f, 18.0f, 12.91f, 17.97f, 13.1f, 17.92f)
                curveTo(13.35f, 16.58f, 14.03f, 15.41f, 15.0f, 14.54f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 2.79f, 13.21f, 1.0f, 11.0f, 1.0f)
                reflectiveCurveTo(7.0f, 2.79f, 7.0f, 5.0f)
                verticalLineTo(17.5f)
                curveTo(7.0f, 20.54f, 9.46f, 23.0f, 12.5f, 23.0f)
                curveTo(13.13f, 23.0f, 13.73f, 22.89f, 14.29f, 22.7f)
                curveTo(13.97f, 22.29f, 13.7f, 21.84f, 13.5f, 21.36f)
                curveTo(13.17f, 21.44f, 12.84f, 21.5f, 12.5f, 21.5f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _paperclipMinus!!
    }

private var _paperclipMinus: ImageVector? = null
