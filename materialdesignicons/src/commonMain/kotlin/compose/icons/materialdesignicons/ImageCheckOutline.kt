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

public val MaterialDesignIcons.ImageCheckOutline: ImageVector
    get() {
        if (_imageCheckOutline != null) {
            return _imageCheckOutline!!
        }
        _imageCheckOutline = Builder(name = "ImageCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.18f, 17.0f)
                curveTo(12.54f, 15.5f, 13.43f, 14.16f, 14.68f, 13.25f)
                lineTo(13.96f, 12.29f)
                lineTo(11.21f, 15.83f)
                lineTo(9.25f, 13.47f)
                lineTo(6.5f, 17.0f)
                horizontalLineTo(12.18f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.03f)
                curveTo(12.09f, 19.7f, 12.24f, 20.38f, 12.5f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.47f, 21.0f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3.0f, 19.53f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.53f, 3.0f, 20.04f, 3.21f, 20.41f, 3.59f)
                curveTo(20.79f, 3.96f, 21.0f, 4.47f, 21.0f, 5.0f)
                verticalLineTo(12.5f)
                curveTo(20.38f, 12.24f, 19.7f, 12.09f, 19.0f, 12.03f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
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
        return _imageCheckOutline!!
    }

private var _imageCheckOutline: ImageVector? = null
