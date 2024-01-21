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

public val TablerIcons.BladeFilled: ImageVector
    get() {
        if (_bladeFilled != null) {
            return _bladeFilled!!
        }
        _bladeFilled = Builder(name = "BladeFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.586f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
                lineToRelative(0.586f, 0.585f)
                lineToRelative(0.586f, -0.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.7f, -0.117f)
                lineToRelative(0.128f, 0.117f)
                lineToRelative(2.586f, 2.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                lineToRelative(-0.586f, 0.586f)
                lineToRelative(0.586f, 0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                lineToRelative(-8.586f, 8.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                lineToRelative(-0.586f, -0.586f)
                lineToRelative(-0.586f, 0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                lineToRelative(-2.586f, -2.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(0.585f, -0.587f)
                lineToRelative(-0.585f, -0.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.117f, -2.7f)
                lineToRelative(0.117f, -0.129f)
                close()
                moveTo(14.613f, 7.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.497f)
                lineToRelative(0.292f, 0.293f)
                lineToRelative(-1.068f, 1.067f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, -2.512f, 1.784f)
                lineToRelative(-0.005f, 0.149f)
                lineToRelative(0.005f, 0.15f)
                curveToRelative(0.01f, 0.125f, 0.03f, 0.248f, 0.062f, 0.367f)
                lineToRelative(-1.067f, 1.068f)
                lineToRelative(-0.293f, -0.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.497f)
                lineToRelative(0.292f, 0.293f)
                lineToRelative(-0.292f, 0.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.497f, 1.32f)
                lineToRelative(0.293f, -0.292f)
                lineToRelative(0.293f, 0.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -1.497f)
                lineToRelative(-0.292f, -0.293f)
                lineToRelative(1.069f, -1.067f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, 2.449f, -2.45f)
                lineToRelative(1.067f, -1.068f)
                lineToRelative(0.293f, 0.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -1.497f)
                lineToRelative(-0.292f, -0.293f)
                lineToRelative(0.292f, -0.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.497f, -1.32f)
                lineToRelative(-0.293f, 0.292f)
                lineToRelative(-0.293f, -0.292f)
                close()
            }
        }
        .build()
        return _bladeFilled!!
    }

private var _bladeFilled: ImageVector? = null
