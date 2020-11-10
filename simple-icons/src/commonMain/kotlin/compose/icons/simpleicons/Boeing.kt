package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Boeing: VectorAsset
    get() {
        if (_boeing != null) {
            return _boeing!!
        }
        _boeing = VectorAssetBuilder(name = "Boeing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.905f, 17.353f)
                arcToRelative(6.051f, 6.051f, 0.0f, false, true, -3.759f, -1.301f)
                curveTo(4.35f, 13.337f, 6.8f, 9.694f, 10.143f, 6.136f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, true, 2.262f, 7.728f)
                curveToRelative(-1.06f, -0.49f, -2.05f, -1.105f, -2.888f, -1.88f)
                lineToRelative(1.831f, 3.438f)
                arcToRelative(6.058f, 6.058f, 0.0f, false, true, -4.443f, 1.931f)
                moveTo(0.83f, 11.278f)
                arcToRelative(6.075f, 6.075f, 0.0f, false, true, 6.076f, -6.077f)
                curveToRelative(0.9f, 0.0f, 1.752f, 0.196f, 2.522f, 0.546f)
                curveToRelative(-3.293f, 2.91f, -5.843f, 6.293f, -7.352f, 9.217f)
                arcTo(6.051f, 6.051f, 0.0f, false, true, 0.83f, 11.278f)
                moveToRelative(12.34f, 2.912f)
                arcToRelative(6.862f, 6.862f, 0.0f, false, false, 0.642f, -2.912f)
                curveToRelative(0.0f, -2.4f, -1.225f, -4.515f, -3.085f, -5.753f)
                arcToRelative(49.606f, 49.606f, 0.0f, false, true, 3.583f, -3.342f)
                arcToRelative(31.172f, 31.172f, 0.0f, false, false, -4.2f, 2.975f)
                arcToRelative(6.907f, 6.907f, 0.0f, false, false, -8.436f, 10.625f)
                curveTo(0.35f, 18.646f, 0.12f, 20.944f, 1.286f, 21.72f)
                curveToRelative(1.248f, 0.832f, 3.962f, -0.677f, 5.59f, -3.134f)
                curveToRelative(0.0f, 0.0f, -2.518f, 2.273f, -3.902f, 1.751f)
                curveToRelative(-0.851f, -0.322f, -0.854f, -1.624f, -0.152f, -3.492f)
                arcToRelative(6.871f, 6.871f, 0.0f, false, false, 4.084f, 1.338f)
                curveToRelative(1.893f, 0.0f, 3.606f, -0.76f, 4.853f, -1.992f)
                lineToRelative(0.245f, 0.462f)
                curveTo(15.013f, 16.408f, 24.0f, 16.17f, 24.0f, 16.17f)
                curveToRelative(0.0f, -0.431f, -5.95f, -0.04f, -10.832f, -1.98f)
            }
        }
        .build()
        return _boeing!!
    }

private var _boeing: VectorAsset? = null
