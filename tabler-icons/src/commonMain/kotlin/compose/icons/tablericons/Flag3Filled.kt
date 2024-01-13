package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Flag3Filled: ImageVector
    get() {
        if (_flag3Filled != null) {
            return _flag3Filled!!
        }
        _flag3Filled = Builder(name = "Flag3Filled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                curveToRelative(0.852f, 0.0f, 1.297f, 0.986f, 0.783f, 1.623f)
                lineToRelative(-0.076f, 0.084f)
                lineToRelative(-3.792f, 3.793f)
                lineToRelative(3.792f, 3.793f)
                curveToRelative(0.603f, 0.602f, 0.22f, 1.614f, -0.593f, 1.701f)
                lineToRelative(-0.114f, 0.006f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _flag3Filled!!
    }

private var _flag3Filled: ImageVector? = null
