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

public val MaterialDesignIcons.TelevisionClassic: ImageVector
    get() {
        if (_televisionClassic != null) {
            return _televisionClassic!!
        }
        _televisionClassic = Builder(name = "TelevisionClassic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.16f, 3.0f)
                lineTo(6.75f, 4.41f)
                lineTo(9.34f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 7.0f, 2.0f, 7.89f, 2.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.11f, 2.89f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 21.0f, 22.0f, 20.11f, 22.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.89f, 21.11f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(14.66f)
                lineTo(17.25f, 4.41f)
                lineTo(15.84f, 3.0f)
                lineTo(12.0f, 6.84f)
                lineTo(8.16f, 3.0f)
                moveTo(4.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                moveTo(19.5f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.5f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.5f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.5f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.5f, 9.0f)
                moveTo(19.5f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.5f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.5f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.5f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.5f, 12.0f)
                close()
            }
        }
        .build()
        return _televisionClassic!!
    }

private var _televisionClassic: ImageVector? = null
