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

public val MaterialDesignIcons.Replay: ImageVector
    get() {
        if (_replay != null) {
            return _replay!!
        }
        _replay = Builder(name = "Replay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineTo(1.0f)
                lineTo(7.0f, 6.0f)
                lineTo(12.0f, 11.0f)
                verticalLineTo(7.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 19.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 13.0f)
                horizontalLineTo(4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 13.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _replay!!
    }

private var _replay: ImageVector? = null
