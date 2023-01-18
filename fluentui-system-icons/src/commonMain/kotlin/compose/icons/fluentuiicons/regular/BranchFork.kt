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

public val RegularGroup.BranchFork: ImageVector
    get() {
        if (_branchFork != null) {
            return _branchFork!!
        }
        _branchFork = Builder(name = "BranchFork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.5f)
                curveTo(11.0f, 7.2632f, 9.6961f, 8.7219f, 8.0f, 8.9646f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.25f)
                curveTo(15.4926f, 11.5f, 16.5f, 10.4926f, 16.5f, 9.25f)
                verticalLineTo(8.8551f)
                curveTo(15.0543f, 8.4248f, 14.0f, 7.0855f, 14.0f, 5.5f)
                curveTo(14.0f, 3.567f, 15.567f, 2.0f, 17.5f, 2.0f)
                curveTo(19.433f, 2.0f, 21.0f, 3.567f, 21.0f, 5.5f)
                curveTo(21.0f, 7.2632f, 19.6961f, 8.7219f, 18.0f, 8.9646f)
                verticalLineTo(9.25f)
                curveTo(18.0f, 11.3211f, 16.3211f, 13.0f, 14.25f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0354f)
                curveTo(9.6961f, 15.2781f, 11.0f, 16.7368f, 11.0f, 18.5f)
                curveTo(11.0f, 20.433f, 9.433f, 22.0f, 7.5f, 22.0f)
                curveTo(5.567f, 22.0f, 4.0f, 20.433f, 4.0f, 18.5f)
                curveTo(4.0f, 16.9145f, 5.0543f, 15.5752f, 6.5f, 15.1449f)
                verticalLineTo(8.8551f)
                curveTo(5.0543f, 8.4248f, 4.0f, 7.0855f, 4.0f, 5.5f)
                curveTo(4.0f, 3.567f, 5.567f, 2.0f, 7.5f, 2.0f)
                curveTo(9.433f, 2.0f, 11.0f, 3.567f, 11.0f, 5.5f)
                close()
                moveTo(7.5f, 7.5f)
                curveTo(8.6046f, 7.5f, 9.5f, 6.6046f, 9.5f, 5.5f)
                curveTo(9.5f, 4.3954f, 8.6046f, 3.5f, 7.5f, 3.5f)
                curveTo(6.3954f, 3.5f, 5.5f, 4.3954f, 5.5f, 5.5f)
                curveTo(5.5f, 6.6046f, 6.3954f, 7.5f, 7.5f, 7.5f)
                close()
                moveTo(17.5f, 7.5f)
                curveTo(18.6046f, 7.5f, 19.5f, 6.6046f, 19.5f, 5.5f)
                curveTo(19.5f, 4.3954f, 18.6046f, 3.5f, 17.5f, 3.5f)
                curveTo(16.3954f, 3.5f, 15.5f, 4.3954f, 15.5f, 5.5f)
                curveTo(15.5f, 6.6046f, 16.3954f, 7.5f, 17.5f, 7.5f)
                close()
                moveTo(9.5f, 18.5f)
                curveTo(9.5f, 17.3954f, 8.6046f, 16.5f, 7.5f, 16.5f)
                curveTo(6.3954f, 16.5f, 5.5f, 17.3954f, 5.5f, 18.5f)
                curveTo(5.5f, 19.6046f, 6.3954f, 20.5f, 7.5f, 20.5f)
                curveTo(8.6046f, 20.5f, 9.5f, 19.6046f, 9.5f, 18.5f)
                close()
            }
        }
        .build()
        return _branchFork!!
    }

private var _branchFork: ImageVector? = null
