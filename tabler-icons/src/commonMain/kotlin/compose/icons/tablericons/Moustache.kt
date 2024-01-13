package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Moustache: ImageVector
    get() {
        if (_moustache != null) {
            return _moustache!!
        }
        _moustache = Builder(name = "Moustache", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.599f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.933f, 1.333f, 2.133f, 1.556f, 3.126f, 1.556f)
                lineToRelative(0.291f, 0.0f)
                lineToRelative(0.77f, -0.044f)
                lineToRelative(0.213f, 0.0f)
                curveToRelative(-0.963f, 1.926f, -3.163f, 2.925f, -6.6f, 3.0f)
                lineToRelative(-0.4f, 0.0f)
                lineToRelative(-0.165f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.165f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.599f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.933f, 1.333f, -2.133f, 1.556f, -3.126f, 1.556f)
                lineToRelative(-0.291f, 0.0f)
                lineToRelative(-0.77f, -0.044f)
                lineToRelative(-0.213f, 0.0f)
                curveToRelative(0.963f, 1.926f, 3.163f, 2.925f, 6.6f, 3.0f)
                lineToRelative(0.4f, 0.0f)
                lineToRelative(0.165f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.165f, -6.0f)
                close()
            }
        }
        .build()
        return _moustache!!
    }

private var _moustache: ImageVector? = null
