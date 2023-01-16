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

public val MaterialDesignIcons.EmoticonKissOutline: ImageVector
    get() {
        if (_emoticonKissOutline != null) {
            return _emoticonKissOutline!!
        }
        _emoticonKissOutline = Builder(name = "EmoticonKissOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.5f)
                curveTo(9.0f, 10.3f, 8.3f, 11.0f, 7.5f, 11.0f)
                curveTo(6.7f, 11.0f, 6.0f, 10.3f, 6.0f, 9.5f)
                curveTo(6.0f, 8.7f, 6.7f, 8.0f, 7.5f, 8.0f)
                curveTo(8.3f, 8.0f, 9.0f, 8.7f, 9.0f, 9.5f)
                moveTo(16.0f, 9.5f)
                curveTo(16.0f, 10.3f, 15.3f, 11.0f, 14.5f, 11.0f)
                curveTo(13.7f, 11.0f, 13.0f, 10.3f, 13.0f, 9.5f)
                curveTo(13.0f, 8.7f, 13.7f, 8.0f, 14.5f, 8.0f)
                curveTo(15.3f, 8.0f, 16.0f, 8.7f, 16.0f, 9.5f)
                moveTo(14.0f, 14.12f)
                lineTo(11.88f, 12.0f)
                lineTo(10.82f, 13.06f)
                lineTo(11.88f, 14.12f)
                lineTo(10.82f, 15.18f)
                lineTo(11.88f, 16.24f)
                lineTo(10.82f, 17.3f)
                lineTo(11.88f, 18.36f)
                lineTo(14.0f, 16.24f)
                lineTo(12.94f, 15.18f)
                lineTo(14.0f, 14.12f)
                moveTo(16.85f, 13.0f)
                arcTo(2.05f, 2.05f, 0.0f, false, false, 14.8f, 15.05f)
                curveTo(14.8f, 15.62f, 15.03f, 16.12f, 15.4f, 16.5f)
                lineTo(18.9f, 20.0f)
                lineTo(22.4f, 16.5f)
                curveTo(22.77f, 16.13f, 23.0f, 15.61f, 23.0f, 15.05f)
                arcTo(2.05f, 2.05f, 0.0f, false, false, 20.95f, 13.0f)
                curveTo(20.4f, 13.0f, 19.87f, 13.23f, 19.5f, 13.6f)
                lineTo(18.9f, 14.2f)
                lineTo(18.3f, 13.61f)
                curveTo(17.93f, 13.23f, 17.4f, 13.0f, 16.85f, 13.0f)
                moveTo(15.0f, 18.92f)
                curveTo(13.82f, 19.6f, 12.46f, 20.0f, 11.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 3.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 11.0f, 4.0f)
                curveTo(15.26f, 4.0f, 18.73f, 7.33f, 19.0f, 11.5f)
                curveTo(19.58f, 11.19f, 20.26f, 11.0f, 20.95f, 11.0f)
                curveTo(20.45f, 5.95f, 16.18f, 2.0f, 11.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 1.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 11.0f, 22.0f)
                curveTo(13.0f, 22.0f, 14.88f, 21.4f, 16.45f, 20.38f)
                lineTo(15.0f, 18.92f)
                close()
            }
        }
        .build()
        return _emoticonKissOutline!!
    }

private var _emoticonKissOutline: ImageVector? = null
