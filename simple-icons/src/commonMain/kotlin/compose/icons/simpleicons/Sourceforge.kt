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

public val SimpleIcons.Sourceforge: ImageVector
    get() {
        if (_sourceforge != null) {
            return _sourceforge!!
        }
        _sourceforge = Builder(name = "Sourceforge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.998f, 1.465f)
                curveToRelative(-0.088f, 0.0f, -0.176f, 0.04f, -0.24f, 0.104f)
                lineTo(0.102f, 11.215f)
                curveToRelative(-0.136f, 0.128f, -0.136f, 0.344f, 0.0f, 0.481f)
                lineToRelative(9.152f, 9.135f)
                curveToRelative(0.064f, 0.072f, 0.152f, 0.105f, 0.24f, 0.105f)
                curveToRelative(0.088f, 0.0f, 0.174f, -0.041f, 0.238f, -0.105f)
                lineToRelative(1.369f, -1.385f)
                curveToRelative(0.136f, -0.128f, 0.136f, -0.344f, 0.0f, -0.481f)
                lineToRelative(-7.172f, -7.174f)
                arcToRelative(0.468f, 0.468f, 0.0f, false, true, 0.0f, -0.664f)
                lineToRelative(9.078f, -9.078f)
                curveToRelative(0.12f, -0.12f, 0.112f, -0.273f, 0.072f, -0.377f)
                curveToRelative(-0.04f, -0.096f, -0.144f, -0.207f, -0.313f, -0.207f)
                lineTo(9.998f, 1.465f)
                close()
                moveTo(14.529f, 3.057f)
                curveToRelative(-0.088f, 0.0f, -0.176f, 0.041f, -0.24f, 0.105f)
                lineToRelative(-1.393f, 1.393f)
                curveToRelative(-0.136f, 0.128f, -0.136f, 0.344f, 0.0f, 0.481f)
                lineToRelative(7.172f, 7.182f)
                curveToRelative(0.088f, 0.088f, 0.137f, 0.208f, 0.137f, 0.328f)
                curveToRelative(0.0f, 0.12f, -0.049f, 0.24f, -0.137f, 0.328f)
                lineToRelative(-9.078f, 9.078f)
                curveToRelative(-0.12f, 0.12f, -0.112f, 0.273f, -0.072f, 0.377f)
                curveToRelative(0.04f, 0.096f, 0.144f, 0.207f, 0.313f, 0.207f)
                verticalLineToRelative(-0.008f)
                lineTo(14.0f, 22.527f)
                curveToRelative(0.088f, 0.0f, 0.176f, -0.032f, 0.24f, -0.096f)
                lineToRelative(9.656f, -9.654f)
                curveToRelative(0.072f, -0.064f, 0.104f, -0.152f, 0.104f, -0.24f)
                curveToRelative(0.0f, -0.088f, -0.04f, -0.176f, -0.104f, -0.24f)
                lineToRelative(-9.127f, -9.135f)
                curveToRelative(-0.064f, -0.072f, -0.152f, -0.105f, -0.24f, -0.105f)
                close()
                moveTo(11.434f, 6.213f)
                curveToRelative(-0.112f, 0.005f, -0.216f, 0.101f, -0.211f, 0.238f)
                curveToRelative(0.144f, 2.218f, -2.642f, 2.763f, -2.642f, 6.246f)
                verticalLineToRelative(0.023f)
                curveToRelative(0.0f, 2.122f, 1.603f, 3.842f, 3.58f, 3.842f)
                curveToRelative(1.977f, 0.0f, 3.578f, -1.72f, 3.578f, -3.842f)
                verticalLineToRelative(-0.023f)
                curveToRelative(0.0f, -0.985f, -0.368f, -1.923f, -0.744f, -2.627f)
                curveToRelative(-0.072f, -0.136f, -0.29f, -0.087f, -0.266f, 0.041f)
                curveToRelative(0.673f, 2.994f, -1.016f, 4.851f, -1.016f, 2.545f)
                curveToRelative(0.0f, -3.931f, -1.394f, -5.716f, -2.131f, -6.389f)
                arcToRelative(0.207f, 0.207f, 0.0f, false, false, -0.148f, -0.055f)
                close()
            }
        }
        .build()
        return _sourceforge!!
    }

private var _sourceforge: ImageVector? = null
