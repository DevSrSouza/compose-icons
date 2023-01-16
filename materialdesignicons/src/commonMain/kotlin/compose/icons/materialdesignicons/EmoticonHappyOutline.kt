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

public val MaterialDesignIcons.EmoticonHappyOutline: ImageVector
    get() {
        if (_emoticonHappyOutline != null) {
            return _emoticonHappyOutline!!
        }
        _emoticonHappyOutline = Builder(name = "EmoticonHappyOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(10.0f, 9.5f)
                curveTo(10.0f, 10.3f, 9.3f, 11.0f, 8.5f, 11.0f)
                curveTo(7.7f, 11.0f, 7.0f, 10.3f, 7.0f, 9.5f)
                curveTo(7.0f, 8.7f, 7.7f, 8.0f, 8.5f, 8.0f)
                curveTo(9.3f, 8.0f, 10.0f, 8.7f, 10.0f, 9.5f)
                moveTo(17.0f, 9.5f)
                curveTo(17.0f, 10.3f, 16.3f, 11.0f, 15.5f, 11.0f)
                curveTo(14.7f, 11.0f, 14.0f, 10.3f, 14.0f, 9.5f)
                curveTo(14.0f, 8.7f, 14.7f, 8.0f, 15.5f, 8.0f)
                curveTo(16.3f, 8.0f, 17.0f, 8.7f, 17.0f, 9.5f)
                moveTo(12.0f, 17.23f)
                curveTo(10.25f, 17.23f, 8.71f, 16.5f, 7.81f, 15.42f)
                lineTo(9.23f, 14.0f)
                curveTo(9.68f, 14.72f, 10.75f, 15.23f, 12.0f, 15.23f)
                curveTo(13.25f, 15.23f, 14.32f, 14.72f, 14.77f, 14.0f)
                lineTo(16.19f, 15.42f)
                curveTo(15.29f, 16.5f, 13.75f, 17.23f, 12.0f, 17.23f)
                close()
            }
        }
        .build()
        return _emoticonHappyOutline!!
    }

private var _emoticonHappyOutline: ImageVector? = null
