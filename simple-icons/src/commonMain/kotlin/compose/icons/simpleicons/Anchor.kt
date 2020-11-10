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

public val SimpleIcons.Anchor: VectorAsset
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = VectorAssetBuilder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.335f, 12.606f)
                curveToRelative(-0.171f, 0.682f, -0.586f, 1.261f, -1.139f, 1.564f)
                lineToRelative(-0.428f, 0.234f)
                lineToRelative(0.78f, 1.32f)
                lineToRelative(0.41f, -0.226f)
                arcToRelative(3.743f, 3.743f, 0.0f, false, false, 1.435f, -1.44f)
                arcToRelative(4.404f, 4.404f, 0.0f, false, false, 0.565f, -2.1f)
                verticalLineToRelative(-0.016f)
                arcToRelative(4.403f, 4.403f, 0.0f, false, false, -0.565f, -2.1f)
                arcToRelative(3.744f, 3.744f, 0.0f, false, false, -1.434f, -1.44f)
                lineToRelative(-0.41f, -0.225f)
                lineToRelative(-0.78f, 1.32f)
                lineToRelative(0.427f, 0.234f)
                curveToRelative(0.571f, 0.312f, 0.995f, 0.92f, 1.155f, 1.632f)
                lineTo(7.244f, 11.363f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -1.24f, -0.743f)
                curveToRelative(-0.77f, 0.0f, -1.396f, 0.617f, -1.396f, 1.377f)
                curveToRelative(0.0f, 0.759f, 0.626f, 1.377f, 1.396f, 1.377f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 1.252f, -0.768f)
                close()
                moveTo(12.0f, 24.0f)
                curveTo(6.392f, 24.0f, 1.846f, 18.627f, 1.846f, 12.0f)
                reflectiveCurveTo(6.392f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.154f, 5.373f, 10.154f, 12.0f)
                reflectiveCurveTo(17.608f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(17.591f, 12.836f)
                curveToRelative(-0.29f, 2.825f, -1.867f, 5.206f, -4.06f, 6.377f)
                lineToRelative(0.829f, 1.368f)
                curveToRelative(2.846f, -1.526f, 4.83f, -4.767f, 4.896f, -8.538f)
                curveToRelative(-0.066f, -3.771f, -2.05f, -7.012f, -4.896f, -8.539f)
                lineToRelative(-0.83f, 1.37f)
                curveToRelative(2.194f, 1.17f, 3.771f, 3.55f, 4.061f, 6.375f)
                lineToRelative(0.023f, 0.794f)
                close()
                moveTo(12.939f, 18.172f)
                lineToRelative(0.194f, -0.107f)
                curveToRelative(0.995f, -0.547f, 1.841f, -1.398f, 2.446f, -2.46f)
                arcToRelative(7.645f, 7.645f, 0.0f, false, false, 0.98f, -3.648f)
                verticalLineToRelative(-0.008f)
                arcToRelative(7.645f, 7.645f, 0.0f, false, false, -0.98f, -3.647f)
                curveToRelative(-0.605f, -1.063f, -1.451f, -1.914f, -2.446f, -2.46f)
                lineToRelative(-0.194f, -0.108f)
                lineToRelative(-0.79f, 1.336f)
                lineToRelative(0.203f, 0.11f)
                arcToRelative(4.892f, 4.892f, 0.0f, false, true, 1.772f, 1.702f)
                curveToRelative(0.467f, 0.744f, 0.763f, 1.62f, 0.856f, 2.535f)
                lineToRelative(0.015f, 0.536f)
                lineToRelative(-0.015f, 0.535f)
                arcToRelative(5.905f, 5.905f, 0.0f, false, true, -0.856f, 2.536f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, true, -1.772f, 1.701f)
                lineToRelative(-0.203f, 0.111f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: VectorAsset? = null
