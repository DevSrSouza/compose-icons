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

public val SimpleIcons.Near: ImageVector
    get() {
        if (_near != null) {
            return _near!!
        }
        _near = Builder(name = "Near", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.443f, 0.0f)
                curveToRelative(-0.89f, 0.0f, -1.714f, 0.46f, -2.18f, 1.218f)
                lineToRelative(-5.017f, 7.448f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, 0.792f, 0.7f)
                lineToRelative(4.938f, -4.282f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.334f, 0.151f)
                verticalLineToRelative(13.41f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.354f, 0.128f)
                lineTo(5.03f, 0.905f)
                arcTo(2.555f, 2.555f, 0.0f, false, false, 3.078f, 0.0f)
                horizontalLineToRelative(-0.521f)
                arcTo(2.557f, 2.557f, 0.0f, false, false, 0.0f, 2.557f)
                verticalLineToRelative(18.886f)
                arcToRelative(2.557f, 2.557f, 0.0f, false, false, 4.736f, 1.338f)
                lineToRelative(5.017f, -7.448f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, -0.792f, -0.7f)
                lineToRelative(-4.938f, 4.283f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.333f, -0.152f)
                verticalLineTo(5.352f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.354f, -0.128f)
                lineToRelative(14.924f, 17.87f)
                curveToRelative(0.486f, 0.574f, 1.2f, 0.905f, 1.952f, 0.906f)
                horizontalLineToRelative(0.521f)
                arcTo(2.558f, 2.558f, 0.0f, false, false, 24.0f, 21.445f)
                verticalLineTo(2.557f)
                arcTo(2.558f, 2.558f, 0.0f, false, false, 21.443f, 0.0f)
                close()
            }
        }
        .build()
        return _near!!
    }

private var _near: ImageVector? = null
