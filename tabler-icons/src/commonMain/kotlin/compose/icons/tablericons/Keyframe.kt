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

public val TablerIcons.Keyframe: ImageVector
    get() {
        if (_keyframe != null) {
            return _keyframe!!
        }
        _keyframe = Builder(name = "Keyframe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.225f, 18.412f)
                arcToRelative(1.595f, 1.595f, 0.0f, false, true, -1.225f, 0.588f)
                curveToRelative(-0.468f, 0.0f, -0.914f, -0.214f, -1.225f, -0.588f)
                lineToRelative(-4.361f, -5.248f)
                arcToRelative(1.844f, 1.844f, 0.0f, false, true, 0.0f, -2.328f)
                lineToRelative(4.361f, -5.248f)
                arcToRelative(1.595f, 1.595f, 0.0f, false, true, 1.225f, -0.588f)
                curveToRelative(0.468f, 0.0f, 0.914f, 0.214f, 1.225f, 0.588f)
                lineToRelative(4.361f, 5.248f)
                arcToRelative(1.844f, 1.844f, 0.0f, false, true, 0.0f, 2.328f)
                lineToRelative(-4.361f, 5.248f)
                close()
            }
        }
        .build()
        return _keyframe!!
    }

private var _keyframe: ImageVector? = null
