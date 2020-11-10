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

public val SimpleIcons.Periscope: VectorAsset
    get() {
        if (_periscope != null) {
            return _periscope!!
        }
        _periscope = VectorAssetBuilder(name = "Periscope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.135f, 24.0f)
                curveToRelative(1.875f, 0.0f, 9.314f, -8.439f, 9.314f, -14.096f)
                curveTo(21.449f, 4.49f, 17.22f, 0.0f, 12.135f, 0.0f)
                curveTo(6.78f, 0.0f, 2.551f, 4.488f, 2.551f, 9.904f)
                curveTo(2.551f, 15.56f, 9.99f, 24.0f, 12.135f, 24.0f)
                close()
                moveTo(10.639f, 3.846f)
                curveToRelative(0.485f, -0.12f, 0.995f, -0.185f, 1.524f, -0.185f)
                curveToRelative(3.0f, 0.0f, 5.581f, 2.551f, 5.581f, 5.865f)
                curveToRelative(0.0f, 2.985f, -2.581f, 5.535f, -5.596f, 5.535f)
                curveToRelative(-3.345f, 0.0f, -5.925f, -2.55f, -5.925f, -5.535f)
                curveToRelative(0.0f, -1.396f, 0.45f, -2.64f, 1.229f, -3.63f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 1.245f, 1.006f, 2.234f, 2.25f, 2.234f)
                curveTo(10.948f, 8.161f, 12.0f, 7.14f, 12.0f, 5.896f)
                curveToRelative(0.0f, -0.919f, -0.56f, -1.708f, -1.359f, -2.053f)
                lineToRelative(-0.002f, 0.003f)
                close()
            }
        }
        .build()
        return _periscope!!
    }

private var _periscope: VectorAsset? = null
