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

public val TablerIcons.PhoneFilled: ImageVector
    get() {
        if (_phoneFilled != null) {
            return _phoneFilled!!
        }
        _phoneFilled = Builder(name = "PhoneFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.877f, 0.519f)
                lineToRelative(0.051f, 0.11f)
                lineToRelative(2.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.313f, 1.16f)
                lineToRelative(-0.1f, 0.068f)
                lineToRelative(-1.674f, 1.004f)
                lineToRelative(0.063f, 0.103f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 3.132f, 3.132f)
                lineToRelative(0.102f, 0.062f)
                lineToRelative(1.005f, -1.672f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.113f, -0.453f)
                lineToRelative(0.115f, 0.039f)
                lineToRelative(5.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.622f, 0.807f)
                lineToRelative(0.007f, 0.121f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.06f, 2.998f)
                curveToRelative(-8.579f, -0.521f, -15.418f, -7.36f, -15.94f, -15.998f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _phoneFilled!!
    }

private var _phoneFilled: ImageVector? = null
