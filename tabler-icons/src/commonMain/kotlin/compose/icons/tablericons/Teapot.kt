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

public val TablerIcons.Teapot: ImageVector
    get() {
        if (_teapot != null) {
            return _teapot!!
        }
        _teapot = Builder(name = "Teapot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.29f, 3.0f)
                horizontalLineToRelative(3.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.988f, 1.78f)
                lineToRelative(1.555f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.988f, 2.22f)
                horizontalLineToRelative(-6.53f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.988f, -2.22f)
                lineToRelative(1.555f, -14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.988f, -1.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.47f, 12.5f)
                lineToRelative(-4.257f, -5.019f)
                arcToRelative(0.899f, 0.899f, 0.0f, false, true, 0.69f, -1.481f)
                horizontalLineToRelative(13.09f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.007f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.657f, -1.346f, 3.0f, -3.007f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                horizontalLineToRelative(10.0f)
            }
        }
        .build()
        return _teapot!!
    }

private var _teapot: ImageVector? = null
