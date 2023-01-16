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

public val MaterialDesignIcons.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 6.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 14.5f, 2.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 17.75f, 6.0f)
                curveTo(17.75f, 6.42f, 18.08f, 6.75f, 18.5f, 6.75f)
                curveTo(18.92f, 6.75f, 19.25f, 6.42f, 19.25f, 6.0f)
                verticalLineTo(5.25f)
                horizontalLineTo(20.75f)
                verticalLineTo(6.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 18.5f, 8.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 16.25f, 6.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.5f, 4.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.75f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.29f)
                curveTo(16.89f, 8.15f, 19.0f, 10.83f, 19.0f, 14.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 21.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 14.0f)
                curveTo(5.0f, 10.83f, 7.11f, 8.15f, 10.0f, 7.29f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.25f)
                moveTo(22.0f, 6.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                moveTo(19.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                moveTo(20.91f, 4.38f)
                lineTo(22.33f, 2.96f)
                lineTo(23.04f, 3.67f)
                lineTo(21.62f, 5.09f)
                lineTo(20.91f, 4.38f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
