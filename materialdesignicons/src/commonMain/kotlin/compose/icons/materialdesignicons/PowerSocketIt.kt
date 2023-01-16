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

public val MaterialDesignIcons.PowerSocketIt: ImageVector
    get() {
        if (_powerSocketIt != null) {
            return _powerSocketIt!!
        }
        _powerSocketIt = Builder(name = "PowerSocketIt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 16.5f)
                curveTo(10.5f, 15.68f, 11.17f, 15.0f, 12.0f, 15.0f)
                curveTo(12.83f, 15.0f, 13.5f, 15.68f, 13.5f, 16.5f)
                curveTo(13.5f, 17.34f, 12.83f, 18.0f, 12.0f, 18.0f)
                curveTo(11.17f, 18.0f, 10.5f, 17.34f, 10.5f, 16.5f)
                moveTo(10.5f, 7.5f)
                curveTo(10.5f, 6.67f, 11.17f, 6.0f, 12.0f, 6.0f)
                curveTo(12.83f, 6.0f, 13.5f, 6.67f, 13.5f, 7.5f)
                curveTo(13.5f, 8.33f, 12.83f, 9.0f, 12.0f, 9.0f)
                curveTo(11.17f, 9.0f, 10.5f, 8.33f, 10.5f, 7.5f)
                moveTo(4.22f, 2.0f)
                horizontalLineTo(19.78f)
                curveTo(21.0f, 2.0f, 22.0f, 3.0f, 22.0f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(22.0f, 21.0f, 21.0f, 22.0f, 19.78f, 22.0f)
                horizontalLineTo(4.22f)
                curveTo(3.0f, 22.0f, 2.0f, 21.0f, 2.0f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(2.0f, 3.0f, 3.0f, 2.0f, 4.22f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                moveTo(10.5f, 12.0f)
                curveTo(10.5f, 11.17f, 11.17f, 10.5f, 12.0f, 10.5f)
                curveTo(12.83f, 10.5f, 13.5f, 11.17f, 13.5f, 12.0f)
                curveTo(13.5f, 12.83f, 12.83f, 13.5f, 12.0f, 13.5f)
                curveTo(11.17f, 13.5f, 10.5f, 12.83f, 10.5f, 12.0f)
                close()
            }
        }
        .build()
        return _powerSocketIt!!
    }

private var _powerSocketIt: ImageVector? = null
