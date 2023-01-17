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

public val TablerIcons.Keyframes: ImageVector
    get() {
        if (_keyframes != null) {
            return _keyframes!!
        }
        _keyframes = Builder(name = "Keyframes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.225f, 18.412f)
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineToRelative(4.586f, 5.836f)
                arcToRelative(1.844f, 1.844f, 0.0f, false, true, 0.0f, 2.328f)
                lineToRelative(-4.586f, 5.836f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                lineToRelative(4.586f, 5.836f)
                arcToRelative(1.844f, 1.844f, 0.0f, false, true, 0.0f, 2.328f)
                lineToRelative(-4.586f, 5.836f)
            }
        }
        .build()
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
