package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Codemagic: ImageVector
    get() {
        if (_codemagic != null) {
            return _codemagic!!
        }
        _codemagic = Builder(name = "Codemagic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.833f, 10.117f)
                lineTo(16.937f, 7.24f)
                curveToRelative(-0.07f, -0.035f, -0.106f, -0.106f, -0.142f, -0.177f)
                lineToRelative(-2.912f, -5.896f)
                curveToRelative(-0.498f, -1.03f, -1.776f, -1.457f, -2.807f, -0.96f)
                arcToRelative(2.09f, 2.09f, 0.0f, false, false, -0.959f, 0.96f)
                lineTo(7.205f, 7.063f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.142f, 0.177f)
                lineToRelative(-5.896f, 2.913f)
                curveToRelative(-1.03f, 0.497f, -1.457f, 1.776f, -0.96f, 2.806f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.96f, 0.96f)
                lineToRelative(5.896f, 2.876f)
                curveToRelative(0.07f, 0.036f, 0.106f, 0.107f, 0.142f, 0.142f)
                lineToRelative(2.948f, 5.896f)
                curveToRelative(0.497f, 1.03f, 1.776f, 1.457f, 2.806f, 0.96f)
                arcToRelative(2.09f, 2.09f, 0.0f, false, false, 0.959f, -0.96f)
                lineToRelative(2.877f, -5.896f)
                curveToRelative(0.036f, -0.07f, 0.107f, -0.142f, 0.142f, -0.142f)
                lineToRelative(5.896f, -2.912f)
                curveToRelative(1.03f, -0.498f, 1.457f, -1.776f, 0.96f, -2.806f)
                curveToRelative(-0.178f, -0.427f, -0.533f, -0.746f, -0.96f, -0.96f)
                close()
                moveTo(18.465f, 10.544f)
                lineToRelative(-2.735f, 2.38f)
                curveToRelative(-0.533f, 0.497f, -0.924f, 1.136f, -1.066f, 1.847f)
                lineToRelative(-0.71f, 3.551f)
                curveToRelative(-0.036f, 0.143f, -0.178f, 0.25f, -0.32f, 0.214f)
                curveToRelative(-0.071f, 0.0f, -0.107f, -0.036f, -0.142f, -0.107f)
                lineToRelative(-2.38f, -2.735f)
                curveToRelative(-0.497f, -0.533f, -1.137f, -0.923f, -1.847f, -1.066f)
                lineToRelative(-3.552f, -0.71f)
                curveToRelative(-0.142f, -0.035f, -0.249f, -0.178f, -0.213f, -0.32f)
                curveToRelative(0.0f, -0.07f, 0.035f, -0.106f, 0.106f, -0.142f)
                lineToRelative(2.735f, -2.38f)
                curveToRelative(0.533f, -0.497f, 0.924f, -1.136f, 1.066f, -1.847f)
                lineToRelative(0.71f, -3.551f)
                curveToRelative(0.036f, -0.143f, 0.178f, -0.25f, 0.32f, -0.214f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, 0.142f, 0.071f)
                lineToRelative(2.38f, 2.735f)
                curveToRelative(0.497f, 0.533f, 1.137f, 0.924f, 1.847f, 1.066f)
                lineToRelative(3.552f, 0.71f)
                curveToRelative(0.142f, 0.036f, 0.249f, 0.178f, 0.213f, 0.32f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, -0.106f, 0.178f)
                close()
            }
        }
        .build()
        return _codemagic!!
    }

private var _codemagic: ImageVector? = null
