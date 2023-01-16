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

public val MaterialDesignIcons.ImagePlusOutline: ImageVector
    get() {
        if (_imagePlusOutline != null) {
            return _imagePlusOutline!!
        }
        _imagePlusOutline = Builder(name = "ImagePlusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 19.7f, 13.13f, 20.37f, 13.35f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13.0f, 19.0f, 13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                moveTo(13.96f, 12.29f)
                lineTo(11.21f, 15.83f)
                lineTo(9.25f, 13.47f)
                lineTo(6.5f, 17.0f)
                horizontalLineTo(13.35f)
                curveTo(13.75f, 15.88f, 14.47f, 14.91f, 15.4f, 14.21f)
                lineTo(13.96f, 12.29f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _imagePlusOutline!!
    }

private var _imagePlusOutline: ImageVector? = null
