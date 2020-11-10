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

public val SimpleIcons.Favro: VectorAsset
    get() {
        if (_favro != null) {
            return _favro!!
        }
        _favro = VectorAssetBuilder(name = "Favro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.586f, 1.655f)
                arcToRelative(6.623f, 6.623f, 0.0f, false, false, -6.621f, 6.621f)
                verticalLineToRelative(0.772f)
                arcToRelative(7.503f, 7.503f, 0.0f, false, true, 3.31f, 3.269f)
                lineTo(8.275f, 8.276f)
                arcToRelative(3.302f, 3.302f, 0.0f, false, true, 3.31f, -3.31f)
                curveToRelative(0.91f, 0.0f, 1.655f, -0.745f, 1.655f, -1.655f)
                reflectiveCurveToRelative(-0.745f, -1.655f, -1.655f, -1.655f)
                close()
                moveTo(1.655f, 9.103f)
                curveTo(0.745f, 9.103f, 0.0f, 9.848f, 0.0f, 10.758f)
                reflectiveCurveToRelative(0.745f, 1.655f, 1.655f, 1.655f)
                arcToRelative(3.302f, 3.302f, 0.0f, false, true, 3.31f, 3.31f)
                verticalLineToRelative(4.966f)
                curveToRelative(0.0f, 0.91f, 0.745f, 1.655f, 1.655f, 1.655f)
                reflectiveCurveToRelative(1.655f, -0.745f, 1.655f, -1.655f)
                verticalLineToRelative(-4.966f)
                arcToRelative(6.623f, 6.623f, 0.0f, false, false, -6.621f, -6.621f)
                close()
                moveTo(17.379f, 9.103f)
                curveToRelative(-3.655f, 0.0f, -6.621f, 2.966f, -6.621f, 6.621f)
                reflectiveCurveToRelative(2.966f, 6.621f, 6.621f, 6.621f)
                arcToRelative(6.583f, 6.583f, 0.0f, false, false, 3.462f, -0.979f)
                curveToRelative(0.262f, 0.579f, 0.841f, 0.979f, 1.503f, 0.979f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, false, 1.655f, -1.655f)
                verticalLineToRelative(-9.931f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, false, -1.655f, -1.655f)
                curveToRelative(-0.676f, 0.0f, -1.241f, 0.4f, -1.503f, 0.979f)
                arcToRelative(6.574f, 6.574f, 0.0f, false, false, -3.462f, -0.979f)
                close()
                moveTo(17.379f, 12.414f)
                curveToRelative(1.834f, 0.0f, 3.31f, 1.476f, 3.31f, 3.31f)
                reflectiveCurveToRelative(-1.476f, 3.31f, -3.31f, 3.31f)
                curveToRelative(-1.835f, 0.0f, -3.31f, -1.476f, -3.31f, -3.31f)
                reflectiveCurveToRelative(1.476f, -3.31f, 3.31f, -3.31f)
                close()
            }
        }
        .build()
        return _favro!!
    }

private var _favro: VectorAsset? = null
