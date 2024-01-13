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

public val TablerIcons.ArrowBigLeftFilled: ImageVector
    get() {
        if (_arrowBigLeftFilled != null) {
            return _arrowBigLeftFilled!!
        }
        _arrowBigLeftFilled = Builder(name = "ArrowBigLeftFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.586f, 4.0f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.828f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.18f, 0.434f)
                lineToRelative(0.145f, -0.068f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.089f, -1.78f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, -1.85f)
                lineToRelative(-7.0f, -0.001f)
                verticalLineToRelative(-2.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.414f, -1.414f)
                close()
            }
        }
        .build()
        return _arrowBigLeftFilled!!
    }

private var _arrowBigLeftFilled: ImageVector? = null
