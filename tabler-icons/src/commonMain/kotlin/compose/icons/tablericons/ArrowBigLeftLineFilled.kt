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

public val TablerIcons.ArrowBigLeftLineFilled: ImageVector
    get() {
        if (_arrowBigLeftLineFilled != null) {
            return _arrowBigLeftLineFilled!!
        }
        _arrowBigLeftLineFilled = Builder(name = "ArrowBigLeftLineFilled", defaultWidth = 24.0.dp,
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
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                lineToRelative(-5.0f, -0.001f)
                verticalLineToRelative(-2.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.415f, 12.0f)
                lineToRelative(6.585f, -6.586f)
                verticalLineToRelative(3.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, 0.883f)
                lineToRelative(5.0f, -0.001f)
                verticalLineToRelative(4.0f)
                lineToRelative(-5.0f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(-6.585f, -6.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowBigLeftLineFilled!!
    }

private var _arrowBigLeftLineFilled: ImageVector? = null
