package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4395f, 5.5586f)
                curveToRelative(-0.675f, 1.1664f, -1.352f, 2.3318f, -2.0274f, 3.498f)
                curveToRelative(-0.0366f, -0.0155f, -0.0742f, -0.0286f, -0.1113f, -0.043f)
                curveToRelative(-1.8249f, -0.6957f, -3.484f, -0.8f, -4.42f, -0.787f)
                curveToRelative(-1.8551f, 0.0185f, -3.3544f, 0.4643f, -4.2597f, 0.8203f)
                curveToRelative(-0.084f, -0.1494f, -1.7526f, -3.021f, -2.0215f, -3.4864f)
                arcToRelative(1.1451f, 1.1451f, 0.0f, false, false, -0.1406f, -0.1914f)
                curveToRelative(-0.3312f, -0.364f, -0.9054f, -0.4859f, -1.379f, -0.203f)
                curveToRelative(-0.475f, 0.282f, -0.7136f, 0.9361f, -0.3886f, 1.5019f)
                curveToRelative(1.9466f, 3.3696f, -0.0966f, -0.2158f, 1.9473f, 3.3593f)
                curveToRelative(0.0172f, 0.031f, -0.4946f, 0.2642f, -1.3926f, 1.0177f)
                curveTo(2.8987f, 12.176f, 0.452f, 14.772f, 0.0f, 18.9902f)
                horizontalLineToRelative(24.0f)
                curveToRelative(-0.119f, -1.1108f, -0.3686f, -2.099f, -0.7461f, -3.0683f)
                curveToRelative(-0.7438f, -1.9118f, -1.8435f, -3.2928f, -2.7402f, -4.1836f)
                arcToRelative(12.1048f, 12.1048f, 0.0f, false, false, -2.1309f, -1.6875f)
                curveToRelative(0.6594f, -1.122f, 1.312f, -2.2559f, 1.9649f, -3.3848f)
                curveToRelative(0.2077f, -0.3615f, 0.1886f, -0.7956f, -0.0079f, -1.1191f)
                arcToRelative(1.1001f, 1.1001f, 0.0f, false, false, -0.8515f, -0.5332f)
                curveToRelative(-0.5225f, -0.0536f, -0.9392f, 0.3128f, -1.0488f, 0.5449f)
                close()
                moveTo(18.4004f, 14.0196f)
                curveToRelative(0.3944f, 0.5926f, 0.324f, 1.3306f, -0.1563f, 1.6503f)
                curveToRelative(-0.4799f, 0.3197f, -1.188f, 0.0985f, -1.582f, -0.4941f)
                curveToRelative(-0.3944f, -0.5927f, -0.324f, -1.3307f, 0.1563f, -1.6504f)
                curveToRelative(0.4727f, -0.315f, 1.1812f, -0.1086f, 1.582f, 0.4941f)
                close()
                moveTo(7.207f, 13.5273f)
                curveToRelative(0.4803f, 0.3197f, 0.5506f, 1.0577f, 0.1563f, 1.6504f)
                curveToRelative(-0.394f, 0.5926f, -1.1038f, 0.8138f, -1.584f, 0.4941f)
                curveToRelative(-0.48f, -0.3197f, -0.5503f, -1.0577f, -0.1563f, -1.6504f)
                curveToRelative(0.4008f, -0.6021f, 1.1087f, -0.8106f, 1.584f, -0.4941f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
