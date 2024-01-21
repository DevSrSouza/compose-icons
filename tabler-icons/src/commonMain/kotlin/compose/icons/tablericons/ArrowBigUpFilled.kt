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

public val TablerIcons.ArrowBigUpFilled: ImageVector
    get() {
        if (_arrowBigUpFilled != null) {
            return _arrowBigUpFilled!!
        }
        _arrowBigUpFilled = Builder(name = "ArrowBigUpFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.586f, 3.0f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.434f, 2.18f)
                lineToRelative(0.068f, 0.145f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.78f, 1.089f)
                horizontalLineToRelative(2.586f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, -1.995f)
                lineToRelative(-0.001f, -7.0f)
                horizontalLineToRelative(2.587f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, -3.414f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowBigUpFilled!!
    }

private var _arrowBigUpFilled: ImageVector? = null
