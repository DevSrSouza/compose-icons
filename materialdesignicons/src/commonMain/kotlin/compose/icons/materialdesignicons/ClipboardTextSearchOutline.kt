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

public val MaterialDesignIcons.ClipboardTextSearchOutline: ImageVector
    get() {
        if (_clipboardTextSearchOutline != null) {
            return _clipboardTextSearchOutline!!
        }
        _clipboardTextSearchOutline = Builder(name = "ClipboardTextSearchOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                horizontalLineTo(16.5f)
                horizontalLineTo(17.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineTo(10.0f)
                curveTo(10.08f, 14.32f, 10.23f, 13.64f, 10.5f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                moveTo(11.9f, 10.9f)
                curveTo(13.17f, 9.64f, 14.84f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.82f)
                curveTo(11.85f, 10.97f, 11.87f, 10.94f, 11.9f, 10.9f)
                moveTo(11.9f, 20.1f)
                curveTo(12.26f, 20.45f, 12.65f, 20.74f, 13.06f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(9.18f)
                curveTo(9.5f, 2.16f, 10.14f, 1.5f, 11.0f, 1.2f)
                curveTo(12.53f, 0.64f, 14.25f, 1.44f, 14.82f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(10.82f)
                curveTo(20.4f, 10.24f, 19.72f, 9.8f, 19.0f, 9.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.03f)
                curveTo(11.27f, 19.39f, 11.57f, 19.76f, 11.9f, 20.1f)
                moveTo(11.0f, 4.0f)
                curveTo(11.0f, 4.55f, 11.45f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(13.0f, 4.55f, 13.0f, 4.0f)
                reflectiveCurveTo(12.55f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(11.0f, 3.45f, 11.0f, 4.0f)
                moveTo(23.39f, 21.0f)
                lineTo(22.0f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20.0f, 16.5f, 20.0f)
                curveTo(14.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(21.0f, 13.0f, 21.0f, 15.5f)
                curveTo(21.0f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21.0f)
                moveTo(19.0f, 15.5f)
                curveTo(19.0f, 14.12f, 17.88f, 13.0f, 16.5f, 13.0f)
                reflectiveCurveTo(14.0f, 14.12f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 18.0f, 16.5f, 18.0f)
                reflectiveCurveTo(19.0f, 16.88f, 19.0f, 15.5f)
                close()
            }
        }
        .build()
        return _clipboardTextSearchOutline!!
    }

private var _clipboardTextSearchOutline: ImageVector? = null
