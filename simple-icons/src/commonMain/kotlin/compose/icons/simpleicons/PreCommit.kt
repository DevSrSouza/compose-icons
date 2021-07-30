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

public val SimpleIcons.PreCommit: ImageVector
    get() {
        if (_preCommit != null) {
            return _preCommit!!
        }
        _preCommit = Builder(name = "PreCommit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.355f, 10.444f)
                lineTo(13.556f, 0.645f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -3.112f, 0.0f)
                lineTo(0.645f, 10.444f)
                arcToRelative(2.201f, 2.201f, 0.0f, false, false, 0.0f, 3.112f)
                lineToRelative(9.799f, 9.799f)
                arcToRelative(2.201f, 2.201f, 0.0f, false, false, 3.112f, 0.0f)
                lineToRelative(9.799f, -9.799f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.0f, -3.112f)
                close()
                moveTo(21.698f, 13.362f)
                lineToRelative(-8.337f, 8.337f)
                arcToRelative(1.922f, 1.922f, 0.0f, false, true, -1.362f, 0.563f)
                curveToRelative(-0.493f, 0.0f, -0.986f, -0.188f, -1.362f, -0.563f)
                lineTo(2.3f, 13.362f)
                arcTo(1.92f, 1.92f, 0.0f, false, true, 1.738f, 12.0f)
                curveToRelative(0.0f, -0.514f, 0.2f, -0.998f, 0.564f, -1.362f)
                lineToRelative(8.337f, -8.337f)
                curveToRelative(0.363f, -0.363f, 0.847f, -0.563f, 1.361f, -0.563f)
                reflectiveCurveToRelative(0.998f, 0.2f, 1.362f, 0.564f)
                lineToRelative(8.337f, 8.337f)
                curveToRelative(0.75f, 0.75f, 0.75f, 1.972f, -0.001f, 2.723f)
                close()
                moveTo(14.195f, 9.76f)
                curveToRelative(0.094f, 0.173f, 0.142f, 0.399f, 0.142f, 0.678f)
                reflectiveCurveToRelative(-0.047f, 0.505f, -0.142f, 0.678f)
                curveToRelative(-0.095f, 0.173f, -0.22f, 0.306f, -0.376f, 0.401f)
                arcToRelative(1.485f, 1.485f, 0.0f, false, true, -0.542f, 0.191f)
                arcToRelative(4.033f, 4.033f, 0.0f, false, true, -0.641f, 0.049f)
                horizontalLineToRelative(-1.504f)
                lineTo(11.132f, 9.119f)
                horizontalLineToRelative(1.504f)
                curveToRelative(0.222f, 0.0f, 0.435f, 0.017f, 0.641f, 0.049f)
                curveToRelative(0.205f, 0.033f, 0.386f, 0.097f, 0.542f, 0.191f)
                curveToRelative(0.156f, 0.095f, 0.281f, 0.228f, 0.376f, 0.401f)
                close()
                moveTo(21.257f, 11.079f)
                lineTo(12.92f, 2.742f)
                curveToRelative(-0.245f, -0.245f, -0.572f, -0.381f, -0.92f, -0.381f)
                reflectiveCurveToRelative(-0.675f, 0.135f, -0.921f, 0.381f)
                lineToRelative(-8.337f, 8.337f)
                curveToRelative(-0.245f, 0.246f, -0.381f, 0.573f, -0.381f, 0.921f)
                reflectiveCurveToRelative(0.135f, 0.675f, 0.381f, 0.921f)
                lineToRelative(8.337f, 8.337f)
                arcToRelative(1.304f, 1.304f, 0.0f, false, false, 1.842f, 0.0f)
                lineToRelative(8.337f, -8.337f)
                arcToRelative(1.305f, 1.305f, 0.0f, false, false, -0.001f, -1.842f)
                close()
                moveTo(16.044f, 11.479f)
                arcToRelative(2.437f, 2.437f, 0.0f, false, true, -0.53f, 0.906f)
                arcToRelative(2.624f, 2.624f, 0.0f, false, true, -0.943f, 0.635f)
                curveToRelative(-0.386f, 0.16f, -0.855f, 0.24f, -1.405f, 0.24f)
                horizontalLineToRelative(-2.034f)
                verticalLineToRelative(3.155f)
                lineTo(9.197f, 16.415f)
                verticalLineToRelative(-8.8f)
                horizontalLineToRelative(3.969f)
                curveToRelative(0.55f, 0.0f, 1.019f, 0.08f, 1.405f, 0.24f)
                curveToRelative(0.386f, 0.16f, 0.7f, 0.372f, 0.943f, 0.635f)
                curveToRelative(0.242f, 0.263f, 0.419f, 0.563f, 0.53f, 0.9f)
                curveToRelative(0.111f, 0.337f, 0.166f, 0.686f, 0.166f, 1.048f)
                curveToRelative(0.0f, 0.353f, -0.055f, 0.7f, -0.166f, 1.041f)
                close()
            }
        }
        .build()
        return _preCommit!!
    }

private var _preCommit: ImageVector? = null
