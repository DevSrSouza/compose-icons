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

public val SimpleIcons.Backendless: ImageVector
    get() {
        if (_backendless != null) {
            return _backendless!!
        }
        _backendless = Builder(name = "Backendless", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.215f, 6.16f)
                curveTo(2.354f, 6.147f, 0.584f, 6.953f, 0.0f, 8.19f)
                curveToRelative(3.68f, -0.998f, 5.747f, -0.332f, 8.244f, 2.638f)
                curveToRelative(0.99f, 1.184f, 1.895f, 2.45f, 2.992f, 3.51f)
                curveToRelative(1.098f, 1.08f, 2.303f, 2.161f, 3.637f, 2.826f)
                curveToRelative(2.97f, 1.475f, 6.802f, 0.415f, 8.05f, -1.994f)
                curveToRelative(-0.387f, 0.145f, -0.752f, 0.27f, -1.118f, 0.416f)
                curveToRelative(-1.693f, 1.181f, -3.92f, 1.204f, -5.748f, -0.375f)
                curveToRelative(-1.873f, -1.62f, -3.487f, -3.532f, -5.166f, -5.36f)
                curveTo(9.276f, 8.107f, 7.555f, 6.55f, 5.016f, 6.217f)
                arcToRelative(6.243f, 6.243f, 0.0f, false, false, -0.801f, -0.057f)
                close()
                moveTo(19.854f, 7.879f)
                curveToRelative(-0.957f, -0.013f, -2.0f, 0.301f, -3.043f, 0.976f)
                curveToRelative(-1.034f, 0.686f, -1.96f, 1.538f, -2.971f, 2.348f)
                curveToRelative(-0.603f, -0.395f, -1.204f, -0.81f, -1.807f, -1.205f)
                curveToRelative(-0.043f, 0.062f, -0.11f, 0.145f, -0.152f, 0.207f)
                curveToRelative(0.15f, 0.187f, 0.324f, 0.354f, 0.474f, 0.54f)
                curveToRelative(0.861f, 0.956f, 1.743f, 1.931f, 2.69f, 2.866f)
                curveToRelative(0.947f, -0.852f, 1.723f, -1.598f, 2.562f, -2.305f)
                curveToRelative(2.411f, -2.035f, 4.628f, -1.725f, 6.393f, 1.038f)
                curveToRelative(-0.355f, -2.828f, -2.042f, -4.437f, -4.146f, -4.465f)
                close()
                moveTo(4.393f, 12.615f)
                curveToRelative(1.291f, 5.422f, 4.733f, 4.902f, 7.08f, 3.738f)
                curveToRelative(0.624f, 0.291f, 1.528f, 0.603f, 2.109f, 0.873f)
                curveToRelative(0.043f, -0.062f, 0.107f, -0.125f, 0.15f, -0.187f)
                curveToRelative(-1.033f, -0.665f, -1.978f, -1.538f, -2.84f, -2.37f)
                curveToRelative(-0.215f, -0.207f, -0.41f, -0.415f, -0.603f, -0.622f)
                curveToRelative(-3.336f, 2.866f, -5.896f, -1.432f, -5.896f, -1.432f)
                close()
            }
        }
        .build()
        return _backendless!!
    }

private var _backendless: ImageVector? = null
