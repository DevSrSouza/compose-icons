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

public val MaterialDesignIcons.PhoneClassic: ImageVector
    get() {
        if (_phoneClassic != null) {
            return _phoneClassic!!
        }
        _phoneClassic = Builder(name = "PhoneClassic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.46f, 3.0f, 3.34f, 4.78f, 0.29f, 7.67f)
                curveTo(0.11f, 7.85f, 0.0f, 8.1f, 0.0f, 8.38f)
                curveTo(0.0f, 8.66f, 0.11f, 8.91f, 0.29f, 9.09f)
                lineTo(2.77f, 11.57f)
                curveTo(2.95f, 11.75f, 3.2f, 11.86f, 3.5f, 11.86f)
                curveTo(3.75f, 11.86f, 4.0f, 11.75f, 4.18f, 11.58f)
                curveTo(4.97f, 10.84f, 5.87f, 10.22f, 6.84f, 9.73f)
                curveTo(7.17f, 9.57f, 7.4f, 9.23f, 7.4f, 8.83f)
                verticalLineTo(5.73f)
                curveTo(8.85f, 5.25f, 10.39f, 5.0f, 12.0f, 5.0f)
                curveTo(13.59f, 5.0f, 15.14f, 5.25f, 16.59f, 5.72f)
                verticalLineTo(8.82f)
                curveTo(16.59f, 9.21f, 16.82f, 9.56f, 17.15f, 9.72f)
                curveTo(18.13f, 10.21f, 19.0f, 10.84f, 19.82f, 11.57f)
                curveTo(20.0f, 11.75f, 20.25f, 11.85f, 20.5f, 11.85f)
                curveTo(20.8f, 11.85f, 21.05f, 11.74f, 21.23f, 11.56f)
                lineTo(23.71f, 9.08f)
                curveTo(23.89f, 8.9f, 24.0f, 8.65f, 24.0f, 8.37f)
                curveTo(24.0f, 8.09f, 23.88f, 7.85f, 23.7f, 7.67f)
                curveTo(20.65f, 4.78f, 16.53f, 3.0f, 12.0f, 3.0f)
                moveTo(9.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 10.0f, 3.0f, 15.0f, 3.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 15.0f, 15.0f, 10.0f, 15.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                moveTo(12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 12.0f)
                moveTo(12.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _phoneClassic!!
    }

private var _phoneClassic: ImageVector? = null
