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

public val TablerIcons.AlignBoxRightMiddle: ImageVector
    get() {
        if (_alignBoxRightMiddle != null) {
            return _alignBoxRightMiddle!!
        }
        _alignBoxRightMiddle = Builder(name = "AlignBoxRightMiddle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 18.222f)
                verticalLineToRelative(-12.444f)
                curveToRelative(0.0f, -0.982f, 0.796f, -1.778f, 1.778f, -1.778f)
                horizontalLineToRelative(12.444f)
                curveToRelative(0.982f, 0.0f, 1.778f, 0.796f, 1.778f, 1.778f)
                verticalLineToRelative(12.444f)
                curveToRelative(0.0f, 0.982f, -0.796f, 1.778f, -1.778f, 1.778f)
                horizontalLineToRelative(-12.444f)
                arcToRelative(1.778f, 1.778f, 0.0f, false, true, -1.778f, -1.778f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(4.0f)
            }
        }
        .build()
        return _alignBoxRightMiddle!!
    }

private var _alignBoxRightMiddle: ImageVector? = null
