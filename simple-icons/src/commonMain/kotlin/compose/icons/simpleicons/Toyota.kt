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

public val SimpleIcons.Toyota: VectorAsset
    get() {
        if (_toyota != null) {
            return _toyota!!
        }
        _toyota = VectorAssetBuilder(name = "Toyota", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.236f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 3.476f, -12.0f, 7.762f)
                curveToRelative(0.0f, 4.289f, 5.373f, 7.766f, 12.0f, 7.766f)
                reflectiveCurveToRelative(12.0f, -3.476f, 12.0f, -7.766f)
                reflectiveCurveToRelative(-5.373f, -7.762f, -12.0f, -7.762f)
                close()
                moveTo(12.0f, 16.432f)
                curveToRelative(-0.986f, 0.0f, -1.79f, -1.942f, -1.84f, -4.385f)
                arcToRelative(21.093f, 21.093f, 0.0f, false, false, 3.68f, 0.0f)
                curveToRelative(-0.05f, 2.442f, -0.854f, 4.385f, -1.84f, 4.385f)
                close()
                moveTo(10.281f, 10.108f)
                curveToRelative(0.268f, -1.727f, 0.937f, -2.953f, 1.719f, -2.953f)
                reflectiveCurveToRelative(1.45f, 1.226f, 1.719f, 2.953f)
                arcToRelative(19.436f, 19.436f, 0.0f, false, true, -3.438f, 0.0f)
                close()
                moveTo(12.0f, 5.358f)
                curveToRelative(-1.287f, 0.0f, -2.385f, 1.928f, -2.79f, 4.619f)
                curveToRelative(-2.44f, -0.38f, -4.143f, -1.248f, -4.143f, -2.256f)
                curveToRelative(0.0f, -1.36f, 3.104f, -2.461f, 6.933f, -2.461f)
                curveToRelative(3.83f, 0.0f, 6.933f, 1.102f, 6.933f, 2.461f)
                curveToRelative(0.0f, 1.008f, -1.703f, 1.876f, -4.143f, 2.256f)
                curveToRelative(-0.405f, -2.69f, -1.503f, -4.618f, -2.79f, -4.618f)
                close()
                moveTo(1.72f, 11.708f)
                curveToRelative(0.0f, -1.315f, 0.507f, -2.55f, 1.388f, -3.61f)
                curveToRelative(-0.009f, 0.074f, -0.015f, 0.15f, -0.015f, 0.226f)
                curveToRelative(0.0f, 1.657f, 2.485f, 3.07f, 5.953f, 3.59f)
                curveToRelative(-0.003f, 0.12f, -0.003f, 0.242f, -0.003f, 0.364f)
                curveToRelative(0.0f, 3.09f, 0.866f, 5.705f, 2.063f, 6.593f)
                curveToRelative(-5.26f, -0.317f, -9.385f, -3.403f, -9.385f, -7.163f)
                close()
                moveTo(12.894f, 18.871f)
                curveToRelative(1.197f, -0.888f, 2.063f, -3.504f, 2.063f, -6.593f)
                curveToRelative(0.0f, -0.123f, -0.002f, -0.243f, -0.003f, -0.363f)
                curveToRelative(3.466f, -0.52f, 5.953f, -1.932f, 5.953f, -3.591f)
                curveToRelative(0.0f, -0.076f, -0.006f, -0.152f, -0.015f, -0.226f)
                curveToRelative(0.881f, 1.063f, 1.387f, 2.295f, 1.387f, 3.61f)
                curveToRelative(0.0f, 3.76f, -4.125f, 6.846f, -9.385f, 7.163f)
                close()
                moveTo(12.894f, 18.871f)
                close()
            }
        }
        .build()
        return _toyota!!
    }

private var _toyota: VectorAsset? = null
