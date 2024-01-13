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

public val TablerIcons.ArrowBigDownLineFilled: ImageVector
    get() {
        if (_arrowBigDownLineFilled != null) {
            return _arrowBigDownLineFilled!!
        }
        _arrowBigDownLineFilled = Builder(name = "ArrowBigDownLineFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(4.999f)
                lineToRelative(-2.586f, 0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, 3.414f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 0.0f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.434f, -2.18f)
                lineToRelative(-0.068f, -0.145f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.78f, -1.089f)
                lineToRelative(-2.586f, -0.001f)
                verticalLineToRelative(-4.999f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _arrowBigDownLineFilled!!
    }

private var _arrowBigDownLineFilled: ImageVector? = null
