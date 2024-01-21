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

public val TablerIcons.BriefcaseFilled: ImageVector
    get() {
        if (_briefcaseFilled != null) {
            return _briefcaseFilled!!
        }
        _briefcaseFilled = Builder(name = "BriefcaseFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 13.478f)
                verticalLineToRelative(4.522f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-4.522f)
                lineToRelative(0.553f, 0.277f)
                arcToRelative(20.999f, 20.999f, 0.0f, false, false, 18.897f, -0.002f)
                lineToRelative(0.55f, -0.275f)
                close()
                moveTo(14.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(2.242f)
                lineToRelative(-1.447f, 0.724f)
                arcToRelative(19.002f, 19.002f, 0.0f, false, true, -16.726f, 0.186f)
                lineToRelative(-0.647f, -0.32f)
                lineToRelative(-1.18f, -0.59f)
                verticalLineToRelative(-2.242f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.01f)
                curveToRelative(0.0f, -0.562f, -0.448f, -1.01f, -1.0f, -1.01f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _briefcaseFilled!!
    }

private var _briefcaseFilled: ImageVector? = null
