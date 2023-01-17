package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Verified24: ImageVector
    get() {
        if (_verified24 != null) {
            return _verified24!!
        }
        _verified24 = Builder(name = "Verified24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.03f, 9.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-5.47f, 5.47f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.136f, 1.2f)
                lineToRelative(1.375f, 1.01f)
                curveToRelative(0.274f, 0.201f, 0.593f, 0.333f, 0.929f, 0.384f)
                lineToRelative(1.687f, 0.259f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 3.02f, 3.021f)
                lineToRelative(0.259f, 1.686f)
                curveToRelative(0.051f, 0.336f, 0.183f, 0.655f, 0.384f, 0.929f)
                lineToRelative(1.01f, 1.375f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 0.0f, 4.272f)
                lineToRelative(-1.01f, 1.375f)
                arcToRelative(2.106f, 2.106f, 0.0f, false, false, -0.384f, 0.929f)
                lineToRelative(-0.259f, 1.687f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -3.021f, 3.02f)
                lineToRelative(-1.686f, 0.259f)
                arcToRelative(2.106f, 2.106f, 0.0f, false, false, -0.929f, 0.384f)
                lineToRelative(-1.375f, 1.01f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -4.272f, 0.0f)
                lineToRelative(-1.375f, -1.01f)
                arcToRelative(2.106f, 2.106f, 0.0f, false, false, -0.929f, -0.384f)
                lineToRelative(-1.687f, -0.259f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -3.02f, -3.021f)
                lineToRelative(-0.259f, -1.686f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, false, -0.384f, -0.929f)
                lineTo(1.2f, 14.136f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 0.0f, -4.272f)
                lineToRelative(1.01f, -1.375f)
                curveToRelative(0.201f, -0.274f, 0.333f, -0.593f, 0.384f, -0.929f)
                lineToRelative(0.259f, -1.687f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 3.021f, -3.02f)
                lineToRelative(1.686f, -0.259f)
                curveToRelative(0.336f, -0.051f, 0.655f, -0.183f, 0.929f, -0.384f)
                lineTo(9.864f, 1.2f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 4.272f, 0.0f)
                close()
                moveTo(10.752f, 2.409f)
                lineTo(9.377f, 3.419f)
                arcToRelative(3.614f, 3.614f, 0.0f, false, true, -1.59f, 0.658f)
                lineToRelative(-1.686f, 0.258f)
                arcToRelative(2.111f, 2.111f, 0.0f, false, false, -1.766f, 1.766f)
                lineToRelative(-0.258f, 1.686f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -0.658f, 1.589f)
                lineToRelative(-1.01f, 1.376f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 0.0f, 2.496f)
                lineToRelative(1.01f, 1.375f)
                curveToRelative(0.344f, 0.469f, 0.57f, 1.015f, 0.658f, 1.59f)
                lineToRelative(0.258f, 1.686f)
                curveToRelative(0.14f, 0.911f, 0.855f, 1.626f, 1.766f, 1.766f)
                lineToRelative(1.686f, 0.258f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 1.589f, 0.658f)
                lineToRelative(1.376f, 1.01f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 2.496f, 0.0f)
                lineToRelative(1.375f, -1.01f)
                arcToRelative(3.613f, 3.613f, 0.0f, false, true, 1.59f, -0.657f)
                lineToRelative(1.686f, -0.26f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 1.766f, -1.765f)
                lineToRelative(0.258f, -1.686f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 0.658f, -1.589f)
                lineToRelative(1.01f, -1.376f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 0.0f, -2.496f)
                lineToRelative(-1.01f, -1.375f)
                arcToRelative(3.613f, 3.613f, 0.0f, false, true, -0.657f, -1.59f)
                lineToRelative(-0.26f, -1.686f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, -1.765f, -1.766f)
                lineToRelative(-1.686f, -0.258f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -1.589f, -0.658f)
                lineToRelative(-1.376f, -1.01f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, -2.496f, 0.0f)
                close()
            }
        }
        .build()
        return _verified24!!
    }

private var _verified24: ImageVector? = null
