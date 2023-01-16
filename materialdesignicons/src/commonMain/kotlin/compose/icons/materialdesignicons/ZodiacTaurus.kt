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

public val MaterialDesignIcons.ZodiacTaurus: ImageVector
    get() {
        if (_zodiacTaurus != null) {
            return _zodiacTaurus!!
        }
        _zodiacTaurus = Builder(name = "ZodiacTaurus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.59f, 9.0f)
                curveTo(17.7f, 7.74f, 19.0f, 5.46f, 19.0f, 3.0f)
                horizontalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 5.46f, 6.3f, 7.74f, 8.41f, 9.0f)
                curveTo(5.09f, 11.0f, 4.0f, 15.28f, 6.0f, 18.6f)
                curveTo(7.97f, 21.92f, 12.27f, 23.0f, 15.59f, 21.0f)
                curveTo(18.91f, 19.04f, 20.0f, 14.74f, 18.0f, 11.42f)
                curveTo(17.42f, 10.43f, 16.58f, 9.59f, 15.59f, 9.0f)
                moveTo(12.0f, 20.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _zodiacTaurus!!
    }

private var _zodiacTaurus: ImageVector? = null
