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

public val SimpleIcons.Craftcms: ImageVector
    get() {
        if (_craftcms != null) {
            return _craftcms!!
        }
        _craftcms = Builder(name = "Craftcms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.474f, 0.0f)
                horizontalLineTo(2.526f)
                arcTo(2.516f, 2.516f, 0.0f, false, false, 0.0f, 2.526f)
                verticalLineToRelative(18.948f)
                arcTo(2.516f, 2.516f, 0.0f, false, false, 2.526f, 24.0f)
                horizontalLineToRelative(18.948f)
                arcTo(2.534f, 2.534f, 0.0f, false, false, 24.0f, 21.474f)
                verticalLineTo(2.526f)
                arcTo(2.516f, 2.516f, 0.0f, false, false, 21.474f, 0.0f)
                moveToRelative(-9.516f, 14.625f)
                curveToRelative(0.786f, 0.0f, 1.628f, -0.31f, 2.442f, -1.039f)
                lineToRelative(1.123f, 1.291f)
                curveToRelative(-1.18f, 0.955f, -2.527f, 1.488f, -3.874f, 1.488f)
                curveToRelative(-2.667f, 0.0f, -4.35f, -1.769f, -3.958f, -4.267f)
                curveToRelative(0.393f, -2.498f, 2.667f, -4.266f, 5.334f, -4.266f)
                curveToRelative(1.29f, 0.0f, 2.498f, 0.505f, 3.34f, 1.431f)
                lineToRelative(-1.572f, 1.291f)
                curveToRelative(-0.45f, -0.59f, -1.207f, -0.982f, -2.05f, -0.982f)
                curveToRelative(-1.6f, 0.0f, -2.834f, 1.039f, -3.087f, 2.526f)
                curveToRelative(-0.224f, 1.488f, 0.674f, 2.527f, 2.302f, 2.527f)
            }
        }
        .build()
        return _craftcms!!
    }

private var _craftcms: ImageVector? = null
