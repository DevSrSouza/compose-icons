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

public val TablerIcons.MedicalCrossFilled: ImageVector
    get() {
        if (_medicalCrossFilled != null) {
            return _medicalCrossFilled!!
        }
        _medicalCrossFilled = Builder(name = "MedicalCrossFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, 1.995f)
                verticalLineToRelative(2.803f)
                lineToRelative(-2.428f, -1.401f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.732f, 0.732f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-0.073f, 0.138f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.805f, 2.594f)
                lineToRelative(2.427f, 1.402f)
                lineToRelative(-2.427f, 1.402f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.732f, 2.732f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(0.083f, 0.132f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.649f, 0.6f)
                lineToRelative(2.428f, -1.402f)
                verticalLineToRelative(2.804f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, -1.995f)
                verticalLineToRelative(-2.804f)
                lineToRelative(2.428f, 1.403f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.732f, -0.732f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(0.073f, -0.138f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.805f, -2.594f)
                lineToRelative(-2.428f, -1.403f)
                lineToRelative(2.428f, -1.402f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.732f, -2.732f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(-0.083f, -0.132f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.649f, -0.6f)
                lineToRelative(-2.428f, 1.4f)
                verticalLineToRelative(-2.802f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _medicalCrossFilled!!
    }

private var _medicalCrossFilled: ImageVector? = null
