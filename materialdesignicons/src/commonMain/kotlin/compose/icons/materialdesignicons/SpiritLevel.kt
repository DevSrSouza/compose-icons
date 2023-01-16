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

public val MaterialDesignIcons.SpiritLevel: ImageVector
    get() {
        if (_spiritLevel != null) {
            return _spiritLevel!!
        }
        _spiritLevel = Builder(name = "SpiritLevel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                moveTo(18.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                moveTo(11.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 12.0f, 15.0f, 11.11f, 15.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 11.11f, 9.9f, 12.0f, 11.0f, 12.0f)
                moveTo(4.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _spiritLevel!!
    }

private var _spiritLevel: ImageVector? = null
