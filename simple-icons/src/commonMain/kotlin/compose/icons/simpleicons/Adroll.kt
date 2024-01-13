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

public val SimpleIcons.Adroll: ImageVector
    get() {
        if (_adroll != null) {
            return _adroll!!
        }
        _adroll = Builder(name = "Adroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, -6.01f, -4.727f, -10.886f, -10.886f, -10.886f)
                arcToRelative(10.863f, 10.863f, 0.0f, false, false, -9.508f, 5.578f)
                lineTo(8.914f, 12.0f)
                curveToRelative(0.0f, -2.323f, 1.958f, -4.2f, 4.2f, -4.2f)
                curveToRelative(2.377f, 0.0f, 4.2f, 1.877f, 4.2f, 4.2f)
                reflectiveCurveToRelative(-1.836f, 4.2f, -4.2f, 4.2f)
                horizontalLineTo(4.065f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 0.0f, 20.266f)
                verticalLineToRelative(2.62f)
                horizontalLineToRelative(13.114f)
                curveTo(19.232f, 22.886f, 24.0f, 18.01f, 24.0f, 12.0f)
            }
        }
        .build()
        return _adroll!!
    }

private var _adroll: ImageVector? = null
