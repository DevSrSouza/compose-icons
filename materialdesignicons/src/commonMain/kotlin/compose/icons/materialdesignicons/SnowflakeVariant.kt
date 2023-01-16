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

public val MaterialDesignIcons.SnowflakeVariant: ImageVector
    get() {
        if (_snowflakeVariant != null) {
            return _snowflakeVariant!!
        }
        _snowflakeVariant = Builder(name = "SnowflakeVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 12.0f)
                lineTo(16.27f, 11.0f)
                horizontalLineTo(23.0f)
                lineTo(22.0f, 9.0f)
                horizontalLineTo(18.03f)
                lineTo(20.42f, 5.83f)
                lineTo(19.43f, 3.83f)
                lineTo(15.37f, 9.2f)
                lineTo(13.35f, 10.21f)
                lineTo(13.75f, 8.0f)
                lineTo(17.83f, 2.62f)
                lineTo(15.64f, 2.22f)
                lineTo(12.0f, 7.0f)
                lineTo(8.4f, 2.2f)
                lineTo(6.2f, 2.6f)
                lineTo(10.26f, 8.0f)
                lineTo(10.66f, 10.21f)
                lineTo(8.82f, 9.29f)
                lineTo(8.66f, 9.21f)
                lineTo(4.6f, 3.8f)
                lineTo(3.6f, 5.8f)
                lineTo(6.0f, 9.0f)
                horizontalLineTo(2.0f)
                lineTo(1.0f, 11.0f)
                horizontalLineTo(7.77f)
                lineTo(9.75f, 12.0f)
                lineTo(7.73f, 13.0f)
                horizontalLineTo(1.0f)
                lineTo(2.0f, 15.0f)
                horizontalLineTo(5.97f)
                lineTo(3.58f, 18.17f)
                lineTo(4.57f, 20.17f)
                lineTo(8.63f, 14.8f)
                lineTo(10.65f, 13.79f)
                lineTo(10.25f, 16.0f)
                lineTo(6.17f, 21.38f)
                lineTo(8.36f, 21.79f)
                lineTo(12.0f, 17.0f)
                lineTo(15.6f, 21.8f)
                lineTo(17.8f, 21.4f)
                lineTo(13.74f, 16.0f)
                lineTo(13.34f, 13.79f)
                lineTo(15.34f, 14.79f)
                lineTo(19.4f, 20.2f)
                lineTo(20.4f, 18.2f)
                lineTo(18.0f, 15.0f)
                horizontalLineTo(22.0f)
                lineTo(23.0f, 13.0f)
                horizontalLineTo(16.23f)
            }
        }
        .build()
        return _snowflakeVariant!!
    }

private var _snowflakeVariant: ImageVector? = null
