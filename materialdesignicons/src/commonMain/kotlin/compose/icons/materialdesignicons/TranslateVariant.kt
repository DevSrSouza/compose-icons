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

public val MaterialDesignIcons.TranslateVariant: ImageVector
    get() {
        if (_translateVariant != null) {
            return _translateVariant!!
        }
        _translateVariant = Builder(name = "TranslateVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f)
                verticalLineTo(15.0f)
                lineTo(4.0f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 8.8f, 10.79f, 7.0f, 13.0f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(13.0f, 1.9f, 12.1f, 1.0f, 11.0f, 1.0f)
                moveTo(11.0f, 4.0f)
                lineTo(9.5f, 4.0f)
                curveTo(9.16f, 5.19f, 8.54f, 6.3f, 7.68f, 7.26f)
                lineTo(7.66f, 7.28f)
                lineTo(8.92f, 8.53f)
                lineTo(8.55f, 9.54f)
                lineTo(7.0f, 8.0f)
                lineTo(4.5f, 10.5f)
                lineTo(3.81f, 9.77f)
                lineTo(6.34f, 7.28f)
                curveTo(5.72f, 6.59f, 5.22f, 5.82f, 4.86f, 5.0f)
                horizontalLineTo(5.85f)
                curveTo(6.16f, 5.6f, 6.54f, 6.17f, 7.0f, 6.68f)
                curveTo(7.72f, 5.88f, 8.24f, 4.97f, 8.57f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                moveTo(21.0f, 9.0f)
                horizontalLineTo(13.0f)
                curveTo(11.9f, 9.0f, 11.0f, 9.9f, 11.0f, 11.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 19.1f, 11.9f, 20.0f, 13.0f, 20.0f)
                horizontalLineTo(20.0f)
                lineTo(23.0f, 23.0f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 9.9f, 22.1f, 9.0f, 21.0f, 9.0f)
                moveTo(19.63f, 19.0f)
                lineTo(18.78f, 16.75f)
                horizontalLineTo(15.22f)
                lineTo(14.38f, 19.0f)
                horizontalLineTo(12.88f)
                lineTo(16.25f, 10.0f)
                horizontalLineTo(17.75f)
                lineTo(21.13f, 19.0f)
                horizontalLineTo(19.63f)
                moveTo(17.0f, 12.0f)
                lineTo(18.22f, 15.25f)
                horizontalLineTo(15.79f)
                lineTo(17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _translateVariant!!
    }

private var _translateVariant: ImageVector? = null
