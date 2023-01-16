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

public val MaterialDesignIcons.EmoticonCool: ImageVector
    get() {
        if (_emoticonCool != null) {
            return _emoticonCool!!
        }
        _emoticonCool = Builder(name = "EmoticonCool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.22f, 7.22f)
                curveTo(4.91f, 4.11f, 8.21f, 2.0f, 12.0f, 2.0f)
                curveTo(15.79f, 2.0f, 19.09f, 4.11f, 20.78f, 7.22f)
                lineTo(20.0f, 8.0f)
                horizontalLineTo(4.0f)
                lineTo(3.22f, 7.22f)
                moveTo(21.4f, 8.6f)
                curveTo(21.78f, 9.67f, 22.0f, 10.81f, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 10.81f, 2.22f, 9.67f, 2.6f, 8.6f)
                lineTo(4.0f, 10.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 11.38f, 7.12f, 12.5f, 8.5f, 12.5f)
                curveTo(9.88f, 12.5f, 11.25f, 11.38f, 11.25f, 10.0f)
                horizontalLineTo(12.75f)
                curveTo(12.75f, 11.38f, 14.12f, 12.5f, 15.5f, 12.5f)
                curveTo(16.88f, 12.5f, 19.0f, 11.38f, 19.0f, 10.0f)
                horizontalLineTo(20.0f)
                lineTo(21.4f, 8.6f)
                moveTo(16.19f, 15.42f)
                lineTo(14.77f, 14.0f)
                curveTo(14.32f, 14.72f, 13.25f, 15.23f, 12.0f, 15.23f)
                curveTo(10.75f, 15.23f, 9.68f, 14.72f, 9.23f, 14.0f)
                lineTo(7.81f, 15.42f)
                curveTo(8.71f, 16.5f, 10.25f, 17.23f, 12.0f, 17.23f)
                curveTo(13.75f, 17.23f, 15.29f, 16.5f, 16.19f, 15.42f)
                close()
            }
        }
        .build()
        return _emoticonCool!!
    }

private var _emoticonCool: ImageVector? = null
