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

public val MaterialDesignIcons.SnowflakeCheck: ImageVector
    get() {
        if (_snowflakeCheck != null) {
            return _snowflakeCheck!!
        }
        _snowflakeCheck = Builder(name = "SnowflakeCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 21.16f)
                lineTo(15.0f, 18.16f)
                lineTo(16.16f, 17.0f)
                lineTo(17.75f, 18.59f)
                lineTo(21.34f, 15.0f)
                lineTo(22.5f, 16.41f)
                lineTo(17.75f, 21.16f)
                moveTo(12.0f, 18.0f)
                curveTo(12.0f, 16.46f, 12.59f, 15.06f, 13.54f, 14.0f)
                lineTo(12.0f, 14.89f)
                lineTo(9.5f, 13.44f)
                verticalLineTo(10.56f)
                lineTo(12.0f, 9.11f)
                lineTo(14.5f, 10.56f)
                verticalLineTo(13.13f)
                curveTo(15.08f, 12.71f, 15.75f, 12.4f, 16.46f, 12.21f)
                verticalLineTo(10.56f)
                lineTo(18.46f, 9.43f)
                lineTo(20.79f, 10.05f)
                lineTo(21.31f, 8.12f)
                lineTo(19.54f, 7.65f)
                lineTo(20.0f, 5.88f)
                lineTo(18.07f, 5.36f)
                lineTo(17.45f, 7.69f)
                lineTo(15.45f, 8.82f)
                lineTo(13.0f, 7.38f)
                verticalLineTo(5.12f)
                lineTo(14.71f, 3.41f)
                lineTo(13.29f, 2.0f)
                lineTo(12.0f, 3.29f)
                lineTo(10.71f, 2.0f)
                lineTo(9.29f, 3.41f)
                lineTo(11.0f, 5.12f)
                verticalLineTo(7.38f)
                lineTo(8.5f, 8.82f)
                lineTo(6.5f, 7.69f)
                lineTo(5.92f, 5.36f)
                lineTo(4.0f, 5.88f)
                lineTo(4.47f, 7.65f)
                lineTo(2.7f, 8.12f)
                lineTo(3.22f, 10.05f)
                lineTo(5.55f, 9.43f)
                lineTo(7.55f, 10.56f)
                verticalLineTo(13.45f)
                lineTo(5.55f, 14.58f)
                lineTo(3.22f, 13.96f)
                lineTo(2.7f, 15.89f)
                lineTo(4.47f, 16.36f)
                lineTo(4.0f, 18.12f)
                lineTo(5.93f, 18.64f)
                lineTo(6.55f, 16.31f)
                lineTo(8.55f, 15.18f)
                lineTo(11.0f, 16.62f)
                verticalLineTo(18.88f)
                lineTo(9.29f, 20.59f)
                lineTo(10.71f, 22.0f)
                lineTo(12.0f, 20.71f)
                lineTo(13.29f, 22.0f)
                lineTo(13.42f, 21.87f)
                curveTo(12.54f, 20.83f, 12.0f, 19.5f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _snowflakeCheck!!
    }

private var _snowflakeCheck: ImageVector? = null
