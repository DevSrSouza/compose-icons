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

public val MaterialDesignIcons.EmoticonAngry: ImageVector
    get() {
        if (_emoticonAngry != null) {
            return _emoticonAngry!!
        }
        _emoticonAngry = Builder(name = "EmoticonAngry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(7.0f, 9.5f)
                verticalLineTo(8.0f)
                lineTo(10.0f, 9.5f)
                curveTo(10.0f, 10.3f, 9.3f, 11.0f, 8.5f, 11.0f)
                curveTo(7.7f, 11.0f, 7.0f, 10.3f, 7.0f, 9.5f)
                moveTo(14.77f, 17.23f)
                curveTo(14.32f, 16.5f, 13.25f, 16.0f, 12.0f, 16.0f)
                curveTo(10.75f, 16.0f, 9.68f, 16.5f, 9.23f, 17.23f)
                lineTo(7.81f, 15.81f)
                curveTo(8.71f, 14.72f, 10.25f, 14.0f, 12.0f, 14.0f)
                curveTo(13.75f, 14.0f, 15.29f, 14.72f, 16.19f, 15.81f)
                lineTo(14.77f, 17.23f)
                moveTo(17.0f, 9.5f)
                curveTo(17.0f, 10.3f, 16.3f, 11.0f, 15.5f, 11.0f)
                curveTo(14.7f, 11.0f, 14.0f, 10.3f, 14.0f, 9.5f)
                lineTo(17.0f, 8.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _emoticonAngry!!
    }

private var _emoticonAngry: ImageVector? = null
