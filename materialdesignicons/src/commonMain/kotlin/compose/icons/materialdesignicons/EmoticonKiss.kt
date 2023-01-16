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

public val MaterialDesignIcons.EmoticonKiss: ImageVector
    get() {
        if (_emoticonKiss != null) {
            return _emoticonKiss!!
        }
        _emoticonKiss = Builder(name = "EmoticonKiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9f, 18.94f)
                lineTo(15.94f, 16.0f)
                curveTo(15.76f, 15.79f, 15.55f, 15.5f, 15.55f, 15.05f)
                arcTo(1.3f, 1.3f, 0.0f, false, true, 16.85f, 13.75f)
                curveTo(17.19f, 13.75f, 17.53f, 13.89f, 17.77f, 14.15f)
                lineTo(18.91f, 15.26f)
                lineTo(20.03f, 14.13f)
                curveTo(20.27f, 13.89f, 20.61f, 13.75f, 20.95f, 13.75f)
                arcTo(1.3f, 1.3f, 0.0f, false, true, 22.25f, 15.05f)
                curveTo(22.25f, 15.39f, 22.11f, 15.73f, 21.87f, 15.97f)
                lineTo(18.9f, 18.94f)
                moveTo(17.46f, 19.62f)
                curveTo(15.72f, 21.1f, 13.47f, 22.0f, 11.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 1.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 11.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 21.0f, 12.0f)
                curveTo(21.0f, 12.09f, 21.0f, 12.17f, 20.95f, 12.25f)
                curveTo(20.21f, 12.25f, 19.5f, 12.55f, 18.97f, 13.07f)
                lineTo(18.9f, 13.14f)
                lineTo(18.84f, 13.09f)
                curveTo(18.32f, 12.55f, 17.6f, 12.25f, 16.85f, 12.25f)
                arcTo(2.8f, 2.8f, 0.0f, false, false, 14.05f, 15.05f)
                curveTo(14.05f, 15.78f, 14.34f, 16.5f, 14.87f, 17.03f)
                lineTo(17.46f, 19.62f)
                moveTo(13.0f, 9.5f)
                curveTo(13.0f, 10.3f, 13.7f, 11.0f, 14.5f, 11.0f)
                curveTo(15.3f, 11.0f, 16.0f, 10.3f, 16.0f, 9.5f)
                curveTo(16.0f, 8.7f, 15.3f, 8.0f, 14.5f, 8.0f)
                curveTo(13.7f, 8.0f, 13.0f, 8.7f, 13.0f, 9.5f)
                moveTo(9.0f, 9.5f)
                curveTo(9.0f, 8.7f, 8.3f, 8.0f, 7.5f, 8.0f)
                curveTo(6.7f, 8.0f, 6.0f, 8.7f, 6.0f, 9.5f)
                curveTo(6.0f, 10.3f, 6.7f, 11.0f, 7.5f, 11.0f)
                curveTo(8.3f, 11.0f, 9.0f, 10.3f, 9.0f, 9.5f)
                moveTo(12.94f, 15.18f)
                lineTo(14.0f, 14.12f)
                lineTo(11.88f, 12.0f)
                lineTo(10.82f, 13.06f)
                lineTo(11.88f, 14.12f)
                lineTo(10.82f, 15.18f)
                lineTo(11.88f, 16.24f)
                lineTo(10.82f, 17.3f)
                lineTo(11.88f, 18.36f)
                lineTo(14.0f, 16.24f)
                lineTo(12.94f, 15.18f)
                close()
            }
        }
        .build()
        return _emoticonKiss!!
    }

private var _emoticonKiss: ImageVector? = null
