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

public val MaterialDesignIcons.RadioactiveCircleOutline: ImageVector
    get() {
        if (_radioactiveCircleOutline != null) {
            return _radioactiveCircleOutline!!
        }
        _radioactiveCircleOutline = Builder(name = "RadioactiveCircleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(14.65f, 2.0f, 17.2f, 3.05f, 19.07f, 4.93f)
                curveTo(20.95f, 6.8f, 22.0f, 9.35f, 22.0f, 12.0f)
                curveTo(22.0f, 14.65f, 20.95f, 17.2f, 19.07f, 19.07f)
                curveTo(17.2f, 20.95f, 14.65f, 22.0f, 12.0f, 22.0f)
                curveTo(9.35f, 22.0f, 6.8f, 20.95f, 4.93f, 19.07f)
                curveTo(3.05f, 17.2f, 2.0f, 14.65f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 9.88f, 19.16f, 7.84f, 17.66f, 6.34f)
                curveTo(16.16f, 4.84f, 14.12f, 4.0f, 12.0f, 4.0f)
                moveTo(13.5f, 14.0f)
                lineTo(15.55f, 16.84f)
                curveTo(14.55f, 17.57f, 13.33f, 18.0f, 12.0f, 18.0f)
                curveTo(10.67f, 18.0f, 9.45f, 17.57f, 8.45f, 16.84f)
                lineTo(10.5f, 14.0f)
                curveTo(10.94f, 14.32f, 11.45f, 14.5f, 12.0f, 14.5f)
                curveTo(12.55f, 14.5f, 13.06f, 14.32f, 13.5f, 14.0f)
                moveTo(12.0f, 11.0f)
                curveTo(12.55f, 11.0f, 13.0f, 11.45f, 13.0f, 12.0f)
                curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f)
                curveTo(11.45f, 13.0f, 11.0f, 12.55f, 11.0f, 12.0f)
                curveTo(11.0f, 11.45f, 11.45f, 11.0f, 12.0f, 11.0f)
                moveTo(9.32f, 6.63f)
                lineTo(10.88f, 9.76f)
                curveTo(10.06f, 10.17f, 9.5f, 11.0f, 9.5f, 12.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 9.65f, 7.35f, 7.62f, 9.32f, 6.63f)
                moveTo(14.68f, 6.63f)
                curveTo(16.65f, 7.62f, 18.0f, 9.65f, 18.0f, 12.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 11.0f, 13.94f, 10.17f, 13.12f, 9.76f)
                lineTo(14.68f, 6.63f)
                close()
            }
        }
        .build()
        return _radioactiveCircleOutline!!
    }

private var _radioactiveCircleOutline: ImageVector? = null
