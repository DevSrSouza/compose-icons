package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PackageDependents24: ImageVector
    get() {
        if (_packageDependents24 != null) {
            return _packageDependents24!!
        }
        _packageDependents24 = Builder(name = "PackageDependents24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.126f, 0.64f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 1.75f, 0.0f)
                lineToRelative(8.25f, 4.762f)
                curveToRelative(0.103f, 0.06f, 0.199f, 0.128f, 0.286f, 0.206f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.554f, 0.96f)
                curveToRelative(0.023f, 0.113f, 0.035f, 0.23f, 0.035f, 0.35f)
                verticalLineToRelative(3.332f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(18.501f, 7.64f)
                lineToRelative(-7.75f, 4.474f)
                lineTo(10.751f, 22.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.125f, 0.65f)
                lineToRelative(-8.75f, -5.052f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.875f, -1.515f)
                lineTo(0.001f, 6.917f)
                curveToRelative(0.0f, -0.119f, 0.012f, -0.236f, 0.035f, -0.35f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.554f, -0.96f)
                curveToRelative(0.088f, -0.078f, 0.184f, -0.146f, 0.286f, -0.205f)
                lineTo(9.126f, 0.639f)
                close()
                moveTo(10.001f, 10.813f)
                verticalLineToRelative(0.001f)
                lineToRelative(7.75f, -4.474f)
                lineToRelative(-7.625f, -4.402f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.25f, 0.0f)
                lineTo(2.251f, 6.34f)
                close()
                moveTo(1.501f, 7.638f)
                verticalLineToRelative(8.803f)
                curveToRelative(0.0f, 0.09f, 0.048f, 0.172f, 0.125f, 0.216f)
                lineToRelative(7.625f, 4.402f)
                verticalLineToRelative(-8.947f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.347f, 17.5f)
                lineToRelative(-2.894f, -2.702f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.023f, -1.096f)
                lineToRelative(4.286f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.096f)
                lineToRelative(-4.286f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.023f, -1.096f)
                lineTo(21.347f, 19.0f)
                horizontalLineToRelative(-6.633f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(6.633f)
                close()
            }
        }
        .build()
        return _packageDependents24!!
    }

private var _packageDependents24: ImageVector? = null
