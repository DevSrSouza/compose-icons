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

public val MaterialDesignIcons.ClipboardSearchOutline: ImageVector
    get() {
        if (_clipboardSearchOutline != null) {
            return _clipboardSearchOutline!!
        }
        _clipboardSearchOutline = Builder(name = "ClipboardSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.03f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.5f)
                curveTo(19.72f, 9.8f, 20.4f, 10.24f, 21.0f, 10.82f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(13.06f)
                curveTo(12.65f, 20.74f, 12.26f, 20.45f, 11.9f, 20.1f)
                curveTo(11.57f, 19.76f, 11.27f, 19.39f, 11.03f, 19.0f)
                moveTo(12.0f, 3.0f)
                curveTo(12.55f, 3.0f, 13.0f, 3.45f, 13.0f, 4.0f)
                reflectiveCurveTo(12.55f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(11.0f, 4.55f, 11.0f, 4.0f)
                reflectiveCurveTo(11.45f, 3.0f, 12.0f, 3.0f)
                moveTo(20.31f, 17.9f)
                curveTo(20.75f, 17.21f, 21.0f, 16.38f, 21.0f, 15.5f)
                curveTo(21.0f, 13.0f, 19.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(12.0f, 13.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 20.0f, 16.5f, 20.0f)
                curveTo(17.37f, 20.0f, 18.19f, 19.75f, 18.88f, 19.32f)
                lineTo(22.0f, 22.39f)
                lineTo(23.39f, 21.0f)
                lineTo(20.31f, 17.9f)
                moveTo(16.5f, 18.0f)
                curveTo(15.12f, 18.0f, 14.0f, 16.88f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 13.0f, 16.5f, 13.0f)
                reflectiveCurveTo(19.0f, 14.12f, 19.0f, 15.5f)
                reflectiveCurveTo(17.88f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return _clipboardSearchOutline!!
    }

private var _clipboardSearchOutline: ImageVector? = null
