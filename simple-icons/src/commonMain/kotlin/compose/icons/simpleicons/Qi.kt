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

public val SimpleIcons.Qi: VectorAsset
    get() {
        if (_qi != null) {
            return _qi!!
        }
        _qi = VectorAssetBuilder(name = "Qi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.574f, 0.0f)
                arcToRelative(1.524f, 1.524f, 0.0f, true, false, 0.0f, 3.049f)
                arcToRelative(1.524f, 1.524f, 0.0f, true, false, 0.0f, -3.049f)
                close()
                moveTo(11.812f, 2.857f)
                arcToRelative(7.627f, 7.627f, 0.0f, false, false, -0.01f, 15.246f)
                curveToRelative(0.297f, 0.0f, 0.296f, 0.293f, 0.296f, 0.293f)
                verticalLineToRelative(2.65f)
                reflectiveCurveToRelative(0.001f, 2.763f, 2.658f, 2.954f)
                curveToRelative(0.295f, 0.01f, 0.295f, -0.295f, 0.295f, -0.295f)
                lineTo(15.051f, 3.785f)
                reflectiveCurveToRelative(0.0f, -0.293f, -0.295f, -0.414f)
                arcToRelative(7.667f, 7.667f, 0.0f, false, false, -2.944f, -0.514f)
                close()
                moveTo(16.7f, 4.52f)
                curveToRelative(-0.124f, -0.02f, -0.123f, 0.167f, -0.123f, 0.386f)
                verticalLineToRelative(11.147f)
                curveToRelative(0.0f, 0.294f, -0.002f, 0.528f, 0.293f, 0.297f)
                curveToRelative(0.01f, -0.01f, 0.023f, -0.019f, 0.033f, -0.028f)
                arcToRelative(7.626f, 7.626f, 0.0f, false, false, -0.03f, -11.709f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.173f, -0.093f)
                close()
                moveTo(11.935f, 5.906f)
                curveToRelative(0.165f, 0.0f, 0.164f, 0.164f, 0.164f, 0.164f)
                verticalLineToRelative(8.82f)
                reflectiveCurveToRelative(0.0f, 0.165f, -0.164f, 0.165f)
                arcToRelative(4.577f, 4.577f, 0.0f, false, true, 0.0f, -9.148f)
                close()
            }
        }
        .build()
        return _qi!!
    }

private var _qi: VectorAsset? = null
