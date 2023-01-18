package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.AppRecent: ImageVector
    get() {
        if (_appRecent != null) {
            return _appRecent!!
        }
        _appRecent = Builder(name = "AppRecent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 19.75f)
                curveTo(18.0f, 20.9409f, 17.0748f, 21.9156f, 15.904f, 21.9948f)
                lineTo(15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0591f, 22.0f, 6.0844f, 21.0748f, 6.0052f, 19.904f)
                lineTo(6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0591f, 6.9252f, 2.0844f, 8.096f, 2.0052f)
                lineTo(8.25f, 2.0f)
                horizontalLineTo(15.75f)
                curveTo(16.9409f, 2.0f, 17.9156f, 2.9252f, 17.9948f, 4.096f)
                lineTo(18.0f, 4.25f)
                verticalLineTo(19.75f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9409f, 5.0f, 21.9156f, 5.9252f, 21.9948f, 7.096f)
                lineTo(22.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 17.9409f, 21.0748f, 18.9156f, 19.904f, 18.9948f)
                lineTo(19.75f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0591f, 19.0f, 2.0844f, 18.0748f, 2.0052f, 16.904f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(2.0f, 6.0591f, 2.9252f, 5.0844f, 4.096f, 5.0052f)
                lineTo(4.25f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _appRecent!!
    }

private var _appRecent: ImageVector? = null
