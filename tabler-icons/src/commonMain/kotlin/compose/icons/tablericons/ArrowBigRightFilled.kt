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

public val TablerIcons.ArrowBigRightFilled: ImageVector
    get() {
        if (_arrowBigRightFilled != null) {
            return _arrowBigRightFilled!!
        }
        _arrowBigRightFilled = Builder(name = "ArrowBigRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.089f, 3.634f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.089f, 1.78f)
                lineToRelative(-0.001f, 2.586f)
                horizontalLineToRelative(-6.999f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.995f, 1.85f)
                lineToRelative(6.999f, -0.001f)
                lineToRelative(0.001f, 2.587f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.414f, 1.414f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.828f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.18f, -0.434f)
                lineToRelative(-0.145f, 0.068f)
                close()
            }
        }
        .build()
        return _arrowBigRightFilled!!
    }

private var _arrowBigRightFilled: ImageVector? = null
