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

public val MaterialDesignIcons.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                verticalLineTo(15.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.5f, 19.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 14.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.5f, 12.0f)
                curveTo(18.04f, 12.0f, 18.55f, 12.12f, 19.0f, 12.34f)
                verticalLineTo(6.47f)
                lineTo(9.0f, 8.6f)
                verticalLineTo(17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 21.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 14.0f)
                curveTo(6.04f, 14.0f, 6.55f, 14.12f, 7.0f, 14.34f)
                verticalLineTo(6.0f)
                lineTo(21.0f, 3.0f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
