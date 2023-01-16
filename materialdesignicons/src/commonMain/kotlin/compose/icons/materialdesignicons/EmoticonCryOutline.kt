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

public val MaterialDesignIcons.EmoticonCryOutline: ImageVector
    get() {
        if (_emoticonCryOutline != null) {
            return _emoticonCryOutline!!
        }
        _emoticonCryOutline = Builder(name = "EmoticonCryOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.57f, 20.0f)
                curveTo(6.23f, 20.0f, 5.14f, 18.91f, 5.14f, 17.57f)
                curveTo(5.14f, 16.5f, 6.32f, 14.5f, 7.57f, 12.81f)
                curveTo(8.82f, 14.5f, 10.0f, 16.5f, 10.0f, 17.57f)
                arcTo(2.43f, 2.43f, 0.0f, false, true, 7.57f, 20.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                curveTo(2.0f, 13.75f, 2.45f, 15.38f, 3.24f, 16.81f)
                curveTo(3.4f, 16.0f, 3.81f, 15.07f, 4.31f, 14.17f)
                curveTo(4.11f, 13.5f, 4.0f, 12.75f, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                curveTo(11.76f, 20.0f, 11.53f, 20.0f, 11.29f, 19.96f)
                curveTo(10.82f, 20.7f, 10.14f, 21.28f, 9.34f, 21.63f)
                curveTo(10.19f, 21.87f, 11.08f, 22.0f, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 14.0f)
                curveTo(11.59f, 14.0f, 11.19f, 14.04f, 10.81f, 14.12f)
                curveTo(11.16f, 14.75f, 11.47f, 15.4f, 11.69f, 16.0f)
                curveTo(11.79f, 16.0f, 11.89f, 16.0f, 12.0f, 16.0f)
                curveTo(13.25f, 16.0f, 14.32f, 16.5f, 14.77f, 17.23f)
                lineTo(16.19f, 15.81f)
                curveTo(15.29f, 14.72f, 13.75f, 14.0f, 12.0f, 14.0f)
                moveTo(15.5f, 8.0f)
                curveTo(14.7f, 8.0f, 14.0f, 8.7f, 14.0f, 9.5f)
                curveTo(14.0f, 10.3f, 14.7f, 11.0f, 15.5f, 11.0f)
                curveTo(16.3f, 11.0f, 17.0f, 10.3f, 17.0f, 9.5f)
                curveTo(17.0f, 8.7f, 16.3f, 8.0f, 15.5f, 8.0f)
                moveTo(10.0f, 9.5f)
                curveTo(10.0f, 8.7f, 9.3f, 8.0f, 8.5f, 8.0f)
                curveTo(7.7f, 8.0f, 7.0f, 8.7f, 7.0f, 9.5f)
                curveTo(7.0f, 10.3f, 7.7f, 11.0f, 8.5f, 11.0f)
                curveTo(9.3f, 11.0f, 10.0f, 10.3f, 10.0f, 9.5f)
            }
        }
        .build()
        return _emoticonCryOutline!!
    }

private var _emoticonCryOutline: ImageVector? = null
