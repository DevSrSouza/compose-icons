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

public val MaterialDesignIcons.PauseOctagon: ImageVector
    get() {
        if (_pauseOctagon != null) {
            return _pauseOctagon!!
        }
        _pauseOctagon = Builder(name = "PauseOctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.73f, 3.0f)
                lineTo(21.0f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(15.73f, 21.0f)
                horizontalLineTo(8.27f)
                lineTo(3.0f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(8.27f, 3.0f)
                horizontalLineTo(15.73f)
                moveTo(15.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _pauseOctagon!!
    }

private var _pauseOctagon: ImageVector? = null
