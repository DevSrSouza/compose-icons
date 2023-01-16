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

public val MaterialDesignIcons.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                moveTo(12.0f, 16.5f)
                curveTo(9.5f, 16.5f, 7.5f, 14.5f, 7.5f, 12.0f)
                curveTo(7.5f, 9.5f, 9.5f, 7.5f, 12.0f, 7.5f)
                curveTo(14.5f, 7.5f, 16.5f, 9.5f, 16.5f, 12.0f)
                curveTo(16.5f, 14.5f, 14.5f, 16.5f, 12.0f, 16.5f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _album!!
    }

private var _album: ImageVector? = null
