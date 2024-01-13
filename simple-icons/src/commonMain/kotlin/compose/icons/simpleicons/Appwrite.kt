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

public val SimpleIcons.Appwrite: ImageVector
    get() {
        if (_appwrite != null) {
            return _appwrite!!
        }
        _appwrite = Builder(name = "Appwrite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.291f)
                verticalLineToRelative(5.29f)
                lineTo(10.557f, 22.581f)
                arcTo(10.58f, 10.58f, 0.0f, false, true, 0.0f, 12.715f)
                verticalLineToRelative(-1.43f)
                curveToRelative(0.048f, -0.735f, 0.174f, -1.463f, 0.374f, -2.171f)
                curveTo(1.63f, 4.673f, 5.713f, 1.419f, 10.557f, 1.419f)
                curveToRelative(4.844f, 0.0f, 8.927f, 3.254f, 10.183f, 7.695f)
                horizontalLineToRelative(-5.749f)
                arcToRelative(5.283f, 5.283f, 0.0f, false, false, -4.434f, -2.404f)
                arcToRelative(5.282f, 5.282f, 0.0f, false, false, -4.434f, 2.404f)
                arcTo(5.23f, 5.23f, 0.0f, false, false, 5.267f, 12.0f)
                arcToRelative(5.27f, 5.27f, 0.0f, false, false, 1.66f, 3.848f)
                arcToRelative(5.27f, 5.27f, 0.0f, false, false, 3.63f, 1.443f)
                lineTo(24.0f, 17.291f)
                close()
                moveTo(24.0f, 10.557f)
                verticalLineToRelative(5.291f)
                horizontalLineToRelative(-9.813f)
                arcTo(5.276f, 5.276f, 0.0f, false, false, 15.848f, 12.0f)
                curveToRelative(0.0f, -0.5f, -0.07f, -0.984f, -0.199f, -1.443f)
                lineTo(24.0f, 10.557f)
                close()
            }
        }
        .build()
        return _appwrite!!
    }

private var _appwrite: ImageVector? = null
