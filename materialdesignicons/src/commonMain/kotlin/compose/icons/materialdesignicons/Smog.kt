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

public val MaterialDesignIcons.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(10.08f, 2.0f, 8.5f, 3.35f, 8.09f, 5.15f)
                curveTo(7.45f, 4.44f, 6.53f, 4.0f, 5.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 7.5f)
                horizontalLineTo(2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 11.0f)
                horizontalLineTo(6.68f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.72f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.28f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.32f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 22.0f, 7.5f)
                horizontalLineTo(22.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 4.0f)
                horizontalLineTo(18.5f)
                curveTo(17.47f, 4.0f, 16.55f, 4.44f, 15.91f, 5.15f)
                curveTo(15.5f, 3.35f, 13.92f, 2.0f, 12.0f, 2.0f)
                moveTo(7.2f, 14.0f)
                lineTo(6.4f, 22.0f)
                horizontalLineTo(11.0f)
                lineTo(10.2f, 14.0f)
                horizontalLineTo(7.2f)
                moveTo(13.8f, 14.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineTo(17.6f)
                lineTo(16.8f, 14.0f)
                horizontalLineTo(13.8f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
