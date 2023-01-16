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

public val MaterialDesignIcons.HandPeaceVariant: ImageVector
    get() {
        if (_handPeaceVariant != null) {
            return _handPeaceVariant!!
        }
        _handPeaceVariant = Builder(name = "HandPeaceVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                moveTo(16.94f, 1.0f)
                curveTo(16.4f, 0.91f, 15.87f, 1.25f, 15.76f, 1.8f)
                lineTo(14.75f, 7.57f)
                curveTo(14.53f, 7.54f, 14.29f, 7.5f, 14.0f, 7.47f)
                lineTo(13.57f, 7.5f)
                lineTo(12.41f, 1.8f)
                curveTo(12.31f, 1.26f, 11.78f, 0.91f, 11.24f, 1.0f)
                curveTo(10.7f, 1.13f, 10.35f, 1.66f, 10.45f, 2.2f)
                lineTo(11.65f, 8.11f)
                lineTo(7.85f, 9.8f)
                curveTo(7.35f, 10.0f, 7.0f, 10.53f, 7.0f, 11.14f)
                verticalLineTo(15.5f)
                curveTo(7.0f, 16.3f, 7.73f, 17.0f, 8.5f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.39f, 17.0f, 15.74f, 16.84f, 16.0f, 16.57f)
                lineTo(16.5f, 16.16f)
                curveTo(16.5f, 16.16f, 17.0f, 15.78f, 17.0f, 15.36f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 13.0f, 17.0f, 11.86f, 16.13f, 11.3f)
                lineTo(17.71f, 2.2f)
                curveTo(17.83f, 1.66f, 17.5f, 1.13f, 16.94f, 1.0f)
                close()
            }
        }
        .build()
        return _handPeaceVariant!!
    }

private var _handPeaceVariant: ImageVector? = null
