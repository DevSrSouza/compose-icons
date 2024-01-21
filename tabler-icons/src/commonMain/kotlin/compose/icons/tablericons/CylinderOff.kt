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

public val TablerIcons.CylinderOff: ImageVector
    get() {
        if (_cylinderOff != null) {
            return _cylinderOff!!
        }
        _cylinderOff = Builder(name = "CylinderOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.23f, 5.233f)
                curveToRelative(-0.15f, 0.245f, -0.23f, 0.502f, -0.23f, 0.767f)
                curveToRelative(0.0f, 1.131f, 1.461f, 2.117f, 3.62f, 2.628f)
                moveToRelative(4.357f, 0.343f)
                curveToRelative(3.404f, -0.204f, 6.023f, -1.456f, 6.023f, -2.971f)
                curveToRelative(0.0f, -1.657f, -3.134f, -3.0f, -7.0f, -3.0f)
                curveToRelative(-1.645f, 0.0f, -3.158f, 0.243f, -4.353f, 0.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.657f, 3.134f, 3.0f, 7.0f, 3.0f)
                curveToRelative(3.245f, 0.0f, 5.974f, -0.946f, 6.767f, -2.23f)
                moveToRelative(0.233f, -3.77f)
                verticalLineToRelative(-9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _cylinderOff!!
    }

private var _cylinderOff: ImageVector? = null
