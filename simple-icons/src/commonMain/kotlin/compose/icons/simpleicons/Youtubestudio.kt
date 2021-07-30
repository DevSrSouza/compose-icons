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

public val SimpleIcons.Youtubestudio: ImageVector
    get() {
        if (_youtubestudio != null) {
            return _youtubestudio!!
        }
        _youtubestudio = Builder(name = "Youtubestudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.919f, 13.176f)
                curveToRelative(0.048f, -0.384f, 0.084f, -0.768f, 0.084f, -1.176f)
                reflectiveCurveToRelative(-0.036f, -0.792f, -0.084f, -1.176f)
                lineToRelative(2.532f, -1.98f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.144f, -0.768f)
                lineToRelative(-2.4f, -4.152f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.732f, -0.264f)
                lineToRelative(-2.988f, 1.2f)
                arcToRelative(8.767f, 8.767f, 0.0f, false, false, -2.028f, -1.176f)
                lineToRelative(-0.456f, -3.18f)
                arcTo(0.585f, 0.585f, 0.0f, false, false, 14.403f, 0.0f)
                horizontalLineToRelative(-4.8f)
                curveToRelative(-0.3f, 0.0f, -0.552f, 0.216f, -0.588f, 0.504f)
                lineToRelative(-0.456f, 3.18f)
                arcTo(9.22f, 9.22f, 0.0f, false, false, 6.531f, 4.86f)
                lineToRelative(-2.988f, -1.2f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, false, -0.732f, 0.264f)
                lineToRelative(-2.4f, 4.152f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, false, 0.144f, 0.768f)
                lineToRelative(2.532f, 1.98f)
                curveToRelative(-0.048f, 0.384f, -0.084f, 0.78f, -0.084f, 1.176f)
                reflectiveCurveToRelative(0.036f, 0.792f, 0.084f, 1.176f)
                lineToRelative(-2.532f, 1.98f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, -0.144f, 0.768f)
                lineToRelative(2.4f, 4.152f)
                curveToRelative(0.144f, 0.264f, 0.468f, 0.36f, 0.732f, 0.264f)
                lineToRelative(2.988f, -1.2f)
                curveToRelative(0.624f, 0.48f, 1.296f, 0.876f, 2.028f, 1.176f)
                lineToRelative(0.456f, 3.18f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, false, 0.588f, 0.504f)
                horizontalLineToRelative(4.8f)
                curveToRelative(0.3f, 0.0f, 0.552f, -0.216f, 0.588f, -0.504f)
                lineToRelative(0.456f, -3.18f)
                arcToRelative(9.22f, 9.22f, 0.0f, false, false, 2.028f, -1.176f)
                lineToRelative(2.988f, 1.2f)
                curveToRelative(0.276f, 0.108f, 0.588f, 0.0f, 0.732f, -0.264f)
                lineToRelative(2.4f, -4.152f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, -0.144f, -0.768f)
                lineToRelative(-2.532f, -1.98f)
                close()
                moveTo(9.603f, 15.6f)
                verticalLineTo(8.4f)
                lineToRelative(6.0f, 3.6f)
                lineToRelative(-6.0f, 3.6f)
                close()
            }
        }
        .build()
        return _youtubestudio!!
    }

private var _youtubestudio: ImageVector? = null
