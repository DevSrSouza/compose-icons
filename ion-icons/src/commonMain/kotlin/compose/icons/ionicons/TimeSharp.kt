package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TimeSharp: ImageVector
    get() {
        if (_timeSharp != null) {
            return _timeSharp!!
        }
        _timeSharp = Builder(name = "TimeSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                curveToRelative(0.0f, 114.69f, 93.32f, 208.0f, 208.0f, 208.0f)
                curveToRelative(114.86f, 0.0f, 208.0f, -93.14f, 208.0f, -208.0f)
                curveTo(464.0f, 141.31f, 370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(364.0f, 288.0f)
                horizontalLineTo(244.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 364.0f, 288.0f)
                close()
            }
        }
        .build()
        return _timeSharp!!
    }

private var _timeSharp: ImageVector? = null
