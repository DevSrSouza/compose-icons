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

public val SimpleIcons.NewRelic: VectorAsset
    get() {
        if (_newRelic != null) {
            return _newRelic!!
        }
        _newRelic = VectorAssetBuilder(name = "NewRelic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9994f, 16.3548f)
                arcToRelative(4.354f, 4.354f, 0.0f, true, true, 4.354f, -4.354f)
                arcToRelative(4.3598f, 4.3598f, 0.0f, false, true, -4.354f, 4.354f)
                close()
                moveTo(11.9994f, 8.2215f)
                arcToRelative(3.7793f, 3.7793f, 0.0f, true, false, 3.7793f, 3.7792f)
                arcToRelative(3.7836f, 3.7836f, 0.0f, false, false, -3.7793f, -3.7792f)
                close()
                moveTo(13.0283f, 19.1396f)
                arcToRelative(6.9722f, 6.9722f, 0.0f, true, true, 6.9737f, -6.9722f)
                arcToRelative(6.9808f, 6.9808f, 0.0f, false, true, -6.9737f, 6.9722f)
                close()
                moveTo(13.0283f, 5.7757f)
                arcToRelative(6.3974f, 6.3974f, 0.0f, true, false, 6.3989f, 6.3975f)
                arcToRelative(6.4046f, 6.4046f, 0.0f, false, false, -6.399f, -6.4032f)
                close()
                moveTo(10.8556f, 21.7737f)
                curveToRelative(-5.3657f, 0.0f, -9.7571f, -2.9617f, -10.6782f, -7.2037f)
                curveTo(-0.9521f, 9.3725f, 3.4307f, 3.991f, 9.9488f, 2.5727f)
                arcToRelative(15.0552f, 15.0552f, 0.0f, false, true, 3.193f, -0.3463f)
                curveToRelative(5.3657f, 0.0f, 9.7571f, 2.9616f, 10.6782f, 7.2021f)
                curveToRelative(0.5504f, 2.5305f, -0.171f, 5.1732f, -2.0319f, 7.445f)
                curveToRelative(-1.8609f, 2.2719f, -4.5983f, 3.8684f, -7.7396f, 4.5524f)
                arcToRelative(15.0495f, 15.0495f, 0.0f, false, true, -3.193f, 0.3477f)
                close()
                moveTo(13.1404f, 2.8055f)
                arcToRelative(14.479f, 14.479f, 0.0f, false, false, -3.0694f, 0.329f)
                curveTo(3.8632f, 4.484f, -0.3241f, 9.5594f, 0.7392f, 14.448f)
                curveToRelative(0.8622f, 3.9747f, 5.0295f, 6.7538f, 10.1164f, 6.7538f)
                arcToRelative(14.4833f, 14.4833f, 0.0f, false, false, 3.0708f, -0.3334f)
                curveToRelative(3.0177f, -0.6567f, 5.653f, -2.2029f, 7.4163f, -4.354f)
                curveToRelative(1.7631f, -2.1512f, 2.427f, -4.5984f, 1.9154f, -6.9593f)
                curveToRelative(-0.8636f, -3.9776f, -5.0236f, -6.7538f, -10.1163f, -6.7538f)
                close()
            }
        }
        .build()
        return _newRelic!!
    }

private var _newRelic: VectorAsset? = null
