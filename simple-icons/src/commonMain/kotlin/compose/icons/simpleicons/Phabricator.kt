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

public val SimpleIcons.Phabricator: ImageVector
    get() {
        if (_phabricator != null) {
            return _phabricator!!
        }
        _phabricator = Builder(name = "Phabricator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.18f, 10.018f)
                lineToRelative(-4.426f, -4.449f)
                curveTo(17.053f, 3.782f, 14.66f, 2.665f, 12.0f, 2.665f)
                reflectiveCurveTo(6.947f, 3.783f, 5.246f, 5.568f)
                lineTo(0.821f, 10.02f)
                arcToRelative(2.802f, 2.802f, 0.0f, false, false, 0.0f, 3.962f)
                lineToRelative(4.542f, 4.578f)
                curveToRelative(1.692f, 1.711f, 4.04f, 2.773f, 6.637f, 2.773f)
                reflectiveCurveToRelative(4.945f, -1.062f, 6.637f, -2.774f)
                lineToRelative(4.543f, -4.579f)
                arcToRelative(2.802f, 2.802f, 0.0f, false, false, 0.0f, -3.962f)
                close()
                moveTo(12.0f, 19.384f)
                arcToRelative(7.384f, 7.384f, 0.0f, true, true, 0.0f, -14.768f)
                arcToRelative(7.384f, 7.384f, 0.0f, false, true, 0.0f, 14.768f)
                close()
                moveTo(15.651f, 11.812f)
                lineToRelative(0.999f, -1.014f)
                lineToRelative(-0.447f, -1.028f)
                lineTo(14.78f, 9.77f)
                lineToRelative(-0.456f, -0.45f)
                lineToRelative(-0.038f, -1.437f)
                lineToRelative(-1.008f, -0.431f)
                lineToRelative(-1.01f, 0.998f)
                horizontalLineToRelative(-0.624f)
                lineToRelative(-1.047f, -1.006f)
                lineToRelative(-1.022f, 0.415f)
                lineToRelative(0.035f, 1.406f)
                lineToRelative(-0.444f, 0.443f)
                lineToRelative(-1.444f, -0.014f)
                lineToRelative(-0.409f, 1.023f)
                lineToRelative(1.034f, 1.01f)
                lineToRelative(0.006f, 0.633f)
                lineToRelative(-0.996f, 1.007f)
                lineToRelative(0.44f, 1.031f)
                lineToRelative(1.428f, -0.002f)
                lineToRelative(0.456f, 0.453f)
                lineToRelative(0.016f, 1.422f)
                lineToRelative(1.068f, 0.447f)
                lineToRelative(0.965f, -1.009f)
                lineToRelative(0.636f, 0.01f)
                lineToRelative(1.028f, 1.011f)
                lineToRelative(1.044f, -0.423f)
                lineToRelative(-0.043f, -1.409f)
                lineToRelative(0.442f, -0.44f)
                lineToRelative(1.43f, 0.013f)
                lineToRelative(0.423f, -1.03f)
                lineToRelative(-1.03f, -1.0f)
                lineToRelative(-0.009f, -0.629f)
                close()
                moveTo(11.936f, 13.618f)
                arcToRelative(1.533f, 1.533f, 0.0f, true, true, 0.0f, -3.065f)
                arcToRelative(1.533f, 1.533f, 0.0f, false, true, 0.0f, 3.065f)
                close()
            }
        }
        .build()
        return _phabricator!!
    }

private var _phabricator: ImageVector? = null
