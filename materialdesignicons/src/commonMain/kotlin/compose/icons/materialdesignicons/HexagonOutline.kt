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

public val MaterialDesignIcons.HexagonOutline: ImageVector
    get() {
        if (_hexagonOutline != null) {
            return _hexagonOutline!!
        }
        _hexagonOutline = Builder(name = "HexagonOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.5f)
                curveTo(21.0f, 16.88f, 20.79f, 17.21f, 20.47f, 17.38f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22.0f, 12.0f, 22.0f)
                curveTo(11.79f, 22.0f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3.0f, 16.88f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2.0f, 12.0f, 2.0f)
                curveTo(12.21f, 2.0f, 12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21.0f, 7.12f, 21.0f, 7.5f)
                verticalLineTo(16.5f)
                moveTo(12.0f, 4.15f)
                lineTo(5.0f, 8.09f)
                verticalLineTo(15.91f)
                lineTo(12.0f, 19.85f)
                lineTo(19.0f, 15.91f)
                verticalLineTo(8.09f)
                lineTo(12.0f, 4.15f)
                close()
            }
        }
        .build()
        return _hexagonOutline!!
    }

private var _hexagonOutline: ImageVector? = null
