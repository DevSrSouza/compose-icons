package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowEnterLeft: ImageVector
    get() {
        if (_arrowEnterLeft != null) {
            return _arrowEnterLeft!!
        }
        _arrowEnterLeft = Builder(name = "ArrowEnterLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2496f, 4.0f)
                curveTo(21.6638f, 4.0f, 21.9996f, 4.3358f, 21.9996f, 4.75f)
                verticalLineTo(11.25f)
                curveTo(21.9996f, 13.3211f, 20.3206f, 15.0f, 18.2496f, 15.0f)
                horizontalLineTo(4.5854f)
                lineTo(8.3047f, 18.7197f)
                curveTo(8.571f, 18.9859f, 8.5952f, 19.4026f, 8.3774f, 19.6962f)
                lineTo(8.3047f, 19.7803f)
                curveTo(8.0385f, 20.0466f, 7.6218f, 20.0708f, 7.3282f, 19.8529f)
                lineTo(7.2441f, 19.7803f)
                lineTo(2.2441f, 14.7803f)
                curveTo(1.9778f, 14.5141f, 1.9536f, 14.0974f, 2.1715f, 13.8038f)
                lineTo(2.2441f, 13.7197f)
                lineTo(7.2441f, 8.7197f)
                curveTo(7.537f, 8.4268f, 8.0119f, 8.4268f, 8.3047f, 8.7197f)
                curveTo(8.571f, 8.9859f, 8.5952f, 9.4026f, 8.3774f, 9.6962f)
                lineTo(8.3047f, 9.7803f)
                lineTo(4.5854f, 13.5f)
                horizontalLineTo(18.2496f)
                curveTo(19.4404f, 13.5f, 20.4152f, 12.5748f, 20.4944f, 11.404f)
                lineTo(20.4996f, 11.25f)
                verticalLineTo(4.75f)
                curveTo(20.4996f, 4.3358f, 20.8354f, 4.0f, 21.2496f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowEnterLeft!!
    }

private var _arrowEnterLeft: ImageVector? = null
