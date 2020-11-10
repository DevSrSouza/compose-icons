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

public val SimpleIcons.Clockify: VectorAsset
    get() {
        if (_clockify != null) {
            return _clockify!!
        }
        _clockify = VectorAssetBuilder(name = "Clockify", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.979f, 8.248f)
                lineToRelative(5.438f, -5.514f)
                lineToRelative(1.557f, 1.577f)
                lineToRelative(-5.438f, 5.514f)
                lineToRelative(-1.558f, -1.577f)
                close()
                moveTo(12.776f, 13.883f)
                arcToRelative(1.911f, 1.911f, 0.0f, false, true, -1.364f, -0.577f)
                arcToRelative(1.987f, 1.987f, 0.0f, false, true, -0.562f, -1.385f)
                curveToRelative(0.0f, -1.082f, 0.862f, -1.96f, 1.925f, -1.96f)
                curveToRelative(1.064f, 0.0f, 1.928f, 0.878f, 1.928f, 1.96f)
                curveToRelative(0.0f, 0.516f, -0.201f, 1.012f, -0.563f, 1.385f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, true, -1.364f, 0.577f)
                close()
                moveTo(21.998f, 19.578f)
                lineToRelative(-1.556f, 1.579f)
                lineToRelative(-5.438f, -5.515f)
                lineToRelative(1.558f, -1.577f)
                lineToRelative(5.436f, 5.513f)
                close()
                moveTo(12.834f, 20.403f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, false, 3.097f, -0.615f)
                lineToRelative(2.656f, 2.695f)
                arcTo(11.643f, 11.643f, 0.0f, false, true, 12.834f, 24.0f)
                curveTo(6.298f, 24.0f, 1.0f, 18.627f, 1.0f, 12.0f)
                reflectiveCurveTo(6.299f, 0.0f, 12.834f, 0.0f)
                curveToRelative(2.068f, 0.0f, 4.012f, 0.54f, 5.703f, 1.486f)
                lineToRelative(-2.611f, 2.65f)
                arcToRelative(8.127f, 8.127f, 0.0f, false, false, -3.092f, -0.613f)
                curveToRelative(-4.577f, 0.0f, -8.287f, 3.78f, -8.287f, 8.44f)
                curveToRelative(0.0f, 4.661f, 3.71f, 8.44f, 8.287f, 8.44f)
                close()
            }
        }
        .build()
        return _clockify!!
    }

private var _clockify: VectorAsset? = null
