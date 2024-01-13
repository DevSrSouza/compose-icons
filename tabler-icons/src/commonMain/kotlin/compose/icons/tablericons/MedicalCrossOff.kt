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

public val TablerIcons.MedicalCrossOff: ImageVector
    get() {
        if (_medicalCrossOff != null) {
            return _medicalCrossOff!!
        }
        _medicalCrossOff = Builder(name = "MedicalCrossOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.928f, 17.733f)
                lineToRelative(-0.574f, -0.331f)
                lineToRelative(-3.354f, -1.938f)
                verticalLineToRelative(4.536f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.536f)
                lineToRelative(-3.928f, 2.268f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.366f, -0.366f)
                lineToRelative(-1.0f, -1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.366f, -1.366f)
                lineToRelative(3.927f, -2.268f)
                lineToRelative(-3.927f, -2.268f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.366f, -1.366f)
                lineToRelative(1.0f, -1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.366f, -0.366f)
                lineToRelative(0.333f, 0.192f)
                moveToRelative(3.595f, -0.46f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.535f)
                lineToRelative(3.928f, -2.267f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.366f, 0.366f)
                lineToRelative(1.0f, 1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.366f, 1.366f)
                lineToRelative(-3.927f, 2.268f)
                lineToRelative(3.927f, 2.269f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.366f, 1.366f)
                lineToRelative(-0.24f, 0.416f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _medicalCrossOff!!
    }

private var _medicalCrossOff: ImageVector? = null
