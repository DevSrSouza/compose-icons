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

public val MaterialDesignIcons.ContentCut: ImageVector
    get() {
        if (_contentCut != null) {
            return _contentCut!!
        }
        _contentCut = Builder(name = "ContentCut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(13.0f, 9.0f)
                lineTo(15.0f, 11.0f)
                lineTo(22.0f, 4.0f)
                verticalLineTo(3.0f)
                moveTo(12.0f, 12.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 12.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 12.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 12.5f)
                moveTo(6.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 18.0f)
                curveTo(4.0f, 16.89f, 4.9f, 16.0f, 6.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 18.0f)
                curveTo(8.0f, 19.11f, 7.1f, 20.0f, 6.0f, 20.0f)
                moveTo(6.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 6.0f)
                curveTo(4.0f, 4.89f, 4.9f, 4.0f, 6.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 6.0f)
                curveTo(8.0f, 7.11f, 7.1f, 8.0f, 6.0f, 8.0f)
                moveTo(9.64f, 7.64f)
                curveTo(9.87f, 7.14f, 10.0f, 6.59f, 10.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 10.0f)
                curveTo(6.59f, 10.0f, 7.14f, 9.87f, 7.64f, 9.64f)
                lineTo(10.0f, 12.0f)
                lineTo(7.64f, 14.36f)
                curveTo(7.14f, 14.13f, 6.59f, 14.0f, 6.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 18.0f)
                curveTo(10.0f, 17.41f, 9.87f, 16.86f, 9.64f, 16.36f)
                lineTo(12.0f, 14.0f)
                lineTo(19.0f, 21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                lineTo(9.64f, 7.64f)
                close()
            }
        }
        .build()
        return _contentCut!!
    }

private var _contentCut: ImageVector? = null
