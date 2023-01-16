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

public val MaterialDesignIcons.Teamviewer: ImageVector
    get() {
        if (_teamviewer != null) {
            return _teamviewer!!
        }
        _teamviewer = Builder(name = "Teamviewer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.04f, 9.2f)
                lineTo(9.3f, 11.0f)
                horizontalLineTo(14.75f)
                lineTo(14.0f, 9.2f)
                lineTo(19.55f, 12.0f)
                lineTo(14.0f, 14.8f)
                lineTo(14.75f, 13.0f)
                horizontalLineTo(9.3f)
                lineTo(10.04f, 14.8f)
                lineTo(4.5f, 12.0f)
                lineTo(10.04f, 9.2f)
                moveTo(20.83f, 22.0f)
                horizontalLineTo(3.17f)
                curveTo(2.53f, 22.0f, 2.0f, 21.5f, 2.0f, 20.83f)
                verticalLineTo(3.17f)
                curveTo(2.0f, 2.53f, 2.53f, 2.0f, 3.17f, 2.0f)
                horizontalLineTo(20.83f)
                curveTo(21.5f, 2.0f, 22.0f, 2.53f, 22.0f, 3.17f)
                verticalLineTo(20.83f)
                curveTo(22.0f, 21.47f, 21.5f, 22.0f, 20.83f, 22.0f)
                moveTo(11.93f, 3.76f)
                curveTo(7.41f, 3.82f, 3.78f, 7.5f, 3.76f, 12.0f)
                curveTo(3.72f, 16.5f, 7.35f, 20.2f, 11.86f, 20.24f)
                horizontalLineTo(12.0f)
                curveTo(16.53f, 20.18f, 20.18f, 16.53f, 20.24f, 12.0f)
                curveTo(20.31f, 7.5f, 16.74f, 3.83f, 12.26f, 3.76f)
                curveTo(12.15f, 3.75f, 12.04f, 3.76f, 11.93f, 3.76f)
                close()
            }
        }
        .build()
        return _teamviewer!!
    }

private var _teamviewer: ImageVector? = null
