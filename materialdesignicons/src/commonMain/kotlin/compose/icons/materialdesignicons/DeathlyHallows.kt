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

public val MaterialDesignIcons.DeathlyHallows: ImageVector
    get() {
        if (_deathlyHallows != null) {
            return _deathlyHallows!!
        }
        _deathlyHallows = Builder(name = "DeathlyHallows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(1.0f, 21.0f)
                horizontalLineTo(23.0f)
                lineTo(12.0f, 2.0f)
                moveTo(12.75f, 11.47f)
                curveTo(14.56f, 11.87f, 15.7f, 13.67f, 15.3f, 15.5f)
                curveTo(15.0f, 16.75f, 14.0f, 17.75f, 12.75f, 18.03f)
                verticalLineTo(11.47f)
                moveTo(11.25f, 18.0f)
                curveTo(9.44f, 17.6f, 8.3f, 15.8f, 8.7f, 14.0f)
                curveTo(9.0f, 12.72f, 10.0f, 11.72f, 11.25f, 11.44f)
                verticalLineTo(18.0f)
                moveTo(16.88f, 14.72f)
                curveTo(16.83f, 12.35f, 15.09f, 10.36f, 12.75f, 10.0f)
                verticalLineTo(6.29f)
                lineTo(20.4f, 19.5f)
                horizontalLineTo(13.07f)
                curveTo(15.29f, 19.0f, 16.87f, 17.03f, 16.88f, 14.75f)
                verticalLineTo(14.72f)
                moveTo(11.25f, 6.29f)
                verticalLineTo(10.0f)
                curveTo(8.6f, 10.4f, 6.77f, 12.88f, 7.18f, 15.54f)
                curveTo(7.5f, 17.5f, 8.97f, 19.12f, 10.93f, 19.55f)
                horizontalLineTo(3.6f)
                lineTo(11.25f, 6.29f)
                close()
            }
        }
        .build()
        return _deathlyHallows!!
    }

private var _deathlyHallows: ImageVector? = null
