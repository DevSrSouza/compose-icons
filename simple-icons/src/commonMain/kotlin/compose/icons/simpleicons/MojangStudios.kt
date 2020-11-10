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

public val SimpleIcons.MojangStudios: VectorAsset
    get() {
        if (_mojangStudios != null) {
            return _mojangStudios!!
        }
        _mojangStudios = VectorAssetBuilder(name = "MojangStudios", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.912f, 0.0f)
                arcTo(6.913f, 6.913f, 0.0f, false, false, 0.0f, 6.912f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(17.088f)
                arcTo(6.912f, 6.912f, 0.0f, false, false, 24.0f, 17.088f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-4.992f)
                close()
                moveTo(17.023f, 2.594f)
                curveToRelative(0.566f, 0.0f, 1.024f, 2.505f, 1.024f, 3.07f)
                arcToRelative(1.024f, 1.024f, 0.0f, true, true, -2.047f, 0.0f)
                curveToRelative(0.0f, -0.565f, 0.459f, -3.07f, 1.023f, -3.07f)
                close()
                moveTo(14.41f, 5.498f)
                curveToRelative(0.69f, 0.19f, 2.082f, 3.77f, 3.637f, 2.215f)
                curveToRelative(1.448f, -1.448f, 2.049f, 7.164f, 2.049f, 7.164f)
                lineToRelative(-2.05f, -1.022f)
                reflectiveCurveToRelative(0.002f, -2.048f, -3.07f, -4.095f)
                curveToRelative(-3.809f, -2.54f, -8.189f, -0.867f, -8.189f, 3.07f)
                curveToRelative(0.0f, 8.033f, 13.309f, 5.12f, 13.309f, 5.12f)
                reflectiveCurveToRelative(-0.002f, 2.046f, -2.05f, 2.046f)
                lineTo(5.765f, 19.996f)
                curveToRelative(-2.047f, 0.0f, -2.05f, -2.047f, -2.05f, -2.047f)
                lineTo(3.715f, 7.713f)
                curveToRelative(0.0f, -2.048f, 2.05f, -2.049f, 2.05f, -2.049f)
                horizontalLineToRelative(4.093f)
                curveToRelative(2.048f, 0.0f, 4.096f, 2.049f, 4.096f, 2.049f)
                curveToRelative(0.0f, -1.49f, 0.117f, -2.098f, 0.328f, -2.205f)
                arcToRelative(0.175f, 0.175f, 0.0f, false, true, 0.13f, -0.01f)
                close()
            }
        }
        .build()
        return _mojangStudios!!
    }

private var _mojangStudios: VectorAsset? = null
