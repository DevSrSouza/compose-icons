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

public val MaterialDesignIcons.HomeCircle: ImageVector
    get() {
        if (_homeCircle != null) {
            return _homeCircle!!
        }
        _homeCircle = Builder(name = "HomeCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.07f, 4.93f)
                curveTo(17.22f, 3.0f, 14.66f, 1.96f, 12.0f, 2.0f)
                curveTo(9.34f, 1.96f, 6.79f, 3.0f, 4.94f, 4.93f)
                curveTo(3.0f, 6.78f, 1.96f, 9.34f, 2.0f, 12.0f)
                curveTo(1.96f, 14.66f, 3.0f, 17.21f, 4.93f, 19.06f)
                curveTo(6.78f, 21.0f, 9.34f, 22.04f, 12.0f, 22.0f)
                curveTo(14.66f, 22.04f, 17.21f, 21.0f, 19.06f, 19.07f)
                curveTo(21.0f, 17.22f, 22.04f, 14.66f, 22.0f, 12.0f)
                curveTo(22.04f, 9.34f, 21.0f, 6.78f, 19.07f, 4.93f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(19.5f, 12.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _homeCircle!!
    }

private var _homeCircle: ImageVector? = null
