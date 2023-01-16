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

public val MaterialDesignIcons.YoutubeTv: ImageVector
    get() {
        if (_youtubeTv != null) {
            return _youtubeTv!!
        }
        _youtubeTv = Builder(name = "YoutubeTv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 4.5f)
                horizontalLineTo(21.5f)
                curveTo(22.34f, 4.5f, 23.0f, 5.15f, 23.0f, 6.0f)
                verticalLineTo(17.5f)
                curveTo(23.0f, 18.35f, 22.34f, 19.0f, 21.5f, 19.0f)
                horizontalLineTo(2.5f)
                curveTo(1.65f, 19.0f, 1.0f, 18.35f, 1.0f, 17.5f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 5.15f, 1.65f, 4.5f, 2.5f, 4.5f)
                moveTo(9.71f, 8.5f)
                verticalLineTo(15.0f)
                lineTo(15.42f, 11.7f)
                lineTo(9.71f, 8.5f)
                moveTo(17.25f, 21.0f)
                horizontalLineTo(6.65f)
                curveTo(6.35f, 21.0f, 6.15f, 20.8f, 6.15f, 20.5f)
                curveTo(6.15f, 20.2f, 6.35f, 20.0f, 6.65f, 20.0f)
                horizontalLineTo(17.35f)
                curveTo(17.65f, 20.0f, 17.85f, 20.2f, 17.85f, 20.5f)
                curveTo(17.85f, 20.8f, 17.55f, 21.0f, 17.25f, 21.0f)
                close()
            }
        }
        .build()
        return _youtubeTv!!
    }

private var _youtubeTv: ImageVector? = null
