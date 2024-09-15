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

public val SimpleIcons.Googlecast: ImageVector
    get() {
        if (_googlecast != null) {
            return _googlecast!!
        }
        _googlecast = Builder(name = "Googlecast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.545f)
                verticalLineToRelative(3.273f)
                horizontalLineToRelative(3.273f)
                curveToRelative(0.0f, -1.811f, -1.462f, -3.273f, -3.273f, -3.273f)
                close()
                moveTo(0.0f, 14.182f)
                verticalLineToRelative(2.182f)
                curveToRelative(3.011f, 0.0f, 5.455f, 2.444f, 5.455f, 5.455f)
                horizontalLineToRelative(2.182f)
                curveToRelative(0.0f, -4.222f, -3.415f, -7.636f, -7.636f, -7.636f)
                close()
                moveTo(0.0f, 9.818f)
                lineTo(0.0f, 12.0f)
                curveToRelative(5.422f, 0.0f, 9.818f, 4.396f, 9.818f, 9.818f)
                lineTo(12.0f, 21.818f)
                curveToRelative(0.0f, -6.633f, -5.378f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(21.818f, 2.182f)
                lineTo(2.182f, 2.182f)
                curveTo(0.982f, 2.182f, 0.0f, 3.164f, 0.0f, 4.364f)
                verticalLineToRelative(3.273f)
                horizontalLineToRelative(2.182f)
                lineTo(2.182f, 4.364f)
                horizontalLineToRelative(19.636f)
                verticalLineToRelative(15.273f)
                horizontalLineToRelative(-7.636f)
                verticalLineToRelative(2.182f)
                horizontalLineToRelative(7.636f)
                curveToRelative(1.2f, 0.0f, 2.182f, -0.982f, 2.182f, -2.182f)
                lineTo(24.0f, 4.364f)
                curveToRelative(0.0f, -1.2f, -0.982f, -2.182f, -2.182f, -2.182f)
                close()
            }
        }
        .build()
        return _googlecast!!
    }

private var _googlecast: ImageVector? = null
