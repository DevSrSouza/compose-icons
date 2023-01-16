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

public val MaterialDesignIcons.CloudCheckVariantOutline: ImageVector
    get() {
        if (_cloudCheckVariantOutline != null) {
            return _cloudCheckVariantOutline!!
        }
        _cloudCheckVariantOutline = Builder(name = "CloudCheckVariantOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.35f, 17.0f)
                lineTo(16.0f, 11.35f)
                lineTo(14.55f, 9.9f)
                lineTo(10.33f, 14.13f)
                lineTo(8.23f, 12.03f)
                lineTo(6.8f, 13.45f)
                moveTo(6.5f, 20.0f)
                quadTo(4.22f, 20.0f, 2.61f, 18.43f)
                quadTo(1.0f, 16.85f, 1.0f, 14.58f)
                quadTo(1.0f, 12.63f, 2.17f, 11.1f)
                quadTo(3.35f, 9.57f, 5.25f, 9.15f)
                quadTo(5.88f, 6.85f, 7.75f, 5.43f)
                quadTo(9.63f, 4.0f, 12.0f, 4.0f)
                quadTo(14.93f, 4.0f, 16.96f, 6.04f)
                quadTo(19.0f, 8.07f, 19.0f, 11.0f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23.0f, 13.78f, 23.0f, 15.5f)
                quadTo(23.0f, 17.38f, 21.69f, 18.69f)
                quadTo(20.38f, 20.0f, 18.5f, 20.0f)
                moveTo(6.5f, 18.0f)
                horizontalLineTo(18.5f)
                quadTo(19.55f, 18.0f, 20.27f, 17.27f)
                quadTo(21.0f, 16.55f, 21.0f, 15.5f)
                quadTo(21.0f, 14.45f, 20.27f, 13.73f)
                quadTo(19.55f, 13.0f, 18.5f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                quadTo(17.0f, 8.93f, 15.54f, 7.46f)
                quadTo(14.08f, 6.0f, 12.0f, 6.0f)
                quadTo(9.93f, 6.0f, 8.46f, 7.46f)
                quadTo(7.0f, 8.93f, 7.0f, 11.0f)
                horizontalLineTo(6.5f)
                quadTo(5.05f, 11.0f, 4.03f, 12.03f)
                quadTo(3.0f, 13.05f, 3.0f, 14.5f)
                quadTo(3.0f, 15.95f, 4.03f, 17.0f)
                quadTo(5.05f, 18.0f, 6.5f, 18.0f)
                moveTo(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cloudCheckVariantOutline!!
    }

private var _cloudCheckVariantOutline: ImageVector? = null
