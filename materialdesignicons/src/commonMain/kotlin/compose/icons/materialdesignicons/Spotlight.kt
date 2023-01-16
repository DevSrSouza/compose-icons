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

public val MaterialDesignIcons.Spotlight: ImageVector
    get() {
        if (_spotlight != null) {
            return _spotlight!!
        }
        _spotlight = Builder(name = "Spotlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(7.09f, 8.55f)
                curveTo(6.4f, 9.5f, 6.0f, 10.71f, 6.0f, 12.0f)
                curveTo(6.0f, 13.29f, 6.4f, 14.5f, 7.09f, 15.45f)
                lineTo(2.0f, 18.0f)
                verticalLineTo(6.0f)
                moveTo(6.0f, 3.0f)
                horizontalLineTo(18.0f)
                lineTo(15.45f, 7.09f)
                curveTo(14.5f, 6.4f, 13.29f, 6.0f, 12.0f, 6.0f)
                curveTo(10.71f, 6.0f, 9.5f, 6.4f, 8.55f, 7.09f)
                lineTo(6.0f, 3.0f)
                moveTo(22.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(16.91f, 15.45f)
                curveTo(17.6f, 14.5f, 18.0f, 13.29f, 18.0f, 12.0f)
                curveTo(18.0f, 10.71f, 17.6f, 9.5f, 16.91f, 8.55f)
                lineTo(22.0f, 6.0f)
                moveTo(18.0f, 21.0f)
                horizontalLineTo(6.0f)
                lineTo(8.55f, 16.91f)
                curveTo(9.5f, 17.6f, 10.71f, 18.0f, 12.0f, 18.0f)
                curveTo(13.29f, 18.0f, 14.5f, 17.6f, 15.45f, 16.91f)
                lineTo(18.0f, 21.0f)
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _spotlight!!
    }

private var _spotlight: ImageVector? = null
