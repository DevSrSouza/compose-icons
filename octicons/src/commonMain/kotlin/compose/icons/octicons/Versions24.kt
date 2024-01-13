package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Versions24: ImageVector
    get() {
        if (_versions24 != null) {
            return _versions24!!
        }
        _versions24 = Builder(name = "Versions24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(8.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
                moveTo(9.5f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(21.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(10.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(6.17f, 4.165f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.335f, 1.006f)
                curveToRelative(-0.228f, 0.114f, -0.295f, 0.177f, -0.315f, 0.201f)
                arcToRelative(0.035f, 0.035f, 0.0f, false, false, -0.008f, 0.016f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.012f, 0.112f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.07f, 0.008f, 0.102f, 0.012f, 0.112f)
                arcToRelative(0.03f, 0.03f, 0.0f, false, false, 0.008f, 0.016f)
                curveToRelative(0.02f, 0.024f, 0.087f, 0.087f, 0.315f, 0.201f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -0.67f, 1.342f)
                curveToRelative(-0.272f, -0.136f, -0.58f, -0.315f, -0.81f, -0.598f)
                curveTo(4.1f, 19.259f, 4.0f, 18.893f, 4.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -0.393f, 0.1f, -0.759f, 0.355f, -1.073f)
                curveToRelative(0.23f, -0.283f, 0.538f, -0.462f, 0.81f, -0.598f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.006f, 0.336f)
                close()
                moveTo(2.15f, 5.624f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.274f, 1.025f)
                curveToRelative(-0.15f, 0.087f, -0.257f, 0.17f, -0.32f, 0.245f)
                curveTo(1.5f, 6.96f, 1.5f, 6.99f, 1.5f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.04f, 0.056f, 0.106f)
                curveToRelative(0.063f, 0.074f, 0.17f, 0.158f, 0.32f, 0.245f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.752f, 1.298f)
                curveTo(0.73f, 18.421f, 0.0f, 17.907f, 0.0f, 17.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -0.907f, 0.73f, -1.42f, 1.124f, -1.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.025f, 0.274f)
                close()
            }
        }
        .build()
        return _versions24!!
    }

private var _versions24: ImageVector? = null
