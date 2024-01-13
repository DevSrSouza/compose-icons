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

public val SimpleIcons.Goland: ImageVector
    get() {
        if (_goland != null) {
            return _goland!!
        }
        _goland = Builder(name = "Goland", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(6.764f, 3.0f)
                arcToRelative(5.448f, 5.448f, 0.0f, false, true, 3.892f, 1.356f)
                lineTo(9.284f, 6.012f)
                arcTo(3.652f, 3.652f, 0.0f, false, false, 6.696f, 5.0f)
                curveToRelative(-1.6f, 0.0f, -2.844f, 1.4f, -2.844f, 3.08f)
                verticalLineToRelative(0.028f)
                curveToRelative(0.0f, 1.812f, 1.244f, 3.14f, 3.0f, 3.14f)
                arcToRelative(3.468f, 3.468f, 0.0f, false, false, 2.048f, -0.596f)
                lineTo(8.9f, 9.228f)
                lineTo(6.708f, 9.228f)
                verticalLineToRelative(-1.88f)
                lineTo(11.0f, 7.348f)
                verticalLineToRelative(4.296f)
                arcToRelative(6.428f, 6.428f, 0.0f, false, true, -4.228f, 1.572f)
                curveToRelative(-3.076f, 0.0f, -5.196f, -2.164f, -5.196f, -5.092f)
                verticalLineToRelative(-0.028f)
                arcTo(5.08f, 5.08f, 0.0f, false, true, 6.764f, 3.0f)
                close()
                moveTo(17.196f, 3.0f)
                curveToRelative(3.052f, 0.0f, 5.244f, 2.276f, 5.244f, 5.088f)
                verticalLineToRelative(0.028f)
                arcToRelative(5.116f, 5.116f, 0.0f, false, true, -5.272f, 5.12f)
                curveToRelative(-3.056f, -0.02f, -5.248f, -2.296f, -5.248f, -5.112f)
                verticalLineToRelative(-0.028f)
                arcTo(5.116f, 5.116f, 0.0f, false, true, 17.196f, 3.0f)
                close()
                moveTo(17.168f, 5.0f)
                arcTo(2.96f, 2.96f, 0.0f, false, false, 14.2f, 8.068f)
                verticalLineToRelative(0.028f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 3.0f, 3.112f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, false, 2.964f, -3.084f)
                verticalLineToRelative(-0.028f)
                arcTo(3.004f, 3.004f, 0.0f, false, false, 17.168f, 5.0f)
                close()
                moveTo(2.252f, 19.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.252f, 21.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _goland!!
    }

private var _goland: ImageVector? = null
