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

public val MaterialDesignIcons.ImageCheck: ImageVector
    get() {
        if (_imageCheck != null) {
            return _imageCheck!!
        }
        _imageCheck = Builder(name = "ImageCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 21.0f)
                curveTo(12.18f, 20.23f, 12.0f, 19.39f, 12.0f, 18.5f)
                curveTo(12.0f, 18.33f, 12.0f, 18.17f, 12.03f, 18.0f)
                horizontalLineTo(5.0f)
                lineTo(8.5f, 13.5f)
                lineTo(11.0f, 16.5f)
                lineTo(14.5f, 12.0f)
                lineTo(15.19f, 12.92f)
                curveTo(16.16f, 12.34f, 17.29f, 12.0f, 18.5f, 12.0f)
                curveTo(19.39f, 12.0f, 20.23f, 12.18f, 21.0f, 12.5f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 4.47f, 20.79f, 3.96f, 20.41f, 3.59f)
                curveTo(20.04f, 3.21f, 19.53f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 19.53f, 3.21f, 20.04f, 3.59f, 20.41f)
                curveTo(3.96f, 20.79f, 4.47f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(12.5f)
                moveTo(17.75f, 22.0f)
                lineTo(15.0f, 19.0f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                lineTo(17.75f, 22.0f)
                close()
            }
        }
        .build()
        return _imageCheck!!
    }

private var _imageCheck: ImageVector? = null
