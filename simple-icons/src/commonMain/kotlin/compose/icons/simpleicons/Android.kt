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

public val SimpleIcons.Android: VectorAsset
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = VectorAssetBuilder(name = "Android", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.523f, 15.3414f)
                curveToRelative(-0.5511f, 0.0f, -0.9993f, -0.4486f, -0.9993f, -0.9997f)
                reflectiveCurveToRelative(0.4483f, -0.9993f, 0.9993f, -0.9993f)
                curveToRelative(0.5511f, 0.0f, 0.9993f, 0.4483f, 0.9993f, 0.9993f)
                curveToRelative(1.0E-4f, 0.5511f, -0.4482f, 0.9997f, -0.9993f, 0.9997f)
                moveToRelative(-11.046f, 0.0f)
                curveToRelative(-0.5511f, 0.0f, -0.9993f, -0.4486f, -0.9993f, -0.9997f)
                reflectiveCurveToRelative(0.4482f, -0.9993f, 0.9993f, -0.9993f)
                curveToRelative(0.5511f, 0.0f, 0.9993f, 0.4483f, 0.9993f, 0.9993f)
                curveToRelative(0.0f, 0.5511f, -0.4483f, 0.9997f, -0.9993f, 0.9997f)
                moveToRelative(11.4045f, -6.02f)
                lineToRelative(1.9973f, -3.4592f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, -0.1521f, -0.5676f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, -0.5676f, 0.1521f)
                lineToRelative(-2.0223f, 3.503f)
                curveTo(15.5902f, 8.2439f, 13.8533f, 7.8508f, 12.0f, 7.8508f)
                reflectiveCurveToRelative(-3.5902f, 0.3931f, -5.1367f, 1.0989f)
                lineTo(4.841f, 5.4467f)
                arcToRelative(0.4161f, 0.4161f, 0.0f, false, false, -0.5677f, -0.1521f)
                arcToRelative(0.4157f, 0.4157f, 0.0f, false, false, -0.1521f, 0.5676f)
                lineToRelative(1.9973f, 3.4592f)
                curveTo(2.6889f, 11.1867f, 0.3432f, 14.6589f, 0.0f, 18.761f)
                horizontalLineToRelative(24.0f)
                curveToRelative(-0.3435f, -4.1021f, -2.6892f, -7.5743f, -6.1185f, -9.4396f)
            }
        }
        .build()
        return _android!!
    }

private var _android: VectorAsset? = null
