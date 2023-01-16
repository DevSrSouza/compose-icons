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

public val MaterialDesignIcons.ZodiacCancer: ImageVector
    get() {
        if (_zodiacCancer != null) {
            return _zodiacCancer!!
        }
        _zodiacCancer = Builder(name = "ZodiacCancer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(6.5f, 4.0f, 2.0f, 7.58f, 2.0f, 12.0f)
                curveTo(2.0f, 14.12f, 3.65f, 15.87f, 5.76f, 16.0f)
                horizontalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 8.0f)
                horizontalLineTo(5.76f)
                curveTo(7.44f, 6.41f, 9.69f, 5.55f, 12.0f, 5.6f)
                curveTo(13.77f, 5.58f, 15.5f, 6.07f, 17.0f, 7.0f)
                lineTo(18.25f, 5.75f)
                curveTo(16.38f, 4.58f, 14.21f, 3.97f, 12.0f, 4.0f)
                moveTo(6.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 12.0f)
                curveTo(8.0f, 13.11f, 7.08f, 14.0f, 6.0f, 14.0f)
                curveTo(4.96f, 14.0f, 4.1f, 13.22f, 4.0f, 12.2f)
                curveTo(4.0f, 12.07f, 4.0f, 11.93f, 4.0f, 11.8f)
                curveTo(4.1f, 10.77f, 4.97f, 10.0f, 6.0f, 10.0f)
                moveTo(18.24f, 8.0f)
                horizontalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 16.0f)
                horizontalLineTo(18.24f)
                curveTo(16.56f, 17.59f, 14.31f, 18.45f, 12.0f, 18.4f)
                curveTo(10.23f, 18.42f, 8.5f, 17.93f, 7.0f, 17.0f)
                lineTo(5.76f, 18.24f)
                curveTo(7.63f, 19.41f, 9.79f, 20.0f, 12.0f, 20.0f)
                curveTo(17.5f, 20.0f, 22.0f, 16.42f, 22.0f, 12.0f)
                curveTo(22.0f, 9.88f, 20.35f, 8.13f, 18.24f, 8.0f)
                moveTo(18.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 12.0f)
                curveTo(16.0f, 10.89f, 16.92f, 10.0f, 18.0f, 10.0f)
                curveTo(19.04f, 10.0f, 19.9f, 10.78f, 20.0f, 11.8f)
                curveTo(20.0f, 11.93f, 20.0f, 12.07f, 20.0f, 12.2f)
                curveTo(19.9f, 13.23f, 19.03f, 14.0f, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _zodiacCancer!!
    }

private var _zodiacCancer: ImageVector? = null
