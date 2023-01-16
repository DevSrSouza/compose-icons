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

public val MaterialDesignIcons.SurroundSound: ImageVector
    get() {
        if (_surroundSound != null) {
            return _surroundSound!!
        }
        _surroundSound = Builder(name = "SurroundSound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 4.0f)
                moveTo(7.76f, 16.24f)
                lineTo(6.35f, 17.65f)
                curveTo(4.78f, 16.1f, 4.0f, 14.05f, 4.0f, 12.0f)
                curveTo(4.0f, 9.95f, 4.78f, 7.9f, 6.34f, 6.34f)
                lineTo(7.75f, 7.75f)
                curveTo(6.59f, 8.93f, 6.0f, 10.46f, 6.0f, 12.0f)
                curveTo(6.0f, 13.54f, 6.59f, 15.07f, 7.76f, 16.24f)
                moveTo(12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                moveTo(17.66f, 17.66f)
                lineTo(16.25f, 16.25f)
                curveTo(17.41f, 15.07f, 18.0f, 13.54f, 18.0f, 12.0f)
                curveTo(18.0f, 10.46f, 17.41f, 8.93f, 16.24f, 7.76f)
                lineTo(17.65f, 6.35f)
                curveTo(19.22f, 7.9f, 20.0f, 9.95f, 20.0f, 12.0f)
                curveTo(20.0f, 14.05f, 19.22f, 16.1f, 17.66f, 17.66f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _surroundSound!!
    }

private var _surroundSound: ImageVector? = null
