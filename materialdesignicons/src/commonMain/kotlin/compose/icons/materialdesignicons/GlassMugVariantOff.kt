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

public val MaterialDesignIcons.GlassMugVariantOff: ImageVector
    get() {
        if (_glassMugVariantOff != null) {
            return _glassMugVariantOff!!
        }
        _glassMugVariantOff = Builder(name = "GlassMugVariantOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.44f, 5.24f)
                lineTo(7.0f, 3.79f)
                curveTo(7.71f, 3.29f, 8.57f, 3.0f, 9.5f, 3.0f)
                curveTo(10.53f, 3.0f, 11.5f, 3.35f, 12.32f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(16.21f, 4.0f, 18.0f, 5.79f, 18.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 10.0f, 21.0f, 10.45f, 21.0f, 11.0f)
                verticalLineTo(17.8f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.8f)
                lineTo(11.26f, 8.06f)
                curveTo(11.5f, 8.0f, 11.73f, 8.0f, 12.0f, 8.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 6.9f, 15.11f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(11.5f)
                curveTo(11.03f, 5.37f, 10.29f, 5.0f, 9.5f, 5.0f)
                curveTo(9.12f, 5.0f, 8.76f, 5.09f, 8.44f, 5.24f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                curveTo(3.79f, 14.0f, 2.0f, 12.21f, 2.0f, 10.0f)
                curveTo(2.0f, 8.37f, 3.0f, 6.94f, 4.44f, 6.33f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(7.19f, 6.54f)
                lineTo(9.61f, 8.96f)
                lineTo(17.0f, 16.34f)
                verticalLineTo(16.35f)
                lineTo(18.65f, 18.0f)
                horizontalLineTo(18.66f)
                lineTo(20.5f, 19.84f)
                verticalLineTo(19.85f)
                lineTo(22.11f, 21.46f)
                moveTo(8.59f, 10.5f)
                lineTo(6.11f, 8.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 8.0f, 4.0f, 8.9f, 4.0f, 10.0f)
                curveTo(4.0f, 11.11f, 4.89f, 12.0f, 6.0f, 12.0f)
                curveTo(6.0f, 12.0f, 7.68f, 12.13f, 8.5f, 10.63f)
                lineTo(8.59f, 10.5f)
                close()
            }
        }
        .build()
        return _glassMugVariantOff!!
    }

private var _glassMugVariantOff: ImageVector? = null
