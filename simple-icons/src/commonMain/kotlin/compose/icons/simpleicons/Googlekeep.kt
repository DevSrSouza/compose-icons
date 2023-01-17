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

public val SimpleIcons.Googlekeep: ImageVector
    get() {
        if (_googlekeep != null) {
            return _googlekeep!!
        }
        _googlekeep = Builder(name = "Googlekeep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.908f, 0.0f)
                curveToRelative(-0.904f, 0.0f, -1.635f, 0.733f, -1.635f, 1.637f)
                verticalLineToRelative(20.726f)
                curveToRelative(0.0f, 0.904f, 0.732f, 1.637f, 1.635f, 1.637f)
                lineTo(19.09f, 24.0f)
                curveToRelative(0.904f, 0.0f, 1.637f, -0.733f, 1.637f, -1.637f)
                lineTo(20.727f, 6.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(14.227f, 0.0f)
                lineTo(4.908f, 0.0f)
                close()
                moveTo(14.727f, 0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(11.97f, 8.229f)
                curveToRelative(0.224f, 0.0f, 0.571f, 0.031f, 0.765f, 0.072f)
                curveToRelative(0.2f, 0.04f, 0.576f, 0.185f, 0.842f, 0.312f)
                curveToRelative(0.828f, 0.414f, 1.467f, 1.164f, 1.774f, 2.088f)
                curveToRelative(0.168f, 0.511f, 0.188f, 1.34f, 0.05f, 1.865f)
                arcToRelative(3.752f, 3.752f, 0.0f, false, true, -1.277f, 1.952f)
                lineToRelative(-0.25f, 0.193f)
                horizontalLineToRelative(-1.87f)
                curveToRelative(-2.134f, 0.0f, -1.931f, 0.042f, -2.478f, -0.494f)
                arcToRelative(3.349f, 3.349f, 0.0f, false, true, -0.984f, -1.844f)
                curveToRelative(-0.148f, -0.766f, -0.053f, -1.437f, 0.32f, -2.203f)
                curveToRelative(0.19f, -0.399f, 0.303f, -0.556f, 0.65f, -0.899f)
                curveToRelative(0.68f, -0.679f, 1.513f, -1.037f, 2.458f, -1.042f)
                close()
                moveTo(10.104f, 16.092f)
                horizontalLineToRelative(3.781f)
                verticalLineToRelative(1.328f)
                horizontalLineToRelative(-3.779f)
                verticalLineToRelative(-1.328f)
                close()
            }
        }
        .build()
        return _googlekeep!!
    }

private var _googlekeep: ImageVector? = null
