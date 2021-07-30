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

public val SimpleIcons.Ifixit: ImageVector
    get() {
        if (_ifixit != null) {
            return _ifixit!!
        }
        _ifixit = Builder(name = "Ifixit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.345f, 12.506f)
                lineToRelative(2.37f, 3.131f)
                curveToRelative(0.198f, 0.261f, 0.211f, 0.69f, 0.025f, 0.961f)
                lineToRelative(-0.119f, 0.177f)
                curveToRelative(-0.181f, 0.27f, -0.55f, 0.645f, -0.814f, 0.831f)
                lineToRelative(-0.285f, 0.201f)
                curveToRelative(-0.266f, 0.195f, -0.697f, 0.195f, -0.956f, -0.016f)
                lineToRelative(-3.135f, -2.369f)
                curveToRelative(-0.255f, -0.195f, -0.681f, -0.195f, -0.94f, 0.0f)
                lineToRelative(-3.136f, 2.369f)
                curveToRelative(-0.258f, 0.211f, -0.689f, 0.211f, -0.956f, 0.03f)
                lineToRelative(-0.207f, -0.135f)
                curveToRelative(-0.27f, -0.181f, -0.641f, -0.556f, -0.825f, -0.81f)
                lineToRelative(-0.181f, -0.256f)
                curveToRelative(-0.186f, -0.27f, -0.18f, -0.689f, 0.018f, -0.96f)
                lineToRelative(2.377f, -3.149f)
                curveToRelative(0.195f, -0.256f, 0.195f, -0.675f, 0.0f, -0.945f)
                lineTo(6.197f, 8.43f)
                curveToRelative(-0.194f, -0.263f, -0.203f, -0.69f, -0.013f, -0.957f)
                lineToRelative(0.2f, -0.285f)
                curveToRelative(0.187f, -0.264f, 0.56f, -0.629f, 0.828f, -0.814f)
                lineToRelative(0.175f, -0.119f)
                curveToRelative(0.27f, -0.196f, 0.703f, -0.182f, 0.961f, 0.014f)
                lineToRelative(3.135f, 2.37f)
                curveToRelative(0.26f, 0.195f, 0.684f, 0.195f, 0.942f, 0.0f)
                lineToRelative(3.135f, -2.385f)
                curveToRelative(0.258f, -0.195f, 0.698f, -0.226f, 0.979f, -0.061f)
                lineToRelative(0.33f, 0.195f)
                curveToRelative(0.28f, 0.165f, 0.639f, 0.524f, 0.795f, 0.81f)
                lineToRelative(0.12f, 0.21f)
                curveToRelative(0.154f, 0.285f, 0.123f, 0.721f, -0.075f, 0.99f)
                lineToRelative(-2.37f, 3.135f)
                curveToRelative(-0.194f, 0.255f, -0.194f, 0.676f, 0.0f, 0.945f)
                lineToRelative(0.006f, 0.028f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.37f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.37f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ifixit!!
    }

private var _ifixit: ImageVector? = null
