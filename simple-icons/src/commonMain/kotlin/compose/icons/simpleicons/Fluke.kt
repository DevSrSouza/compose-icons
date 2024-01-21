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

public val SimpleIcons.Fluke: ImageVector
    get() {
        if (_fluke != null) {
            return _fluke!!
        }
        _fluke = Builder(name = "Fluke", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.603f, 12.656f)
                horizontalLineToRelative(-0.092f)
                verticalLineToRelative(-0.131f)
                horizontalLineToRelative(0.08f)
                curveToRelative(0.065f, 0.0f, 0.078f, 0.013f, 0.078f, 0.065f)
                curveToRelative(0.0f, 0.04f, -0.026f, 0.066f, -0.066f, 0.066f)
                close()
                moveTo(20.866f, 12.669f)
                curveToRelative(0.0f, 0.157f, -0.118f, 0.288f, -0.276f, 0.288f)
                reflectiveCurveToRelative(-0.275f, -0.13f, -0.275f, -0.288f)
                curveToRelative(0.0f, -0.158f, 0.105f, -0.276f, 0.262f, -0.289f)
                curveToRelative(0.17f, 0.0f, 0.289f, 0.118f, 0.289f, 0.289f)
                close()
                moveTo(20.748f, 12.866f)
                lineTo(20.643f, 12.696f)
                curveToRelative(0.052f, -0.014f, 0.091f, -0.053f, 0.091f, -0.106f)
                curveToRelative(0.0f, -0.079f, -0.052f, -0.118f, -0.13f, -0.118f)
                horizontalLineToRelative(-0.145f)
                verticalLineToRelative(0.394f)
                horizontalLineToRelative(0.066f)
                verticalLineToRelative(-0.17f)
                horizontalLineToRelative(0.065f)
                lineToRelative(0.105f, 0.17f)
                horizontalLineToRelative(0.053f)
                close()
                moveTo(24.0f, 8.393f)
                verticalLineToRelative(7.214f)
                lineTo(0.0f, 15.607f)
                lineTo(0.0f, 8.393f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(6.44f, 11.567f)
                lineTo(4.222f, 11.567f)
                lineTo(4.222f, 11.2f)
                horizontalLineToRelative(2.203f)
                verticalLineToRelative(-0.498f)
                lineTo(3.633f, 10.702f)
                verticalLineToRelative(2.308f)
                horizontalLineToRelative(0.59f)
                verticalLineToRelative(-0.892f)
                horizontalLineToRelative(2.216f)
                verticalLineToRelative(-0.55f)
                close()
                moveTo(9.259f, 12.433f)
                lineTo(7.384f, 12.433f)
                verticalLineToRelative(-1.731f)
                horizontalLineToRelative(-0.577f)
                verticalLineToRelative(2.308f)
                horizontalLineToRelative(2.452f)
                verticalLineToRelative(-0.577f)
                close()
                moveTo(12.721f, 10.702f)
                horizontalLineToRelative(-0.577f)
                verticalLineToRelative(1.77f)
                horizontalLineToRelative(-2.02f)
                verticalLineToRelative(-1.77f)
                horizontalLineToRelative(-0.576f)
                verticalLineToRelative(1.875f)
                curveToRelative(0.039f, 0.42f, 0.432f, 0.433f, 0.432f, 0.433f)
                horizontalLineToRelative(2.308f)
                reflectiveCurveToRelative(0.38f, -0.013f, 0.433f, -0.433f)
                verticalLineToRelative(-1.875f)
                close()
                moveTo(16.289f, 13.01f)
                lineTo(14.452f, 11.83f)
                lineTo(16.197f, 10.702f)
                horizontalLineToRelative(-1.023f)
                lineToRelative(-1.299f, 0.8f)
                verticalLineToRelative(-0.8f)
                horizontalLineToRelative(-0.577f)
                verticalLineToRelative(2.308f)
                horizontalLineToRelative(0.577f)
                verticalLineToRelative(-0.866f)
                lineToRelative(1.377f, 0.866f)
                horizontalLineToRelative(1.037f)
                close()
                moveTo(19.528f, 10.702f)
                horizontalLineToRelative(-2.912f)
                verticalLineToRelative(2.308f)
                horizontalLineToRelative(2.912f)
                verticalLineToRelative(-0.538f)
                horizontalLineToRelative(-2.335f)
                verticalLineToRelative(-0.328f)
                horizontalLineToRelative(2.335f)
                verticalLineToRelative(-0.537f)
                horizontalLineToRelative(-2.335f)
                verticalLineToRelative(-0.355f)
                horizontalLineToRelative(2.335f)
                verticalLineToRelative(-0.55f)
                close()
                moveTo(20.931f, 12.669f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, false, -0.34f, -0.341f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, false, -0.342f, 0.34f)
                curveToRelative(0.0f, 0.184f, 0.158f, 0.342f, 0.341f, 0.342f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, false, 0.341f, -0.341f)
                close()
            }
        }
        .build()
        return _fluke!!
    }

private var _fluke: ImageVector? = null
